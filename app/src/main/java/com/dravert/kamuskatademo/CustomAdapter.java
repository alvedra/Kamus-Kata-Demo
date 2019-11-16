package com.dravert.kamuskatademo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import de.hdodenhof.circleimageview.CircleImageView;

public class CustomAdapter extends ArrayAdapter {

    private final Context context;
    private final String[] values;
    private final int[] images;

    public CustomAdapter(Context context, String[] word, int[] images){
        super(context, -1, word);
        this.context = context;
        this.values = word;
        this.images = images;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = layoutInflater.inflate(R.layout.list_item_two_layout, parent, false);

        TextView tvWord = rowView.findViewById(R.id.textview_word);
        CircleImageView imageCircle = rowView.findViewById(R.id.circle_image);

        tvWord.setText(values[position]);
        imageCircle.setImageResource(images[position]);

        return rowView;
    }
}
