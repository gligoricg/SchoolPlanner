package com.planner.schoolplanner;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class DailFragmentAdapter extends ArrayAdapter<String>{
    String [] predmeti;
    String [] vreme;
    String [] ucionica;
    Context context;
    Context c;
    public DailFragmentAdapter(String[] predmeti, String[] vreme, String[] ucionica, Context context){
        super(context,R.layout.fragment_daily_row, R.id.predmet,predmeti);
        this.predmeti=predmeti;
        this.vreme=vreme;
        this.ucionica=ucionica;
        this.context=context;

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String [] predmeti= this.predmeti;
        String [] vreme = this.vreme;
        String [] ucionica = this.ucionica;

        View listItem = super.getView(position, convertView, parent);
        TextView txt = (TextView)listItem.findViewById(R.id.predmet);
        TextView vremeTV = (TextView)listItem.findViewById(R.id.vreme);
        TextView ucionicaTV = (TextView)listItem.findViewById(R.id.ucionica);

        txt.setText(predmeti[position]);
        vremeTV.setText(vreme[position]);
        ucionicaTV.setText(ucionica[position]);

        return listItem;
    }
}
