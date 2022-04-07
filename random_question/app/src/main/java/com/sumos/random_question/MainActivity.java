package com.sumos.random_question;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {


    RadioButton rbA , rbB, rbC ,rbD;  //radiobutonlarımı atadım.
    RadioGroup rg;
    Button cvpla,sonrakiSoru;
    TextView dogruSayi, yanlısSayi;
    Sorular_Cevaplar Sorular_Cevaplar= new Sorular_Cevaplar();
    ArrayList<Integer>soruSira = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5));
    EditText Soru;
    int skor = 0;
    int dogru,yanlis;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbA = (RadioButton) findViewById(R.id.A);
        rbB = (RadioButton) findViewById(R.id.B);
        rbC = (RadioButton) findViewById(R.id.C);
        rbD = (RadioButton) findViewById(R.id.D);  //butonların iid isimlerinii kendi vermiş olduğum isimlerle eşleştirdim

        rg = (RadioGroup) findViewById(R.id.rGroup);

        cvpla = (Button) findViewById(R.id.cevapla);
        sonrakiSoru= (Button) findViewById(R.id.digerSoru);

        dogruSayi= (TextView) findViewById(R.id.dogruSayisi);
        yanlısSayi= (TextView) findViewById(R.id.yanlisSayi);

        Soru = (EditText) findViewById(R.id.soruMetni);


        Collections.shuffle(soruSira);
            yukle(); //soruları karıştırdım

        sonrakiSoru.setEnabled(false);
        dogru=yanlis=0;

        sonrakiSoru.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                skor++;
                if (skor<6) yukle();
                cvpla.setEnabled(true);

    }

});
        cvpla.setOnClickListener(new View.OnClickListener() {


    @Override
    public void onClick(View view) {   //her radio button işaretlendiiği zaman doğru yanlışı kontrol etmesi için if koşulu oluşturdum eğer işaretlene buton doğru ise dogru textviewi bir arttır ve doğru yaz
        if (rbA.isChecked()){
            if (rbA.getText().equals(Sorular_Cevaplar.cevaplar.get(soruSira.get(skor)))){
            dogru ++;
            dogruSayi.setText(dogru+"DOĞRU");
            }else {

                yanlis++;  //eğer yanlış ise yanlış textviewi  bir arttır ve yanlış yaz
                yanlısSayi.setText(yanlis+"YANLIŞ");
            }

        }

        if (rbB.isChecked()){
            if (rbB.getText().equals(Sorular_Cevaplar.cevaplar.get(soruSira.get(skor)))){
                dogru++;
                dogruSayi.setText(yanlis+"DOĞRU");
            }else {

                yanlis++;
                yanlısSayi.setText(yanlis+"YANLIŞ");
            }


        }
        if (rbC.isChecked()){
            if (rbC.getText().equals(Sorular_Cevaplar.cevaplar.get(soruSira.get(skor)))){
                dogru++;
                dogruSayi.setText(dogru+"DOĞRU");
            }else {

                yanlis++;
                yanlısSayi.setText(yanlis+"YANLIŞ");
            }

        }
        if (rbD.isChecked()){
            if (rbD.getText().equals(Sorular_Cevaplar.cevaplar.get(soruSira.get(skor)))){
                dogru++;
                dogruSayi.setText(dogru+"DOĞRU");
            }else {

                yanlis++;
                yanlısSayi.setText(yanlis+"YANLIŞ");
            }


        }

        cvpla.setEnabled(false); //cevapla butanuna basılduktan sonra sonraki butonuna geçilmesini sağladım
        sonrakiSoru.setEnabled(true);

    }
});


        }

    public void yukle() {  //yukarıda shuffle kullandık şıkların karışık bir şekilde gelmesini sağladık
        Soru.setText(Sorular_Cevaplar.Soru.get(soruSira.get(skor)));
        Collections.shuffle(Sorular_Cevaplar.secenek[soruSira.get(skor)]);   //diğer java dosyamızda buluna şıkları buraya get metoduyla çağırdık.
        rbA.setText(Sorular_Cevaplar.secenek[soruSira.get(skor)].get(0));
        rbB.setText(Sorular_Cevaplar.secenek[soruSira.get(skor)].get(1));
        rbC.setText(Sorular_Cevaplar.secenek[soruSira.get(skor)].get(2));
        rbD.setText(Sorular_Cevaplar.secenek[soruSira.get(skor)].get(3));


        sonrakiSoru.setEnabled(false);
    }


}