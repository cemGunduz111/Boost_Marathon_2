package com.cem.Soru6;

import java.io.Serializable;

public class Log implements Serializable {
	String hataMesaji;
	String sinifAdi;
	String metotAdi;

	public Log() {
		super();
	}

	public Log(String hataMesaji, String sinifAdi, String metotAdi) {
		super();
		this.hataMesaji = hataMesaji;
		this.sinifAdi = sinifAdi;
		this.metotAdi = metotAdi;

	}

	@Override
	public String toString() {
		return "Log [hataMesaji=" + hataMesaji + ", sinifAdi=" + sinifAdi + ", metotAdi=" + metotAdi + "]";
	}

	public String getHataMesaji() {
		return hataMesaji;
	}

	public void setHataMesaji(String hataMesaji) {
		this.hataMesaji = hataMesaji;
	}

	public String getSinifAdi() {
		return sinifAdi;
	}

	public void setSinifAdi(String sinifAdi) {
		this.sinifAdi = sinifAdi;
	}

	public String getMetotAdi() {
		return metotAdi;
	}

	public void setMetotAdi(String metotAdi) {
		this.metotAdi = metotAdi;
	}

}
