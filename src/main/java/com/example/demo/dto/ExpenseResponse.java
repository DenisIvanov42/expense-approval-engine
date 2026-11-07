package com.example.demo.dto;

import com.example.demo.model.Expense;
import com.example.demo.model.ExpenseStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ExpenseResponse(
    Long id,
    String title,
    String description,
    BigDecimal amount,
    ExpenseStatus status,
    String employeeEmail,
    LocalDateTime createdAt
) {
    // A clean mapping helper to convert from Database Entity -> Response DTO
    public static ExpenseResponse fromEntity(Expense expense) {
        return new ExpenseResponse(
            expense.getId(),
            expense.getTitle(),
            expense.getDescription(),
            expense.getAmount(),
            expense.getStatus(),
            expense.getEmployeeEmail(),
            expense.getCreatedAt()
        );
    }
}