package com.personal.rvcheckbox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements QuantityListener{

    RecyclerView recycler_view;
    QuantityAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler_view = findViewById(R.id.recycler_view);

        setRecyclerView();
    }

    private ArrayList<String> getQuantityData(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("10 kg");
        arrayList.add("20 kg");
        arrayList.add("30 kg");
        arrayList.add("40 kg");
        arrayList.add("50 kg");
        arrayList.add("60 kg");
        arrayList.add("120 kg");

        return arrayList;
    }

    private void setRecyclerView() {

        recycler_view.setHasFixedSize(true);
        recycler_view.setLayoutManager(new LinearLayoutManager(this));
        adapter = new QuantityAdapter(this,getQuantityData(),this);
        recycler_view.setAdapter(adapter);
    }

    @Override
    public void onQuantityChange(ArrayList<String> arrayList) {
        //TODO
        Toast.makeText(this, arrayList.toString(), Toast.LENGTH_SHORT).show();
    }
}