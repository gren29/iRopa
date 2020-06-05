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
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.paulyrobenz_profile_picture,"paulypolish",R.drawable.paulypolish_publicacion,"paulypolish","Esa combinación  nunca va a pasar de moda, simplemente perfecta, les comparto la información por si les interesa")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.amyhernandez_profile_picture,"_heerb",R.drawable._heerb_publicacion,"_heerb","Esté conjunto se ve super formal y al mismo tiempo esta muy cómodo, se los recomiendo totalmente, aparte el azul nunca pasa de moda")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.eduardotenorio_profile_picture,"eduardo.tm58",R.drawable.eduardotm58_publicacion_2,"eduardo.tm58","No me jusguen pero esta blusa está espectacular!!! Tendrán más información acerca de ropa como esta")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.rocioayame_profile_picture,"chiio_ayame",R.drawable.chiio_ayame_publicacion,"chiio_ayame","Me encanta como se le vé este outfit, lo puyeden comprar completo en una tiendo en el centro, les dejo la información por si les interesa")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.karenblanco_profile_picture,"krnblv",R.drawable.krnblv_publicacion,"krnblv","Es un Pantalon super cómodo, se los recomiendo muchisimos, a parte de que el color es increible y sobre todo está barato")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.leslieescobar_profile_picture,"lesz_escobar",R.drawable.lesz_escobar_publicacion,"lesz_escobar","Este pantalon esta totalmente a la moda, me parece genial ese modelo, pero hay que saber usarlo")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.alejandrozepeda_profile_picture,"alejandrooozf",R.drawable.alejandrooozf_publicacion,"alejandrooozf","Ese sueter es perfecto para esta épocas de frio, se los recomiendo mucho")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.brauliogarcia_profile_picture,"brauxilio",R.drawable.brauxilio_publicacion,"brauxilio","Este sueter está super cómodo, lo uso cuando llego a mi casa sobre todo en este frio.")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.eduardotenorio_profile_picture,"eduardo.tm58",R.drawable.eduardotm58_publicacion_2,"eduardo.tm58","Está super hermoso pero creo que es dificil de combinar")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.davidportilla_profile_picture,"jdavid.pm",R.drawable.jdavidpm_publicacion,"jdavid.pm","Esta muy cool sta sudadera, es unisex, asi que quien sea la puede usar, de las recomiendo 100%")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.luisosornio_profile_picture,"wizi_osornio",R.drawable.wizi_osornio_publicacion,"wizi_osornio","Ese gorro me gusta demasiado, yo digo que todos deberiamos de tener almenos uno igual, vena la descrioción completa")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.noeacosta_profile_picture,"noe.a.v",R.drawable.noeav_publicacion,"noe.a.v","Este sueter es increible, su color no es común pero se los recomiendo demasiado, se verán diferente y elegantes")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.paulyrobenz_profile_picture,"paulypolish",R.drawable.paulypolish_publicacion_2,"paulypolish","Este sueter va perfecto con cualquier cosa, es la combinacion entre juvenil, formal e informal")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.karenblanco_profile_picture,"krnblv",R.drawable.krnblv_publicacion_2,"krnblv","Me encantooooo ese color, el color moztaza es mi favorito, y esta super fresco, se los recomiendo totalmente")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.brauliogarcia_profile_picture,"brauxilio",R.drawable.brauxilio_publicacion_2,"brauxilio","Le compré este sueter a mi novia, le gusto de inmediato, se los comparto por si les interesaría comprarlo, está muy barato")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.alejandrozepeda_profile_picture,"alejandrooozf",R.drawable.alejandrooozf_publicacion_2,"alejandrooozf","¿Al guien ha visto este sueter? Lo llevo buscando más de un mes")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.leslieescobar_profile_picture,"lesz_escobar",R.drawable.lesz_escobar_publicacion_2,"lesz_escobar","Ese sueter se les ve super bien, al menos a mi me gusta como se vé, deberían de usarlos más")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.rocioayame_profile_picture,"chiio_ayame",R.drawable.chiio_ayame_publicacion_2,"chiio_ayame","Esta super cómodo, veo a mi novio le encanta usarlo, nunca se lo quita, creo que le gustaría saber más de él")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.noeacosta_profile_picture,"noe.a.v",R.drawable.noeav_publicacion_2,"noe.a.v","Ese sueter se ve super genial, saben donde lo podria conseguir para un regalo")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.alejandrozepeda_profile_picture,"alejandrooozf",R.drawable.alejandrooozf_publicacion_3,"alejandrooozf","Este pantalon lo compré hace un més y les puedo decir que me encanta, es muy cómodo y simplemente combina con todo!!!!!")));
         listaContainerhomeAdmin.add((new ContainerHomeAdministrador(R.drawable.eduardotenorio_profile_picture,"eduardo.tm58",R.drawable.eduardotm58_publicacion_3,"eduardo.tm58","Esta playera es mi favorita, me encanta, mas porque combina con todo y el corte es el mejor que he tenido")));
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
