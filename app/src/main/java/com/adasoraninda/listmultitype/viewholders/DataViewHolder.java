package com.adasoraninda.listmultitype.viewholders;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.adasoraninda.listmultitype.R;

public class DataViewHolder extends RecyclerView.ViewHolder {

    private final TextView textView;

    public DataViewHolder(View view) {
        super(view);
        textView = view.findViewById(R.id.text);
    }

    public void bindData(String text) {
        textView.setText(text);
    }

}
