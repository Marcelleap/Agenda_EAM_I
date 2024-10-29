package com.example.agenda_eam;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private List<String> compromissos;

    public RecyclerAdapter(List<String> compromissos) {
        this.compromissos = compromissos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String compromisso = compromissos.get(position);
        holder.txtCompromisso.setText(compromisso);
    }

    @Override
    public int getItemCount() {
        return compromissos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtCompromisso;
        public Button btnEditar;
        public Button btnExcluir;

        public ViewHolder(View itemView) {
            super(itemView);
            txtCompromisso = itemView.findViewById(R.id.txtCompromisso);
            btnEditar = itemView.findViewById(R.id.btnEditar);
            btnExcluir = itemView.findViewById(R.id.btnExcluir);
        }
    }
}
