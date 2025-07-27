package com.prepx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.prepx.model.ResumeUpload;
import com.prepx.repository.ResumeUploadRepository;
import com.prepx.service.ResumeUploadService;

@Service
public class ResumeUploadServiceImpl implements ResumeUploadService {

    @Autowired
    private ResumeUploadRepository resumeUploadRepository;

    @Override
    public ResumeUpload saveResume(MultipartFile file) throws Exception {
        ResumeUpload upload = new ResumeUpload(
                file.getOriginalFilename(),
                file.getContentType(),
                file.getBytes()
        );
        return resumeUploadRepository.save(upload);
    }

    @Override
    public List<ResumeUpload> getAllResumes() {
        return resumeUploadRepository.findAll();
    }
}
