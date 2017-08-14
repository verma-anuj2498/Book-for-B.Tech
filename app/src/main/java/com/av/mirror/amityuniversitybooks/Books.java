package com.av.mirror.amityuniversitybooks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Books extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    public FloatingActionButton fabhome;
    public Bundle putextr=new Bundle();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Bundle extras=getIntent().getExtras();
        int a=extras.getInt("ctryscb",0);
        int c=extras.getInt("ctrysbc",0);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //main code shuru hota h yaha se
    CardView ok;
        ok=(CardView)findViewById(R.id.ok);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://drive.google.com/open?id=0B4butL-QcjAZYkRLX2NZbWZGbHM"));
                startActivity(i);
            }
        });
        fabhome=(FloatingActionButton)findViewById(R.id.homefab);

        fabhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Books.this,MainActivity.class);
                startActivity(i);

            }
        });




    }

    @Override
    public void onBackPressed() {
        Intent in=new Intent(Books.this,Course.class);
        startActivity(in);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.books, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        int num;
        int p=getIntent().getExtras().getInt("ctryscb", 0);
        int q=getIntent().getExtras().getInt("ctrysbc",0);
        if (id == R.id.book_nav_one) {
        Intent in=new Intent(Books.this,Books.class);
            num=1;
            num=Integer.valueOf(String.valueOf(q)+String.valueOf(num));
            putextr.putInt("ctryscb",p);
            putextr.putInt("ctrysbc",num);
            in.putExtras(putextr);
            Toast.makeText(Books.this, "Ctryscb: " + p+ "\nctrysbc: " + num, Toast.LENGTH_SHORT).show();

            startActivity(in);
        } else if (id == R.id.book_nav_two) {
        Intent in=new Intent(Books.this,Books.class);
            num=2;
            num=Integer.valueOf(String.valueOf(q)+String.valueOf(num));
            putextr.putInt("ctryscb",p);
            putextr.putInt("ctrysbc",num);
            in.putExtras(putextr);
            Toast.makeText(Books.this, "Ctryscb: " + p+ "\nctrysbc: " + num, Toast.LENGTH_SHORT).show();

            startActivity(in);

        } else if (id == R.id.book_nav_three) {
        Intent in=new Intent(Books.this,Books.class);
            num=3;
            num=Integer.valueOf(String.valueOf(q)+String.valueOf(num));
            putextr.putInt("ctryscb",p);
            putextr.putInt("ctrysbc",num);
            in.putExtras(putextr);
            Toast.makeText(Books.this, "Ctryscb: " + p+ "\nctrysbc: " + num, Toast.LENGTH_SHORT).show();

            startActivity(in);

        } else if (id == R.id.book_nav_four) {
        Intent in=new Intent(Books.this,Books.class);
            num=4;
            num=Integer.valueOf(String.valueOf(q)+String.valueOf(num));
            putextr.putInt("ctryscb",p);
            putextr.putInt("ctrysbc",num);
            in.putExtras(putextr);
            Toast.makeText(Books.this, "Ctryscb: " + p+ "\nctrysbc: " + num, Toast.LENGTH_SHORT).show();

            startActivity(in);

        } else if (id == R.id.book_nav_five) {
            Intent in=new Intent(Books.this,Books.class);
            num=5;
            num=Integer.valueOf(String.valueOf(q)+String.valueOf(num));
            putextr.putInt("ctryscb",p);
            putextr.putInt("ctrysbc",num);
            in.putExtras(putextr);
            Toast.makeText(Books.this, "Ctryscb: " + p+ "\nctrysbc: " + num, Toast.LENGTH_SHORT).show();

            startActivity(in);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
