package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MortgageLender {
    @Test
//    As a lender, I want to be able to check my available funds, 
//    so that I know how much money I can offer for loans.
//
//    When I check my available funds
//    Then I should see how much funds I currently have
    void checkAvailableFunds(){
        //setup
        Lender lender = new Lender();
        
        //Execution
        //int expected = 0;
        //int actual = lender.checkAvailableFunds();
        
        //Assertion
        assertEquals(0,lender.checkAvailableFunds());
        
    }
    @Test
//    As a lender, I want to add money to my available funds,
//    so that I can offer loans to potential home buyers.
//
//    Given I have <current_amount> available funds
//    When I add <deposit_amount>
//    Then my available funds should be <total>
//
//    Examples:
//            | current_amount | deposit_amount |   total  |
//            |     100,000    |      50,000    | 150,000  |
//            |     200,000    |      30,000    | 230,000  |
    void addMoneyToAvailableFunds(){
        //setup
        Lender lender = new Lender();

        //Execution
        lender.depositAmount(100000);
        lender.depositAmount(50000);

        //Assertion
        assertEquals(150000,lender.checkAvailableFunds());

    }
    @Test
    void qualifyLoanApplication(){
//        As a lender, I want to accept and qualify loan applications, so that I can ensure I get my money back.
//
//                Rule: To qualify for the full amount, candidates must have debt-to-income (DTI) less than 36%, credit score above 620
//        and savings worth 25% of requested loan amount.
//
//                Rule: To partially qualify, candidates must still meet the same dti and credit score thresholds.
//        The loan amount for partial qualified applications is four times the applicant's savings.
//
//        Given a loan applicant with <dti>, <credit_score>, and <savings>
//                When they apply for a loan with <requested_amount>
//        Then their qualification is <qualification>
//                And their loan amount is <loan_amount>
//                And their loan status is <status>
//
//                Example:
//|  requested_amount  |   dti  |  credit_score  |  savings  |     qualification    |  loan_amount  |   status   |
//|      250,000       |   21   |       700      | 100,000   |       qualified      |   250,000     |  qualified |
//|      250,000       |   37   |       700      | 100,000   |     not qualified    |         0     |  denied    |
//|      250,000       |   30   |       600      | 100,000   |     not qualified    |         0     |  denied    |
//|      250,000       |   30   |       700      |  50,000   |  partially qualified |   200,000     |  qualified |


        //setup
        Lender lender = new Lender();
        LoanApplicant loanApplicant = new LoanApplicant();

        //Execution
        loanApplicant.setRequestedAmount(250000);
        loanApplicant.setDti(21);
        loanApplicant.setCreditScore(700);
        loanApplicant.setSavings(100000);
        lender.acceptQualifyLoanApplication(loanApplicant);

        //Assertion
        assertEquals("qualified",loanApplicant.getQualification());
        assertEquals(250000,loanApplicant.getLoanAmount());
        assertEquals("qualified",loanApplicant.getStatus());

    }
}
