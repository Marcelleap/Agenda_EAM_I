package com.example.agenda_eam;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class OutputFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    public OutputFragment() {
        // Required empty public constructor
    }

    public static OutputFragment newInstance(String param1, String param2) {
        OutputFragment fragment = new OutputFragment();
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
        View view = inflater.inflate(R.layout.fragment_output, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.list_Compromisso);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        List<String> compromissos = new ArrayList<>();
        compromissos.add("Compromisso de exemplo");

        RecyclerAdapter adapter = new RecyclerAdapter(compromissos);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
