package com.example.tiagoandrade.atividade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public Button btnClicar;
    public TextView txtInserido;
    public EditText txtNovo;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClicar = (Button) findViewById(R.id.btnCumprimentar);
        txtInserido = (TextView) findViewById(R.id.labelMensagem);
        txtNovo = (EditText) findViewById(R.id.editNome);


        btnClicar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String textoQueDigiteiNaCaixa = txtNovo.getText().toString();

                txtInserido.setText("Alô, "+textoQueDigiteiNaCaixa+"!");

            }

            });
    }
}
