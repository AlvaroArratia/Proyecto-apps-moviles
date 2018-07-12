package com.example.alvaroarratia.proyecto

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class EventoAdapter(val eventoList: ArrayList<Evento>): RecyclerView.Adapter<EventoAdapter.ViewHolder>()  {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.msjTitulo?.text = eventoList[position].titulo
        holder?.msjNombre?.text = eventoList[position].nombre
        holder?.txtHora?.text = eventoList[position].hora
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.evento_layout, parent, false)
        return ViewHolder(v);
    }

    override fun getItemCount(): Int {
        return eventoList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val msjTitulo = itemView.findViewById<TextView>(R.id.txtTitulo)
        val msjNombre = itemView.findViewById<TextView>(R.id.txtNombre)
        val txtHora = itemView.findViewById<TextView>(R.id.txtHora)
    }
}