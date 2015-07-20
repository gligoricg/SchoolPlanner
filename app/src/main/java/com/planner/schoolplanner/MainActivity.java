package com.planner.schoolplanner;


import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);

        if(android.os.Build.VERSION.SDK_INT < 11) {
            requestWindowFeature(Window.FEATURE_NO_TITLE);
        }
        ActionBar.Tab dailyTab, weeklyTab;

        Fragment dailyFragment =(Fragment) new DailyFragment();
        Fragment weeklyFragment = new WeeklyFragment();
        setContentView(R.layout.activity_main);


        ActionBar actionBar = getActionBar();

            actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
            actionBar.setDisplayShowHomeEnabled(false);
            actionBar.setDisplayShowTitleEnabled(false);

        dailyTab = actionBar.newTab();
        dailyTab.setText("Daily");
        weeklyTab = actionBar.newTab();
        weeklyTab.setText("Weekly");
        dailyTab.setTabListener(new TabListener(dailyFragment));
        weeklyTab.setTabListener(new TabListener(weeklyFragment));

        actionBar.addTab(dailyTab);
        actionBar.addTab(weeklyTab);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
