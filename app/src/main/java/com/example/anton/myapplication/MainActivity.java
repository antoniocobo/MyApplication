package com.example.anton.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    boolean dec=false;
    boolean sum=false;
    boolean res=false;
    boolean mul=false;
    boolean div=false;
    Double[] numero= new Double[10];
    Double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button n0=(Button)findViewById(R.id.b0);
        n0.setOnClickListener(this);
        Button n1=(Button)findViewById(R.id.b1);
        n1.setOnClickListener(this);
        Button n2=(Button)findViewById(R.id.b2);
        n2.setOnClickListener(this);
        Button n3=(Button)findViewById(R.id.b3);
        n3.setOnClickListener(this);
        Button n4=(Button)findViewById(R.id.b4);
        n4.setOnClickListener(this);
        Button n5=(Button)findViewById(R.id.b5);
        n5.setOnClickListener(this);
        Button n6=(Button)findViewById(R.id.b6);
        n6.setOnClickListener(this);
        Button n7=(Button)findViewById(R.id.b7);
        n7.setOnClickListener(this);
        Button n8=(Button)findViewById(R.id.b8);
        n8.setOnClickListener(this);
        Button n9=(Button)findViewById(R.id.b9);
        n9.setOnClickListener(this);

        Button punto=(Button)findViewById(R.id.bP);
        punto.setOnClickListener(this);

        Button suma=(Button)findViewById(R.id.bSum);
        suma.setOnClickListener(this);
        Button resta=(Button)findViewById(R.id.bRes);
        resta.setOnClickListener(this);
        Button mul=(Button)findViewById(R.id.bMul);
        mul.setOnClickListener(this);
        Button div=(Button)findViewById(R.id.bDiv);
        div.setOnClickListener(this);

        Button borrar=(Button)findViewById(R.id.bD);
        borrar.setOnClickListener(this);
        Button limpiar=(Button)findViewById(R.id.bC);
        limpiar.setOnClickListener(this);

        Button bnoexp=(Button)findViewById(R.id.bCE);
        bnoexp.setOnClickListener(this);
        Button mem=(Button)findViewById(R.id.bM);
        mem.setOnClickListener(this);
     }
    @Override
    public void onClick(View v){
        TextView pantalla = (TextView)findViewById(R.id.texto);
        int seleccion= v.getId();
        String a = pantalla.getText().toString();

            try {
                switch (seleccion) {
                    case R.id.b0:
                        pantalla.setText(a+"0");
                        break;
                    case R.id.b1:
                        pantalla.setText(a+"1");
                        break;
                    case R.id.b2:
                        pantalla.setText(a+"2");
                        break;
                    case R.id.b3:
                        pantalla.setText(a+"3");
                        break;
                    case R.id.b4:
                        pantalla.setText(a+"4");
                        break;
                    case R.id.b5:
                        pantalla.setText(a+"5");
                        break;
                    case R.id.b6:
                        pantalla.setText(a+"6");
                        break;
                    case R.id.b7:
                        pantalla.setText(a+"7");
                        break;
                    case R.id.b8:
                        pantalla.setText(a+"8");
                        break;
                    case R.id.b9:
                        pantalla.setText(a+"9");
                        break;
                    case R.id.bP:
                        if(dec==false) {
                            pantalla.setText(a + ".");
                            dec=true;
                        }else{return;}
                        break;
                    case R.id.bSum:
                        sum=true;
                        numero[0]=Double.parseDouble(a);
                        pantalla.setText("");
                        dec=false;
                        break;
                    case R.id.bRes:
                        res=true;
                        numero[0]=Double.parseDouble(a);
                        pantalla.setText("");
                        dec=false;
                        break;
                    case R.id.bMul:
                        mul=true;
                        numero[0]=Double.parseDouble(a);
                        pantalla.setText("");
                        dec=false;
                        break;
                    case R.id.bDiv:
                        div=true;
                        numero[0]=Double.parseDouble(a);
                        pantalla.setText("");
                        dec=false;
                        break;
                    case R.id.bI:
                        div=true;
                        numero[1]=Double.parseDouble(a);
                        if(sum == true){
                            resultado = numero[0] + numero[1];
                            pantalla.setText(String.valueOf(resultado));
                        }else if(res == true){
                            resultado = numero[0] - numero[1];
                            pantalla.setText(String.valueOf(resultado));
                        }else if(mul == true){
                            resultado = numero[0] * numero[1];
                            pantalla.setText(String.valueOf(resultado));
                        }else if(div == true){
                            resultado = numero[0] / numero[1];
                            pantalla.setText(String.valueOf(resultado));
                        }
                        dec=false;
                        sum=false;
                        res=false;
                        mul=false;
                        div=false;
                        break;
                    case R.id.bD:
                        a=pantalla.getText().toString();
                        if(a.length()>0){
                            a=a.substring(0, a.length()-1);
                            pantalla.setText(a);
                        }
                        break;
                    case R.id.bC:
                        pantalla.setText("");
                        dec=false;
                        break;
                }
            }catch (Exception e){
                pantalla.setText("error");
            };
    }


}


