package com.example.android.expensesandincome;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AddExpenses extends AppCompatActivity {

    private Spinner sCategoryIncome;
    private TextView inputExpensesSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_expenses);

        sCategoryIncome = findViewById(R.id.s_category_expenses);
        inputExpensesSum = findViewById(R.id.et_input_expenses_sum);
    }


    public void addExpensesSum(View view) {
        float sum = Float.parseFloat(inputExpensesSum.getText().toString());
        String category = sCategoryIncome.getTransitionName();
    }
}
