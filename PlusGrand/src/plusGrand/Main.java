package plusGrand;

import java.util.Scanner;


public class Main {
	static Scanner sc = new Scanner(System.in);
	static int PremierNombre = 0;
	static int DeuxiemeNombre = 0;

	static void SetNumbers(int Premier, int Deuxieme) {
		Fonctions op = new Fonctions();
			System.out.println("Entrez le premier nombre : ");
			PremierNombre = op.VerificationNombre(sc);
			System.out.println("Entrez le deuxieme nombre : ");
			DeuxiemeNombre = op.VerificationNombre(sc);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fonctions f = new Fonctions();
		System.out.println("Bienvenue sur notre Comparateur de nombre : ");
		SetNumbers(PremierNombre, DeuxiemeNombre);
		f.Comparaison(PremierNombre, DeuxiemeNombre);

	}

}
