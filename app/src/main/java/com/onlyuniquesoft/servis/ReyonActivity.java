package com.onlyuniquesoft.servis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ReyonActivity extends AppCompatActivity {
    ListView listViewReyon;
    List<Reyon> reyonlar = new ArrayList<Reyon>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reyon);

        android.support.v7.app.ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        listViewReyon = (ListView) findViewById(R.id.listViewReyonlar);

        reyonlar.add(new Reyon("Meyve Sebze"));
        reyonlar.add(new Reyon("Gıda,Şekerleme"));
        reyonlar.add(new Reyon("Et"));
        reyonlar.add(new Reyon("İçecekler"));
        reyonlar.add(new Reyon("Süt,Kahvaltılık"));
        reyonlar.add(new Reyon("Ev,Pet"));
        reyonlar.add(new Reyon("Deterjan,Temizlik"));
        reyonlar.add(new Reyon("Bebek,Çoçuk"));
        reyonlar.add(new Reyon("Kozmaetik"));
        reyonlar.add(new Reyon("Kırtasıye"));
        reyonlar.add(new Reyon("Hırdavat"));



        ReyonAdaptor adaptor=new ReyonAdaptor(this,reyonlar);
        listViewReyon.setAdapter(adaptor);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_reyon, menu);
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
