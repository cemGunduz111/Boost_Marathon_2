package com.cem.Soru3;

public class CustomStringTR {

	public String ifade;

	public int uzunluk() {

		return ifade.length();

	}

	public String kesme(int sayi) {

		return ifade.substring(sayi);

	}

	public String kesme(int sayi, int sayi2) {

		return ifade.substring(sayi, sayi2);

	}

	public char harfNe(int sayi) {

		return ifade.charAt(sayi);

	}

	public boolean iceriyorMu(String kelime) {

		return ifade.contains(kelime);

	}

	public boolean neIleBasliyor(String harf) {

		return ifade.startsWith(harf);

	}

	public String harfDegistir(String harf, String harf2) {

		return ifade.replace(harf, harf2);

	}

	public boolean esitMi(String kelime) {

		return ifade.equals(kelime);

	}

	public boolean esitMi2(String kelime) {

		return ifade.equalsIgnoreCase(kelime);

	}

	public boolean neIleBitiyor(String kelime) {

		return ifade.endsWith(kelime);

	}

	public int indexNumarasiNe(String index) {

		return ifade.indexOf(index);

	}
}
