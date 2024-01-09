package calculatrice;

import java.util.Scanner;

public class Operations {

	public int Addition(int PremierNombre, int DeuxiemeNombre) {

		int Somme = PremierNombre + DeuxiemeNombre;

		return Somme;
	}

	public int Soustraction(int PremierNombre, int DeuxiemeNombre) {

		int Sous = PremierNombre - DeuxiemeNombre;

		return Sous;
	}

	public int Division(int PremierNombre, int DeuxiemeNombre) {
		int Div = 0;
		if (DeuxiemeNombre != 0) {
			Div = PremierNombre / DeuxiemeNombre;

		} else {
			System.out.println(" Division par 0 impossible");
		}
		return Div;

	}

	public int Multiplication(int PremierNombre, int DeuxiemeNombre) {

		int Multipl = PremierNombre * DeuxiemeNombre;

		return Multipl;
	}

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

}
