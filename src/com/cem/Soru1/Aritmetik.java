package com.cem.Soru1;

import java.util.Scanner;

public class Aritmetik {

	public static double DortIslem(int[] dizi, String islem) {

		double sonuc = 0;

		if (islem.equals("carp") || islem.equals("bol"))
			sonuc = 1;

		for (int i = 0; i < dizi.length; i++) {
			switch (islem) {

			case "topla":
				sonuc += dizi[i];
				break;
			case "cikar":
				sonuc -= dizi[i];
				break;
			case "carp":
				sonuc *= dizi[i];
				break;
			case "bol":
				if (dizi[i] != 0)
					sonuc /= dizi[i];
				break;

			default:
				break;
			}
		}
		return sonuc;
	}

	public static void AlanHesapla() {
		// �evre toplam� * y�kseklik / 2 -> be�gen

		int secim;
		int tabanUzunlugu, kenarUzunlugu;
		int yukseklik;
		double alan = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1- ��gen ");
		System.out.println("2- Kare");
		System.out.println("3- Dikd�rtgen");
		System.out.println("4- Be�gen");
		System.out.print("��lem se�iniz: ");
		secim = scanner.nextInt();

		switch (secim) {
		case 1:
			System.out.print("Taban uzunlu�unu girin: ");
			tabanUzunlugu = scanner.nextInt();
			System.out.print("Y�ksekli�i girin: ");
			yukseklik = scanner.nextInt();
			alan = tabanUzunlugu * yukseklik / 2.0;
			System.out.println("��genin alan�: " + alan);
			break;
		case 2:
			System.out.print("Karenin kenar uzunlu�unu girin: ");
			kenarUzunlugu = scanner.nextInt();
			alan = Math.pow(kenarUzunlugu, 2);
			System.out.println("Karenin alan�: " + alan);
			break;
		case 3:
			System.out.print("Dikd�rtgenin kenar uzunlu�unu girin: ");
			kenarUzunlugu = scanner.nextInt();
			System.out.print("Dikd�rtgenin taban uzunlu�unu girin: ");
			tabanUzunlugu = scanner.nextInt();
			alan = tabanUzunlugu * kenarUzunlugu;
			System.out.println("Dikd�rtgenin alan�: " + alan);
			break;
		case 4:
			System.out.print("Be�genin kenar uzunlu�unu girin: ");
			kenarUzunlugu = scanner.nextInt();
			System.out.print("Be�genin y�ksekli�ini girin: ");
			yukseklik = scanner.nextInt();
			alan = kenarUzunlugu * 5 * yukseklik / 2.0;
			System.out.println("Be�genin alan�: " + alan);
			break;

		default:
			break;
		}
	}
}
