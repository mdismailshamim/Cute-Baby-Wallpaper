package com.example.cutebabywallpaper.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.cutebabywallpaper.Activities.ViewWallpaperActivity;
import com.example.cutebabywallpaper.R;

import java.util.List;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ViewHolder> {
    private Context mContext;
    private List<UserClass> imageList;


    public GridAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public List<UserClass> getImageList() {
        return imageList;
    }

    public void setListImage(List<UserClass> imageList) {
        this.imageList = imageList;
    }

    @NonNull
    @Override
    public GridAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridAdapter.ViewHolder holder, final int position) {
        Glide.with(mContext).load(getImageList().get(position).getImages()).into(holder.gridImage);
        holder.viewWallpaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent imageIntent = new Intent(mContext, ViewWallpaperActivity.class);
                imageIntent.putExtra(ViewWallpaperActivity.EXTR_IMAGE,imageList.get(position));
                mContext.startActivity(imageIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView gridImage;
        private Button viewWallpaper;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gridImage = itemView.findViewById(R.id.gridImage);
            viewWallpaper = itemView.findViewById(R.id.viewWallpaper);
        }
    }
}
