package com.example.quicksum;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private boolean isOthPressed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView calculatorScreen = findViewById(R.id.calculatorScreen);
        final Button n1 = findViewById(R.id.n1);
        final Button n2 = findViewById(R.id.n2);
        final Button n3 = findViewById(R.id.n3);
        final Button n4 = findViewById(R.id.n4);
        final Button n5 = findViewById(R.id.n5);
        final Button n6 = findViewById(R.id.n6);
        final Button n7 = findViewById(R.id.n7);
        final Button n8 = findViewById(R.id.n8);
        final Button n9 = findViewById(R.id.n9);

        final View.OnClickListener calculatorListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int id = v.getId();
                switch (id) {
                    case R.id.n1:
                        String screenContent = calculatorScreen.getText().toString();
                        if (isOthPressed) {
                            if (screenContent.equals("")) {
                                calculatorScreen.append("0.5");
                            } else {
                                double res = Double.parseDouble(screenContent) + 0.5;
                                calculatorScreen.setText(String.valueOf(res));
                            }
                            n1.setText("1");
                            n2.setText("2");
                            n3.setText("3");
                            isOthPressed = false;
                            break;
                        }
                        if (screenContent.equals("")) {
                            calculatorScreen.append("1");
                            break;
                        }
                        double res = Double.parseDouble(screenContent) + 1;
                        calculatorScreen.setText(String.valueOf(res));
                        break;
                    case R.id.n2:
                        screenContent = calculatorScreen.getText().toString();
                        if (isOthPressed) {
                            if (screenContent.equals("")) {
                                calculatorScreen.append("0.33");
                            } else {
                                res = Double.parseDouble(screenContent) + 0.33;
                                calculatorScreen.setText(String.valueOf(res));
                            }
                            n1.setText("1");
                            n2.setText("2");
                            n3.setText("3");
                            isOthPressed = false;
                            break;
                        }
                        if (screenContent.equals("")) {
                            calculatorScreen.append("2");
                            break;
                        }
                        res = Double.parseDouble(screenContent) + 2;
                        calculatorScreen.setText(String.valueOf(res));
                        break;
                    case R.id.n3:
                        screenContent = calculatorScreen.getText().toString();
                        if (isOthPressed) {
                            if (screenContent.equals("")) {
                                calculatorScreen.append("0.25");
                            } else {
                                res = Double.parseDouble(screenContent) + 0.25;
                                calculatorScreen.setText(String.valueOf(res));
                            }
                            n1.setText("1");
                            n2.setText("2");
                            n3.setText("3");
                            isOthPressed = false;
                            break;
                        }
                        if (screenContent.equals("")) {
                            calculatorScreen.append("3");
                            break;
                        }
                        res = Double.parseDouble(screenContent) + 3;
                        calculatorScreen.setText(String.valueOf(res));
                        break;
                    case R.id.n4:
                        screenContent = calculatorScreen.getText().toString();
                        if (screenContent.equals("")) {
                            calculatorScreen.append("4");
                            break;
                        }
                        res = Double.parseDouble(screenContent) + 4;
                        calculatorScreen.setText(String.valueOf(res));
                        break;
                    case R.id.n5:
                        screenContent = calculatorScreen.getText().toString();
                        if (screenContent.equals("")) {
                            calculatorScreen.append("5");
                            break;
                        }
                        res = Double.parseDouble(screenContent) + 5;
                        calculatorScreen.setText(String.valueOf(res));
                        break;
                    case R.id.n6:
                        screenContent = calculatorScreen.getText().toString();
                        if (screenContent.equals("")) {
                            calculatorScreen.append("6");
                            break;
                        }
                        res = Double.parseDouble(screenContent) + 6;
                        calculatorScreen.setText(String.valueOf(res));
                        break;
                    case R.id.n7:
                        screenContent = calculatorScreen.getText().toString();
                        if (screenContent.equals("")) {
                            calculatorScreen.append("7");
                            break;
                        }
                        res = Double.parseDouble(screenContent) + 7;
                        calculatorScreen.setText(String.valueOf(res));
                        break;
                    case R.id.n8:
                        screenContent = calculatorScreen.getText().toString();
                        if (screenContent.equals("")) {
                            calculatorScreen.append("8");
                            break;
                        }
                        res = Double.parseDouble(screenContent) + 8;
                        calculatorScreen.setText(String.valueOf(res));
                        break;
                    case R.id.n9:
                        screenContent = calculatorScreen.getText().toString();
                        if (screenContent.equals("")) {
                            calculatorScreen.append("9");
                            break;
                        }
                        res = Double.parseDouble(screenContent) + 9;
                        calculatorScreen.setText(String.valueOf(res));
                        break;
                }
            }
        };
        n1.setOnClickListener(calculatorListener);
        n2.setOnClickListener(calculatorListener);
        n3.setOnClickListener(calculatorListener);
        n4.setOnClickListener(calculatorListener);
        n5.setOnClickListener(calculatorListener);
        n6.setOnClickListener(calculatorListener);
        n7.setOnClickListener(calculatorListener);
        n8.setOnClickListener(calculatorListener);
        n9.setOnClickListener(calculatorListener);

        final Button allClear = findViewById(R.id.ac);
        allClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorScreen.setText("");
                n1.setText("1");
                n2.setText("2");
                n3.setText("3");
                isOthPressed = false;
            }
        });

        final Button other = findViewById(R.id.oth);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1.setText("1/2");
                n2.setText("1/3");
                n3.setText("1/4");
                isOthPressed = true;
            }
        });

    }
}
