package com.cem.Soru4;

import com.cem.Soru5.Soru5;

public class Test {

	public static void main(String[] args) {
		Kiralama kiralama = new Kiralama();
		Kitap kitap = new Kitap("5", "Kitap Ad�", "Yazar Ad�", 333, false);
//		kiralama.kitapListesi.add(kitap);
		Musteri musteri = new Musteri("ahmet veli", "11");
//		kitap.getKiralayanlar().add(musteri);
//		System.out.println(musteri.toString());
		kiralama.musteriListesi.add(musteri);
		kiralama.kitapListesi.add(kitap);
		kiralama.kiralamaYap(musteri, kitap);

		Soru5 soru5 = new Soru5();
		soru5.kimKiraladi("5"); // soru 5 - 1. k�s�m

		soru5.oncekiSahipler("5"); // soru 5 - 2.k�s�m

		soru5.ahmet(); // soru 5 - 3.k�s�m
		soru5.hangiKitabiKiraladi("11"); // soru 5 - 4.k�s�m
	}

}
