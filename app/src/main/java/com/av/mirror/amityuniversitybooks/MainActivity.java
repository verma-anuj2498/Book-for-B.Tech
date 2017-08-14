package com.av.mirror.amityuniversitybooks;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Animation fabopen,fabclose,fabrotclock,fabrotanti;
    LinearLayout rate,share;
    FloatingActionButton fab,fabshare,fabrate;
    Button oneY,twoY,threeY,fourY;
    int ctr=0,mctr=0;
    Bundle extras=new Bundle();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//Linear layout
        rate=(LinearLayout)findViewById(R.id.rateLL);
        share=(LinearLayout)findViewById(R.id.shareLL);
//fab
        fabshare=(FloatingActionButton)findViewById(R.id.share);
        fab = (FloatingActionButton) findViewById(R.id.plus);
        fabrate=(FloatingActionButton)findViewById(R.id.rate);
//buttons
        oneY=(Button)findViewById(R.id.oneyear);
        twoY=(Button)findViewById(R.id.twoyear);
        threeY=(Button)findViewById(R.id.threeyear);
        fourY=(Button)findViewById(R.id.fouryear);
//fabanimation
        fabopen= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_open);
        fabclose=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_close);
        fabrotclock=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotc);
        fabrotanti=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rota);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




       oneY.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               ctr = 1;
               Intent i = new Intent(MainActivity.this, Semester.class);
               //extras.putInt("mctr",mctr);
            //   extras.putInt("ctr",ctr);
               i.putExtra("ctrys", ctr);
               startActivity(i);
               Toast.makeText(MainActivity.this, "FIRST YEAR", Toast.LENGTH_SHORT).show();
           }
       });

        twoY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ctr=2;
                Intent i=new Intent(MainActivity.this,Semester.class);
                //extras.putInt("mctr",mctr);
              //  extras.putInt("ctr",ctr);
                i.putExtra("ctrys", ctr);
                startActivity(i);
                Toast.makeText(MainActivity.this,"SECOND YEAR", Toast.LENGTH_SHORT).show();
            }
        });


        threeY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ctr=3;
                Intent i=new Intent(MainActivity.this,Semester.class);
                //extras.putInt("mctr",mctr);
              //  extras.putInt("ctr",ctr);
                i.putExtra("ctrys", ctr);
                startActivity(i);
                Toast.makeText(MainActivity.this, "THIRD YEAR", Toast.LENGTH_SHORT).show();
            }
        });


        fourY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ctr=4;
                Intent i=new Intent(MainActivity.this,Semester.class);
              //  extras.putInt("mctr",mctr);
               // extras.putInt("ctr",ctr);
                i.putExtra("ctrys", ctr);
                startActivity(i);
                Toast.makeText(MainActivity.this,"FOURTH YEAR", Toast.LENGTH_SHORT).show();
            }
        });




        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(rate.getVisibility()==View.VISIBLE && share.getVisibility()==View.VISIBLE){

                    rate.startAnimation(fabclose);
                    share.startAnimation(fabclose);
                    fab.startAnimation(fabrotanti);
                    share.setVisibility(View.GONE);
                    rate.setVisibility(View.GONE);

                }

                else{
                    rate.startAnimation(fabopen);
                    share.startAnimation(fabopen);
                    fab.startAnimation(fabrotclock);
                    share.setVisibility(View.VISIBLE);
                    rate.setVisibility(View.VISIBLE);


                }
            }
        });

        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.youtube.com/"));
                startActivity(i);
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "Here is the share content body";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share via"));
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        Intent a = new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


// color vala overflow menu


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        RelativeLayout rel=(RelativeLayout) findViewById(R.id.main_view);
        mctr=0;
        switch ( item.getItemId()){

            case R.id.about:{
            Toast.makeText(MainActivity.this,"This will show \n about the developers",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(MainActivity.this,About.class);
                startActivity(i);

            return true;}

            case  R.id.black:{
                if(item.isChecked()){
                    item.setChecked(false);
                    mctr=0;
                    rel.setBackgroundColor(Color.WHITE);
                }
                else {
                    item.setChecked(true);
                    mctr=1;
                    rel.setBackgroundColor(Color.BLACK);
                    return true;
                }
            }
            case  R.id.yellow:{
                if(item.isChecked()){
                    mctr=0;
                    item.setChecked(false);
                    rel.setBackgroundColor(Color.WHITE);
                }
                else {
                    item.setChecked(true);
                    mctr=2;
                    Toast.makeText(MainActivity.this,"Yellow "+mctr,Toast.LENGTH_SHORT).show();
                    rel.setBackgroundColor(Color.YELLOW);
                    return true;
                }
            }

            case R.id.white:{
                if(item.isChecked()){
                    item.setChecked(false);
                    mctr=0;
                }
                else {
                    item.setChecked(true);
                    mctr=3;
                    rel.setBackgroundColor(Color.WHITE);
                    return true;
                }
            }
        default:return super.onOptionsItemSelected(item);
        }




    }
//navigation bar vala navbar
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
            ctr=0;

        if (id == R.id.nav_one) {
            ctr = 1;
            Intent i = new Intent(MainActivity.this, Semester.class);
           // extras.putInt("mctr",mctr);
            //extras.putInt("ctr",ctr);
            i.putExtra("ctrys", ctr);
            startActivity(i);
            Toast.makeText(MainActivity.this, "First year", Toast.LENGTH_SHORT).show();


        } else if (id == R.id.nav_two) {
            ctr=2;
            Intent i=new Intent(MainActivity.this,Semester.class);
            //extras.putInt("mctr",mctr);
          //  extras.putInt("ctr",ctr);
            i.putExtra("ctrys", ctr);
            startActivity(i);
            Toast.makeText(MainActivity.this,"SECOND YEAR", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_three) {
            ctr=3;
            Intent i=new Intent(MainActivity.this,Semester.class);
            //extras.putInt("mctr",mctr);
            //extras.putInt("ctr",ctr);
            i.putExtra("ctrys", ctr);
            startActivity(i);
            Toast.makeText(MainActivity.this, "THIRD YEAR", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_four) {
            ctr=4;
            Intent i=new Intent(MainActivity.this,Semester.class);
            //extras.putInt("mctr",mctr);
            //extras.putInt("ctr",ctr);
            i.putExtra("ctrys", ctr);
            startActivity(i);
            Toast.makeText(MainActivity.this,"FOURTH YEAR", Toast.LENGTH_SHORT).show();
        } else if(id==R.id.home){

            Intent i=new Intent(MainActivity.this,MainActivity.class);
            startActivity(i);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
