package com.cem.Soru4;

import java.util.ArrayList;
import java.util.List;

public class Kiralama implements IKiralama {
	public static List<Musteri> musteriListesi = new ArrayList<Musteri>();
	public static List<Kitap> kitapListesi = new ArrayList<Kitap>();
	public static List<Kitap> kiralananKitapListesi = new ArrayList<Kitap>();
	public static List<Kasiyer> kasiyerListesi = new ArrayList<Kasiyer>();

	public void kiralamaYap(Musteri musteri, Kitap kitap) {

		if (musteriListesi.contains(musteri)) {
			if (kitapListesi.contains(kitap)) {
				kitap.kiraliMi = true;
				kitap.kiralayanlar.add(musteri);
				kiralananKitapListesi.add(kitap);
				musteri.getAlinanKitaplar().add(kitap);
			} else {
				System.out.println("Kitap mevcut deðildir.");
			}
		} else {
			System.out.println("Müþteri bulunamadý");
		}

	}

	public void kitapAra(Kitap kitap) {

		if (kitapListesi.contains(kitap)) {
			System.out.println(kitap.getAd() + " adlý kitap mevcuttur.");
		} else {
			System.out.println("Kitap bulunamadý.");
		}
	}

	public void kiralananKitaplar() {
		kiralananKitapListesi.forEach(x -> System.out.println(x));
	}

	public void musteriAra(Musteri musteri) {

		if (musteriListesi.contains(musteri)) {
			System.out.println(musteri.getAd() + " adlý müþteri mevcuttur.");
		} else {
			System.out.println("Müþteri bulunamadý.");
		}
	}

}
