package com.example.ksitproduction.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ksitproduction.R;
import com.example.ksitproduction.model.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class ViewAdaptor extends RecyclerView.Adapter<ViewAdaptor.ViewHolder> {

    private LayoutInflater inflater;
    private List<CTask> tasks;

    ViewAdaptor(Context context, List<CTask> CTasks) {
        this.tasks = CTasks;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public ViewAdaptor.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.recycler_view_tasks_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewAdaptor.ViewHolder holder, int position) {
        CTask CTask = tasks.get(position);
        holder.nameView.setText(CTask.getName());
        holder.dateView.setText(CTask.getDate());
        //holder.status.setImageDrawable();

    }
    @Override
    public int getItemCount() {
        return tasks.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final TextView dateView;
        final TextView nameView;
        final TextView pointView;
        final ImageView status;
        ViewHolder(View view){
            super(view);
            nameView = (TextView) view.findViewById(R.id.name);
            dateView = (TextView) view.findViewById((R.id.date));
            pointView = (TextView) view.findViewById((R.id.control_point));
            status = (ImageView) view.findViewById((R.id.status));
        }
    }
}
