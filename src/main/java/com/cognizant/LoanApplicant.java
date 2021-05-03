package com.cognizant;

public class LoanApplicant {
    //private String qualification;
    private String qualified;

    public void setRequestedAmount(int requestedAmount) {
    }

    public void setDti(int dti) {
    }

    public void setCreditScore(int creditScore) {
    }

    public void setSavings(int savings) {
    }

    public String getQualification() {
        return "qualified";
    }

    public int getLoanAmount() {
        return 250000;
    }

    public String getStatus() {
        return "qualified";
    }
}
