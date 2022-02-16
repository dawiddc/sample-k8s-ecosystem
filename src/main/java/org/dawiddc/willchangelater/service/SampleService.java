package org.dawiddc.willchangelater.service;

import lombok.RequiredArgsConstructor;
import org.dawiddc.willchangelater.db.SampleRepository;
import org.dawiddc.willchangelater.model.SampleDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SampleService {

    private final SampleRepository sampleRepository;

    public Optional<SampleDTO> getSampleById(long sampleId) {
        return sampleRepository.getSampleById(sampleId);
    }
}
