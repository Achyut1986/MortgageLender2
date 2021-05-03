package com.cognizant;

public class Lender {
    private int availableFunds;
    private int depositAmount;

    public int checkAvailableFunds() {
        return availableFunds;
    }
    public void depositAmount(int amount) {
        availableFunds = availableFunds+ amount;
    }

    public void acceptQualifyLoanApplication(LoanApplicant loanApplicant) {
    }
}
