package com.example.usuarios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class confirmardatos extends AppCompatActivity {

    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmardatos);

        tv1=(TextView) findViewById(R.id.tvrnombre);
        String datos= getIntent().getStringExtra("inombre");
        tv1.setText(datos);

        tv5= findViewById(R.id.tvrFecha);
        String datos4= getIntent().getStringExtra("ifecha");
        tv5.setText(datos4);

        tv2=(TextView) findViewById(R.id.tvrTelefono);
        String datos1= getIntent().getStringExtra("itelefono");
        tv2.setText(datos1);

        tv3=(TextView) findViewById(R.id.tvrEmail);
        String datos2= getIntent().getStringExtra("iemail");
        tv3.setText(datos2);

        tv4=(TextView) findViewById(R.id.tvContenido);
        String datos3= getIntent().getStringExtra("idescripcion");
        tv4.setText(datos3);
    }

//Metodo para el boton regresar
    public void regresar(View view){
        Intent intent=new Intent(this, MainActivity.class);
        intent.putExtra("inombre1", tv1.getText().toString());
        intent.putExtra("ifecha1",tv5.getText().toString());
        intent.putExtra("itelefono1", tv2.getText().toString());
        intent.putExtra("iemail1", tv3.getText().toString());
        intent.putExtra("idescripcion1", tv4.getText().toString());
        startActivity(intent);

    }
}
