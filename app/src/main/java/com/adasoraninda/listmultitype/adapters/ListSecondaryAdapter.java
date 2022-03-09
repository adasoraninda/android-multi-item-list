package com.adasoraninda.listmultitype.adapters;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.adasoraninda.listmultitype.R;
import com.adasoraninda.listmultitype.viewholders.DataViewHolder;

import java.util.ArrayList;
import java.util.List;

public class ListSecondaryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final ArrayList<String> data = new ArrayList<>();

    @SuppressLint("NotifyDataSetChanged")
    public void setData(List<String> data) {
        this.data.clear();
        this.data.addAll(data);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_data_horizontal, parent, false);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((DataViewHolder) holder).bindData(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
