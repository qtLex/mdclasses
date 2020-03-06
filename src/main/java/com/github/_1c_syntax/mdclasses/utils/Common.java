package com.github._1c_syntax.mdclasses.utils;

import com.github._1c_syntax.mdclasses.mdo.MDObjectBase;
import com.github._1c_syntax.mdclasses.metadata.Configuration;
import com.github._1c_syntax.mdclasses.metadata.SupportConfiguration;
import com.github._1c_syntax.mdclasses.metadata.additional.MDOType;
import com.github._1c_syntax.mdclasses.metadata.additional.ModuleType;
import com.github._1c_syntax.mdclasses.metadata.additional.ParseSupportData;
import com.github._1c_syntax.mdclasses.metadata.additional.SupportVariant;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.net.URI;
import java.nio.file.Path;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Slf4j
@UtilityClass
public class Common {

  public static final Map<MDOType, Set<ModuleType>> MODULE_TYPES_FOR_MDO_TYPES = moduleTypesForMDOTypes();

  public static Map<URI, Map<SupportConfiguration, SupportVariant>> getModuleSupports(Configuration configuration) {
    Map<URI, Map<SupportConfiguration, SupportVariant>> modulesBySupport = new HashMap<>();
    var fileParentConfiguration = MDOPathUtils.getParentConfigurationsPath(
      configuration.getConfigurationSource(), configuration.getRootPath());

    if (fileParentConfiguration == null || !fileParentConfiguration.toFile().exists()) {
      return modulesBySupport;
    }

    ParseSupportData supportData = new ParseSupportData(fileParentConfiguration);
    final Map<String, Map<SupportConfiguration, SupportVariant>> supportMap = supportData.getSupportMap();

    configuration.getChildren()
      .forEach((mdoType, stringMDObjectBaseMap) ->
        stringMDObjectBaseMap.forEach((name, mdObject) -> {
          var mdoModuleSupport = getMDObjectSupport(supportMap, mdObject);
          if (!mdoModuleSupport.isEmpty()) {
            modulesBySupport.putAll(mdoModuleSupport);
          }
          if (mdObject.getForms() != null) {
            mdObject.getForms().forEach(form -> {
              var formSupport = getMDObjectSupport(supportMap, form);
              if (!formSupport.isEmpty()) {
                modulesBySupport.putAll(formSupport);
              }
            });
          }
        })
      );

    return modulesBySupport;
  }

  private static Map<URI, Map<SupportConfiguration, SupportVariant>> getMDObjectSupport(
    Map<String, Map<SupportConfiguration, SupportVariant>> supportMap,
    MDObjectBase mdObject) {
    Map<URI, Map<SupportConfiguration, SupportVariant>> modulesBySupport = new HashMap<>();
    Set<URI> uris = new HashSet<>();
    if (mdObject.getMdoURI() != null) {
      uris.add(mdObject.getMdoURI());
    }
    if (mdObject.getModulesByType() != null) {
      mdObject.getModulesByType().forEach((uri, moduleType) -> uris.add(uri));
    }

    Map<SupportConfiguration, SupportVariant> moduleSupport = Collections.emptyMap();
    if (mdObject.getUuid() == null) {
      LOGGER.info("Не удалось найти идентификатор по объекту " + mdObject);
    } else {
      moduleSupport = supportMap.getOrDefault(mdObject.getUuid(), Collections.emptyMap());
    }
    for (URI uri : uris) {
      modulesBySupport.put(uri, moduleSupport);
    }
    return modulesBySupport;
  }

  public static Path getAbsolutePath(File file) {
    return file.toPath().toAbsolutePath();
  }

  public static URI getAbsoluteUri(File file) {
    return getAbsolutePath(file).toUri();
  }

  private static Map<MDOType, Set<ModuleType>> moduleTypesForMDOTypes() {
    Map<MDOType, Set<ModuleType>> result = new HashMap<>();

    for (MDOType mdoType : MDOType.values()) {
      Set<ModuleType> types = new HashSet<>();
      switch (mdoType) {
        case ACCOUNTING_REGISTER:
        case ACCUMULATION_REGISTER:
        case CALCULATION_REGISTER:
        case INFORMATION_REGISTER:
          types.add(ModuleType.ManagerModule);
          types.add(ModuleType.RecordSetModule);
          break;
        case BUSINESS_PROCESS:
        case CATALOG:
        case CHART_OF_ACCOUNTS:
        case CHART_OF_CALCULATION_TYPES:
        case CHART_OF_CHARACTERISTIC_TYPES:
        case DATA_PROCESSOR:
        case DOCUMENT:
        case EXCHANGE_PLAN:
        case REPORT:
        case TASK:
          types.add(ModuleType.ManagerModule);
          types.add(ModuleType.ObjectModule);
          break;
        case COMMAND_GROUP:
        case COMMON_ATTRIBUTE:
        case COMMON_PICTURE:
        case COMMON_TEMPLATE:
        case DEFINED_TYPE:
        case DOCUMENT_NUMERATOR:
        case EVENT_SUBSCRIPTION:
        case FUNCTIONAL_OPTION:
        case ROLE:
        case SCHEDULED_JOB:
        case SESSION_PARAMETER:
        case STYLE_ITEM:
        case STYLE:
        case SUBSYSTEM:
        case WS_REFERENCE:
        case XDTO_PACKAGE:
          break;
        case COMMON_COMMAND:
          types.add(ModuleType.CommandModule);
          break;
        case COMMON_FORM:
          types.add(ModuleType.FormModule);
          break;
        case COMMON_MODULE:
          types.add(ModuleType.CommonModule);
          break;
        case CONFIGURATION:
          types.add(ModuleType.ApplicationModule);
          types.add(ModuleType.SessionModule);
          types.add(ModuleType.ExternalConnectionModule);
          types.add(ModuleType.ManagedApplicationModule);
          types.add(ModuleType.OrdinaryApplicationModule);
          break;
        case CONSTANT:
          types.add(ModuleType.ValueManagerModule);
          break;
        case DOCUMENT_JOURNAL:
        case ENUM:
        case FILTER_CRITERION:
        case SETTINGS_STORAGE:
          types.add(ModuleType.ManagerModule);
          break;
        case HTTP_SERVICE:
          types.add(ModuleType.HTTPServiceModule);
          break;
        case SEQUENCE:
          types.add(ModuleType.RecordSetModule);
          break;
        case WEB_SERVICE:
          types.add(ModuleType.WEBServiceModule);
          break;
        default:
          // non
      }

      result.put(mdoType, types);
    }

    return result;
  }

}
