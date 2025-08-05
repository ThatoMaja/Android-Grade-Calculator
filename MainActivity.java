package com.week1.projectfirstdraft;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText studentName, mathScore, scienceScore, englishScore;
    TextView resultTextView;
    Button calculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        studentName = findViewById(R.id.studentName);
        mathScore = findViewById(R.id.mathScore);
        scienceScore = findViewById(R.id.scienceScore);
        englishScore = findViewById(R.id.englishScore);
        resultTextView = findViewById(R.id.resultTextView);
        calculateButton = findViewById(R.id.calculateButton);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { calculateGrade(); }
        });
    }

    private void calculateGrade() {
        String name = studentName.getText().toString().trim();
        String mathStr = mathScore.getText().toString().trim();
        String scienceStr = scienceScore.getText().toString().trim();
        String englishStr = englishScore.getText().toString().trim();

        if (name.isEmpty() || mathStr.isEmpty() || scienceStr.isEmpty() || englishStr.isEmpty()) {
            resultTextView.setText("Please complete all required fields.");
            return;
        }

        try {
            double math = Double.parseDouble(mathStr);
            double science = Double.parseDouble(scienceStr);
            double english = Double.parseDouble(englishStr);

            double average = (math + science + english) / 3;
            String grade;

            if (average >= 90) {
                grade = "A";
            } else if (average >= 80) {
                grade = "B";
            } else if (average >= 70) {
                grade = "C";
            } else {
                grade = "F";
            }

            resultTextView.setText("Name: " + name + "\nAverage: " + String.format("%.2f", average) + "\nGrade: " + grade);
        } catch (NumberFormatException e) {
            resultTextView.setText("Invalid input. Please enter numeric values for scores.");
        }
    }
}
