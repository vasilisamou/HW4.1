package com.example.hw31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText;
    double num1=0;
    double num2=0;
    char op= ' ';
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.editText);
        Button btn_0= findViewById(R.id.btn_0);
        btn_0.setOnClickListener(this);
        Button btn_1= findViewById(R.id.btn_1 );
        btn_1.setOnClickListener(this);
        Button btn_2= findViewById(R.id.btn_2 );
        btn_2.setOnClickListener(this);
        Button btn_3= findViewById(R.id.btn_3 );
        btn_3.setOnClickListener(this);
        Button btn_4= findViewById(R.id.btn_4 );
        btn_4.setOnClickListener(this);
        Button btn_5= findViewById(R.id.btn_5);
        btn_5.setOnClickListener(this);
        Button btn_6= findViewById(R.id.btn_6);
        btn_6.setOnClickListener(this);
        Button btn_7= findViewById(R.id.btn_7);
        btn_7.setOnClickListener(this);
        Button btn_8= findViewById(R.id.btn_8);
        btn_8.setOnClickListener(this);
        Button btn_9= findViewById(R.id.btn_9);
        btn_9.setOnClickListener(this);
        Button btn_clr= findViewById(R.id.btn_clr);
        btn_clr.setOnClickListener(this);
        Button btn_div= findViewById(R.id.btn_div);
        btn_div.setOnClickListener(this);
        Button btn_mul= findViewById(R.id.btn_mul);
        btn_mul.setOnClickListener(this);
        Button btn_add= findViewById(R.id.btn_add);
        btn_add.setOnClickListener(this);
        Button btn_minus= findViewById(R.id.btn_minus);
        btn_minus.setOnClickListener(this);
        Button btn_eql= findViewById(R.id.btn_eql);
        btn_eql.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String strNum= editText.getText().toString();
        switch (v.getId() ) {
            case R.id.btn_0:
                editText.setText(strNum+"0");
                break;
            case R.id.btn_1:
                editText.setText(strNum+"1");
                break;
            case R.id.btn_2:
                editText.setText(strNum+"2");
                break;
            case R.id.btn_3:
                editText.setText(strNum+"3");
                break;
            case R.id.btn_4:
                editText.setText(strNum+"4");
                break;
            case R.id.btn_5:
                editText.setText(strNum+"5");
                break;
            case R.id.btn_6:
                editText.setText(strNum+"6");
                break;
            case R.id.btn_7:
                editText.setText(strNum+"7");
                break;
            case R.id.btn_8:
                editText.setText(strNum+"8");
                break;
            case R.id.btn_9:
                editText.setText(strNum+"9");
                break;
            case R.id.btn_add:
                num1= Double.valueOf(editText.getText().toString());
                op='+';
                editText.setText(" ");
                break;
            case R.id.btn_minus:
                num1= Double.valueOf(editText.getText().toString());
                op='-';
                editText.setText(" ");
                break;
            case R.id.btn_div:
                num1= Double.valueOf(editText.getText().toString());
                op='/';
                editText.setText(" ");
                break;
            case R.id.btn_mul:
                num1= Double.valueOf(editText.getText().toString());
                op='*';
                editText.setText(" ");
                break;
            case R.id.btn_eql:
                num2= Double.valueOf(editText.getText().toString());
                editText.setText("");
                switch (op){
                    case '+':
                        editText.setText(String.valueOf(num1+num2));
                        break;
                    case '-':
                        editText.setText(String.valueOf(num1-num2));
                        break;
                    case '*':
                        editText.setText(String.valueOf(num1*num2));
                        break;
                    case '/':
                        editText.setText(String.valueOf(num1/num2));
                        break;
                }
                break;
            case R.id.btn_clr:
                editText.setText("");
                strNum ="";
                break;


        }
    }
}