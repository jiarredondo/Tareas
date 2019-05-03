package com.example.tarea1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    TextView result;
    int valor1;
    int valor2;
    String signo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1 = 0;
        valor2 = 0;
        setupUI();
    }

    private void setupUI() {
        //final TextView mTextView = (TextView) findViewById(R.id.textview);
        //mTextView.setText(R.string.app_name);



        Button mbutton1 = (Button) findViewById(R.id.btn1);

        mbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText et1 =  (EditText) findViewById(R.id.edtitext);
                int uno = 1;

                String valor = et1.getText() + String.valueOf(uno);
                et1.setText(valor);

            }
        });

        Button mbuttonc = (Button) findViewById(R.id.btnc);

        mbuttonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText et1 =  (EditText) findViewById(R.id.edtitext);
                int cero = 0;

                String valor = String.valueOf(cero);
                et1.setText(valor);


            }
        });

        Button mbutton2 = (Button) findViewById(R.id.btn2);

        mbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText et1 =  (EditText) findViewById(R.id.edtitext);
                int dos = 2;

                String valor = et1.getText() + String.valueOf(dos);
                et1.setText(valor);
            }
        });

        Button mbutton3 = (Button) findViewById(R.id.btn3);

        mbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText et1 =  (EditText) findViewById(R.id.edtitext);
                int tres = 3;

                String valor = et1.getText() + String.valueOf(tres);
                et1.setText(valor);
            }
        });

        Button mbutton4 = (Button) findViewById(R.id.btn4);

        mbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText et1 =  (EditText) findViewById(R.id.edtitext);
                int cuatro = 4;

                String valor = et1.getText() + String.valueOf(cuatro);
                et1.setText(valor);
            }
        });

        Button mbutton5 = (Button) findViewById(R.id.btn5);

        mbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText et1 =  (EditText) findViewById(R.id.edtitext);
                int cinco = 5;

                String valor = et1.getText() + String.valueOf(cinco);
                et1.setText(valor);

            }
        });

        Button mbutton6 = (Button) findViewById(R.id.btn6);

        mbutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText et1 =  (EditText) findViewById(R.id.edtitext);
                int seis = 6;

                String valor = et1.getText() + String.valueOf(seis);
                et1.setText(valor);
            }
        });

        Button mbutton7 = (Button) findViewById(R.id.btn7);

        mbutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText et1 =  (EditText) findViewById(R.id.edtitext);
                int siete = 7;

                String valor = et1.getText() + String.valueOf(siete);
                et1.setText(valor);

            }
        });

        Button mbutton8 = (Button) findViewById(R.id.btn8);

        mbutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText et1 =  (EditText) findViewById(R.id.edtitext);
                int ocho = 8;

                String valor = et1.getText() + String.valueOf(ocho);
                et1.setText(valor);
            }
        });

        Button mbutton9 = (Button) findViewById(R.id.btn9);

        mbutton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText et1 =  (EditText) findViewById(R.id.edtitext);
                int nueve = 9;

                String valor = et1.getText() + String.valueOf(nueve);
                et1.setText(valor);

            }
        });

        Button mbutton0 = (Button) findViewById(R.id.btn0);

        mbutton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText et1 =  (EditText) findViewById(R.id.edtitext);
                int cero = 0;

                String valor = et1.getText() + String.valueOf(cero);
                et1.setText(valor);

            }
        });


        Button mbuttonmas = (Button) findViewById(R.id.btnmas);

        mbuttonmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et1 =  (EditText) findViewById(R.id.edtitext);
                signo = "+";
                valor1 = Integer.parseInt(et1.getText().toString());
                et1.setText("");
            }
        });

        Button mbuttonmenos = (Button) findViewById(R.id.btnmenos);
        mbuttonmenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et1 =  (EditText) findViewById(R.id.edtitext);
                signo = "-";
                valor1 = Integer.parseInt(et1.getText().toString());
                et1.setText("");
            }
        });

        Button mbuttonmulti = (Button) findViewById(R.id.btnmulti);
        mbuttonmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et1 =  (EditText) findViewById(R.id.edtitext);
                signo = "*";
                valor1 = Integer.parseInt(et1.getText().toString());
                et1.setText("");

            }
        });

        Button mbuttonigual = (Button) findViewById(R.id.btnigual);
        mbuttonigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText et1 = (EditText) findViewById(R.id.edtitext);
                int nro1 = valor1;

                int res=0;

                 if (et1.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "No se puede realizar calculo", Toast.LENGTH_SHORT).show();
                } else {
                    int nro2 = Integer.parseInt(et1.getText().toString());
                        if (signo == "+") {
                            res = nro1 + nro2;
                        } else {
                            if (signo == "-") {
                                res = nro1 - nro2;
                            } else {

                                res = nro1 * nro2;
                            }

                        }
                    }

                String valor = String.valueOf(res);
                et1.setText(valor);

                Intent intent = new Intent();
                intent.setClass(getApplicationContext(),Main2Activity.class);
                intent.putExtra("calculo",String.valueOf(res));
                startActivity(intent);
            }

        });

    }
}
