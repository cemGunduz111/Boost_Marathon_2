package com.cem.Soru4;

import java.util.ArrayList;
import java.util.List;

public class Kasiyer extends Insan {

	public static List<Kitap> kiralananKitaplar;

	public Kasiyer(String ad, String id) {
		super();
		this.ad = ad;
		this.id = id;
		this.kiralananKitaplar = new ArrayList<Kitap>();
	}

	public List<Kitap> getKiralananKitaplar() {
		return kiralananKitaplar;
	}

	public void setKiralananKitaplar(List<Kitap> kiralananKitaplar) {
		this.kiralananKitaplar = kiralananKitaplar;
	}

}
