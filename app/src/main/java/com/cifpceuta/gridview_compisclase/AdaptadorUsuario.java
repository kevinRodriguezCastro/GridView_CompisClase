package com.cifpceuta.gridview_compisclase;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AdaptadorUsuario extends ArrayAdapter<Usuario> {
    private Activity context;
    private ArrayList<Usuario> usuarios;
    public AdaptadorUsuario(Activity c, ArrayList<Usuario> usuarios) {
        super(c,R.layout.layout_usuarios,usuarios);
        this.context = c;
        this.usuarios = usuarios;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View fila = inflater.inflate(R.layout.layout_usuarios,parent,false);

        Usuario usuario = usuarios.get(position);
        ImageView imagen;
        TextView nombre;

        imagen = (ImageView) fila.findViewById(R.id.img);
        nombre = (TextView) fila.findViewById(R.id.nombre);

        imagen.setImageResource(usuario.getImagen());
        nombre.setText(usuario.getNombre());

        return fila;
    }
}
