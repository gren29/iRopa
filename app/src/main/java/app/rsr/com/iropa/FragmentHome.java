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
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.paulyrobenz_profile_picture,"paulypolish",R.drawable.paulypolish_publicacion,"paulypolish","Se ve chidoliro")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.amyhernandez_profile_picture,"_heerb",R.drawable._heerb_publicacion,"_heerb","Wooooo! Esta increible")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.eduardotenorio_profile_picture,"eduardo.tm58",R.drawable.eduardotm58_publicacion_2,"eduardo.tm58","¿Crees que esté en negro?")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.rocioayame_profile_picture,"chiio_ayame",R.drawable.chiio_ayame_publicacion,"chiio_ayame","Iría perfecto con unos tenis que tengo")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.karenblanco_profile_picture,"krnblv",R.drawable.krnblv_publicacion,"krnblv","Siempre me ha encantado ese color")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.leslieescobar_profile_picture,"lesz_escobar",R.drawable.lesz_escobar_publicacion,"lesz_escobar","Está espectacular")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.alejandrozepeda_profile_picture,"alejandrooozf",R.drawable.alejandrooozf_publicacion,"alejandrooozf","Creo que vi ese mismo modelo en el centro")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.brauliogarcia_profile_picture,"brauxilio",R.drawable.brauxilio_publicacion,"brauxilio","¿Estará dsiponible en mi talla?")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.eduardotenorio_profile_picture,"eduardo.tm58",R.drawable.eduardotm58_publicacion_2,"eduardo.tm58","Está super hermoso pero creo que es dificil de combinar")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.davidportilla_profile_picture,"jdavid.pm",R.drawable.jdavidpm_publicacion,"jdavid.pm","Genial, ya sé con que lo usaría")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.luisosornio_profile_picture,"wizi_osornio",R.drawable.wizi_osornio_publicacion,"wizi_osornio","Tengo una pieza igualita a esa")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.noeacosta_profile_picture,"noe.a.v",R.drawable.noeav_publicacion,"noe.a.v","No inventes, simpre la busqué")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.paulyrobenz_profile_picture,"paulypolish",R.drawable.paulypolish_publicacion_2,"paulypolish","No sabía que lo quería hasta que lo ví")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.karenblanco_profile_picture,"krnblv",R.drawable.krnblv_publicacion_2,"krnblv","Me encantooooo")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.brauliogarcia_profile_picture,"brauxilio",R.drawable.brauxilio_publicacion_2,"brauxilio","Lo necesito")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.alejandrozepeda_profile_picture,"alejandrooozf",R.drawable.alejandrooozf_publicacion_2,"alejandrooozf","Quedaría perfecto con un collar que tengo")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.leslieescobar_profile_picture,"lesz_escobar",R.drawable.lesz_escobar_publicacion_2,"lesz_escobar","La combinacion perfecta entre formal y casual")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.rocioayame_profile_picture,"chiio_ayame",R.drawable.chiio_ayame_publicacion_2,"chiio_ayame","Se ve super cómodo")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.noeacosta_profile_picture,"noe.a.v",R.drawable.noeav_publicacion_2,"noe.a.v","Estoy seguro que lo he visto antes")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.alejandrozepeda_profile_picture,"alejandrooozf",R.drawable.alejandrooozf_publicacion_3,"alejandrooozf","Creo que me enamoré desde que lo ví")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.eduardotenorio_profile_picture,"eduardo.tm58",R.drawable.eduardotm58_publicacion_3,"eduardo.tm58","Comentario")));
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
