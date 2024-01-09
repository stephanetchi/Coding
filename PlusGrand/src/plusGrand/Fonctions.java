package plusGrand;

import java.util.Scanner;

public class Fonctions {
	public int VerificationNombre(Scanner s) {
		int y = 0;
		boolean isNumber = true;
		while (isNumber) {
			System.out.println(" ");
			try {
				y = (int) Integer.valueOf(s.next());
				isNumber = false;
			} catch (Exception e) {
				System.out.println("Vous devez entrer des nombres / chiffres ");
			}

		}
		return y;
	}
	public int Comparaison (int premierNombre, int DeuxiemeNombre) {
		
		if (premierNombre == DeuxiemeNombre) {
			System.out.println(" Ces deux nombres sont egaux");
			return 0;
		}else if (premierNombre>DeuxiemeNombre) {
			System.out.println(" Le nombre le plus grand est " + premierNombre);
			return premierNombre;
		}else if (DeuxiemeNombre>premierNombre) {
			System.out.println(" Le nombre le plus grand est " + DeuxiemeNombre);
			return DeuxiemeNombre;
		}return 0;
	}

}

