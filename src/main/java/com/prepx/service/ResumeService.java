package com.prepx.service;

import org.springframework.web.multipart.MultipartFile;

public interface ResumeService {
    String extractTextFromResume(MultipartFile file);
}
