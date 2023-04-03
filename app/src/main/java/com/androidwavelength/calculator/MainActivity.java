package com.androidwavelength.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView ResultText;
    private Button btnClear, btnLeftBracket, btnRightBracket, btnMod,
            btn7, btn8, btn9, btnDivide,
            btn4, btn5, btn6, btnMultiply,
            btn1, btn2, btn3, btnMinus,
            btn0, btnDot, btnEqualTo, btnPlus;
    private double number1 = 0, number2 = 0;
    private boolean addition, subtraction, division, multiplication, mod, decimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        setupListeners();
    }

    private void setupListeners() {
        btnClear.setOnClickListener(new BtnClearClickListener());
        btnLeftBracket.setOnClickListener(new BtnLeftBracketClickListener());
        btnRightBracket.setOnClickListener(new BtnRightBracketClickListener());
        btnMod.setOnClickListener(new BtnModClickListener());
        btn7.setOnClickListener(new Btn7ClickListener());
        btn8.setOnClickListener(new Btn8ClickListener());
        btn9.setOnClickListener(new Btn9ClickListener());
        btnDivide.setOnClickListener(new BtnDivideClickListener());
        btn4.setOnClickListener(new Btn4ClickListener());
        btn5.setOnClickListener(new Btn5ClickListener());
        btn6.setOnClickListener(new Btn6ClickListener());
        btnMultiply.setOnClickListener(new BtnMultiplyClickListener());
        btn1.setOnClickListener(new Btn1ClickListener());
        btn2.setOnClickListener(new Btn2ClickListener());
        btn3.setOnClickListener(new Btn3ClickListener());
        btnMinus.setOnClickListener(new BtnMinusClickListener());
        btn0.setOnClickListener(new Btn0ClickListener());
        btnDot.setOnClickListener(new BtnDotClickListener());
        btnEqualTo.setOnClickListener(new BtnEqualToClickListener());
        btnPlus.setOnClickListener(new BtnPlusClickListener());
    }

    private void initViews() {
        ResultText = findViewById(R.id.ResultText);
        btnClear = findViewById(R.id.btnClear);
        btnLeftBracket = findViewById(R.id.btnLeftBracket);
        btnRightBracket = findViewById(R.id.btnRightBracket);
        btnMod = findViewById(R.id.btnMod);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnDivide = findViewById(R.id.btnDivide);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btnMultiply = findViewById(R.id.btnMultiply);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btnMinus = findViewById(R.id.btnMinus);
        btn0 = findViewById(R.id.btn0);
        btnDot = findViewById(R.id.btnDot);
        btnEqualTo = findViewById(R.id.btnEqualTo);
        btnPlus = findViewById(R.id.btnPlus);
    }

    private class Btn0ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            ResultText.setText(ResultText.getText() + "0");
        }
    }

    private class Btn1ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            ResultText.setText(ResultText.getText() + "1");
        }
    }

    private class Btn2ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            ResultText.setText(ResultText.getText() + "2");
        }
    }

    private class Btn3ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            ResultText.setText(ResultText.getText() + "3");
        }
    }

    private class Btn4ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            ResultText.setText(ResultText.getText() + "4");
        }
    }

    private class Btn5ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            ResultText.setText(ResultText.getText() + "5");
        }
    }

    private class Btn6ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            ResultText.setText(ResultText.getText() + "6");
        }
    }

    private class Btn7ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            ResultText.setText(ResultText.getText() + "7");
        }
    }

    private class Btn8ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            ResultText.setText(ResultText.getText() + "8");
        }
    }

    private class Btn9ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            ResultText.setText(ResultText.getText() + "9");
        }
    }

    private class BtnLeftBracketClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            ResultText.setText(ResultText.getText() + "(");
        }
    }

    private class BtnRightBracketClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            ResultText.setText(ResultText.getText() + ")");
        }
    }

    private class BtnPlusClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (ResultText.getText().length() != 0) {
                number1 = Float.parseFloat(ResultText.getText() + "");
                addition = true;
                decimal = false;
                ResultText.setText(null);
            }
        }
    }

    private class BtnMinusClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (ResultText.getText().length() != 0) {
                number1 = Float.parseFloat(ResultText.getText() + "");
                subtraction = true;
                decimal = false;
                ResultText.setText(null);
            }
        }
    }

    private class BtnMultiplyClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (ResultText.getText().length() != 0) {
                number1 = Float.parseFloat(ResultText.getText() + " ");
                multiplication = true;
                decimal = false;
                ResultText.setText(null);
            }
        }
    }

    private class BtnDivideClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (ResultText.getText().length() != 0) {
                number1 = Float.parseFloat(ResultText.getText() + " ");
                division = true;
                decimal = false;
                ResultText.setText(null);
            }
        }
    }

    private class BtnModClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (ResultText.getText().length() != 0) {
                number1 = Float.parseFloat(ResultText.getText() + " ");
                mod = true;
                decimal = false;
                ResultText.setText(null);
            }
        }
    }

    private class BtnClearClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            ResultText.setText("");
            number1 = 0.0;
            number2 = 0.0;
        }
    }

    private class BtnDotClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (decimal) {

            } else {
                ResultText.setText(ResultText.getText() + ".");
                decimal = true;
            }
        }
    }

    private class BtnEqualToClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (addition || subtraction || division || multiplication || mod) {
                number2 = Float.parseFloat(ResultText.getText() + "");
            }
            if (addition) {
                ResultText.setText(number1 + number2 + "");
                addition = false;
            }
            if (subtraction) {
                ResultText.setText(number1 - number2 + "");
                subtraction = false;
            }
            if (multiplication) {
                ResultText.setText(number1 * number2 + "");
                multiplication = false;
            }

            if (division) {
                ResultText.setText(number1 / number2 + "");
                division = false;
            }

            if (mod) {
                ResultText.setText(number1 % number2 + "");
                mod = false;
            }
        }
    }
}
