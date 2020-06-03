package app.rsr.com.iropa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    Button btnSignUpUser;

    EditText lblUser;
    EditText lblPassword;

    String stringLblUser = null;
    String stringLblPassword = null;
    String tipo = null;

    //Semi bases de datos
    //Se crean desde un principio
    public ArrayList<BDUsuarioAdmin> arrayBDUserAdmin = new ArrayList<BDUsuarioAdmin>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llenarBDUsuarioAdmin();

        btnLogin = findViewById(R.id.mainActivityButtonLogin);
        btnSignUpUser = findViewById(R.id.mainActivityButtonSignUp);

        lblUser = (EditText)findViewById(R.id.MainActivityLabelUser);
        lblPassword = (EditText)findViewById(R.id.MainActivityLabelPass);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   Toast.makeText(getApplicationContext(),"Login",Toast.LENGTH_SHORT).show();
                //Implmetacion  Activity Login
                //Se ingresasn los datos User y Password
                stringLblUser = lblUser.getText().toString();
                stringLblPassword = lblPassword.getText().toString();
               // Toast.makeText(getApplicationContext(),stringLblUser,Toast.LENGTH_SHORT).show();
                //Toast.makeText(getApplicationContext(),stringLblPassword,Toast.LENGTH_SHORT).show();

                tipo = validacionUserAdmin(stringLblUser,stringLblPassword,arrayBDUserAdmin);
               //Toast.makeText(getApplicationContext(),tipo,Toast.LENGTH_LONG).show();
                if(tipo.equals("user")){
                    Intent myIntent = new Intent(MainActivity.this,Home.class);
                    myIntent.putExtra("BDUserAdmin",arrayBDUserAdmin);
                    myIntent.putExtra("idUserAdmin",stringLblUser);
                    startActivity(myIntent);
                }
                if(tipo.equals("admin")){
                    Intent myIntent = new Intent(MainActivity.this,HomeAdministador.class);
                    myIntent.putExtra("BDUserAdmin",arrayBDUserAdmin);
                    myIntent.putExtra("idUserAdmin",stringLblUser);
                    startActivity(myIntent);
                }
                if(tipo.equals("NO")){
                    Toast.makeText(getApplicationContext(),"Usuario y/o contraseña incorrecto",Toast.LENGTH_SHORT).show();
                    lblUser.setText("");
                    lblPassword.setText("");
                }
                if (getIntent().getBooleanExtra("EXIT", false)) {
                    finish();
                }
            }
        });

        btnSignUpUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(getApplicationContext(),"SignUp",Toast.LENGTH_SHORT).show();
                Intent myIntent = new Intent(MainActivity.this,SignUpUser.class);
                myIntent.putExtra("BDUserAdmin",arrayBDUserAdmin);
                startActivity(myIntent);
            }
        });
    }

    private void llenarBDUsuarioAdmin(){
        //Falta imagen de cada Usuario
        arrayBDUserAdmin.add(new BDUsuarioAdmin("_heerb","Amy","Hernandez","amy_herb@gmail.com","herb","11/04/1998",R.drawable.unnamed,"user"));
        arrayBDUserAdmin.add(new BDUsuarioAdmin("brauxilio","Braulio","Garcia","brau-97@gmail.com","brau97","01/03/1997",R.drawable.unnamed,"user"));
        arrayBDUserAdmin.add(new BDUsuarioAdmin("chiio_ayame","Rocio","Ayame","roci_amy@gmail.com","chiio","12/09/1998",R.drawable.unnamed,"user"));
        arrayBDUserAdmin.add(new BDUsuarioAdmin("noe.a.v","Noe","Acosta","noe_acos@gmail.com","noeAcosta","21/11/1998",R.drawable.unnamed,"user"));
        arrayBDUserAdmin.add(new BDUsuarioAdmin("krnblv","Karen","Blanco","kar_blanco@gmail.com","karkar","01/12/1998",R.drawable.unnamed,"user"));
        arrayBDUserAdmin.add(new BDUsuarioAdmin("jdavid.pm","David","Portilla","david_por1@gmail.com","davi1por","12/02/1998",R.drawable.unnamed,"user"));
        arrayBDUserAdmin.add(new BDUsuarioAdmin("lesz_escobar","Leslie","Escobar","andrea@gmail.com","andrea","14/01/1998",R.drawable.unnamed,"user"));
        arrayBDUserAdmin.add(new BDUsuarioAdmin("wizi_osornio","Luis","Osornio","luis_oso@gmail.com","osoluis","12/09/1998",R.drawable.unnamed,"user"));
        arrayBDUserAdmin.add(new BDUsuarioAdmin("alejandrooozf","Alejandro","Zepeda","zepeda_chido@gmail.com","maquinaazul","12/09/1997",R.drawable.unnamed,"user"));
        arrayBDUserAdmin.add(new BDUsuarioAdmin("eduardo.tm58","Eduardo","Tenorio","dontenorio@gmail.com","tenorio","16/09/1995",R.drawable.unnamed,"user"));
        arrayBDUserAdmin.add(new BDUsuarioAdmin("paulypolish","Pauly","Robenz","pauly@gmail.com","pauly","12/09/1998",R.drawable.unnamed,"user"));
        arrayBDUserAdmin.add(new BDUsuarioAdmin("usiel_arista","Usiel","Arista","usiel_arista@gmail.com","admin1","12/09/1998",R.drawable.unnamed,"admin"));
        arrayBDUserAdmin.add(new BDUsuarioAdmin("raul_sanchez","Raul","Sanchez","raul_sanchez@gmail.com","admin2","18/09/1998",R.drawable.unnamed,"admin"));
    }

    private String validacionUserAdmin(String idUserAdmin,String password, ArrayList<BDUsuarioAdmin> arrayBDUserAdmin){
       String tipoFinal  = "NO";

       for(BDUsuarioAdmin i : arrayBDUserAdmin){
           if(i.getNombreUserAdmin().equals(idUserAdmin) && i.getPassword().equals(password))return  i.getTipo();
       }
       return tipoFinal;
    }
}
