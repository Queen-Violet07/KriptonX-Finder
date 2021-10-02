package com.example.kriptonx;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;

import java.util.List;

public class ScanAdapter extends RecyclerView.Adapter<ScanAdapter.ViewHolder>{

    Context context;
    List<ScanModel> scanModelList;

    public ScanAdapter(Context context, List<ScanModel> scanModelList) {
        this.context = context;
        this.scanModelList = scanModelList;
    }

    @NonNull
    @Override
    public ScanAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.scan_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ScanAdapter.ViewHolder holder, int position) {

        Glide.with(context).load(scanModelList.get(position).getImg_url()).into(holder.img);
        holder.id.setText(scanModelList.get(position).getId());
        holder.description.setText(scanModelList.get(position).getDescription());
        holder.date.setText(scanModelList.get(position).getDate());
        holder.time.setText(scanModelList.get(position).getCenter());
    }

    @Override
    public int getItemCount() {
        return scanModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView id,description,date,time,center;
        ImageView img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            id=itemView.findViewById(R.id.nasa_id);
            description=itemView.findViewById(R.id.nasa_des);
            date=itemView.findViewById(R.id.nasa_date);
            center=itemView.findViewById(R.id.nasa_center);
            img=itemView.findViewById(R.id.nasa_img);
        }
    }
}
