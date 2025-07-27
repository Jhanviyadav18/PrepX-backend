package com.prepx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prepx.model.ResumeUpload;

public interface ResumeUploadRepository extends JpaRepository<ResumeUpload, Long> {
}
