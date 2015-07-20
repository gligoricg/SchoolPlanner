package com.planner.schoolplanner;

import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentTransaction;

/**
 * Created by PC on 7/16/2015.
 */
public class TabListener implements ActionBar.TabListener {
    private Fragment fragment;

    // The contructor.
    public TabListener(Fragment fragment) {
        this.fragment = fragment;
    }
    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        ft.replace(R.id.activity_main, fragment);
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
        ft.remove(fragment);
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}
