package com.cifpceuta.gridview_compisclase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private GridView lista;
    private AdaptadorUsuario adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = (GridView) findViewById(R.id.lista);

        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario(R.drawable.avatar1_chico,"usuario 1"));
        usuarios.add(new Usuario(R.drawable.avatar2_chica,"usuario 2"));
        usuarios.add(new Usuario(R.drawable.avatar3_chico,"usuario 3"));
        usuarios.add(new Usuario(R.drawable.avatar4_chica,"usuario 4"));

        adapter = new AdaptadorUsuario(this,usuarios);

        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Usuario usuario = (Usuario) adapter.getItem(position);
                Intent i = new Intent(view.getContext(), ChatActivity.class);
                i.putExtra("img",usuario.getImagen());
                i.putExtra("nombre",usuario.getNombre());
                startActivity(i);
            }
        });

    }
}