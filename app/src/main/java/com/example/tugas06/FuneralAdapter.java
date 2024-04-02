package com.example.tugas06;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FuneralAdapter extends RecyclerView.Adapter<FuneralAdapter.ViewHolder> {
    private final Detail detail;

    private ArrayList<FuneralModel> funeralModels;

    public FuneralAdapter(ArrayList<FuneralModel> funeralModels
                           Detail detail) {
        this.funeralModels = funeralModels;
        this.detail = detail;
    }

    @NonNull
    @Override
    public FuneralAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
        return new FuneralAdapter.ViewHolder(view, detail);
    }

    @Override
    public void onBindViewHolder(@NonNull FuneralAdapter.ViewHolder holder, int position) {
        holder.jenisFuneral.setText(funeralModels.get(position).getJenisFuneral());
        holder.logoFuneral.setImageResource(funeralModels.get(position).getLogoFuneral());

    }

    @Override
    public int getItemCount() {
        return funeralModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView jenisFuneral;
        ImageView logoFuneral;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            jenisFuneral = itemView.findViewById(R.id.tvfuneral);
            logoFuneral = itemView.findViewById(R.id.ivfuneral);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (detail != null) {
                        int pos = getAdapterPosition();

                        if (pos != RecyclerView.NO_POSITION){
                            detail.onItemClick(pos);
                        }
                    }
                }
            });


        }
    }
}
