package app.rsr.com.iropa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class SignUpUser extends AppCompatActivity {

    Button btnAceptar;

    EditText lblNombreCompleto;
    EditText lblApellido;
    EditText lblUser;
    EditText lblEmail;
    EditText lblPassword;
    EditText lblFechaNacimiento;

    String stringLblNombreCompleto = null;
    String stringLblApellido = null;
    String stringLblUser = null;
    String stringLblEmail = null;
    String stringLblPassword = null;
    String stringLblFechaNaimiento = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_user);

        //Recibimos parametros de la activty anteriorArrayList
        final ArrayList<BDUsuarioAdmin> arrayBDUserAdmin = (ArrayList<BDUsuarioAdmin>)getIntent().getSerializableExtra("BDUserAdmin");

        int s = arrayBDUserAdmin.size();
        //Toast.makeText(getApplicationContext(),""+s,Toast.LENGTH_SHORT).show();

        btnAceptar = (Button)findViewById(R.id.ActivitySignUpButtonAceptar);

        lblNombreCompleto = (EditText)findViewById(R.id.ActivitySignUpLabelName);
        lblApellido = (EditText)findViewById(R.id.ActivitySignUpLabelApelllido);
        lblUser = (EditText)findViewById(R.id.ActivitySignUpLabelUser);
        lblEmail = (EditText)findViewById(R.id.ActivitySignUpLabelEmail);
        lblPassword = (EditText)findViewById(R.id.ActivitySignUpLabelPassword);
        lblFechaNacimiento = (EditText)findViewById(R.id.ActivitySignUpLabelFechaNac);

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"Aceptar",Toast.LENGTH_SHORT).show();
                stringLblNombreCompleto = lblNombreCompleto.getText().toString();
                stringLblApellido = lblApellido.getText().toString();
                stringLblUser = lblUser.getText().toString();
                stringLblEmail = lblEmail.getText().toString();
                stringLblPassword = lblPassword.getText().toString();
                stringLblFechaNaimiento = lblFechaNacimiento.getText().toString();


                //Validacion de datos
                String existeUser = validacionUserAdmin(stringLblUser,arrayBDUserAdmin);
                String existeEmail = validacionEmail(stringLblEmail,arrayBDUserAdmin);

                if(existeUser.equals("Existe")){
                    Toast.makeText(getApplicationContext(),"Existe Usuario",Toast.LENGTH_SHORT).show();
                    lblUser.setText("");
                }
                else if(existeEmail.equals("Existe")){
                    Toast.makeText(getApplicationContext(),"Existe Email",Toast.LENGTH_SHORT).show();
                    lblEmail.setText("");
                }
                else{
                    //Si esta bien tod-o proceder a guardar datos y cambiar a Home
                   // arrayBDUserAdmin.add(new BDUsuarioAdmin(stringLblUser,stringLblNombreCompleto,stringLblApellido,stringLblEmail,stringLblPassword,stringLblFechaNaimiento,R.drawable.josepasaran_profile_picture,"user"));
                    Intent myIntent = new Intent(SignUpUser.this,Home.class);
                    Toast.makeText(getApplicationContext(),"Cuenta creada",Toast.LENGTH_SHORT).show();
                    myIntent.putExtra("idUser",stringLblUser);
                    startActivity(myIntent);
                }
            }
        });
    }

    private String validacionUserAdmin(String idUserAdmin, ArrayList<BDUsuarioAdmin> arrayBDUserAdmin){
        String tipoFinal  = "NOExiste";

        for(BDUsuarioAdmin i : arrayBDUserAdmin){
            if(i.getNombreUserAdmin().equals(idUserAdmin))return  "Existe";
        }
        return tipoFinal;
    }

    private String validacionEmail(String email, ArrayList<BDUsuarioAdmin> arrayBDUserAdmin){
        String tipoFinal  = "NOExiste";

        for(BDUsuarioAdmin i : arrayBDUserAdmin){
            if(i.getEmail().equals(email))return "Existe";
        }
        return tipoFinal;
    }
}
