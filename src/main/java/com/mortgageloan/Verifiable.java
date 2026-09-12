package com.mortgageloan;

public interface Verifiable {

    void verifyIncome();
    void checkCreditScore();


    default void verificationMessage() {
        System.out.println("Verification process completed.");
    }
}
