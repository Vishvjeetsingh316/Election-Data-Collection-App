package com.applettechnologies.wardno51;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.text.TextUtils;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        spinner1 = (Spinner)findViewById(R.id.spinner1);
        list = new ArrayList<>();

        list.add("Ward No 1");
        list.add("Ward No 2");
        list.add("Ward No 3");
        list.add("Ward No 4");
        list.add("Ward No 5");
        list.add("Ward No 6");
        list.add("Ward No 7");
        list.add("Ward No 8");
        list.add("Ward No 9");
        list.add("Ward No 10");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,list);

        spinner1.setAdapter(adapter);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,list.get(position),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        district_name = (EditText) findViewById(R.id.district_name);
        ward_no = (EditText) findViewById(R.id.ward_no);
        booth_no = (EditText) findViewById(R.id.booth_no);
        person_name = (EditText) findViewById(R.id.person_name);
        mobile_no_1 = (EditText) findViewById(R.id.mobile_no_1);
        mobile_no_2 = (EditText) findViewById(R.id.mobile_no_2);
        karykrta = (EditText) findViewById(R.id.karykrta);
        remark = (EditText) findViewById(R.id.remark);

        send = (Button) findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addData();
            }
        });

    }

    public void addData(){

        String dataDistrictName = district_name.getText().toString();
        String dataWard = ward_no.getText().toString();
        String dataBooth = booth_no.getText().toString();
        String dataPersonName = person_name.getText().toString();
        String dataMob1 = mobile_no_1.getText().toString();
        String dataMob2 = mobile_no_2.getText().toString();
        String dataKarykrta = karykrta.getText().toString();
        String dataRemark = remark.getText().toString();


        if(!TextUtils.isEmpty(dataDistrictName) && !TextUtils.isEmpty(dataWard) && !TextUtils.isEmpty(dataBooth) && !TextUtils.isEmpty(dataPersonName) &&
                !TextUtils.isEmpty(dataMob1) && !TextUtils.isEmpty(dataMob2) && !TextUtils.isEmpty(dataKarykrta) && !TextUtils.isEmpty(dataRemark)){



            Data data = new Data(id,dataDistrictName,dataWard,dataBooth,dataPersonName,dataMob1,dataMob2,dataKarykrta,dataRemark);


            district_name.setText("");
            ward_no.setText("");
            booth_no.setText("");
            person_name.setText("");
            mobile_no_1.setText("");
            mobile_no_2.setText("");
            karykrta.setText("");
            remark.setText("");

        }
        else {
            Toast.makeText(MainActivity.this, "Please Input all the required fields!", Toast.LENGTH_SHORT).show();
        }

    }
}


    DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_tools) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
