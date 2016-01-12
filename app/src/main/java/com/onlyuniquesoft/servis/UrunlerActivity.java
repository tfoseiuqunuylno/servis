package com.onlyuniquesoft.servis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class UrunlerActivity extends AppCompatActivity {
    ListView listView;
    List<Urun> urunler = new ArrayList<Urun>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urunler);

        android.support.v7.app.ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        listView = (ListView) findViewById(R.id.listViewUrunler);

        Intent intent=getIntent(); //Gelen intetnti çekiyoruz.
        String gelenKategoriIsmi=intent.getStringExtra("kategoriIsmi"); //Veri türündeki verimizi çekiyoruz

        if(gelenKategoriIsmi.equals("Meyve"))
        {
            urunler.add(new Urun("kivi", 3.0));
            urunler.add(new Urun("muz", 0.5));
            urunler.add(new Urun("elma", 1.0));
            urunler.add(new Urun("cilek", 1.0));
        }
        if(gelenKategoriIsmi.equals("Sebze"))
        {
            urunler.add(new Urun("biber", 3.0));
            urunler.add(new Urun("domates", 0.5));
            urunler.add(new Urun("fasulye", 1.0));
            urunler.add(new Urun("patlica", 1.0));
        }



        UrunAdaptor adaptor=new UrunAdaptor(this,urunler);
        listView.setAdapter(adaptor);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_urunler, menu);
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
