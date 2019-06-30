package com.example.myapplication2.recyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication2.R;

public class StaggeredGridAdapter extends RecyclerView.Adapter <StaggeredGridAdapter.LinearViewHolder>{

    private Context mContext;
    private OnItemClickListener mListener;
    //private OnItemLongClickListener mLlister;

    public StaggeredGridAdapter(Context context , OnItemClickListener listener){
        this.mContext = context;
        this.mListener = listener;
    }

    @NonNull
    @Override
    public StaggeredGridAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_staggered_grid_recyclerview_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull StaggeredGridAdapter.LinearViewHolder holder, final int position) {
        if(position % 2 != 0){
            holder.imageView.setImageResource(R.drawable.tow);
        }else {
            holder.imageView.setImageResource(R.drawable.eightt);
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(mContext,"check..." + position,Toast.LENGTH_SHORT).show();
                mListener.onClick(position);
            }
        });
//        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View view) {
////                Toast.makeText(mContext,"check..." + position,Toast.LENGTH_SHORT).show();
//                mLlister.onClick(position);
//                return true;
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    class LinearViewHolder extends RecyclerView.ViewHolder{

       private ImageView imageView;

        public LinearViewHolder(View itemView){
            super(itemView);
            imageView = itemView.findViewById(R.id.iv);
        }
    }
    public interface OnItemClickListener{
        void onClick(int pos);
    }

//    public interface OnItemLongClickListener{
//        void onClick(int pos);
//    }
}
