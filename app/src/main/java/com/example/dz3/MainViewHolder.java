package com.example.dz3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {

    TextView textView;
    OnItemClickListener listener;

    public void setListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.textview);
        itemView.setOnClickListener(v -> {
            if (listener != null)
                listener.onClick(getAdapterPosition());
        });
    }

    public void onbind(ItemModel data) {
        textView.setText(data.name);
    }
}
