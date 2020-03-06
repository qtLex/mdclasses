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
@JsonDeserialize(builder = ScheduledJob.ScheduledJobBuilderImpl.class)
@SuperBuilder
public class ScheduledJob extends MDObjectBase {

  public MDOType getType() {
    return MDOType.SCHEDULED_JOB;
  }

  @JsonPOJOBuilder(withPrefix = "")
  @JsonIgnoreProperties(ignoreUnknown = true)
  static final class ScheduledJobBuilderImpl extends ScheduledJob.ScheduledJobBuilder<ScheduledJob, ScheduledJob.ScheduledJobBuilderImpl> {

    @JsonProperty("Properties")
    @Override
    public ScheduledJob.ScheduledJobBuilderImpl properties(Map<String, Object> properties) {
      super.properties(properties);
      return this.self();
    }
  }
}
