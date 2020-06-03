package app.rsr.com.iropa;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapatadorComentarioUser extends RecyclerView.Adapter<AdapatadorComentarioUser.ViewHolderComentarios> {
    ArrayList<ContainerComentarioUser> listaComentariosUser;

    public AdapatadorComentarioUser(ArrayList<ContainerComentarioUser>listaComentariosUser){
        this.listaComentariosUser = listaComentariosUser;
    }

    @NonNull
    @Override
    public ViewHolderComentarios onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_comentarios_user,null,false);
        return new ViewHolderComentarios(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderComentarios viewHolderComentarios, int i) {
        viewHolderComentarios.lblNombreUser.setText(listaComentariosUser.get(i).getComentarioUserNombreUser());
        viewHolderComentarios.lblComentarioUser.setText(listaComentariosUser.get(i).getComentarioUserComentario());
    }

    @Override
    public int getItemCount() {
        return listaComentariosUser.size();
    }

    public class ViewHolderComentarios extends RecyclerView.ViewHolder {

        TextView lblNombreUser;
        TextView lblComentarioUser;
        public ViewHolderComentarios(@NonNull View itemView) {
            super(itemView);
            lblNombreUser = (TextView)itemView.findViewById(R.id.itemComentarioUserNombreUsuario);
            lblComentarioUser = (TextView)itemView.findViewById(R.id.itemComentarioUserComentario);
        }
    }
}
