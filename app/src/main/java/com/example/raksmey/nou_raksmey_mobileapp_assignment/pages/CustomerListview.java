package com.example.raksmey.nou_raksmey_mobileapp_assignment.pages;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.raksmey.nou_raksmey_mobileapp_assignment.R;

public class CustomerListview extends ArrayAdapter<String> {


    private String[] brandName;
    private String[] desc;
    private Integer[] imgid;
    private Activity context;

    public CustomerListview(Activity context, String[] brandName, String[] desc, Integer[] imgid) {
        super(context, R.layout.activity_listview, brandName);

        this.context=context;
        this.brandName=brandName;
        this.desc=desc;
        this.imgid=imgid;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View r=convertView;
        ViewHolder viewHolder= null;
        if(r==null){
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.activity_listview,null,true);
            viewHolder=new ViewHolder(r);
            r.setTag(viewHolder);
        }else {
            viewHolder=(ViewHolder) r.getTag();

        }
        viewHolder.imgView.setImageResource(imgid[position]);
        viewHolder.txtView1.setText(brandName[position]);
        viewHolder.txtView2.setText(desc[position]);

        return r;
    }
    class ViewHolder{

        TextView txtView1;
        TextView txtView2;
        ImageView imgView;
        ViewHolder (View v){

            txtView1=v.findViewById(R.id.tvBrandName);
            txtView2=v.findViewById(R.id.tvDescription);
            imgView=v.findViewById(R.id.imageView);
        }

    }
}
