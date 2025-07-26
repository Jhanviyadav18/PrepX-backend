package com.prepx.service;

import java.util.Map;

public interface ResumeRankerService {
    Map<String, Object> rankResume(String resumeText);
} 