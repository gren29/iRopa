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
        imagen.setImageResource(R.drawable.user);
        recyclerView = (RecyclerView)findViewById(R.id.recyclevieComentariosAdministrador);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        llenarComentariosAdmin();
        AdaptadorComentariosAdministrador adapter = new AdaptadorComentariosAdministrador(listaComentariosAdmin);
        recyclerView.setAdapter(adapter);

    }
    public void llenarComentariosAdmin(){
        //En esta seccion es donde se van a llenar todos los comentarios
        listaComentariosAdmin.add(new ContainerComentariosAdministrador("paulypolish","Comentario de usuario"));
        listaComentariosAdmin.add(new ContainerComentariosAdministrador("chiio_ayame","Comentario de usuario"));
        listaComentariosAdmin.add(new ContainerComentariosAdministrador("brauxilio","Comentario de usuario"));
        listaComentariosAdmin.add(new ContainerComentariosAdministrador("lesz_escobar","Comentario de usuario"));
        listaComentariosAdmin.add(new ContainerComentariosAdministrador("alejandrooozf","Comentario de usuario"));
        listaComentariosAdmin.add(new ContainerComentariosAdministrador("krnblv","Comentario de usuario"));
        listaComentariosAdmin.add(new ContainerComentariosAdministrador("wizi_osornio","Comentario de usuario"));
    }
}
