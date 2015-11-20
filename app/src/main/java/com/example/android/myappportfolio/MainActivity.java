package com.example.android.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    public void onclickSpotStream(View view) {
        Toast.makeText(this, getString(R.string.spotify_streamer), Toast.LENGTH_SHORT).show();
    }

    public void onclickScoreApp(View view) {
        Toast.makeText(this,getString(R.string.scores_app),Toast.LENGTH_SHORT).show();
    }

    public void onclickLibraryApp(View view) {
        Toast.makeText(this,getString(R.string.library_app),Toast.LENGTH_SHORT).show();
    }

    public void onclickBuildItBigger(View view) {
        Toast.makeText(this,getString(R.string.buildit_bigger_app),Toast.LENGTH_SHORT).show();
    }

    public void onclickXYZReader(View view) {
        Toast.makeText(this,getString(R.string.xyzreader_app),Toast.LENGTH_SHORT).show();
    }

    public void onclickCapstoneApp(View view) {
        Toast.makeText(this,getString(R.string.capstone_app),Toast.LENGTH_SHORT).show();
    }


}
