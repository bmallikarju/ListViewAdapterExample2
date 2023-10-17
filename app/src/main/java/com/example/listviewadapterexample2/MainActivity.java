package com.example.listviewadapterexample2;

import static com.example.listviewadapterexample2.model.CarModel.price;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.listviewadapterexample2.adapter.MyCustomAdapter;
import com.example.listviewadapterexample2.model.CarModel;
import com.example.listviewadapterexample2.model.Tvs;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    ArrayList<Tvs> tvsArrayList;

     MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        tvsArrayList = new ArrayList<>();
        Tvs tvs= new Tvs("Tv", "15000", R.drawable.tv_1, "1080pixels");
        Tvs tvs1 = new Tvs("Tv1", "15000", R.drawable.tv_2, "720pixels");
        Tvs tvs2 = new Tvs("Tv2", "15000", R.drawable.tv_3, "1280pixels");
        Tvs tvs3 = new Tvs("Tv3", "15000", R.drawable.tv_4, "1920pixels");
        Tvs tvs4 = new Tvs("Tv4", "15000", R.drawable.tv4, "3840pixels");
        Tvs tvs5= new Tvs("Tv", "15000", R.drawable.tv_1, "1080pixels");
        Tvs tvs6 = new Tvs("Tv1a", "15000", R.drawable.tv_2, "720pixels");
        Tvs tvs7 = new Tvs("Tv2a", "15000", R.drawable.tv_3, "1280pixels");
        Tvs tvs8 = new Tvs("Tv3a", "15000", R.drawable.tv_1, "1920pixels");
        Tvs tvs9 = new Tvs("Tv4a", "15000", R.drawable.tv_2, "3840pixels");

        tvsArrayList.add(tvs);
        tvsArrayList.add(tvs1);
        tvsArrayList.add(tvs2);
        tvsArrayList.add(tvs3);
        tvsArrayList.add(tvs);
        tvsArrayList.add(tvs1);
        tvsArrayList.add(tvs2);
        tvsArrayList.add(tvs3);
        tvsArrayList.add(tvs);
        tvsArrayList.add(tvs1);




        adapter = new MyCustomAdapter(tvsArrayList,getApplicationContext());
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(MainActivity.this, "" + adapter.getItem(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });


    }
}