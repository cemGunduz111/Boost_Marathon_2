package com.cem.Soru6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class HataYakalama {

	public static void main(String[] args) {

		try {

			File dosya = new File("C:\\LogDosyasi\\notlar.txt");
			int[] notlar = { 50, 100, 65, 40, 15 };

			if (dosya.exists()) {
				try (BufferedWriter bf = new BufferedWriter(new FileWriter(dosya, true))) {
					bf.append("Ba�ar�l� Ekleme" + "\n");
				}
			} else {
				throw new FileNotFoundException("Dosya bulunamad�...");
			}
			System.out.println("��rencinin 4.notu: " + notlar[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Dizinin boyutlar� d���nda bir de�er girdiniz.");
		} catch (NullPointerException e) {
			System.out.println("Bo� not olamaz!!!");
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamad�...");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
