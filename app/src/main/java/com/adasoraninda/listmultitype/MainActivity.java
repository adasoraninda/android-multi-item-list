package com.adasoraninda.listmultitype;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.adasoraninda.listmultitype.adapters.ListMainAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView listMain;

    private final ArrayList<String> dataMain = new ArrayList<>();
    private final ArrayList<String> dataSec = new ArrayList<>();
    private final String title = "Hello World";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listMain = findViewById(R.id.list_main);

        ListMainAdapter mainAdapter = new ListMainAdapter();

        for (int i = 0; i < 20; i++) {
            dataMain.add(String.valueOf(i));
            dataSec.add(String.valueOf(i));
        }

        setupList(mainAdapter);

        mainAdapter.setTitle(title);
        mainAdapter.setDataListMain(dataMain);
        mainAdapter.setDataListSecondary(dataSec);
    }

    private void setupList(ListMainAdapter adapter) {
        listMain.setLayoutManager(new LinearLayoutManager(this));
        listMain.setAdapter(adapter);
    }

}