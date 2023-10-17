package com.example.listviewadapterexample2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.listviewadapterexample2.R;
import com.example.listviewadapterexample2.model.CarModel;
import com.example.listviewadapterexample2.model.Tvs;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Tvs> {

    ArrayList<Tvs> tvArrayList;
    Context context;
     public MyCustomAdapter(ArrayList<Tvs> tvsArrayList, Context context){
         super(context, R.layout.item_list,tvsArrayList);
         this.tvArrayList = tvsArrayList;
     }

     private static class ViewHolder{
         TextView name,price,description;
         ImageView image;
     }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

         Tvs tvs = getItem(position);

         ViewHolder tvsViewHolder;
         final View result;

         if (convertView==null){
             tvsViewHolder = new ViewHolder();
             LayoutInflater inflater = LayoutInflater.from(getContext());
             convertView = inflater.inflate(R.layout.item_list, parent,false);

             tvsViewHolder.name = (TextView) convertView.findViewById(R.id.name);
             tvsViewHolder.price = (TextView) convertView.findViewById(R.id.price);
             tvsViewHolder.description = (TextView) convertView.findViewById(R.id.description);
             tvsViewHolder.image = (ImageView) convertView.findViewById(R.id.image);

             result = convertView;
             convertView.setTag(tvsViewHolder);

         }else {

             tvsViewHolder = (ViewHolder) convertView.getTag();

             result = convertView;
         }

         tvsViewHolder.name.setText(tvs.getName());
         tvsViewHolder.price.setText(tvs.getPrice());
         tvsViewHolder.description.setText(tvs.getDescription());
         tvsViewHolder.image.setImageResource(tvs.getImage());
        return convertView;

    }

}
