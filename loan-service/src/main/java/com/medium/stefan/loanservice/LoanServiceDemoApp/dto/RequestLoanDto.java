package com.medium.stefan.loanservice.LoanServiceDemoApp.dto;

import lombok.Data;

@Data
public class RequestLoanDto {
    private Double principalLoanAmount;
    private Double loanTenureInMonths;
    private Double monthlyInterestRate;
    private Double annualRateOfInterestPercent;
}
