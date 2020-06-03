package app.rsr.com.iropa;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorHomeUser extends RecyclerView.Adapter<AdaptadorHomeUser.ViewHolderHomeUser> implements View.OnClickListener {

    ArrayList<ContainerHomeUser> listaContainerHomeUser;
    private View.OnClickListener listener;

    public AdaptadorHomeUser(ArrayList<ContainerHomeUser> listaContainerHomeUser) {
        this.listaContainerHomeUser = listaContainerHomeUser;
    }

    @Override
    public ViewHolderHomeUser onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_home_user,null,false);

        view.setOnClickListener(this);
        return new ViewHolderHomeUser(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderHomeUser viewHolderHomeUser, int i) {
        viewHolderHomeUser.imageHomeUserTitulo.setImageResource(listaContainerHomeUser.get(i).getHomeUserIdImagenUser());
        viewHolderHomeUser.lblNombreUserTitulo.setText(listaContainerHomeUser.get(i).getHomeUserIdNombreUserTitulo());
        viewHolderHomeUser.imagenHomeUserPublicacion.setImageResource(listaContainerHomeUser.get(i).getHomeUserIdImagenPublicacion());
        viewHolderHomeUser.lblNombreUserPublicacion.setText(listaContainerHomeUser.get(i).getHomeUserIdNombreUsuerComentario());
        viewHolderHomeUser.lblComentario.setText(listaContainerHomeUser.get(i).getHomeUserIdComentario());
    }

    @Override
    public int getItemCount() {
        return listaContainerHomeUser.size();
    }

    public  void setOnClickListener(View.OnClickListener listener ){
        this.listener = listener;

    }
    @Override
    public void onClick(View v) {
        if(listener != null) listener.onClick(v);
    }

    public class ViewHolderHomeUser extends RecyclerView.ViewHolder {

        TextView lblNombreUserTitulo;
        TextView lblNombreUserPublicacion;
        TextView lblComentario;
        ImageView imageHomeUserTitulo;
        ImageView imagenHomeUserPublicacion;
        public ViewHolderHomeUser(View itemView) {
            super(itemView);
            imageHomeUserTitulo = (ImageView)itemView.findViewById(R.id.itemHomeUserIdImagenUsuario);
            lblNombreUserTitulo = (TextView)itemView.findViewById(R.id.itemHomeUserIdNombreUsuarioTitulo);
            imagenHomeUserPublicacion = (ImageView)itemView.findViewById(R.id.itemHomeUserIdImagenPublicacion);
            lblNombreUserPublicacion = (TextView)itemView.findViewById(R.id.itemHomeUserIdNombreUsuarioComentario);
            lblComentario = (TextView)itemView.findViewById(R.id.itemHomeUserIdComentario);
        }
    }
}
