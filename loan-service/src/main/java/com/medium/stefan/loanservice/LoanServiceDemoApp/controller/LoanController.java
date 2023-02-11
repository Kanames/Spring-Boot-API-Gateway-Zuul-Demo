package com.medium.stefan.loanservice.LoanServiceDemoApp.controller;

import com.medium.stefan.loanservice.LoanServiceDemoApp.dto.RequestLoanDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class LoanController {

    @PostMapping("/generateLoan")
    public Double ping(@RequestBody RequestLoanDto req){
//        P x R x (1+R)^N / [(1+R)^N-1] where-
//        P = Principal loan amount.
//        N = Loan tenure in months.
//        R = Monthly interest rate.
//        R = Annual Rate of interest/12/100.

        return req.getPrincipalLoanAmount() *
                req.getMonthlyInterestRate() *
                (Math.pow( 1 + req.getMonthlyInterestRate(),req.getLoanTenureInMonths())) /
                (1 + Math.pow(req.getMonthlyInterestRate(),req.getLoanTenureInMonths()-1));

    }
}
