package com.github._1c_syntax.mdclasses.metadata.additional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum MDOType {
  ACCOUNTING_REGISTER("AccountingRegister", "AccountingRegisters", true),
  ACCUMULATION_REGISTER("AccumulationRegister", "AccumulationRegisters", true),
  BUSINESS_PROCESS("BusinessProcess", "BusinessProcesses", true),
  CALCULATION_REGISTER("CalculationRegister", "CalculationRegisters", true),
  CATALOG("Catalog", "Catalogs", true),
  CHART_OF_ACCOUNTS("ChartOfAccounts", "ChartsOfAccounts", true),
  CHART_OF_CALCULATION_TYPES("ChartOfCalculationTypes", "ChartsOfCalculationTypes", true),
  CHART_OF_CHARACTERISTIC_TYPES("ChartOfCharacteristicTypes", "ChartsOfCharacteristicTypes", true),
  COMMAND_GROUP("CommandGroup", "CommandGroups", false),
  COMMON_ATTRIBUTE("CommonAttribute", "CommonAttributes", false),
  COMMON_COMMAND("CommonCommand", "CommonCommands", false),
  COMMON_FORM("CommonForm", "CommonForms", false),
  COMMON_MODULE("CommonModule", "CommonModules", false),
  COMMON_PICTURE("CommonPicture", "CommonPictures", false),
  COMMON_TEMPLATE("CommonTemplate", "CommonTemplates", false),
  CONFIGURATION("Configuration", "", false),
  CONSTANT("Constant", "Constants", false),
  DATA_PROCESSOR("DataProcessor", "DataProcessors", true),
  DEFINED_TYPE("DefinedType", "DefinedTypes", false),
  DOCUMENT_JOURNAL("DocumentJournal", "DocumentJournals", true),
  DOCUMENT_NUMERATOR("DocumentNumerator", "DocumentNumerators", false),
  DOCUMENT("Document", "Documents", true),
  ENUM("Enum", "Enums", true),
  EVENT_SUBSCRIPTION("EventSubscription", "EventSubscriptions", false),
  EXCHANGE_PLAN("ExchangePlan", "ExchangePlans", true),
  FILTER_CRITERION("FilterCriterion", "FilterCriteria", true),
  FUNCTIONAL_OPTION("FunctionalOption", "FunctionalOptions", false),
  FUNCTIONAL_OPTIONS_PARAMETER("FunctionalOptionsParameter", "FunctionalOptionsParameters", false),
  HTTP_SERVICE("HTTPService", "HTTPServices", false),
  INFORMATION_REGISTER("InformationRegister", "InformationRegisters", true),
  INTERFACE("Interface", "Interfaces", true),
  LANGUAGE("Language", "Languages", false),
  REPORT("Report", "Reports", true),
  ROLE("Role", "Roles", false),
  SCHEDULED_JOB("ScheduledJob", "ScheduledJobs", false),
  SEQUENCE("Sequence", "Sequences", true),
  SESSION_PARAMETER("SessionParameter", "SessionParameters", false),
  SETTINGS_STORAGE("SettingsStorage", "SettingsStorages", true),
  STYLE_ITEM("StyleItem", "StyleItems", false),
  STYLE("Style", "Styles", false),
  SUBSYSTEM("Subsystem", "Subsystems", false),
  TASK("Task", "Tasks", true),
  WEB_SERVICE("WebService", "WebServices", false),
  WS_REFERENCE("WSReference", "WSReferences", false),
  XDTO_PACKAGE("XDTOPackage", "XDTOPackages", false),

  FORM("Form", "Forms", false);

  private String shortClassName;
  private String groupName;
  private boolean mayHaveCommand;

  MDOType(String shortName, String groupName, boolean mayHaveCommand) {
    this.shortClassName = shortName;
    this.groupName = groupName;
    this.mayHaveCommand = mayHaveCommand;
  }

  public String getShortClassName() {
    if (this == CONFIGURATION
      || this == ENUM
      || this == INTERFACE) {
      return "MDO" + shortClassName;
    }
    return shortClassName;
  }

  public static List<MDOType> values(boolean withoutChildren) {
    if (withoutChildren) {
      return Arrays.stream(values()).filter(mdoType -> mdoType != FORM).collect(Collectors.toList());
    }
    return Arrays.asList(values());
  }

  public String getGroupName() {
    return groupName;
  }

  public boolean isMayHaveCommand() {
    return mayHaveCommand;
  }
}
