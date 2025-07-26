package com.prepx.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.prepx.service.ResumeRankerService;

@Service
public class ResumeRankerServiceImpl implements ResumeRankerService {

    private final List<String> SKILLS = Arrays.asList("Java", "Spring Boot", "MySQL", "REST API", "Git", "Hibernate", "JPA");

    @Override
    public Map<String, Object> rankResume(String resumeText) {
        String contentLower = resumeText.toLowerCase();
        List<String> matchedSkills = new ArrayList<>();
        int score = 0;
        for (String skill : SKILLS) {
            if (contentLower.contains(skill.toLowerCase())) {
                matchedSkills.add(skill);
                score += 10;
            }
        }
        Map<String, Object> result = new HashMap<>();
        result.put("score", score);
        result.put("matchedSkills", matchedSkills);
        result.put("content", resumeText);
        return result;
    }
}
