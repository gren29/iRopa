package app.rsr.com.iropa;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class FragmentPerfilAdministrador extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    View vista;
    TextView lblNombreCompleto;
    TextView lblNombreUser;
    TextView lblEmail;
    TextView lblPassword;
    TextView lblFechaNacimiento;

    TextView lblActulizarN;
    EditText lblActulizarNN;
    String tipoActualizar = null;
    String dato;
    Button btnAceptar;
    Button btnActualizarPass;
    Button btnActualizarEmail;

    String stringNombreCompleto = null;
    String stringNombreUser = null;
    String stringEmail = null;
    String stringPassword = null;
    String stringFechaNacimiento = null;

    private OnFragmentInteractionListener mListener;

    public FragmentPerfilAdministrador() {

    }

    public static FragmentPerfilAdministrador newInstance(String param1, String param2) {
        FragmentPerfilAdministrador fragment = new FragmentPerfilAdministrador();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.fragment_fragment_perfil_administrador, container, false);

        lblNombreCompleto = (TextView)vista.findViewById(R.id.activityPerfilAdministradorNombreCompleto);
        lblNombreUser = (TextView)vista.findViewById(R.id.activityPerfilAdministradorNombreUser);
        lblEmail = (TextView)vista.findViewById(R.id.activityPerfilAdministradorEmail);
        lblPassword = (TextView)vista.findViewById(R.id.activityPerfilAdministradorPassword);
        lblFechaNacimiento = (TextView)vista.findViewById(R.id.activityPerfilAdministradorFechaNacimiento);

        btnActualizarPass = (Button)vista.findViewById(R.id.btnActualizarPassAdmin);
        btnActualizarEmail = (Button)vista.findViewById(R.id.btnActualizarEmailAdmin);

        btnAceptar = (Button)vista.findViewById(R.id.btnAceptarActualizarAdmin);
        lblActulizarN = (TextView)vista.findViewById(R.id.ActulizarDatosAdmin);
        lblActulizarNN = (EditText)vista.findViewById(R.id.lblActulizarDatosAdmin);

        btnAceptar.setEnabled(false);
        lblActulizarNN.setEnabled(false);
        lblActulizarN.setEnabled(false);
        btnAceptar.setVisibility(vista.INVISIBLE);
        lblActulizarN.setVisibility(vista.INVISIBLE);
        lblActulizarNN.setVisibility(vista.INVISIBLE);

        //Consultas
        stringNombreCompleto = "Usiel Arista ";
        stringNombreUser = "usiel_arista";
        stringEmail = "usiel_arista@gmail.com";
        stringPassword = "******";
        stringFechaNacimiento = "12/09/1998";


        lblNombreCompleto.setText(stringNombreCompleto);
        lblNombreUser.setText(stringNombreUser);
        lblEmail.setText(stringEmail);
        lblPassword.setText(stringPassword);
        lblFechaNacimiento.setText(stringFechaNacimiento);

        btnActualizarPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getContext(),"Password",Toast.LENGTH_SHORT).show();
                btnAceptar.setVisibility(vista.VISIBLE);
                lblActulizarN.setVisibility(vista.VISIBLE);
                lblActulizarNN.setVisibility(vista.VISIBLE);
                btnAceptar.setEnabled(true);
                lblActulizarNN.setEnabled(true);
                lblActulizarN.setEnabled(true);
                lblActulizarN.setText("Nueva contraseña");
                lblActulizarNN.setHint(stringPassword);
                tipoActualizar= "1";

            }
        });

        btnActualizarEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toast.makeText(getContext(),"Email",Toast.LENGTH_SHORT).show();
                btnAceptar.setVisibility(vista.VISIBLE);
                lblActulizarN.setVisibility(vista.VISIBLE);
                lblActulizarNN.setVisibility(vista.VISIBLE);
                btnAceptar.setEnabled(true);
                lblActulizarNN.setEnabled(true);
                lblActulizarN.setEnabled(true);
                lblActulizarN.setText("Nuevo Email");
                lblActulizarNN.setHint(stringEmail);
                tipoActualizar = "2";
            }
        });

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dato = lblActulizarNN.getText().toString();
                if(tipoActualizar.equals("1")){
                    stringPassword = dato;
                    lblPassword.setText(stringPassword);
                    lblActulizarNN.setHint(stringPassword);
                }
                else if(tipoActualizar.equals("2")){
                    stringEmail = dato;
                    lblEmail.setText(stringEmail);
                    lblActulizarNN.setHint(stringEmail);
                }
                btnAceptar.setEnabled(false);
                lblActulizarNN.setEnabled(false);
                lblActulizarN.setEnabled(false);
                btnAceptar.setVisibility(vista.INVISIBLE);
                lblActulizarN.setVisibility(vista.INVISIBLE);
                lblActulizarNN.setVisibility(vista.INVISIBLE);

            }
        });
        return  vista;
    }

    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
