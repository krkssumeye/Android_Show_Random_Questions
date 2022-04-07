package com.sumos.random_question;

import java.util.ArrayList;
import java.util.Arrays;

public class Sorular_Cevaplar {
    ArrayList<String> Soru = new ArrayList<String>(Arrays.asList(    //array list oluşturarak soruları atadım.
            "Hangisinden ornek nesnesi Ornek sınıfından türetilmiştir?",
            "Hangi operatör çarpma için kullanılır?",
            "Javada if ifadesi nasıl başlar?",
            "Java koduna YORUMLARI nasıl eklersiniz?",
            "Bir java sınıfının main metodu için doğru sözdizimi nedir?",
            "Hangi metod string uzunluğunu getirir?",
            ""

    ));

   ArrayList<String>[] secenek = new ArrayList[6];

   ArrayList<String> cevaplar = new ArrayList<>(Arrays.asList(    //bir diğer arrayliste soruların cevaplarını sırasına gööre yazdım.
                " Ornek ornek = new Ornek();",
                "*",
                " if(a>b)",
                "// Bu bir yorum",
                "public static void main(String[] args)",
                "length();"


   ));
    Sorular_Cevaplar(){
        for (int i = 0; i<6; i++){
            secenek[i]= new ArrayList<String>();   //burada ise soruların şıklarını sırasına göre yazdım .
        }
        secenek[0].add("new ornek = Ornek();");
        secenek[0].add("class ornek = Ornek();");
        secenek[0].add("Ornek ornek = new Ornek();");
        secenek[0].add("class ornek = new Ornek();");


        secenek[1].add ("*");
        secenek[1].add ("x");
        secenek[1].add ("#");
        secenek[1].add ("%") ;


        secenek[2].add ("if{a>b}");
        secenek[2].add ("if(a>b)");
        secenek[2].add ("if a>b");
        secenek[2].add("if a>b:");


        secenek[3].add("#Bu bir yorum");
        secenek[3].add("<!– Bu bir yorum –>");
        secenek[3].add("/* Bu bir yorum")  ;
        secenek[3].add  ("// Bu bir yorum");


        secenek[4].add("public static int main(String[] args)");
        secenek[4].add("public int main(String[] args)");
        secenek[4].add("public static void main(String[] args)");
        secenek[4].add("None of the above.");


        secenek[5].add("getSize();");
        secenek[5].add("getLen();");
        secenek[5].add("length();");
        secenek[5].add("len();");
    }


    }

