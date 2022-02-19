package org.dawiddc.willchangelater.service;

import lombok.RequiredArgsConstructor;
import org.dawiddc.willchangelater.db.SampleRepository;
import org.dawiddc.willchangelater.model.SampleDto;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SampleService {

    private final SampleRepository sampleRepository;

    public Optional<SampleDto> getSampleById(long sampleId) {
        return sampleRepository.getSampleById(sampleId);
    }
}
