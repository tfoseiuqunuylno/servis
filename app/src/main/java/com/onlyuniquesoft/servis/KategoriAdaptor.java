package com.onlyuniquesoft.servis;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mustafa on 12.1.2016.
 */
public class KategoriAdaptor extends BaseAdapter  {
    LayoutInflater layoutInflater;
    List<Kategori> kategoriList;
    Activity activity; //Bunu kullanmamızdaki amac toas mesajı verirken this.activity yi belirtiriz.

    public  KategoriAdaptor(Activity activity,List<Kategori> klist){
        layoutInflater=(LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);//Satırımızı kullanmak için gerekli

        kategoriList=klist;
        this.activity=activity;

    }


    @Override
    public int getCount() {
        return kategoriList.size();
    }

    @Override
    public Object getItem(int position) {
        return kategoriList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View satirView;

        satirView=layoutInflater.inflate(R.layout.kategoriler_satir_layout,null);

        TextView isimV=(TextView)satirView.findViewById(R.id.textViewKategoriIsim);

        final Kategori kategori=kategoriList.get(position);

        isimV.setText(kategori.getIsim());
        isimV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String gonderilenKategoriIsmi=kategori.getIsim().toString();
                Intent intent = new Intent(activity, UrunlerActivity.class);
                intent.putExtra("kategoriIsmi",gonderilenKategoriIsmi); //MainActivity içerisinde  girilen text deki degeri gönderiyor.
                activity.startActivity(intent);



            }
        });

        return satirView;
    }


}
