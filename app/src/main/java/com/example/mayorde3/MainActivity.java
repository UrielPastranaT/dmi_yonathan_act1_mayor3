package com.example.mayorde3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button   btnCalcular;
    private Button   btnLimpiar;
    private EditText tfN1;
    private EditText tfN2;
    private EditText tfN3;
    private TextView lblResultado;

    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tfN1 = (EditText)findViewById(R.id.tfN1);
        tfN2 = (EditText)findViewById(R.id.tfN2);
        tfN3 = (EditText)findViewById(R.id.tfN3);

        lblResultado = (TextView) findViewById(R.id.lblResultado);

        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                int n1 = Integer.parseInt(tfN1.getText().toString());
                int n2 = Integer.parseInt(tfN2.getText().toString());
                int n3 = Integer.parseInt(tfN3.getText().toString());

                if(n1 > n2 && n1 > n3)
                {
                    lblResultado.setText(String.valueOf(n1));
                }
                else if(n2 > n1 && n2 > n3)
                {
                    lblResultado.setText(String.valueOf(n2));
                }
                else
                {
                    lblResultado.setText(String.valueOf(n3));
                }
            }
        });

        btnLimpiar = (Button)findViewById(R.id.btnLimpiar);
        btnLimpiar.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                tfN1.setText("");
                tfN2.setText("");
                tfN3.setText("");

                lblResultado.setText("");
            }
        });
    }
}