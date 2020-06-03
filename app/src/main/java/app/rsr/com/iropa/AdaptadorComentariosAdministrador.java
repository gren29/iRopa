package app.rsr.com.iropa;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorComentariosAdministrador extends RecyclerView.Adapter<AdaptadorComentariosAdministrador.ViewHolderComentariosAdministrador> implements  View.OnClickListener{

    ArrayList<ContainerComentariosAdministrador> listaComentariosAdministrador;
    private View.OnClickListener listener;

    public AdaptadorComentariosAdministrador(ArrayList<ContainerComentariosAdministrador>listaComentariosAdministrador){
        this.listaComentariosAdministrador = listaComentariosAdministrador;
    }

    @NonNull
    @Override
    public ViewHolderComentariosAdministrador onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from((viewGroup.getContext())).inflate(R.layout.item_comentarios_admin,null,false);
        view.setOnClickListener(this);
        return new ViewHolderComentariosAdministrador(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderComentariosAdministrador viewHolderComentariosAdministrador, final int i) {
        viewHolderComentariosAdministrador.lblNombreUser.setText(listaComentariosAdministrador.get(i).getComentarioAdministradorNombreUser());
        viewHolderComentariosAdministrador.lblComentarioUser.setText(listaComentariosAdministrador.get(i).getComentarioAdministradorComentario());
        viewHolderComentariosAdministrador.btnEliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listaComentariosAdministrador.remove(i);
                AdaptadorComentariosAdministrador.this.notifyItemRemoved(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listaComentariosAdministrador.size();
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

    public class ViewHolderComentariosAdministrador extends RecyclerView.ViewHolder {
        TextView lblNombreUser;
        TextView lblComentarioUser;
        Button btnEliminar;
        public ViewHolderComentariosAdministrador(@NonNull View itemView) {
            super(itemView);
            lblNombreUser = (TextView)itemView.findViewById(R.id.itemComentarioAdministradorNombreUsuario);
            lblComentarioUser = (TextView)itemView.findViewById(R.id.itemComentarioAdministradorComentario);
            btnEliminar = (Button)itemView.findViewById(R.id.itemComentarioAdministradorBtnEliminar);
            btnEliminar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }
}




