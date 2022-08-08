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
		// çevre toplamý * yükseklik / 2 -> beþgen

		int secim;
		int tabanUzunlugu, kenarUzunlugu;
		int yukseklik;
		double alan = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1- Üçgen ");
		System.out.println("2- Kare");
		System.out.println("3- Dikdörtgen");
		System.out.println("4- Beþgen");
		System.out.print("Ýþlem seçiniz: ");
		secim = scanner.nextInt();

		switch (secim) {
		case 1:
			System.out.print("Taban uzunluðunu girin: ");
			tabanUzunlugu = scanner.nextInt();
			System.out.print("Yüksekliði girin: ");
			yukseklik = scanner.nextInt();
			alan = tabanUzunlugu * yukseklik / 2.0;
			System.out.println("Üçgenin alaný: " + alan);
			break;
		case 2:
			System.out.print("Karenin kenar uzunluðunu girin: ");
			kenarUzunlugu = scanner.nextInt();
			alan = Math.pow(kenarUzunlugu, 2);
			System.out.println("Karenin alaný: " + alan);
			break;
		case 3:
			System.out.print("Dikdörtgenin kenar uzunluðunu girin: ");
			kenarUzunlugu = scanner.nextInt();
			System.out.print("Dikdörtgenin taban uzunluðunu girin: ");
			tabanUzunlugu = scanner.nextInt();
			alan = tabanUzunlugu * kenarUzunlugu;
			System.out.println("Dikdörtgenin alaný: " + alan);
			break;
		case 4:
			System.out.print("Beþgenin kenar uzunluðunu girin: ");
			kenarUzunlugu = scanner.nextInt();
			System.out.print("Beþgenin yüksekliðini girin: ");
			yukseklik = scanner.nextInt();
			alan = kenarUzunlugu * 5 * yukseklik / 2.0;
			System.out.println("Beþgenin alaný: " + alan);
			break;

		default:
			break;
		}
	}
}
