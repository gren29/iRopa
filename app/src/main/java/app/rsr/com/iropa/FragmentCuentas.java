package app.rsr.com.iropa;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FragmentCuentas extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    RecyclerView recyclerView;
    ArrayList<ContainerCuentasAdministrador> listaCuentasAdministrador;
    public FragmentCuentas() {

    }

    public static FragmentCuentas newInstance(String param1, String param2) {
        FragmentCuentas fragment = new FragmentCuentas();
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
        /*
        View vista = inflater.inflate(R.layout.fragment_fragment_home,container,false);
        listaContainerHomeUser = new ArrayList<>();
        recyclerHome = vista.findViewById(R.id.recycleviewHomeUser);
        recyclerHome.setLayoutManager(new LinearLayoutManager(getContext()));
        llenarlistaHomeUser();
        AdaptadorHomeUser adaptadorHomeUser = new AdaptadorHomeUser(listaContainerHomeUser);
        adaptadorHomeUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aqui se va a pasar al la actividad donde estan todos los mensajes de la publicicacion
                Toast.makeText(getContext(),"Se pareto el boton",Toast.LENGTH_SHORT).show();
                Intent myIntent = new Intent(getActivity(),ComentariosUser.class);
                startActivity(myIntent);
            }
        });
        recyclerHome.setAdapter(adaptadorHomeUser);
        return vista;
         */
        View vista = inflater.inflate(R.layout.fragment_fragment_cuentas, container, false);
        listaCuentasAdministrador = new ArrayList<>();
        recyclerView = vista.findViewById(R.id.recyclevieCuentasAdministrador);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        llenarCuentas();
        AdaptadorCunetasAdministrador adaptadorCunetasAdministrador = new AdaptadorCunetasAdministrador(listaCuentasAdministrador);
        adaptadorCunetasAdministrador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        recyclerView.setAdapter(adaptadorCunetasAdministrador);
        return  vista;
    }

    public void llenarCuentas(){
        listaCuentasAdministrador.add(new ContainerCuentasAdministrador("paulypolish","Pauly Robenz","pauly@gmail.com"));
        listaCuentasAdministrador.add(new ContainerCuentasAdministrador("_heerb","Amy Hernandez","amy_herb@gmail.com"));
        listaCuentasAdministrador.add(new ContainerCuentasAdministrador("brauxilio","Braulio Garcia","brau-97@gmail.com"));
        listaCuentasAdministrador.add(new ContainerCuentasAdministrador("chiio_ayame","Rocio Ayame","roci_amy@gmail.com"));
        listaCuentasAdministrador.add(new ContainerCuentasAdministrador("noe.a.v","Noe Acosta","noe_acos@gmail.com"));
        listaCuentasAdministrador.add(new ContainerCuentasAdministrador("krnblv","Karen Blanco","kar_blanco@gmail.com"));
        listaCuentasAdministrador.add(new ContainerCuentasAdministrador("jdavid.pm","David Portilla","david_por1@gmail.com"));
        listaCuentasAdministrador.add(new ContainerCuentasAdministrador("lesz_escobar","Leslie Escobar","andrea@gmail.com"));
        listaCuentasAdministrador.add(new ContainerCuentasAdministrador("wizi_osornio","Luis Osornio","luis_oso@gmail.com"));
        listaCuentasAdministrador.add(new ContainerCuentasAdministrador("alejandrooozf","Alejandro Zepeda","zepeda_chido@gmail.com"));
        listaCuentasAdministrador.add(new ContainerCuentasAdministrador("eduardo.tm58","Eduardo Tenorio","dontenorio@gmail.com"));

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

        void onFragmentInteraction(Uri uri);
    }
}
