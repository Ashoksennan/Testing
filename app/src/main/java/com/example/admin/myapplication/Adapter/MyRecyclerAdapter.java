package com.example.admin.myapplication.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.admin.myapplication.Bean.MyBean;
import com.example.admin.myapplication.R;

import java.util.List;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder>{
    List<MyBean> myBeanList;
    Context context;
    callbackfun callbackfun2;

    public MyRecyclerAdapter(List<MyBean> myBeanList, Context context,callbackfun callbackfun1) {
        this.myBeanList = myBeanList;
        this.context = context;
        this.callbackfun2 = callbackfun1;
    }

    @NonNull
    @Override
    public MyRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_item,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecyclerAdapter.ViewHolder viewHolder, final int i) {
        viewHolder.rollno.setText(myBeanList.get(i).getRollno());
        viewHolder.name.setText(myBeanList.get(i).getName());
        viewHolder.name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callbackfun2.userdetails(myBeanList.get(i).getRollno(),myBeanList.get(i).getName());
            }
        });
        viewHolder.rollno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "just a toast that's all", Toast.LENGTH_SHORT).show();
                Log.e("hdvbf"," just a click");
            }
        });
    }

    @Override
    public int getItemCount() {
        return myBeanList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView rollno,name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
             rollno = (TextView)itemView.findViewById(R.id.tv_rollno);
             name = (TextView)itemView.findViewById(R.id.tv_name);
        }
    }

    public interface callbackfun{

        public void userdetails(String rollno,String name);

    }
}