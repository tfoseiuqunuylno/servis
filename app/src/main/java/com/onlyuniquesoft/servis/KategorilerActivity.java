package com.onlyuniquesoft.servis;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class KategorilerActivity extends AppCompatActivity {

    ListView listViewKategori;
    List<Kategori> kategoriler = new ArrayList<Kategori>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategoriler);





        listViewKategori = (ListView) findViewById(R.id.listViewKategoriler);

        Intent intent=getIntent(); //Gelen intetnti çekiyoruz.
        String gelenReyonIsmi=intent.getStringExtra("reyonIsmi"); //Veri türündeki verimizi çekiyoruz

        android.support.v7.app.ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.show();
        if(gelenReyonIsmi.equals("Meyve Sebze")) {
            kategoriler.add(new Kategori("Meyve"));
            kategoriler.add(new Kategori("Sebze"));
        }
        if(gelenReyonIsmi.equals("Gıda,Şekerleme")) {
            kategoriler.add(new Kategori("Çikolata"));
            kategoriler.add(new Kategori("Büskivi"));
        }
        if(gelenReyonIsmi.equals("Et")) {
            kategoriler.add(new Kategori("Tavuk Eti"));
            kategoriler.add(new Kategori("Dana Eti"));
            kategoriler.add(new Kategori("Kuzu Eti"));
            kategoriler.add(new Kategori("Dana Kıyma"));

        }



        KategoriAdaptor adaptor=new KategoriAdaptor(this,kategoriler);
        listViewKategori.setAdapter(adaptor);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_kategoriler, menu);
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
