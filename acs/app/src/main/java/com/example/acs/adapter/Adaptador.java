package com.example.acs.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.acs.R;
import com.example.acs.model.PassaDados;


import java.util.List;


public class Adaptador  extends RecyclerView.Adapter<Adaptador.MyViewHolder> {

    private List<PassaDados> listaDDados;

    public Adaptador(List<PassaDados> inpumodelo) {
        this.listaDDados = inpumodelo;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_lista_layout, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        PassaDados lista = listaDDados.get( position );
        holder.inputTitulo.setText( lista.getEscrito1() );
        holder.Funcionario.setText( lista.getEscrito2());
        holder.Atdata.setText(lista.getEscrito3());
        holder.Tipo.setText( lista.getEscrito4() );
        holder.Contato.setText( lista.getEscrito5());
    }

    @Override
    public int getItemCount() {
        return this.listaDDados.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView inputTitulo;
        TextView Funcionario;
        TextView Atdata;
        TextView Tipo;
        TextView Contato;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            inputTitulo = itemView.findViewById(R.id.titulo);
            Atdata = itemView.findViewById(R.id.data);
            Contato = itemView.findViewById(R.id.Tell);
            Funcionario = itemView.findViewById(R.id.funci);
            Tipo = itemView.findViewById(R.id.Operac);

        }
    }

}
