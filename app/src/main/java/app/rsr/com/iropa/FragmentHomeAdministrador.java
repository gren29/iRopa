package app.rsr.com.iropa;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FragmentHomeAdministrador extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;
    RecyclerView recyclerView;
    ArrayList<ContainerHomeAdministrador> listaContainerhomeAdmin;

    public FragmentHomeAdministrador() {

    }

    public static FragmentHomeAdministrador newInstance(String param1, String param2) {
        FragmentHomeAdministrador fragment = new FragmentHomeAdministrador();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista =  inflater.inflate(R.layout.fragment_fragment_home_administrador, container, false);
        listaContainerhomeAdmin = new ArrayList<>();
        recyclerView = vista.findViewById(R.id.recycleviewHomeAdministrador);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        llenarListaHomeAdmin();
        AdaptadorHomeAdministrador adaptadorHomeAdministrador = new AdaptadorHomeAdministrador(listaContainerhomeAdmin);
        adaptadorHomeAdministrador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getActivity(),ComentariosAdmin.class);
                startActivity(myIntent);
            }
        });
        recyclerView.setAdapter(adaptadorHomeAdministrador);
        return vista;
    }


     public void llenarListaHomeAdmin(){
        //En esta secicion se llena de momento manual las publicacion de cada usuario
        //Aqui va a la base de datos
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.user,"paulypolish",R.drawable.user,"paulypolish","Comentario")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.user,"_heerb",R.drawable.user,"_heerb","Comentario")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.user,"eduardo.tm58",R.drawable.user,"eduardo.tm58","Comentario")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.user,"chiio_ayame",R.drawable.user,"chiio_ayame","Comentario")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.user,"krnblv",R.drawable.user,"krnblv","Comentario")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.user,"lesz_escobar",R.drawable.user,"lesz_escobar","Comentario")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.user,"alejandrooozf",R.drawable.user,"alejandrooozf","Comentario")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.user,"brauxilio",R.drawable.user,"brauxilio","Comentario")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.user,"eduardo.tm58",R.drawable.user,"eduardo.tm58","Comentario")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.user,"jdavid.pm",R.drawable.user,"jdavid.pm","Comentario")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.user,"wizi_osornio",R.drawable.user,"wizi_osornio","Comentario")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.user,"noe.a.v",R.drawable.user,"noe.a.v","Comentario")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.user,"paulypolish",R.drawable.user,"paulypolish","Comentario")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.user,"krnblv",R.drawable.user,"krnblv","Comentario")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.user,"brauxilio",R.drawable.user,"brauxilio","Comentario")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.user,"alejandrooozf",R.drawable.user,"alejandrooozf","Comentario")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.user,"lesz_escobar",R.drawable.user,"lesz_escobar","Comentario")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.user,"chiio_ayame",R.drawable.user,"chiio_ayame","Comentario")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.user,"noe.a.v",R.drawable.user,"noe.a.v","Comentario")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.user,"alejandrooozf",R.drawable.user,"alejandrooozf","Comentario")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.user,"eduardo.tm58",R.drawable.user,"eduardo.tm58","Comentario")));
    }


    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
