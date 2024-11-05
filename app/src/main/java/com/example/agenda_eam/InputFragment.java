package com.example.agenda_eam;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;

import androidx.fragment.app.Fragment;

public class InputFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    private EditText text_Descricao;
    private Button btn_OK;
    private Button btn_Editar;
    private Button btn_Excluir;
    private Button btn_OutraData;
    private Button cld_Data;
    private Button cld_Hora;
    private Spinner spinner_Prioridade;
    private Switch switch_Notificao;

    public InputFragment() {
        // Required empty public constructor
    }

    public static InputFragment newInstance(String param1, String param2) {
        InputFragment fragment = new InputFragment();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_input, container, false);

        // Inicialização das views
        text_Descricao = view.findViewById(R.id.txtDescricao);
        btn_OK = view.findViewById(R.id.btn_Ok);
        btn_Editar = view.findViewById(R.id.btn_Editar);
        btn_Excluir = view.findViewById(R.id.btn_Excluir);
        btn_OutraData = view.findViewById(R.id.btn_OutraData);
        cld_Data = view.findViewById(R.id.cld_Data);
        cld_Hora = view.findViewById(R.id.cld_Hora);
        spinner_Prioridade = view.findViewById(R.id.spinnerPrioridade);
        switch_Notificao = view.findViewById(R.id.switchNotificacao);

        // Configuração do Spinner
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(), R.array.prioridade_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_Prioridade.setAdapter(adapter);

        // Configuração do botão OK
        btn_OK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String descricao = text_Descricao.getText().toString();
                String prioridade = spinner_Prioridade.getSelectedItem().toString();
                boolean notificacao = switch_Notificao.isChecked();

                Log.d("Agenda", "Descrição: " + descricao);
                Log.d("Agenda", "Prioridade: " + prioridade);
                Log.d("Agenda", "Notificação: " + notificacao);
            }
        });

        return view;
    }
}
