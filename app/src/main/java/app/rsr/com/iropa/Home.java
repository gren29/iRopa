package app.rsr.com.iropa;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, FragmentHome.OnFragmentInteractionListener,FragmentPerfil.OnFragmentInteractionListener,FragmentAcercaDe.OnFragmentInteractionListener {

    Bundle datosRecividos;
    Bundle datosEnviados = new Bundle();
    String idUserGlobal = null;
    ArrayList<BDPublicacion> bdPublicacionsGlobal = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //recivir datos
        datosRecividos = getIntent().getExtras();
        idUserGlobal = datosRecividos.getString("idUser");
       // bdPublicacionsGlobal = (ArrayList<BDPublicacion>) datosRecividos.getSerializable("bdPublicacionesGlobal");
        //Toast.makeText(getApplicationContext(), "Home: " + idUserGlobal+"   T:"+bdPublicacionsGlobal.size(),Toast.LENGTH_SHORT).show();


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent miinTENT =  new Intent(Home.this,Publicacion.class);
                miinTENT.putExtra("idUser",idUserGlobal);
                startActivity(miinTENT);
            }
        });

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        datosEnviados.putString("idUserGlobal",idUserGlobal);
        Fragment fragment = new FragmentHome();
        fragment.setArguments(datosEnviados);
        getSupportFragmentManager().beginTransaction().add(R.id.content_home,fragment).commit();

        navigationView.setNavigationItemSelectedListener(this);
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        Fragment miFragment = null;
        boolean fragmentSeleccionado = false;

        if (id == R.id.nav_home) {
            miFragment = new FragmentHome();
            datosEnviados.putString("idUserGlobal",idUserGlobal);
            miFragment.setArguments(datosEnviados);
            fragmentSeleccionado = true;
        } else if (id == R.id.nav_perfil) {
            miFragment = new FragmentPerfil();
            datosEnviados.putString("idUserGlobal",idUserGlobal);
            miFragment.setArguments(datosEnviados);
            fragmentSeleccionado = true;
        }else if (id == R.id.nav_acercaDe) {
            miFragment = new FragmentAcercaDe();
            fragmentSeleccionado = true;
        } else if (id == R.id.nav_salir) {
            //Salir de la app al menu y desvincular cuenta
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.putExtra("EXIT", true);
            startActivity(intent);
        }

        if(fragmentSeleccionado){
            getSupportFragmentManager().beginTransaction().replace(R.id.content_home,miFragment).commit();
        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
