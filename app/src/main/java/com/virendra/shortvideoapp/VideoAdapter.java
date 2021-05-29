package com.virendra.shortvideoapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class VideoAdapter  extends RecyclerView.Adapter<VideoAdapter.myViewHolder>{

    ArrayList<VideoModel> videos;

    public VideoAdapter(ArrayList<VideoModel> videos) {
        this.videos = videos;
    }

    @NonNull
    @NotNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_view,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull VideoAdapter.myViewHolder holder, int position) {
        holder.setData(videos.get(position));
    }

    @Override
    public int getItemCount() {
        return videos.size();
    }

    static class myViewHolder extends RecyclerView.ViewHolder{

        VideoView videoView;
        TextView title,description;
        ProgressBar pBar;

        public myViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            videoView = itemView.findViewById(R.id.videoView);
            title = itemView.findViewById(R.id.title);
            description = itemView.findViewById(R.id.description);
            pBar = itemView.findViewById(R.id.pBar);
        }
        void setData(VideoModel obj){
            videoView.setVideoPath(obj.getUrl());
            title.setText(obj.getTitle());
            description.setText(obj.getDescription());

            videoView.setOnPreparedListener(mp -> {
                pBar.setVisibility(View.GONE);
                mp.start();
            });

            videoView.setOnCompletionListener(mp -> {
                pBar.setVisibility(View.GONE);
                mp.start();
            });
        }
    }
}
