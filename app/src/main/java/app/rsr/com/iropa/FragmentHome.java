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

public class FragmentHome extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    RecyclerView recyclerHome;
    ArrayList<ContainerHomeUser> listaContainerHomeUser;

    public FragmentHome() {

    }


    public static FragmentHome newInstance(String param1, String param2) {
        FragmentHome fragment = new FragmentHome();
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

        final View vista = inflater.inflate(R.layout.fragment_fragment_home,container,false);
        listaContainerHomeUser = new ArrayList<>();
        recyclerHome = vista.findViewById(R.id.recycleviewHomeUser);
        recyclerHome.setLayoutManager(new LinearLayoutManager(getContext()));
        llenarlistaHomeUser();
        AdaptadorHomeUser adaptadorHomeUser = new AdaptadorHomeUser(listaContainerHomeUser);
        adaptadorHomeUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getActivity(),ComentariosUser.class);
                startActivity(myIntent);
            }
        });
        recyclerHome.setAdapter(adaptadorHomeUser);
        return vista;
    }

    public void llenarlistaHomeUser(){
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.user,"paulypolish",R.drawable.user,"paulypolish","Comentario")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.user,"_heerb",R.drawable.user,"_heerb","Comentario")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.user,"eduardo.tm58",R.drawable.user,"eduardo.tm58","Comentario")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.user,"chiio_ayame",R.drawable.user,"chiio_ayame","Comentario")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.user,"krnblv",R.drawable.user,"krnblv","Comentario")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.user,"lesz_escobar",R.drawable.user,"lesz_escobar","Comentario")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.user,"alejandrooozf",R.drawable.user,"alejandrooozf","Comentario")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.user,"brauxilio",R.drawable.user,"brauxilio","Comentario")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.user,"eduardo.tm58",R.drawable.user,"eduardo.tm58","Comentario")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.user,"jdavid.pm",R.drawable.user,"jdavid.pm","Comentario")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.user,"wizi_osornio",R.drawable.user,"wizi_osornio","Comentario")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.user,"noe.a.v",R.drawable.user,"noe.a.v","Comentario")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.user,"paulypolish",R.drawable.user,"paulypolish","Comentario")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.user,"krnblv",R.drawable.user,"krnblv","Comentario")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.user,"brauxilio",R.drawable.user,"brauxilio","Comentario")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.user,"alejandrooozf",R.drawable.user,"alejandrooozf","Comentario")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.user,"lesz_escobar",R.drawable.user,"lesz_escobar","Comentario")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.user,"chiio_ayame",R.drawable.user,"chiio_ayame","Comentario")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.user,"noe.a.v",R.drawable.user,"noe.a.v","Comentario")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.user,"alejandrooozf",R.drawable.user,"alejandrooozf","Comentario")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.user,"eduardo.tm58",R.drawable.user,"eduardo.tm58","Comentario")));
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
