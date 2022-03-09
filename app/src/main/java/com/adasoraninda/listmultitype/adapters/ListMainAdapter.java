package com.adasoraninda.listmultitype.adapters;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.adasoraninda.listmultitype.R;
import com.adasoraninda.listmultitype.viewholders.DataViewHolder;
import com.adasoraninda.listmultitype.viewholders.ListHorizontalViewHolder;
import com.adasoraninda.listmultitype.viewholders.ToolbarViewHolder;

import java.util.ArrayList;
import java.util.List;

public class ListMainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    // Ini buat data vertical yang dibawah
    private final ArrayList<String> dataMain = new ArrayList<>();
    private final ArrayList<String> dataSec = new ArrayList<>();
    private String title;

    @SuppressLint("NotifyDataSetChanged")
    public void setTitle(String title) {
        this.title = title;
        notifyDataSetChanged();
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setDataListSecondary(List<String> data) {
        this.dataSec.clear();
        this.dataSec.addAll(data);
        notifyDataSetChanged();
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setDataListMain(List<String> data) {
        this.dataMain.clear();
        this.dataMain.addAll(data);
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        RecyclerView.ViewHolder viewHolder;

        switch (viewType) {
            case 0:
                View view1 = inflater.inflate(R.layout.item_toolbar, parent, false);
                viewHolder = new ToolbarViewHolder(view1);
                break;
            case 1:
                View view2 = inflater.inflate(R.layout.item_list_horizontal, parent, false);
                ListSecondaryAdapter adapter = new ListSecondaryAdapter();
                viewHolder = new ListHorizontalViewHolder(view2, adapter);
                break;
            default:
                View view3 = inflater.inflate(R.layout.item_data_vertical, parent, false);
                viewHolder = new DataViewHolder(view3);
                break;
        }

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        switch (position) {
            case 0:
                ((ToolbarViewHolder) holder).bindData(title);
                break;
            case 1:
                ((ListHorizontalViewHolder) holder).bindData(dataSec);
                break;
            default:
                ((DataViewHolder) holder).bindData(dataMain.get(position - 2));
                break;
        }
    }

    @Override
    public int getItemCount() {
        return dataMain.size() + 2;
    }

    @Override
    public int getItemViewType(int position) {
        int viewType = -1;

        switch (position) {
            case 0:
                viewType = 0;
                break;
            case 1:
                viewType = 1;
                break;
            default:
                viewType = 2;
                break;
        }

        return viewType;
    }
}
