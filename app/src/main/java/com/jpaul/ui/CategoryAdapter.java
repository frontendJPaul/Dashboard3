package com.jpaul.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.jpaul.dashboard3.R;
import com.jpaul.model.Category;
import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder>{
    private Context context;
    private List<Category> categories;
    private LayoutInflater layoutInflater;

    public CategoryAdapter(Context context_param,List<Category> categories_param, LayoutInflater layoutInflater_param ) {
        this.context = context_param;
        this.categories = categories_param;
        this.layoutInflater = layoutInflater_param;

    }

    @NonNull
    @Override
    public CategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_menu,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.ViewHolder holder, int position) {
        holder.nameTextView.setText(categories.get(position).getName());
        holder.descriptionTextView.setText(categories.get(position).getDescription());
        Glide.with(context)
                .load(categories.get(position).getUrlImage())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.urlImageView);

    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView nameTextView;
        TextView descriptionTextView;
        ImageView urlImageView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
            descriptionTextView = itemView.findViewById(R.id.descriptionTextView);
            urlImageView = itemView.findViewById(R.id.urlImageView);

        }
    }
}
