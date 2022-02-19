package org.dawiddc.willchangelater.model;

import lombok.Builder;
import lombok.Data;
import lombok.Value;

@Data
@Value
@Builder
public class SampleDto {
    long id;
    String sampleData;
}
