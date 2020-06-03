package app.rsr.com.iropa;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorCunetasAdministrador extends RecyclerView.Adapter<AdaptadorCunetasAdministrador.ViewHolderCuentasAdministrador> implements View.OnClickListener {

    ArrayList<ContainerCuentasAdministrador> listaCunetasAdministrador;
    private View.OnClickListener listener;

    public AdaptadorCunetasAdministrador(ArrayList<ContainerCuentasAdministrador>listaCunetasAdministrador){
        this.listaCunetasAdministrador = listaCunetasAdministrador;
    }
    @NonNull
    @Override
    public ViewHolderCuentasAdministrador onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from((viewGroup.getContext())).inflate(R.layout.item_cuentas_administrador,null,false);
        view.setOnClickListener(this);
        return new ViewHolderCuentasAdministrador(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderCuentasAdministrador viewHolderCuentasAdministrador, final int i) {
        //viewHolderComentariosAdministrador.lblNombreUser.setText(listaComentariosAdministrador.get(i).getComentarioAdministradorNombreUser());
        viewHolderCuentasAdministrador.lblNombreUser.setText(listaCunetasAdministrador.get(i).getCuentaAdministradorNombreUser());
        viewHolderCuentasAdministrador.lblNombreCompleto.setText(listaCunetasAdministrador.get(i).getCuentaAdministradorNombreCompleto());
        viewHolderCuentasAdministrador.lblEmail.setText(listaCunetasAdministrador.get(i).getCuentaAdministradorEmail());
        viewHolderCuentasAdministrador.btnEliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listaCunetasAdministrador.remove(i);
                AdaptadorCunetasAdministrador.this.notifyItemRemoved(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listaCunetasAdministrador.size();
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

    public class ViewHolderCuentasAdministrador extends RecyclerView.ViewHolder {
        TextView lblNombreUser;
        TextView lblNombreCompleto;
        TextView lblEmail;
        Button btnEliminar;
        public ViewHolderCuentasAdministrador(@NonNull View itemView) {
            super(itemView);
            lblNombreUser = (TextView)itemView.findViewById(R.id.itemCuentasAdministradorNombreUser);
            lblNombreCompleto = (TextView)itemView.findViewById(R.id.itemCuentasAdministradorNombreCompleto);
            lblEmail = (TextView)itemView.findViewById(R.id.itemCuentasAdministradorEmail);
            btnEliminar = (Button)itemView.findViewById(R.id.itemCuentasAdministradorBtnElimiar);
            btnEliminar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }
}