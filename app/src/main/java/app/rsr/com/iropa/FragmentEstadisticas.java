package app.rsr.com.iropa;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


public class FragmentEstadisticas extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    Button btnUsuarios;
    Button btnPublicaciones;
    Button btnComentarios;
    View vista;
    ImageView imagen;

    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public FragmentEstadisticas() {
        // Required empty public constructor
    }

    public static FragmentEstadisticas newInstance(String param1, String param2) {
        FragmentEstadisticas fragment = new FragmentEstadisticas();
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
        // Inflate the layout for this fragment
        vista =  inflater.inflate(R.layout.fragment_fragment_estadisticas, container, false);
        btnUsuarios = (Button)vista.findViewById(R.id.btnUsuariosEstadistcias);
        btnPublicaciones = (Button)vista.findViewById(R.id.btnPublicacionesEstadisticas);
        btnComentarios = (Button)vista.findViewById(R.id.btnComentariosEstadisticas);
        imagen = (ImageView)vista.findViewById(R.id.imagenEstadisticas);
        imagen.setEnabled(false);
        imagen.setVisibility(vista.INVISIBLE);
        btnUsuarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imagen.setImageResource(R.drawable.estadisticauser);
                imagen.setEnabled(false);
                imagen.setVisibility(vista.VISIBLE);
            }
        });

        btnPublicaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imagen.setImageResource(R.drawable.estadisticapublicacion);
                imagen.setEnabled(false);
                imagen.setVisibility(vista.VISIBLE);
            }
        });

        btnComentarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imagen.setImageResource(R.drawable.estadisticacomentarios);
                imagen.setEnabled(false);
                imagen.setVisibility(vista.VISIBLE);
            }
        });
        return vista;

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
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
