package com.planner.schoolplanner;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


public class DailyFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_daily, container, false);
        return rootView;
    }

    DailFragmentAdapter adapter;
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        String[] predmeti = new String[] { "Matematika", "Fizika", "Hemija",
                "Biologija", "Srpski jezik", "Engleski jezik", "Informatika", "Matematika2",
                "Hemija2", "Fizika2" };
        String[] vreme = new String[] { "7:00", "8:00", "9:00",
                "10:00", "11:00", "12:00", "13:00", "14:00",
                "15:00", "16:00" };
        String[] ucionica = new String[] { "Android", "iPhone", "WindowsMobile",
                "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
                "Linux", "OS/2" };


        adapter = new DailFragmentAdapter(predmeti, vreme, ucionica, getActivity());
        ListView lv = (ListView)getActivity().findViewById(R.id.listView);
        lv.setAdapter(adapter);

    }



}
