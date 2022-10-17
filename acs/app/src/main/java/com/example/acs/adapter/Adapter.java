package com.example.acs.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.acs.R;
import com.example.acs.model.modelo;

import java.util.List;

public class Adapter  extends RecyclerView.Adapter<Adapter.MyViewHolder> {


    private List<modelo> listaDeTexto;
    public Adapter(List<modelo> ListaAd) {
        this.listaDeTexto = ListaAd;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        modelo texto = listaDeTexto.get(position);
        holder.Titulo.setText( texto.getTitulo()); // add titulo no item da lista
        holder.Data.setText(   texto.getData());  // add data no item da lista
        holder.Texto.setText(  texto.getTexto());  // add um resumo descritivo no item da lista
    }

    @Override
    public int getItemCount() {
        return listaDeTexto.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView Titulo;
        TextView Data;
        TextView Texto;

        public MyViewHolder(View itemView) {
            super(itemView);

            this.Titulo = itemView.findViewById(R.id.TituloAD);
            this.Data = itemView.findViewById(R.id.DataAD);
            this.Texto = itemView.findViewById(R.id.TextoAD);

        }
    }
}
