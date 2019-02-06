package com.example.listviewplayground;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


class CustomAdapter extends ArrayAdapter<String> {
    CustomAdapter(@NonNull Context context, String[] names) {
        super(context, R.layout.custom_row, names);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflate = LayoutInflater.from(getContext());
        View customView = inflate.inflate(R.layout.custom_row, parent, false);

        String singleItem = getItem(position);
        TextView textView = (TextView) customView.findViewById(R.id.textView);
        ImageView image = (ImageView) customView.findViewById(R.id.imageView);

        textView.setText(singleItem);
        image.setImageResource(R.drawable.cover_300x);

        return customView;
    }
}
