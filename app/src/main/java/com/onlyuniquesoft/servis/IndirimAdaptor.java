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
public class IndirimAdaptor extends BaseAdapter {

    LayoutInflater layoutInflater;
    List<Indirim> Indirimlist;
    Activity activity; //Bunu kullanmamızdaki amac toas mesajı verirken this.activity yi belirtiriz.

    public IndirimAdaptor(Activity activity, List<Indirim> ilist) {
        layoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE); //Satırımızı kullanmak için gerekli
        Indirimlist = ilist;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return Indirimlist.size();
    }

    @Override
    public Object getItem(int position) {
        return Indirimlist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View satirView;

        satirView = layoutInflater.inflate(R.layout.urun_satir_layout, null);

        ImageView iv = (ImageView) satirView.findViewById(R.id.imageView);
        TextView tvFiyat = (TextView) satirView.findViewById(R.id.textViewFiyat);
        TextView tvIsim = (TextView) satirView.findViewById(R.id.textViewIsım);
        Button btn = (Button) satirView.findViewById(R.id.button);


        final Indirim indirim = Indirimlist.get(position); //urun classımızdan bir nesne olusturduk.

        // NumberFormat.getCurrencyInstance().format(0.5); //0.5 degeri döndürür bu işlemi fiyatta kullanacagız.
        tvFiyat.setText(NumberFormat.getCurrencyInstance().format(indirim.getFiyat())); //Bizim olusturdugumuzu layouttaki degerleri dolduruyoruz.
        tvIsim.setText(indirim.getIsim()); //Urunun fiyatı için doldurduk.

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity, indirim.getIsim().toString() + "Aldınız ", Toast.LENGTH_SHORT).show();

            }
        });


        String IndUrunIsmi = indirim.getIsim().toString();


        if (IndUrunIsmi.equals("Bebe Bisküvi"))
            iv.setImageResource(R.drawable.bebebuskivi);
        if (IndUrunIsmi.equals("Biskrem"))
            iv.setImageResource(R.drawable.biskrem);
        if (IndUrunIsmi.equals("Bisküvi"))
            iv.setImageResource(R.drawable.buskivi);
        if (IndUrunIsmi.equals("Kakolu Bisküvi"))
            iv.setImageResource(R.drawable.kakolu);
        if (IndUrunIsmi.equals("Susamlı Bisküvi"))
            iv.setImageResource(R.drawable.susamli);
        if (IndUrunIsmi.equals("Yulaflı Bisküvi"))
            iv.setImageResource(R.drawable.yulafli);
        //---------------------------------------
        if (IndUrunIsmi.equals("Albeni"))
            iv.setImageResource(R.drawable.albeni);
        if (IndUrunIsmi.equals("Alpella"))
            iv.setImageResource(R.drawable.alpella);
        if (IndUrunIsmi.equals("Altili Dido"))
            iv.setImageResource(R.drawable.altilidido);
        if (IndUrunIsmi.equals("Cokakrem"))
            iv.setImageResource(R.drawable.cokakrem);
        if (IndUrunIsmi.equals("Dankek"))
            iv.setImageResource(R.drawable.dankek);
        if (IndUrunIsmi.equals("Dido"))
            iv.setImageResource(R.drawable.dido);
        if (IndUrunIsmi.equals("Fıstıklı Çikolata Dido"))
            iv.setImageResource(R.drawable.fistikli);
        if (IndUrunIsmi.equals("Goffret"))
            iv.setImageResource(R.drawable.gofret);
        if (IndUrunIsmi.equals("Hobi Sürme Çikolata"))
            iv.setImageResource(R.drawable.hobi_surmejpg);
        if (IndUrunIsmi.equals("Hobi"))
            iv.setImageResource(R.drawable.hobi);
        if (IndUrunIsmi.equals("Onlu Cikolata"))
            iv.setImageResource(R.drawable.onlugofret);
        if (IndUrunIsmi.equals("Sütlü Çikolata"))
            iv.setImageResource(R.drawable.sutlu);
        //---------------------------------------


        if (IndUrunIsmi.equals("kivi"))
            iv.setImageResource(R.drawable.kivi);
        if (IndUrunIsmi.equals("muz"))
            iv.setImageResource(R.drawable.muz);
        if (IndUrunIsmi.equals("elma"))
            iv.setImageResource(R.drawable.elma);
        if (IndUrunIsmi.equals("cilek"))
            iv.setImageResource(R.drawable.cilek);
        //---------------------------------------
        if (IndUrunIsmi.equals("biber"))
            iv.setImageResource(R.drawable.biber);
        if (IndUrunIsmi.equals("domates"))
            iv.setImageResource(R.drawable.domates);
        if (IndUrunIsmi.equals("fasulye"))
            iv.setImageResource(R.drawable.fasulye);
        if (IndUrunIsmi.equals("patlica"))
            iv.setImageResource(R.drawable.patlica);


        return satirView;
    }
}
