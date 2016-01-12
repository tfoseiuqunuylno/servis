package com.onlyuniquesoft.servis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class IndirimActivity extends AppCompatActivity {
    ListView listView;
    List<Indirim> Indirimliurunler = new ArrayList<Indirim>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indirim);


    /*    android.support.v7.app.ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        */

        listView = (ListView) findViewById(R.id.listViewIndirimler);

        Indirimliurunler.add(new Indirim("kivi", 3.0));
        Indirimliurunler.add(new Indirim("muz", 0.5));
        Indirimliurunler.add(new Indirim("elma", 1.0));
        Indirimliurunler.add(new Indirim("cilek", 1.0));
        Indirimliurunler.add(new Indirim("biber", 3.0));
        Indirimliurunler.add(new Indirim("domates", 0.5));
        Indirimliurunler.add(new Indirim("fasulye", 1.0));
        Indirimliurunler.add(new Indirim("patlica", 1.0));
        Indirimliurunler.add(new Indirim("biber", 3.0));
        Indirimliurunler.add(new Indirim("domates", 0.5));
        Indirimliurunler.add(new Indirim("fasulye", 1.0));
        Indirimliurunler.add(new Indirim("patlica", 1.0));
        Indirimliurunler.add(new Indirim("Albeni", 1.0));
        Indirimliurunler.add(new Indirim("Alpella", 0.5));
        Indirimliurunler.add(new Indirim("Altili Dido", 1.0));
        Indirimliurunler.add(new Indirim("Cokakrem", 1.0));
        Indirimliurunler.add(new Indirim("Dankek", 1.0));
        Indirimliurunler.add(new Indirim("Dido", 0.5));
        Indirimliurunler.add(new Indirim("Fıstıklı Çikolata Dido", 1.0));
        Indirimliurunler.add(new Indirim("Goffret", 1.0));
        Indirimliurunler.add(new Indirim("Hobi Sürme Çikolata", 1.0));
        Indirimliurunler.add(new Indirim("Hobi", 1.0));
        Indirimliurunler.add(new Indirim("Onlu Cikolata", 1.0));
        Indirimliurunler.add(new Indirim("Sütlü Çikolata", 1.0));
        Indirimliurunler.add(new Indirim("Bebe Bisküvi", 3.0));
        Indirimliurunler.add(new Indirim("Biskrem", 0.5));
        Indirimliurunler.add(new Indirim("Bisküvi", 1.0));
        Indirimliurunler.add(new Indirim("Kakolu Bisküvi", 1.0));
        Indirimliurunler.add(new Indirim("Susamlı Bisküvi", 1.0));
        Indirimliurunler.add(new Indirim("Yulaflı Bisküvi", 1.0));

        Indirimliurunler.add(new Indirim("kivi", 3.0));
        Indirimliurunler.add(new Indirim("muz", 0.5));
        Indirimliurunler.add(new Indirim("elma", 1.0));
        Indirimliurunler.add(new Indirim("cilek", 1.0));
        Indirimliurunler.add(new Indirim("biber", 3.0));
        Indirimliurunler.add(new Indirim("domates", 0.5));
        Indirimliurunler.add(new Indirim("fasulye", 1.0));
        Indirimliurunler.add(new Indirim("patlica", 1.0));
        Indirimliurunler.add(new Indirim("biber", 3.0));
        Indirimliurunler.add(new Indirim("domates", 0.5));
        Indirimliurunler.add(new Indirim("fasulye", 1.0));
        Indirimliurunler.add(new Indirim("patlica", 1.0));
        Indirimliurunler.add(new Indirim("Albeni", 1.0));
        Indirimliurunler.add(new Indirim("Alpella", 0.5));
        Indirimliurunler.add(new Indirim("Altili Dido", 1.0));
        Indirimliurunler.add(new Indirim("Cokakrem", 1.0));
        Indirimliurunler.add(new Indirim("Dankek", 1.0));
        Indirimliurunler.add(new Indirim("Dido", 0.5));
        Indirimliurunler.add(new Indirim("Fıstıklı Çikolata Dido", 1.0));
        Indirimliurunler.add(new Indirim("Goffret", 1.0));
        Indirimliurunler.add(new Indirim("Hobi Sürme Çikolata", 1.0));
        Indirimliurunler.add(new Indirim("Hobi", 1.0));
        Indirimliurunler.add(new Indirim("Onlu Cikolata", 1.0));
        Indirimliurunler.add(new Indirim("Sütlü Çikolata", 1.0));
        Indirimliurunler.add(new Indirim("Bebe Bisküvi", 3.0));
        Indirimliurunler.add(new Indirim("Biskrem", 0.5));
        Indirimliurunler.add(new Indirim("Bisküvi", 1.0));
        Indirimliurunler.add(new Indirim("Kakolu Bisküvi", 1.0));
        Indirimliurunler.add(new Indirim("Susamlı Bisküvi", 1.0));
        Indirimliurunler.add(new Indirim("Yulaflı Bisküvi", 1.0));
        Indirimliurunler.add(new Indirim("kivi", 3.0));
        Indirimliurunler.add(new Indirim("muz", 0.5));
        Indirimliurunler.add(new Indirim("elma", 1.0));
        Indirimliurunler.add(new Indirim("cilek", 1.0));
        Indirimliurunler.add(new Indirim("biber", 3.0));
        Indirimliurunler.add(new Indirim("domates", 0.5));
        Indirimliurunler.add(new Indirim("fasulye", 1.0));
        Indirimliurunler.add(new Indirim("patlica", 1.0));
        Indirimliurunler.add(new Indirim("biber", 3.0));
        Indirimliurunler.add(new Indirim("domates", 0.5));
        Indirimliurunler.add(new Indirim("fasulye", 1.0));
        Indirimliurunler.add(new Indirim("patlica", 1.0));
        Indirimliurunler.add(new Indirim("Albeni", 1.0));
        Indirimliurunler.add(new Indirim("Alpella", 0.5));
        Indirimliurunler.add(new Indirim("Altili Dido", 1.0));
        Indirimliurunler.add(new Indirim("Cokakrem", 1.0));
        Indirimliurunler.add(new Indirim("Dankek", 1.0));
        Indirimliurunler.add(new Indirim("Dido", 0.5));
        Indirimliurunler.add(new Indirim("Fıstıklı Çikolata Dido", 1.0));
        Indirimliurunler.add(new Indirim("Goffret", 1.0));
        Indirimliurunler.add(new Indirim("Hobi Sürme Çikolata", 1.0));
        Indirimliurunler.add(new Indirim("Hobi", 1.0));
        Indirimliurunler.add(new Indirim("Onlu Cikolata", 1.0));
        Indirimliurunler.add(new Indirim("Sütlü Çikolata", 1.0));
        Indirimliurunler.add(new Indirim("Bebe Bisküvi", 3.0));
        Indirimliurunler.add(new Indirim("Biskrem", 0.5));
        Indirimliurunler.add(new Indirim("Bisküvi", 1.0));
        Indirimliurunler.add(new Indirim("Kakolu Bisküvi", 1.0));
        Indirimliurunler.add(new Indirim("Susamlı Bisküvi", 1.0));
        Indirimliurunler.add(new Indirim("Yulaflı Bisküvi", 1.0));
        Indirimliurunler.add(new Indirim("kivi", 3.0));
        Indirimliurunler.add(new Indirim("muz", 0.5));
        Indirimliurunler.add(new Indirim("elma", 1.0));
        Indirimliurunler.add(new Indirim("cilek", 1.0));
        Indirimliurunler.add(new Indirim("biber", 3.0));
        Indirimliurunler.add(new Indirim("domates", 0.5));
        Indirimliurunler.add(new Indirim("fasulye", 1.0));
        Indirimliurunler.add(new Indirim("patlica", 1.0));
        Indirimliurunler.add(new Indirim("biber", 3.0));
        Indirimliurunler.add(new Indirim("domates", 0.5));
        Indirimliurunler.add(new Indirim("fasulye", 1.0));
        Indirimliurunler.add(new Indirim("patlica", 1.0));
        Indirimliurunler.add(new Indirim("Albeni", 1.0));
        Indirimliurunler.add(new Indirim("Alpella", 0.5));
        Indirimliurunler.add(new Indirim("Altili Dido", 1.0));
        Indirimliurunler.add(new Indirim("Cokakrem", 1.0));
        Indirimliurunler.add(new Indirim("Dankek", 1.0));
        Indirimliurunler.add(new Indirim("Dido", 0.5));
        Indirimliurunler.add(new Indirim("Fıstıklı Çikolata Dido", 1.0));
        Indirimliurunler.add(new Indirim("Goffret", 1.0));
        Indirimliurunler.add(new Indirim("Hobi Sürme Çikolata", 1.0));
        Indirimliurunler.add(new Indirim("Hobi", 1.0));
        Indirimliurunler.add(new Indirim("Onlu Cikolata", 1.0));
        Indirimliurunler.add(new Indirim("Sütlü Çikolata", 1.0));
        Indirimliurunler.add(new Indirim("Bebe Bisküvi", 3.0));
        Indirimliurunler.add(new Indirim("Biskrem", 0.5));
        Indirimliurunler.add(new Indirim("Bisküvi", 1.0));
        Indirimliurunler.add(new Indirim("Kakolu Bisküvi", 1.0));
        Indirimliurunler.add(new Indirim("Susamlı Bisküvi", 1.0));
        Indirimliurunler.add(new Indirim("Yulaflı Bisküvi", 1.0));
        Indirimliurunler.add(new Indirim("kivi", 3.0));
        Indirimliurunler.add(new Indirim("muz", 0.5));
        Indirimliurunler.add(new Indirim("elma", 1.0));
        Indirimliurunler.add(new Indirim("cilek", 1.0));
        Indirimliurunler.add(new Indirim("biber", 3.0));
        Indirimliurunler.add(new Indirim("domates", 0.5));
        Indirimliurunler.add(new Indirim("fasulye", 1.0));
        Indirimliurunler.add(new Indirim("patlica", 1.0));
        Indirimliurunler.add(new Indirim("biber", 3.0));
        Indirimliurunler.add(new Indirim("domates", 0.5));
        Indirimliurunler.add(new Indirim("fasulye", 1.0));
        Indirimliurunler.add(new Indirim("patlica", 1.0));
        Indirimliurunler.add(new Indirim("Albeni", 1.0));
        Indirimliurunler.add(new Indirim("Alpella", 0.5));
        Indirimliurunler.add(new Indirim("Altili Dido", 1.0));
        Indirimliurunler.add(new Indirim("Cokakrem", 1.0));
        Indirimliurunler.add(new Indirim("Dankek", 1.0));
        Indirimliurunler.add(new Indirim("Dido", 0.5));
        Indirimliurunler.add(new Indirim("Fıstıklı Çikolata Dido", 1.0));
        Indirimliurunler.add(new Indirim("Goffret", 1.0));
        Indirimliurunler.add(new Indirim("Hobi Sürme Çikolata", 1.0));
        Indirimliurunler.add(new Indirim("Hobi", 1.0));
        Indirimliurunler.add(new Indirim("Onlu Cikolata", 1.0));
        Indirimliurunler.add(new Indirim("Sütlü Çikolata", 1.0));
        Indirimliurunler.add(new Indirim("Bebe Bisküvi", 3.0));
        Indirimliurunler.add(new Indirim("Biskrem", 0.5));
        Indirimliurunler.add(new Indirim("Bisküvi", 1.0));
        Indirimliurunler.add(new Indirim("Kakolu Bisküvi", 1.0));
        Indirimliurunler.add(new Indirim("Susamlı Bisküvi", 1.0));
        Indirimliurunler.add(new Indirim("Yulaflı Bisküvi", 1.0));


        IndirimAdaptor adaptor=new IndirimAdaptor(this,Indirimliurunler);
        listView.setAdapter(adaptor);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_indirim, menu);
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
