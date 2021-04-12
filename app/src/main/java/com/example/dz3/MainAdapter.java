package com.example.dz3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

    ArrayList<ItemModel> data = new ArrayList<ItemModel>();
    OnItemClickListener listener;

    public void setListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_list, parent, false);
        MainViewHolder viewHolder = new MainViewHolder(view);
        viewHolder.setListener(listener);
        return viewHolder;
    }

    public void addText(ArrayList<ItemModel> list) {
        data = list;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.onbind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}

interface OnItemClickListener {
    void onClick(int adapterPosition);
}