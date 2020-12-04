package com.emrannik.androidnik.emrannik.hotelbooking_ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.List;

public class AdapterSearch extends RecyclerView.Adapter<AdapterSearch.MyViewHolder> {

    private List<String> data;
    private int[] myImageList;
    private Context context;

    public AdapterSearch(List<String> data, int[] myImageList, Context context) {
        this.data = data;
        this.myImageList=myImageList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.view_item_search,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        int top = (int) context.getResources().getDimension(R.dimen.margin8dp);
        int bottom = (int) context.getResources().getDimension(R.dimen.margin8dp);
        int left = (int) context.getResources().getDimension(R.dimen.marginSize);
        int right = (int) context.getResources().getDimension(R.dimen.marginSize);
        if (position == 0){
            top = 0;
        }else{
            top = (int) context.getResources().getDimension(R.dimen.margin8dp);
        }

        if (position==data.size()-1){
            bottom = (int) context.getResources().getDimension(R.dimen.margin8dp);
        }

        holder.textview_item_room_name.setText(data.get(position));
        holder.imageView.setImageResource(myImageList[position]);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(holder.itemView.getLayoutParams());
        marginLayoutParams.setMargins(left,top,right,bottom);
        holder.itemView.setLayoutParams(marginLayoutParams);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView textview_item_room_name;
        private ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textview_item_room_name = itemView.findViewById(R.id.textview_item_room_name);
            imageView=itemView.findViewById(R.id.imageview_item_search);
        }
    }
}
