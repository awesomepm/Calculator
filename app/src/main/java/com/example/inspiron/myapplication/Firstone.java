package com.example.inspiron.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Firstone extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstone);
        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        button.setOnClickListener(this);
        button2.setOnClickListener( this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText e1 = (EditText)findViewById(R.id.editText);
        EditText e2 = (EditText)findViewById(R.id.editText2);
        TextView t1 = (TextView)findViewById(R.id.textView);
        long num1 = Integer.parseInt(e1.getText().toString());
        long num2 = Integer.parseInt(e2.getText().toString());
        switch (v.getId()) {
            case R.id.button:
                long sum = num1 + num2;
                if (sum<=2147483647)
                t1.setText(String.valueOf(sum));
                else Toast.makeText(this,"Out of Range",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                long subtract = num1 - num2;
                if (subtract<=2147483647)
                t1.setText(String.valueOf(subtract));
                else Toast.makeText(this,"Out of Range",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                long multiply = num1 * num2;
                if (multiply<=2147483647)
                t1.setText(String.valueOf(multiply));
                else Toast.makeText(this,"Out of Range",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4: try{
                long divide = num1 / num2;
                if (divide<=2147483647)
                t1.setText(String.valueOf(divide));
                else Toast.makeText(this,"Out of Range",Toast.LENGTH_SHORT).show();
            }
            catch(Exception e){
                t1.setText("Cannot Divide!");
            }
                break;

    }
}
}








