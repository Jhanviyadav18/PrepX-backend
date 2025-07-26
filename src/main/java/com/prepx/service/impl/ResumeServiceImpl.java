package com.prepx.service.impl;

import java.io.IOException;

import org.apache.tika.Tika;
import org.apache.tika.exception.TikaException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.prepx.service.ResumeService;

@Service
public class ResumeServiceImpl implements ResumeService {

    private final Tika tika = new Tika();

    @Override
    public String extractTextFromResume(MultipartFile file) {
        try {
            return tika.parseToString(file.getInputStream());
        } catch (IOException | TikaException e) {
            e.printStackTrace();
            // Optional: throw a custom exception or return an error response
            return null;
        }
    }
}
