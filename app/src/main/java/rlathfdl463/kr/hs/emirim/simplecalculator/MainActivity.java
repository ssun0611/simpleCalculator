package rlathfdl463.kr.hs.emirim.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit_first;
    EditText edit_second;
    TextView textResult;
    int num1;
    int num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_first=(EditText)findViewById(R.id.edit_first);
        edit_second=(EditText)findViewById(R.id.edit_second);
        Button but_plus=(Button)findViewById(R.id.but_plus);
        Button but_minus=(Button)findViewById(R.id.but_minus);
        Button but_multiply=(Button)findViewById(R.id.but_multiply);
        Button but_division=(Button)findViewById(R.id.but_division);
        textResult=(TextView)findViewById(R.id.text_result);

        but_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final int num1=Integer.parseInt(edit_first.getText().toString());
                final int num2=Integer.parseInt(edit_second.getText().toString());
                textResult.setText("결과는:" + (num1 + num2));
            }
        });

        but_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(edit_first.getText().toString());
                num2=Integer.parseInt(edit_second.getText().toString());
                textResult.setText("결과는:" + (num1 - num2));
            }
        });

        but_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(edit_first.getText().toString());
                num2=Integer.parseInt(edit_second.getText().toString());
                textResult.setText("결과는:" + (num1 * num2));
            }
        });

        but_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(edit_first.getText().toString());
                num2=Integer.parseInt(edit_second.getText().toString());
                textResult.setText("결과는:" + (num1 / num2));
            }
        });

    }
}
