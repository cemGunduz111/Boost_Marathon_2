package com.cem.Soru1;

import java.util.Scanner;

public class AritmetikMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Aritmetik aritmetik1 = new Aritmetik();

		int[] dizi = { 1, 2, 3, 4, 5 };
		int islem;
		System.out.print("Yap�lmas� �stenen ��lemi Se�in(1- D�rt ��lem, 2- Alan Hesab�): ");
		islem = scanner.nextInt();
		scanner.nextLine();
		switch (islem) {

		case 1:
			String hesaplama;
			System.out.print("Yap�lmas� istenen i�lemi girin(topla, cikar, carp, bol): ");
			hesaplama = scanner.nextLine();
			System.out.println(aritmetik1.DortIslem(dizi, hesaplama));
			break;

		case 2:
			aritmetik1.AlanHesapla();
			break;

		default:
			break;
		}

	}

}
