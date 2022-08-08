package com.cem.Soru2;

public class SayiDizisi {

	int[] dizi = new int[0];
	int[] temp;

	public void ekle(int sayi) {

		temp = new int[dizi.length + 1];

		for (int i = 0; i < dizi.length; i++) {

			temp[i] = dizi[i];
		}
		temp[dizi.length] = sayi;
		dizi = temp;

	}

	public void sil(int index) {

		temp = new int[dizi.length - 1];
		for (int i = 0; i < temp.length; i++) {

			if (i >= index) {
				temp[i] = dizi[i + 1];
			} else {
				temp[i] = dizi[i];
			}
		}

		dizi = temp;

	}

	public void liste() {

		for (int i : dizi) {
			System.out.print(i + " ");
		}

	}

	public void arayaEkle(int index, int sayi) {
		temp = new int[dizi.length + 1];

		for (int i = 0; i < index; i++) {

			temp[i] = dizi[i];
		}
		temp[index] = sayi;

		for (int i = index; i < dizi.length; i++) {
			temp[i + 1] = dizi[i];
		}
		dizi = temp;

	}
}