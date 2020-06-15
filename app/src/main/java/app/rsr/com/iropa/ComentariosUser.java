package app.rsr.com.iropa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class ComentariosUser extends AppCompatActivity {
    ArrayList<ContainerComentarioUser> listaComentariosUser;
    RecyclerView recyclerViewComentarios;

    Button btnEnviar;
    EditText mensaje;
    String stringMesanje;
    ImageView imagen;
    Bundle datosRecividos;
    String idUserGlobal = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comentarios_user);

        datosRecividos = getIntent().getExtras();
        idUserGlobal = datosRecividos.getString("idUserGlobal");
       // Toast.makeText(getApplicationContext(), "Comentarios: " + idUserGlobal,Toast.LENGTH_SHORT).show();

        btnEnviar = (Button)findViewById(R.id.activityComentariosBtnEnvia);
        mensaje = (EditText)findViewById(R.id.activityComentarioslblComentario);
        imagen  =(ImageView)findViewById(R.id.activityComentariosImageUser);
        imagen.setImageResource(R.drawable.alejandrooozf_publicacion);

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
                Toast.makeText(getApplicationContext(),"Mensaje enviado.",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void llenarComentariosUser(){
        //En esta seccion es donde se van a llenar todos los comentarios
        listaComentariosUser.add(new ContainerComentarioUser("paulypolish","Esta muy padre, pero, hay algo que no me termina de convencer"));
        listaComentariosUser.add(new ContainerComentarioUser("chiio_ayame","Wow, increible ¿Sabes si tienen sucursales en Pachuca?"));
        listaComentariosUser.add(new ContainerComentarioUser("brauxilio","Hermoso, simplemente hermoso"));
        listaComentariosUser.add(new ContainerComentarioUser("lesz_escobar","Estaria perfecto con unos zapatos azules"));
        listaComentariosUser.add(new ContainerComentarioUser("alejandrooozf","Me encantaria ese mismo modelo en rojo"));
        listaComentariosUser.add(new ContainerComentarioUser("krnblv","Es un acierto total esa combinación"));
        listaComentariosUser.add(new ContainerComentarioUser("wizi_osornio","Adoré ese corte"));
    }
}
