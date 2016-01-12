package com.onlyuniquesoft.servis;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mustafa on 12.1.2016.
 */
public class ReyonAdaptor extends BaseAdapter {
   LayoutInflater layoutInflater;
    List<Reyon> reyonList;
    Activity activity; //Bunu kullanmamızdaki amac toas mesajı verirken this.activity yi belirtiriz.

    public  ReyonAdaptor(Activity activity,List<Reyon> rlist){
        layoutInflater=(LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);//Satırımızı kullanmak için gerekli

              reyonList=rlist;
            this.activity=activity;

    }
    @Override
    public int getCount() {
        return reyonList.size();
    }

    @Override
    public Object getItem(int position) {
        return reyonList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {//EN ÖNEMLİ KISIM Bizim ListVievimiz burada olusturuluyor.
        View satirView;

        satirView=layoutInflater.inflate(R.layout.reyon_satir_layout,null);

        ImageView iv=(ImageView)satirView.findViewById(R.id.imageViewReyon);
        TextView isimV=(TextView)satirView.findViewById(R.id.textViewReyonIsım);

        final Reyon reyon=reyonList.get(position);

        isimV.setText(reyon.getIsim());

        String reyonIsim=reyon.getIsim().toString();
        isimV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String gonderilenReyonIsmi=reyon.getIsim().toString();
                Intent intent = new Intent(activity, KategorilerActivity.class);
                intent.putExtra("reyonIsmi",gonderilenReyonIsmi); //MainActivity içerisinde  girilen text deki degeri gönderiyor.
                activity.startActivity(intent);

            }
        });


        if (reyonIsim.equals("Gıda,Şekerleme"))
            iv.setImageResource(R.drawable.gida);
        if (reyonIsim.equals("Et"))
            iv.setImageResource(R.drawable.et);
        if (reyonIsim.equals("Meyve Sebze"))
            iv.setImageResource(R.drawable.meyve);
        if (reyonIsim.equals("İçecekler"))
            iv.setImageResource(R.drawable.icecekler);
        if (reyonIsim.equals("Süt,Kahvaltılık"))
            iv.setImageResource(R.drawable.kahvalti);
        if (reyonIsim.equals("Ev,Pet"))
            iv.setImageResource(R.drawable.ev);
        if (reyonIsim.equals("Deterjan,Temizlik"))
            iv.setImageResource(R.drawable.deterjan);
        if (reyonIsim.equals("Bebek,Çoçuk"))
            iv.setImageResource(R.drawable.bebek);
        if (reyonIsim.equals("Kozmaetik"))
            iv.setImageResource(R.drawable.kozmetikjpg);
        if (reyonIsim.equals("Kırtasıye"))
            iv.setImageResource(R.drawable.kahvalti);
        if (reyonIsim.equals("Hırdavat"))
            iv.setImageResource(R.drawable.hirdavat);

        return satirView;

    }
}
