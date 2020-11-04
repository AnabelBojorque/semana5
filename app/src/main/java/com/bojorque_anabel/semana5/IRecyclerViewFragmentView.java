package com.bojorque_anabel.semana5;

import com.bojorque_anabel.semana5.adapter.ContactoAdapter;
import com.bojorque_anabel.semana5.pojo.Mascotas;

import java.util.ArrayList;

public interface IRecyclerViewFragmentView  {

    public void generarLayoutVertical();

    public ContactoAdapter crearAdaptador(ArrayList<Mascotas> mascotas);

    public void inicializarAdaptador(ContactoAdapter adaptador);
}
