package app.rsr.com.iropa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publicacion);

        btnImagen = (ImageButton)findViewById(R.id.activityPublicidadImagen);
        btnAceptar = (ImageButton)findViewById(R.id.activityPublicidadEnviar);
        lblProdcuto = (EditText)findViewById(R.id.activityPublicidadProducto);
        lblDescripcion = (EditText)findViewById(R.id.activityPublicidadDescripcion);
        lblCategoria = (EditText)findViewById(R.id.activityPublicidadCategoria);
        lblCosto = (EditText)findViewById(R.id.activityPublicidadCosto);

        btnImagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImagen.setImageResource(R.drawable.josepasaran_profile_picture);
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
                startActivity(miinten);

                //Toast.makeText(getApplicationContext(),"enviar",Toast.LENGTH_SHORT).show();
            }
        });
    }
}