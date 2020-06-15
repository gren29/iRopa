package app.rsr.com.iropa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import java.util.ArrayList;

public class ComentariosAdmin extends AppCompatActivity {

    ArrayList<ContainerComentariosAdministrador> listaComentariosAdmin;
    RecyclerView recyclerView;
    ImageView imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comentarios_admin);
        listaComentariosAdmin = new ArrayList<>();
        imagen  =(ImageView)findViewById(R.id.activityComentariosImageAdministrador);
        imagen.setImageResource(R.drawable.paulypolish_publicacion);
        recyclerView = (RecyclerView)findViewById(R.id.recyclevieComentariosAdministrador);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        llenarComentariosAdmin();
        AdaptadorComentariosAdministrador adapter = new AdaptadorComentariosAdministrador(listaComentariosAdmin);
        recyclerView.setAdapter(adapter);

    }
    public void llenarComentariosAdmin(){
        //En esta seccion es donde se van a llenar todos los comentarios
        listaComentariosAdmin.add(new ContainerComentariosAdministrador("paulypolish","Esta muy padre, pero, hay algo que no me termina de convencer"));
        listaComentariosAdmin.add(new ContainerComentariosAdministrador("alejandrooozf","Una combinacion con un gran acierto no creen?"));
        listaComentariosAdmin.add(new ContainerComentariosAdministrador("lesz_escobar","Azules, unos zapatos auzles combinarian???"));
        listaComentariosAdmin.add(new ContainerComentariosAdministrador("chiio_ayame","Wow, increible ¿Sabes si tienen sucursales en Pachuca?"));
        listaComentariosAdmin.add(new ContainerComentariosAdministrador("krnblv","Me encantaria ese mismo modelo en rojo"));
        listaComentariosAdmin.add(new ContainerComentariosAdministrador("wizi_osornio","Afore todo el ocnjunto"));
        listaComentariosAdmin.add(new ContainerComentariosAdministrador("brauxilio","Hermoso, simplemente hermoso esa combinacion de colores"));


    }
}
