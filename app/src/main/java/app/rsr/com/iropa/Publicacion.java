package app.rsr.com.iropa;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Publicacion extends AppCompatActivity {

    ImageButton btnImagen;
    ImageButton btnAceptar;

    EditText lblProdcuto;
    EditText lblDescripcion;
    EditText lblCategoria;
    EditText lblCosto;

    String prodcuto;
    String descripcion;
    String categoria;
    String costo;

    Bundle datosRecividos;
    String idUserGlobal = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publicacion);

        datosRecividos = getIntent().getExtras();
        idUserGlobal = datosRecividos.getString("idUser");
        //Toast.makeText(getApplicationContext(), "Publicacion: " + idUserGlobal,Toast.LENGTH_SHORT).show();


        btnImagen = (ImageButton)findViewById(R.id.activityPublicidadImagen);
        btnAceptar = (ImageButton)findViewById(R.id.activityPublicidadEnviar);
        lblProdcuto = (EditText)findViewById(R.id.activityPublicidadProducto);
        lblDescripcion = (EditText)findViewById(R.id.activityPublicidadDescripcion);
        lblCategoria = (EditText)findViewById(R.id.activityPublicidadCategoria);
        lblCosto = (EditText)findViewById(R.id.activityPublicidadCosto);

        btnImagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarImagen();
                //btnImagen.setImageResource(R.drawable.eduardotm58_publicacion_3);
                //Toast.makeText(getApplicationContext(),"imagen",Toast.LENGTH_SHORT).show();
            }
        });

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prodcuto = lblProdcuto.getText().toString();
                descripcion = lblDescripcion.getText().toString();
                categoria = lblCategoria.getText().toString();
                costo = lblCosto.getText().toString();
                Intent miinten = new Intent(Publicacion.this,Home.class);
                miinten.putExtra("idUser",idUserGlobal);
                startActivity(miinten);
                Toast.makeText(getApplicationContext(),"Imagen publicada",Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void cargarImagen(){
        Intent miIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        miIntent.setType("image/");
        startActivityForResult(miIntent.createChooser(miIntent,"Seleccione Aplicacion"),10);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK){
            Uri path = data.getData();
            btnImagen.setImageURI(path);
        }
    }
}