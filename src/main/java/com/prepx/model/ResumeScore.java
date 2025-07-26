package com.prepx.model;

public class ResumeScore {
    private String candidateName;
    private double score;

    public ResumeScore(String candidateName, double score) {
        this.candidateName = candidateName;
        this.score = score;
    }

    // Getters and Setters
    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}

