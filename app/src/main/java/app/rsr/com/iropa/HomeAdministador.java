package app.rsr.com.iropa;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class HomeAdministador extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,FragmentHomeAdministrador.OnFragmentInteractionListener,FragmentPerfilAdministrador.OnFragmentInteractionListener,FragmentCuentas.OnFragmentInteractionListener,FragmentEstadisticas.OnFragmentInteractionListener,FragmentAcercaDe.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_administador);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        Fragment fragment = new FragmentHomeAdministrador();
        getSupportFragmentManager().beginTransaction().add(R.id.content_home_administrador,fragment).commit();

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
        getMenuInflater().inflate(R.menu.home_administador, menu);
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


        if (id == R.id.nav_home_administrador) {
            miFragment = new FragmentHomeAdministrador();
            fragmentSeleccionado = true;
        } else if (id == R.id.nav_perfil_administrador) {
            miFragment = new FragmentPerfilAdministrador();
            fragmentSeleccionado = true;
        } else if (id == R.id.nav_cuentas_administrador) {
            miFragment = new FragmentCuentas();
            fragmentSeleccionado = true;
        } else if (id == R.id.nav_estadisticas_administrador) {
            miFragment = new FragmentEstadisticas();
            fragmentSeleccionado = true;
        } else if (id == R.id.nav_acercaDe_administrador) {
            miFragment = new FragmentAcercaDe();
            fragmentSeleccionado = true;
        } else if (id == R.id.nav_salir_administrador) {
            //Salir de la app
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.putExtra("EXIT", true);
            startActivity(intent);
        }

        if(fragmentSeleccionado){
            getSupportFragmentManager().beginTransaction().replace(R.id.content_home_administrador,miFragment).commit();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
