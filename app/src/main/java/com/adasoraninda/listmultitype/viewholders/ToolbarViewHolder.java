package com.adasoraninda.listmultitype.viewholders;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.adasoraninda.listmultitype.R;
import com.google.android.material.appbar.MaterialToolbar;

public class ToolbarViewHolder extends RecyclerView.ViewHolder {

    private final MaterialToolbar toolbar;

    public ToolbarViewHolder(View view) {
        super(view);
        toolbar = view.findViewById(R.id.toolbar);
    }

    public void bindData(String title) {
        toolbar.setTitle(title);
    }

}