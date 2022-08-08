package com.cem.Soru4;

import java.util.ArrayList;
import java.util.List;

public class Musteri extends Insan {

	static List<Kitap> alinanKitaplar;

	@Override
	public String toString() {
		return "[Müşteri adı= " + ad + ", Aldığı Kitaplar= " + getAlinanKitaplar() + "]";
	}

	public Musteri() {
		super();
	}

	public Musteri(String ad, String id) {
		super();
		this.ad = ad;
		this.id = id;
		this.alinanKitaplar = new ArrayList<Kitap>();
	}

	public List<Kitap> getAlinanKitaplar() {
		return this.alinanKitaplar;
	}

	public void setAlinanKitaplar(List<Kitap> alinanKitaplar) {
		this.alinanKitaplar = alinanKitaplar;
	}

}
