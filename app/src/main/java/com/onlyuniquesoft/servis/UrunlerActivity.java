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


        listView = (ListView) findViewById(R.id.listViewUrunler);

        Intent intent = getIntent(); //Gelen intetnti çekiyoruz.
        String gelenKategoriIsmi = intent.getStringExtra("kategoriIsmi"); //Veri türündeki verimizi çekiyoruz

        if (gelenKategoriIsmi.equals("Meyve")) {
            urunler.add(new Urun("Kivi", 3.0));
            urunler.add(new Urun("Muz", 0.5));
            urunler.add(new Urun("Elma", 1.0));
            urunler.add(new Urun("Cilek", 1.0));
        }
        if (gelenKategoriIsmi.equals("Sebze")) {
            urunler.add(new Urun("Biber", 3.0));
            urunler.add(new Urun("Domates", 0.5));
            urunler.add(new Urun("Fasulye", 1.0));
            urunler.add(new Urun("PatlicaN", 1.0));
        }

        if(gelenKategoriIsmi.equals("Çikolata"))
        {
            urunler.add(new Urun("Albeni", 1.0));
            urunler.add(new Urun("Alpella", 0.5));
            urunler.add(new Urun("Altili Dido", 1.0));
            urunler.add(new Urun("Cokakrem", 1.0));
            urunler.add(new Urun("Dankek", 1.0));
            urunler.add(new Urun("Dido", 0.5));
            urunler.add(new Urun("Fıstıklı Çikolata Dido", 1.0));
            urunler.add(new Urun("Goffret", 1.0));
            urunler.add(new Urun("Hobi Sürme Çikolata", 1.0));
            urunler.add(new Urun("Hobi", 1.0));
            urunler.add(new Urun("Onlu Cikolata", 1.0));
            urunler.add(new Urun("Sütlü Çikolata", 1.0));
        }
        if(gelenKategoriIsmi.equals("Büskivi"))
        {
            urunler.add(new Urun("Bebe Bisküvi", 3.0));
            urunler.add(new Urun("Biskrem", 0.5));
            urunler.add(new Urun("Bisküvi", 1.0));
            urunler.add(new Urun("Kakolu Bisküvi", 1.0));
            urunler.add(new Urun("Susamlı Bisküvi", 1.0));
            urunler.add(new Urun("Yulaflı Bisküvi", 1.0));
        }



        UrunAdaptor adaptor = new UrunAdaptor(this, urunler);
        listView.setAdapter(adaptor);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

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
