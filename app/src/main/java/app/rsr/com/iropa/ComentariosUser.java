package app.rsr.com.iropa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

public class ComentariosUser extends AppCompatActivity {
    ArrayList<ContainerComentarioUser> listaComentariosUser;
    RecyclerView recyclerViewComentarios;

    Button btnEnviar;
    EditText mensaje;
    String stringMesanje;
    ImageView imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comentarios_user);

        btnEnviar = (Button)findViewById(R.id.activityComentariosBtnEnvia);
        mensaje = (EditText)findViewById(R.id.activityComentarioslblComentario);
        imagen  =(ImageView)findViewById(R.id.activityComentariosImageUser);
        imagen.setImageResource(R.drawable.user);

        listaComentariosUser = new ArrayList<>();
        recyclerViewComentarios = (RecyclerView)findViewById(R.id.recyclevieComentariosUser);
        recyclerViewComentarios.setLayoutManager(new LinearLayoutManager(this));
        llenarComentariosUser();
        final AdapatadorComentarioUser adapter = new AdapatadorComentarioUser(listaComentariosUser);
        recyclerViewComentarios.setAdapter(adapter);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stringMesanje = mensaje.getText().toString();
                listaComentariosUser.add(new ContainerComentarioUser("eduardo.tm58",stringMesanje));
                mensaje.setText("");
                adapter.notifyDataSetChanged();
            }
        });
    }

    public void llenarComentariosUser(){
        //En esta seccion es donde se van a llenar todos los comentarios
        listaComentariosUser.add(new ContainerComentarioUser("paulypolish","Comentario de usuario"));
        listaComentariosUser.add(new ContainerComentarioUser("chiio_ayame","Comentario de usuario"));
        listaComentariosUser.add(new ContainerComentarioUser("brauxilio","Comentario de usuario"));
        listaComentariosUser.add(new ContainerComentarioUser("lesz_escobar","Comentario de usuario"));
        listaComentariosUser.add(new ContainerComentarioUser("alejandrooozf","Comentario de usuario"));
        listaComentariosUser.add(new ContainerComentarioUser("krnblv","Comentario de usuario"));
        listaComentariosUser.add(new ContainerComentarioUser("wizi_osornio","Comentario de usuario"));
    }
}
