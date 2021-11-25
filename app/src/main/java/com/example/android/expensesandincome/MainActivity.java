package com.example.android.expensesandincome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView expensesInMonth;
    private TextView incomeInMonth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expensesInMonth = findViewById(R.id.expenses_in_month);
        incomeInMonth = findViewById(R.id.income_in_month);

        expensesInMonth.setText("0 руб.");
        incomeInMonth.setText("0 руб.");
    }

    public void addExpenses(View view){
        Intent addExpensesIntent = new Intent(MainActivity.this, AddExpenses.class);
        startActivity(addExpensesIntent);
    }

    public void addIncome(View view) {
        Intent addIncomeIntent = new Intent(MainActivity.this, AddIncome.class);
        startActivity(addIncomeIntent);
    }
}