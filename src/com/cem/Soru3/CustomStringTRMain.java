package com.cem.Soru3;

public class CustomStringTRMain {

	public static void main(String[] args) {

		CustomStringTR custom = new CustomStringTR();

		custom.ifade = "Ýlk boost maratonum";

		System.out.println(custom.uzunluk());
		System.out.println(custom.kesme(6));
		System.out.println(custom.kesme(4, 6));
		System.out.println(custom.harfNe(5));
		System.out.println(custom.iceriyorMu("oos"));
		System.out.println(custom.neIleBasliyor("Ý"));
		System.out.println(custom.neIleBitiyor("num"));
		System.out.println(custom.harfDegistir("o", "x"));
		System.out.println(custom.esitMi("ilk boost maratonum"));
		System.out.println(custom.esitMi2("ilk boost maratonum"));
		System.out.println(custom.indexNumarasiNe("s"));

	}

}
