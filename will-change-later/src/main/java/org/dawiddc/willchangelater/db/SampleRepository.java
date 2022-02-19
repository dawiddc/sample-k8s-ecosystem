package org.dawiddc.willchangelater.db;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dawiddc.willchangelater.model.SampleDto;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Slf4j
@Repository
@PropertySource(value = "classpath:/queries/sample-repository.yml")
@RequiredArgsConstructor
public class SampleRepository {
    public Optional<SampleDto> getSampleById(long sampleId) {
        // TODO: Add JPA
        return Optional.of(SampleDto.builder()
                .id(sampleId)
                .sampleData("sampleData")
                .build());
    }
}
