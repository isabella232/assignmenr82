package com.niketgoel.assignmenr82;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;


// Custom list view adapter
public class CustomerAdapter extends BaseAdapter {

    private ArrayList myList;
    private LayoutInflater inflater;
    private Context context;

    CustomerAdapter(Context context, ArrayList list)
    {
        this.context = context;
        inflater= (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        myList = list;
    }


    // override the following methods for custom adapter

    // return the size of data list
    @Override
    public int getCount() {
        return myList.size();
    }

    // return individual item
    @Override
    public Object getItem(int i) {
        return myList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    // returrn the view
    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        ViewHolder holder;

        if(view==null){ // haven't created view

            view= inflater.inflate(R.layout.my_list_view, viewGroup, false); // inflate the view
            holder= new ViewHolder();
           // holder.view1=view.findViewById(R.id.view);
            holder.view= (TextView) view.findViewById(R.id.view);
            holder.nameTextView= (TextView)view.findViewById(R.id.nameTextView);
            holder.phoneTextView= (TextView)view.findViewById(R.id.phoneTextView);
            view.setTag(holder);
        }else {
            holder= (ViewHolder)view.getTag();
        }

        holder.view.setBackgroundColor(Color.DKGRAY);
        // set name and phone
        Customer customer = (Customer) myList.get(position);
        holder.nameTextView.setText(customer.getName());
        holder.phoneTextView.setText(customer.getPhone());
        return view;
    }

    public class ViewHolder{

        TextView nameTextView, phoneTextView, view;
    }
}
