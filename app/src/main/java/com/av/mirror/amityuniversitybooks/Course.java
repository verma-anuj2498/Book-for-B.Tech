package com.av.mirror.amityuniversitybooks;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.List;

public class Course extends Activity {

        public CardView cs,itech,ecec,mechc,civilc;
    public int ctrys,ctrsc,ctr;
   public int coursectr,cctr;



    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        final Activity activity = this;
       // activity.setTitle("Settings");
        activity.setTitle("Select Course");
       // setContentView(R.layout.activity_main);


        cs=(CardView)findViewById(R.id.computerscience);
        itech=(CardView)findViewById(R.id.infotech);
        ecec=(CardView)findViewById(R.id.ece);
        mechc=(CardView)findViewById(R.id.mech);
        civilc=(CardView)findViewById(R.id.civil);

        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();

        Bundle extras= getIntent().getExtras();

        ctrys=extras.getInt("ctrys");
        ctrsc=extras.getInt("ctrsc");
        ctr=extras.getInt("ctr");


cs.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
      cctr=1;
       coursectr=Integer.valueOf(String.valueOf(ctr)+String.valueOf(cctr));
        Toast.makeText(Course.this,String.valueOf(coursectr),Toast.LENGTH_SHORT).show();

         if(coursectr==111){
             Intent i=new Intent(Intent.ACTION_VIEW);
             i.setData(Uri.parse("https://drive.google.com/open?id=0B-Pt0O3_8qTDdFhrV0pIbzczYzQ"));
             startActivity(i);
         }

        if(coursectr==121){
            Intent i=new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://drive.google.com/open?id=0B-Pt0O3_8qTDNDUwSHJVeWstcGM"));
            startActivity(i);
        }

       if(coursectr==211){
            Intent i=new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://drive.google.com/open?id=0B-Pt0O3_8qTDUC1JcUxySWE1REU"));
            startActivity(i);
        }

        if(coursectr==221){
            Intent i=new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://drive.google.com/open?id=0B-Pt0O3_8qTDMHF2LWpyYWRXQm8"));
            startActivity(i);
        }

        if(coursectr==311){
            Intent i=new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://drive.google.com/open?id=0B-Pt0O3_8qTDQTJVdkpad0lwb0k"));
            startActivity(i);
        }

        if(coursectr==321){
            Intent i=new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://drive.google.com/open?id=0B-Pt0O3_8qTDdzhWN01KcGtXakU"));
            startActivity(i);
        }

        if(coursectr==411){
            Intent i=new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://drive.google.com/open?id=0B-Pt0O3_8qTDdmZRa0p3aUFaaEE"));
            startActivity(i);
        }

        if(coursectr==421){
            Intent i=new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://drive.google.com/open?id=0B-Pt0O3_8qTDblpoTGZra1A2ckU"));
            startActivity(i);
        }


    }
});


        itech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cctr=2;
                coursectr=Integer.valueOf(String.valueOf(ctr)+String.valueOf(cctr));
                Toast.makeText(Course.this,String.valueOf(coursectr),Toast.LENGTH_SHORT).show();

                if(coursectr==112){
                    Intent i=new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://drive.google.com/open?id=0B-Pt0O3_8qTDdFhrV0pIbzczYzQ"));
                    startActivity(i);
                }

                if(coursectr==122){
                    Intent i=new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://drive.google.com/open?id=0B-Pt0O3_8qTDNDUwSHJVeWstcGM"));
                    startActivity(i);
                }

                if(coursectr==212){
                    Intent i=new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://drive.google.com/open?id=0B-Pt0O3_8qTDUC1JcUxySWE1REU"));
                    startActivity(i);
                }

                if(coursectr==222){
                    Intent i=new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://drive.google.com/open?id=0B-Pt0O3_8qTDMHF2LWpyYWRXQm8"));
                    startActivity(i);
                }

                if(coursectr==312){
                    Intent i=new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://drive.google.com/open?id=0B-Pt0O3_8qTDQTJVdkpad0lwb0k"));
                    startActivity(i);
                }

                if(coursectr==322){
                    Intent i=new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://drive.google.com/open?id=0B-Pt0O3_8qTDdzhWN01KcGtXakU"));
                    startActivity(i);
                }

                if(coursectr==412){
                    Intent i=new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://drive.google.com/open?id=0B-Pt0O3_8qTDdmZRa0p3aUFaaEE"));
                    startActivity(i);
                }

                if(coursectr==422){
                    Intent i=new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://drive.google.com/open?id=0B-Pt0O3_8qTDblpoTGZra1A2ckU"));
                    startActivity(i);
                }


            }
        });



        mechc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cctr=3;
                coursectr=Integer.valueOf(String.valueOf(ctr)+String.valueOf(cctr));
                Toast.makeText(Course.this,String.valueOf(coursectr),Toast.LENGTH_SHORT).show();

                if(coursectr==113){
                    Toast.makeText(Course.this,"NO BOOKS HAVE BEEN UPLOADED YET!!",Toast.LENGTH_SHORT).show();
                }

                if(coursectr==123){
                    Toast.makeText(Course.this,"NO BOOKS HAVE BEEN UPLOADED YET!!",Toast.LENGTH_SHORT).show();
                }

                if(coursectr==213){
                    Intent i=new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://drive.google.com/open?id=0B-Pt0O3_8qTDYVExbkliY0xWanc"));
                    startActivity(i);
                }

                if(coursectr==223){
                    Intent i=new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://drive.google.com/open?id=0B-Pt0O3_8qTDZ0F0cWROX3dsVU0"));
                    startActivity(i);
                }

                if(coursectr==313){
                    Intent i=new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://drive.google.com/open?id=0B-Pt0O3_8qTDOENkNmpCT3ZSZjA"));
                    startActivity(i);
                }

                if(coursectr==323){
                    Intent i=new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://drive.google.com/open?id=0B-Pt0O3_8qTDMGYyWnNxdnFNOFk"));
                    startActivity(i);
                }

                if(coursectr==413){
                    Intent i=new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://drive.google.com/open?id=0B-Pt0O3_8qTDNEFxV0tPYmprdUE"));
                    startActivity(i);
                }

                if(coursectr==423){
                    Intent i=new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://drive.google.com/open?id=0B-Pt0O3_8qTDNHVsXzFYSy1Qc0U"));
                    startActivity(i);
                }
            }
        });



        ecec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cctr=4;
                coursectr=Integer.valueOf(String.valueOf(ctr)+String.valueOf(cctr));
                Toast.makeText(Course.this,String.valueOf(coursectr),Toast.LENGTH_SHORT).show();
                if(coursectr==114){
                    Toast.makeText(Course.this,"NO BOOKS HAVE BEEN UPLOADED YET!!",Toast.LENGTH_SHORT).show();
                }

                if(coursectr==124){
                    Toast.makeText(Course.this,"NO BOOKS HAVE BEEN UPLOADED YET!!",Toast.LENGTH_SHORT).show();
                }

                if(coursectr==214){
                    Intent i=new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://drive.google.com/open?id=0B-Pt0O3_8qTDdFpEYnZoZ1U5bEU"));
                    startActivity(i);
                }

                if(coursectr==224){
                    Intent i=new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://drive.google.com/open?id=0B-Pt0O3_8qTDYkk1VnY5RzExajA"));
                    startActivity(i);
                }

                if(coursectr==314){
                    Intent i=new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://drive.google.com/open?id=0B-Pt0O3_8qTDZFVBeUxQRS1QemM"));
                    startActivity(i);
                }

                if(coursectr==324){
                    Intent i=new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://drive.google.com/open?id=0B-Pt0O3_8qTDSWY5Mi0tek91bkk"));
                    startActivity(i);
                }

                if(coursectr==414){
                    Toast.makeText(Course.this,"NO BOOKS HAVE BEEN UPLOADED YET!!",Toast.LENGTH_SHORT).show();

                }

                if(coursectr==424){
                    Toast.makeText(Course.this,"NO BOOKS HAVE BEEN UPLOADED YET!!",Toast.LENGTH_SHORT).show();

                }
            }
        });


        civilc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cctr=5;
                coursectr=Integer.valueOf(String.valueOf(ctr)+String.valueOf(cctr));
                Toast.makeText(Course.this,String.valueOf(coursectr),Toast.LENGTH_SHORT).show();


                if(coursectr==115){
                    Toast.makeText(Course.this,"NO BOOKS HAVE BEEN UPLOADED YET!!",Toast.LENGTH_SHORT).show();
                }

                if(coursectr==125){
                    Toast.makeText(Course.this,"NO BOOKS HAVE BEEN UPLOADED YET!!",Toast.LENGTH_SHORT).show();
                }

                if(coursectr==215){
                    Intent i=new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://drive.google.com/open?id=0B-Pt0O3_8qTDVFdZVHFsd0J3cXc"));
                    startActivity(i);
                }

                if(coursectr==225){
                    Intent i=new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://drive.google.com/open?id=0B-Pt0O3_8qTDWUJJN09tNnhPSVE"));
                    startActivity(i);
                }

                if(coursectr==315){
                    Intent i=new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://drive.google.com/open?id=0B-Pt0O3_8qTDT05JSDZwaGl1ZHc"));
                    startActivity(i);
                }

                if(coursectr==325){
                    Intent i=new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://drive.google.com/open?id=0B-Pt0O3_8qTDSDZSb1lEY3p0a0U"));
                    startActivity(i);
                }

                if(coursectr==415){
                    Intent i=new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://drive.google.com/open?id=0B-Pt0O3_8qTDUEpVX2xNc3ZTWUk"));
                    startActivity(i);
                }

                if(coursectr==425){
                    Intent i=new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://drive.google.com/open?id=0B-Pt0O3_8qTDOHVtX1BWa3lJYms"));
                    startActivity(i);
                }
            }
        });



    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Course Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.av.mirror.amityuniversitybooks/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }


    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Course Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.av.mirror.amityuniversitybooks/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }

    @Override
    public void onBackPressed() {
    super.onBackPressed();}
}
