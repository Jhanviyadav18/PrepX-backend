package com.prepx.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.prepx.model.ResumeUpload;

public interface ResumeUploadService {
    ResumeUpload saveResume(MultipartFile file) throws Exception;
    List<ResumeUpload> getAllResumes();
}
