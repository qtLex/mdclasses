package com.github._1c_syntax.mdclasses.mdo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.github._1c_syntax.mdclasses.metadata.additional.MDOType;
import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.experimental.SuperBuilder;

import java.util.Map;

@Value
@EqualsAndHashCode(callSuper = true)
@JsonDeserialize(builder = InformationRegister.InformationRegisterBuilderImpl.class)
@SuperBuilder
public class InformationRegister extends MDObjectBase {

  public MDOType getType() {
    return MDOType.INFORMATION_REGISTER;
  }

  @JsonPOJOBuilder(withPrefix = "")
  @JsonIgnoreProperties(ignoreUnknown = true)
  static final class InformationRegisterBuilderImpl extends InformationRegister.InformationRegisterBuilder<InformationRegister, InformationRegister.InformationRegisterBuilderImpl> {

    @JsonProperty("Properties")
    @Override
    public InformationRegister.InformationRegisterBuilderImpl properties(Map<String, Object> properties) {
      super.properties(properties);
      return this.self();
    }
  }
}
