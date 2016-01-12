package com.onlyuniquesoft.servis;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.List;

/**
 * Created by Mustafa on 12.1.2016.
 */
public class UrunAdaptor extends BaseAdapter {
    LayoutInflater layoutInflater;
    List<Urun> Urunlist;
    Activity activity; //Bunu kullanmamızdaki amac toas mesajı verirken this.activity yi belirtiriz.

    public  UrunAdaptor(Activity activity,List<Urun> ulist){
        layoutInflater =(LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE); //Satırımızı kullanmak için gerekli
        Urunlist=ulist;
        this.activity=activity;
    }
    @Override
    public int getCount() {
        return Urunlist.size();
    }

    @Override
    public Object getItem(int position) {
        return Urunlist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View satirView;

        satirView=layoutInflater.inflate(R.layout.urun_satir_layout,null);

        ImageView iv=(ImageView)satirView.findViewById(R.id.imageView);
        TextView tvFiyat=(TextView)satirView.findViewById(R.id.textViewFiyat);
        TextView tvIsim=(TextView)satirView.findViewById(R.id.textViewIsım);
        Button btn=(Button)satirView.findViewById(R.id.button);


        final Urun urun=Urunlist.get(position); //urun classımızdan bir nesne olusturduk.

        // NumberFormat.getCurrencyInstance().format(0.5); //0.5 degeri döndürür bu işlemi fiyatta kullanacagız.
        tvFiyat.setText(NumberFormat.getCurrencyInstance().format(urun.getFiyat())); //Bizim olusturdugumuzu layouttaki degerleri dolduruyoruz.
        tvIsim.setText(urun.getIsim()); //Urunun fiyatı için doldurduk.

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity, urun.getIsim().toString() + "Aldınız ", Toast.LENGTH_SHORT).show();

            }
        });


        String UrunIsmi=urun.getIsim().toString();


        if (UrunIsmi.equals("Bebe Bisküvi"))
            iv.setImageResource(R.drawable.bebebuskivi);
        if (UrunIsmi.equals("Biskrem"))
            iv.setImageResource(R.drawable.biskrem);
        if (UrunIsmi.equals("Bisküvi"))
            iv.setImageResource(R.drawable.buskivi);
        if (UrunIsmi.equals("Kakolu Bisküvi"))
            iv.setImageResource(R.drawable.kakolu);
        if (UrunIsmi.equals("Susamlı Bisküvi"))
            iv.setImageResource(R.drawable.susamli);
        if (UrunIsmi.equals("Yulaflı Bisküvi"))
            iv.setImageResource(R.drawable.yulafli);
        //---------------------------------------
        if (UrunIsmi.equals("Albeni"))
            iv.setImageResource(R.drawable.albeni);
        if (UrunIsmi.equals("Alpella"))
            iv.setImageResource(R.drawable.alpella);
        if (UrunIsmi.equals("Altili Dido"))
            iv.setImageResource(R.drawable.altilidido);
        if (UrunIsmi.equals("Cokakrem"))
            iv.setImageResource(R.drawable.cokakrem);
        if (UrunIsmi.equals("Dankek"))
            iv.setImageResource(R.drawable.dankek);
        if (UrunIsmi.equals("Dido"))
            iv.setImageResource(R.drawable.dido);
        if (UrunIsmi.equals("Fıstıklı Çikolata Dido"))
            iv.setImageResource(R.drawable.fistikli);
        if (UrunIsmi.equals("Goffret"))
            iv.setImageResource(R.drawable.gofret);
        if (UrunIsmi.equals("Hobi Sürme Çikolata"))
            iv.setImageResource(R.drawable.hobi_surmejpg);
        if (UrunIsmi.equals("Hobi"))
            iv.setImageResource(R.drawable.hobi);
        if (UrunIsmi.equals("Onlu Cikolata"))
            iv.setImageResource(R.drawable.onlugofret);
        if (UrunIsmi.equals("Sütlü Çikolata"))
            iv.setImageResource(R.drawable.sutlu);
        //---------------------------------------


        if (UrunIsmi.equals("kivi"))
            iv.setImageResource(R.drawable.kivi);
        if (UrunIsmi.equals("muz"))
            iv.setImageResource(R.drawable.muz);
        if (UrunIsmi.equals("elma"))
            iv.setImageResource(R.drawable.elma);
        if (UrunIsmi.equals("cilek"))
            iv.setImageResource(R.drawable.cilek);
       //---------------------------------------
        if (UrunIsmi.equals("biber"))
            iv.setImageResource(R.drawable.biber);
        if (UrunIsmi.equals("domates"))
            iv.setImageResource(R.drawable.domates);
        if (UrunIsmi.equals("fasulye"))
            iv.setImageResource(R.drawable.fasulye);
        if (UrunIsmi.equals("patlica"))
            iv.setImageResource(R.drawable.patlica);


        return satirView;
    }
}
