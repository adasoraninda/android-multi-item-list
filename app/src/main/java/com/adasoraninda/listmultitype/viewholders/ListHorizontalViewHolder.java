package com.adasoraninda.listmultitype.viewholders;

import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.adasoraninda.listmultitype.R;
import com.adasoraninda.listmultitype.adapters.ListSecondaryAdapter;

import java.util.List;

public class ListHorizontalViewHolder extends RecyclerView.ViewHolder {

    private final RecyclerView listHorizontal;
    private final ListSecondaryAdapter adapter;

    public ListHorizontalViewHolder(View view, ListSecondaryAdapter adapter) {
        super(view);
        listHorizontal = view.findViewById(R.id.list_secondary);
        this.adapter = adapter;

        setupList();
    }

    private void setupList() {
        listHorizontal.setAdapter(adapter);

        LinearLayoutManager manager = new LinearLayoutManager(
                listHorizontal.getContext(),
                RecyclerView.HORIZONTAL,
                false
        );

        listHorizontal.setLayoutManager(manager);
    }

    public void bindData(List<String> data) {
        adapter.setData(data);
    }

}
