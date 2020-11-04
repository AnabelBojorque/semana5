package com.bojorque_anabel.semana5;

import com.bojorque_anabel.semana5.adapter.MascotaAdapter;
import com.bojorque_anabel.semana5.pojo.Mascotas;

import java.util.ArrayList;

public interface IMascotasFragmentView {

    public void generarLayoutGrid();

    public MascotaAdapter crearAdaptador(ArrayList<Mascotas> mascotas);

    public void inicializarAdaptador(MascotaAdapter adaptador);
}
