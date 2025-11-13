package com.abischool.abicalculatorjava;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button buttonAdd, buttonSub, buttonMul, buttonDiv;
    EditText editText1, editText2;
    TextView textView;

    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAdd = findViewById(R.id.btn_add);
        buttonSub = findViewById(R.id.btn_sub);
        buttonMul = findViewById(R.id.btn_mul);
        buttonDiv = findViewById(R.id.btn_div);

        editText1 = findViewById(R.id.number1);
        editText2 = findViewById(R.id.number2);
        textView = findViewById(R.id.answer);

        buttonAdd.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonMul.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
    }

    public int getIntFromEditText(EditText editText){
        if(editText.getText().toString().equals("")){
            Toast.makeText(this, "Enter number", Toast.LENGTH_SHORT).show();
            return 0;
        }

        return Integer.parseInt(editText.getText().toString());
    }

    @Override
    public void onClick(View v) {
        num1 = getIntFromEditText(editText1);
        num2 = getIntFromEditText(editText2);

        if(v.getId() == R.id.btn_add){
            textView.setText("Answere = " + (num1 + num2));
        }

        if(v.getId() == R.id.btn_sub){
            textView.setText("Answere = " + (num1 - num2));
        }

        if(v.getId() == R.id.btn_mul){
            textView.setText("Answere = " + (num1 * num2));
        }

        if(v.getId() == R.id.btn_div){
            textView.setText("Answere = " + ((float)num1 / (float)num2));
        }
        /*
        switch (v.getId()){
            case R.id.btn_add:
                textView.setText("Answere = " + (num1 + num2));
                break;
            case R.id.btn_sub:

                break;
            case R.id.btn_mul:

                break;
            case R.id.btn_div:

                break;
        }*/
    }
}