package com.cifpceuta.gridview_compisclase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ChatActivity extends AppCompatActivity {
    private ImageView imagen;
    private TextView nombre,mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        imagen = (ImageView) findViewById(R.id.imgChat);
        nombre = (TextView) findViewById(R.id.nombreChat);
        mensaje = (TextView) findViewById(R.id.mensaje);

        Intent extra = getIntent();

        nombre.setText(extra.getStringExtra("nombre"));
        imagen.setImageResource(extra.getIntExtra("img",0));
        mensaje.setText(nombre.getText()+" dice: ");
    }
    public void volverMain(View v){
        Toast.makeText(this,"click",Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }
}