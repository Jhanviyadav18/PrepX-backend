package com.prepx.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.prepx.service.ResumeRankerService;
import com.prepx.service.ResumeService;

@RestController
@RequestMapping("/api/resume")
@CrossOrigin(origins = "*")
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @Autowired
    private ResumeRankerService resumeRankerService;

    @PostMapping("/rank")
    public ResponseEntity<Map<String, Object>> rankResume(@RequestParam("file") MultipartFile file) {
        try {
            String resumeText = resumeService.extractTextFromResume(file);
            Map<String, Object> result = resumeRankerService.rankResume(resumeText);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            return ResponseEntity.status(500).body(Map.of("error", "Failed to process resume"));
        }
    }
}
