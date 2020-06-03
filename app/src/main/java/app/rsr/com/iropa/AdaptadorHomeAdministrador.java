package app.rsr.com.iropa;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class AdaptadorHomeAdministrador extends RecyclerView.Adapter<AdaptadorHomeAdministrador.ViewHolderHomeAdministrador> implements View.OnClickListener{

    ArrayList<ContainerHomeAdministrador> listaContainerAdmin;
    private View.OnClickListener listener;

    public AdaptadorHomeAdministrador(ArrayList<ContainerHomeAdministrador> listaContainerAdmin) {
        this.listaContainerAdmin = listaContainerAdmin;
    }
    @NonNull
    @Override
    public ViewHolderHomeAdministrador onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_home_administrador,null,false);

        view.setOnClickListener(this);
        return new ViewHolderHomeAdministrador(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderHomeAdministrador viewHolderHomeAdministrador, final int i) {
        viewHolderHomeAdministrador.imageHomeAdminTitulo.setImageResource(listaContainerAdmin.get(i).getHomeAdministradorIdImagenUser());
        viewHolderHomeAdministrador.lblNombreUserTitulo.setText(listaContainerAdmin.get(i).getHomeAdministradorIdNombreUserTitulo());
        viewHolderHomeAdministrador.imagenHomeAdminPublicacion.setImageResource(listaContainerAdmin.get(i).getHomeAdministradorIdImagenPublicacion());
        viewHolderHomeAdministrador.lblNombreUserPublicacion.setText(listaContainerAdmin.get(i).getHomeAdministradorIdNombreUsuerComentario());
        viewHolderHomeAdministrador.lblComentario.setText(listaContainerAdmin.get(i).getHomeAdministradorIdComentario());
        viewHolderHomeAdministrador.btnEliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listaContainerAdmin.remove(i);
                AdaptadorHomeAdministrador.this.notifyItemRemoved(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listaContainerAdmin.size();
    }

    public  void setOnClickListener(View.OnClickListener listener ){
        this.listener = listener;

    }
    @Override
    public void onClick(View v) {
        if(listener != null){
            listener.onClick(v);
        }
    }

    public class ViewHolderHomeAdministrador extends RecyclerView.ViewHolder {

        TextView lblNombreUserTitulo;
        TextView lblNombreUserPublicacion;
        TextView lblComentario;
        ImageView imageHomeAdminTitulo;
        ImageView imagenHomeAdminPublicacion;
        Button btnEliminar;
        public ViewHolderHomeAdministrador(@NonNull View itemView) {
            super(itemView);
            imageHomeAdminTitulo = (ImageView)itemView.findViewById(R.id.itemHomeAdministradorIdImagenUsuario);
            lblNombreUserTitulo = (TextView)itemView.findViewById(R.id.itemHomeAdministradorIdNombreUsuarioTitulo);
            imagenHomeAdminPublicacion = (ImageView)itemView.findViewById(R.id.itemHomeAdministradorIdImagenPublicacion);
            lblNombreUserPublicacion = (TextView)itemView.findViewById(R.id.itemHomeAdministradorIdNombreUsuarioComentario);
            lblComentario = (TextView)itemView.findViewById(R.id.itemHomeAdministradorIdComentario);
            btnEliminar = (Button)itemView.findViewById(R.id.itemHomeAdministradorBtnElimnar);
            btnEliminar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }
}


