package org.dawiddc.willchangelater.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dawiddc.willchangelater.model.SampleDTO;
import org.dawiddc.willchangelater.service.SampleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/api/v1/samples")
@RequiredArgsConstructor
public class SampleController {
    private final SampleService sampleService;

    @GetMapping(path = "/{sampleId}")
    public ResponseEntity<SampleDTO> getSample(@PathVariable long sampleId) {
        log.info("getSample endpoint called for sampleId={}", sampleId);
        Optional<SampleDTO> sample = sampleService.getSampleById(sampleId);
        log.info("Sample fetched for sampleId={}, sample={}", sampleId, sample);
        return ResponseEntity.of(sample);
    }
}
