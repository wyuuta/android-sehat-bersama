package com.example.yuuta.sehatbersama.CustomAdapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.yuuta.sehatbersama.R;

import java.util.ArrayList;

public class CourseListAdapter extends ArrayAdapter {

    //to reference the Activity
    private final Activity context;

    //to store the list of countries
    private final ArrayList<String> nameArray;

    //to store the list of countries
    private final ArrayList<String> lamaArray;

    public CourseListAdapter(Activity context, ArrayList<String> nameArrayParam, ArrayList<String> lamaArrayParam) {
        super(context, R.layout.list_row, nameArrayParam);

        this.context = context;
        this.nameArray = nameArrayParam;
        this.lamaArray = lamaArrayParam;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_row, null, true);

        //this code gets references to objects in the listview_row.xml file
        TextView nameTextField = rowView.findViewById(R.id.textTitle);
        TextView infoTextField = rowView.findViewById(R.id.textSubtitle);

        //this code sets the values of the objects to values from the arrays
        nameTextField.setText(nameArray.get(position));
        infoTextField.setText(lamaArray.get(position));
        return rowView;
    }
}
