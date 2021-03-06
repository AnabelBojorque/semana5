package com.bojorque_anabel.semana5.presenter;

import android.content.Context;

import com.bojorque_anabel.semana5.IMascotasFragmentView;
import com.bojorque_anabel.semana5.db.ConstrutorMascotas;
import com.bojorque_anabel.semana5.pojo.Mascotas;

import java.util.ArrayList;

public class MascotasFragmentPresenter implements IRecyclerViewFragmentPresenter {
    private IMascotasFragmentView mIMascotasFragmentView;
    private Context mContext;
    private ConstrutorMascotas mConstrutorMascotas;
    private ArrayList<Mascotas> mMascotas;

    public MascotasFragmentPresenter(IMascotasFragmentView iMascotasFragmentView, Context context) {
        this.mIMascotasFragmentView=iMascotasFragmentView;
        this.mContext=context;
        obtenerContactosBaseDatos();
    }

    @Override
    public void obtenerContactosBaseDatos() {
        mConstrutorMascotas = new ConstrutorMascotas(mContext);
        mMascotas= mConstrutorMascotas.obtenerMascotas();
        mostrarContactosRV();
    }

    @Override
    public void mostrarContactosRV() {
        mIMascotasFragmentView.inicializarAdaptador(mIMascotasFragmentView.crearAdaptador(mMascotas));
        mIMascotasFragmentView.generarLayoutGrid();
    }
}
