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

    String idUserGlobal = null;

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
        idUserGlobal = getArguments().getString("idUserGlobal");
        //Toast.makeText(getContext(),"Homo F : "+idUserGlobal,Toast.LENGTH_SHORT).show();
        listaContainerHomeUser = new ArrayList<>();
        recyclerHome = vista.findViewById(R.id.recycleviewHomeUser);
        recyclerHome.setLayoutManager(new LinearLayoutManager(getContext()));
        llenarlistaHomeUser();
        AdaptadorHomeUser adaptadorHomeUser = new AdaptadorHomeUser(listaContainerHomeUser);
        adaptadorHomeUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getActivity(),ComentariosUser.class);
                myIntent.putExtra("idUserGlobal",idUserGlobal);
                startActivity(myIntent);
            }
        });
        recyclerHome.setAdapter(adaptadorHomeUser);
        return vista;
    }

    public void llenarlistaHomeUser(){
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.eduardotenorio_profile_picture,"eduardo.tm58",R.drawable.tenorio,"eduardo.tm58","Colores una buena combinacion para mi proximo traje")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.paulyrobenz_profile_picture,"paulypolish",R.drawable.paulypolish_publicacion,"paulypolish","Esa combinación  nunca va a pasar de moda, simplemente perfecta, les comparto la información por si les interesa")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.amyhernandez_profile_picture,"_heerb",R.drawable._heerb_publicacion,"_heerb","Esté conjunto se ve super formal y al mismo tiempo esta muy cómodo, se los recomiendo totalmente, aparte el azul nunca pasa de moda")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.eduardotenorio_profile_picture,"eduardo.tm58",R.drawable.eduardotm58_publicacion_2,"eduardo.tm58","No me jusguen pero esta blusa está espectacular!!! Tendrán más información acerca de ropa como esta")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.rocioayame_profile_picture,"chiio_ayame",R.drawable.chiio_ayame_publicacion,"chiio_ayame","Me encanta como se le vé este outfit, lo puyeden comprar completo en una tiendo en el centro, les dejo la información por si les interesa")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.karenblanco_profile_picture,"krnblv",R.drawable.krnblv_publicacion,"krnblv","Es un Pantalon super cómodo, se los recomiendo muchisimos, a parte de que el color es increible y sobre todo está barato")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.leslieescobar_profile_picture,"lesz_escobar",R.drawable.lesz_escobar_publicacion,"lesz_escobar","Este pantalon esta totalmente a la moda, me parece genial ese modelo, pero hay que saber usarlo")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.alejandrozepeda_profile_picture,"alejandrooozf",R.drawable.alejandrooozf_publicacion,"alejandrooozf","Ese sueter es perfecto para esta épocas de frio, se los recomiendo mucho")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.brauliogarcia_profile_picture,"brauxilio",R.drawable.brauxilio_publicacion,"brauxilio","Este sueter está super cómodo, lo uso cuando llego a mi casa sobre todo en este frio.")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.eduardotenorio_profile_picture,"eduardo.tm58",R.drawable.eduardotm58_publicacion_2,"eduardo.tm58","Está super hermoso pero creo que es dificil de combinar")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.davidportilla_profile_picture,"jdavid.pm",R.drawable.jdavidpm_publicacion,"jdavid.pm","Esta muy cool sta sudadera, es unisex, asi que quien sea la puede usar, de las recomiendo 100%")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.luisosornio_profile_picture,"wizi_osornio",R.drawable.wizi_osornio_publicacion,"wizi_osornio","Ese gorro me gusta demasiado, yo digo que todos deberiamos de tener almenos uno igual, vena la descrioción completa")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.noeacosta_profile_picture,"noe.a.v",R.drawable.noeav_publicacion,"noe.a.v","Este sueter es increible, su color no es común pero se los recomiendo demasiado, se verán diferente y elegantes")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.paulyrobenz_profile_picture,"paulypolish",R.drawable.paulypolish_publicacion_2,"paulypolish","Este sueter va perfecto con cualquier cosa, es la combinacion entre juvenil, formal e informal")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.karenblanco_profile_picture,"krnblv",R.drawable.krnblv_publicacion_2,"krnblv","Me encantooooo ese color, el color moztaza es mi favorito, y esta super fresco, se los recomiendo totalmente")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.brauliogarcia_profile_picture,"brauxilio",R.drawable.brauxilio_publicacion_2,"brauxilio","Le compré este sueter a mi novia, le gusto de inmediato, se los comparto por si les interesaría comprarlo, está muy barato")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.alejandrozepeda_profile_picture,"alejandrooozf",R.drawable.alejandrooozf_publicacion_2,"alejandrooozf","¿Al guien ha visto este sueter? Lo llevo buscando más de un mes")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.leslieescobar_profile_picture,"lesz_escobar",R.drawable.lesz_escobar_publicacion_2,"lesz_escobar","Ese sueter se les ve super bien, al menos a mi me gusta como se vé, deberían de usarlos más")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.rocioayame_profile_picture,"chiio_ayame",R.drawable.chiio_ayame_publicacion_2,"chiio_ayame","Esta super cómodo, veo a mi novio le encanta usarlo, nunca se lo quita, creo que le gustaría saber más de él")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.noeacosta_profile_picture,"noe.a.v",R.drawable.noeav_publicacion_2,"noe.a.v","Ese sueter se ve super genial, saben donde lo podria conseguir para un regalo")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.alejandrozepeda_profile_picture,"alejandrooozf",R.drawable.alejandrooozf_publicacion_3,"alejandrooozf","Este pantalon lo compré hace un més y les puedo decir que me encanta, es muy cómodo y simplemente combina con todo!!!!!")));
        listaContainerHomeUser.add((new ContainerHomeUser(R.drawable.eduardotenorio_profile_picture,"eduardo.tm58",R.drawable.eduardotm58_publicacion_3,"eduardo.tm58","Esta playera es mi favorita, me encanta, mas porque combina con todo y el corte es el mejor que he tenido")));
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
