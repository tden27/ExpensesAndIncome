package com.example.android.expensesandincome.model;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Transaction {

    private static Map<Integer, String> categories = new HashMap<>();    // Категории транзакций
    private final double sum;   // Сумма транзакции
    private final LocalDate date; // Дата транзакции
    private final String comment; // Комментарий к транзакции

    public Transaction(double sum, LocalDate date, String comment) {
        this.sum = sum;
        this.date = date;
        this.comment = comment;
    }

    public static Map<Integer, String> getCategories() {
        return categories;
    }

    public double getSum() {
        return sum;
    }

    public String getDate() {
        return date.toString();
    }

    public String getComment() {
        return comment;
    }

    public String getCategory() {
        return "0";
    }
}
