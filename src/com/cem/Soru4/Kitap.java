package com.cem.Soru4;

import java.util.ArrayList;
import java.util.List;

public class Kitap {

	String kitapAdi;
	String yazarAdi;
	int sayfaSayisi;
	String id;
	static List<Musteri> kiralayanlar;
	boolean kiraliMi;

	public Kitap() {
		super();
	}

	@Override
	public String toString() {
		return " [ad=" + kitapAdi + ", yazarAdi=" + yazarAdi + ", sayfaSayisi=" + sayfaSayisi + ", id=" + id + "]";
	}

	public Kitap(String id, String kitapAdi, String yazarAdi, int sayfaSayisi, boolean kiraliMi) {
		super();
		this.id = id;
		this.kitapAdi = kitapAdi;
		this.yazarAdi = yazarAdi;
		this.sayfaSayisi = sayfaSayisi;
		this.kiralayanlar = new ArrayList<Musteri>();
		this.kiraliMi = kiraliMi;
	}

	public String getAd() {
		return kitapAdi;
	}

	public void setAd(String ad) {
		this.kitapAdi = kitapAdi;
	}

	public String getYazarAdi() {
		return yazarAdi;
	}

	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}

	public int getSayfaSayisi() {
		return sayfaSayisi;
	}

	public void setSayfaSayisi(int sayfaSayisi) {
		this.sayfaSayisi = sayfaSayisi;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Musteri> getKiralayanlar() {
		return kiralayanlar;
	}

	public void setKiralayanlar(List<Musteri> kiralayanlar) {
		this.kiralayanlar = kiralayanlar;
	}

	public boolean isKiraliMi() {
		return kiraliMi;
	}

	public void setKiraliMi(boolean kiraliMi) {
		this.kiraliMi = kiraliMi;
	}

}
