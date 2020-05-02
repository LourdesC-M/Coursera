package com.example.usuarios;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private EditText et4;
    private EditText et5;
    private EditText et6;
    private EditText et7;
    private EditText et8;
    private EditText et9;
    private EditText et10;
    TextView tv_Date;
    EditText et_Date;
    DatePickerDialog.OnDateSetListener setListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        tv_Date=findViewById(R.id.tvdate);
        et_Date=findViewById(R.id.etdate);

        Calendar calendar=Calendar.getInstance();
        final int year =calendar.get(Calendar.YEAR);
        final int month =calendar.get(Calendar.MONTH);
        final int day =calendar.get(Calendar.DAY_OF_MONTH);

        et_Date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        MainActivity.this,android.R.style.Theme_Holo_Light_Dialog_MinWidth,setListener,year,month,day);
                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                datePickerDialog.show();
            }
        });
        setListener= new DatePickerDialog.OnDateSetListener(){
            @Override
            public void onDateSet(DatePicker view, int year, int month, int day) {
                month=month+1;
                String date= day+"/"+month+"/"+year;
                et_Date.setText(date);
            }
        };


        et1=(EditText)findViewById(R.id.eTNombre);
        et9=(EditText)findViewById(R.id.etdate);
        et2=(EditText)findViewById(R.id.eTTelefono);
        et3=(EditText)findViewById(R.id.eTEmail);
        et4=(EditText)findViewById(R.id.eTDescripcion);

        et5=(EditText) findViewById(R.id.eTNombre);
        String datos= getIntent().getStringExtra("inombre1");
        et5.setText(datos);

        et10= findViewById(R.id.etdate);
        String datos4=getIntent().getStringExtra("ifecha1");
        et10.setText(datos4);

        et6=(EditText) findViewById(R.id.eTTelefono);
        String datos1= getIntent().getStringExtra("itelefono1");
        et6.setText(datos1);

        et7=(EditText) findViewById(R.id.eTEmail);
        String datos2= getIntent().getStringExtra("iemail1");
        et7.setText(datos2);

        et8=(EditText) findViewById(R.id.eTDescripcion);
        String datos3= getIntent().getStringExtra("idescripcion1");
        et8.setText(datos3);

    }
    //Metodo para el boton enviar
    public void Enviar(View view){
        Intent intent = new Intent(this, confirmardatos.class);
        intent.putExtra("inombre", et1.getText().toString());
        intent.putExtra("ifecha", et9.getText().toString());
        intent.putExtra("itelefono", et2.getText().toString());
        intent.putExtra("iemail", et3.getText().toString());
        intent.putExtra("idescripcion", et4.getText().toString());
        startActivity(intent);
    }
}
