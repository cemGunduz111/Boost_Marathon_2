package com.cem.Soru2;

public class SayiDizisiMain {

	public static void main(String[] args) {

		SayiDizisi dizi = new SayiDizisi();
		dizi.ekle(6);
		dizi.ekle(3);
		dizi.ekle(2);
		dizi.ekle(8);
		dizi.ekle(11);
		dizi.ekle(7);
		dizi.liste(); // mevcut diziyi listeliyor
		dizi.sil(3); // dizideki 3.elemaný siliyor
		System.out.println();
		dizi.arayaEkle(4, 1234); // dizinin 4.indexine 1234 sayýsýný ekliyor
		dizi.liste();
		dizi.sil(4); // dizinin 4.indexini siliyor
		System.out.println();
		dizi.liste();
	}

}
