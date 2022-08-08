package com.cem.Soru5;

import com.cem.Soru4.Kiralama;
import com.cem.Soru4.Musteri;

public class Soru5 {

	Kiralama kiralama = new Kiralama();
	Musteri musteri;

	public void ahmet() {
		kiralama.musteriListesi.stream().filter(i -> i.getAd().startsWith("ahm"))
				.forEach(a -> System.out.println(a.getAd()));
		;
	}

	public void kimKiraladi(String id) {

		kiralama.kiralananKitapListesi.stream().filter(x -> x.getId().equals(id))
				.forEach(a -> this.musteri = a.getKiralayanlar().get(a.getKiralayanlar().size() - 1));
		System.out.println("Kitabı kiralayan müşteri numarası: " + this.musteri.getId());
	}

	public void hangiKitabiKiraladi(String musteri_id) {
		kiralama.musteriListesi.stream().filter(x -> x.getId().equals(musteri_id))
				.forEach(a -> System.out.println(a.getAlinanKitaplar()));
	}

	public void oncekiSahipler(String kitap_adi) {
		kiralama.kiralananKitapListesi.stream().filter(x -> x.getId().equals(kitap_adi))
				.forEach(a -> System.out.println(a.getKiralayanlar()));
	}
}
