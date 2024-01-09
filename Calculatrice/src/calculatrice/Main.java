package calculatrice;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int ChoixOperation = 0;
	static int PremierNombre = 0;
	static int DeuxiemeNombre = 0;
	static int result = 0;

	static void SetNumbers(int Premier, int Deuxieme) {
		Operations op = new Operations();
			System.out.println("Entrez le premier nombre : ");
			PremierNombre = op.VerificationNombre(sc);
			System.out.println("Entrez le deuxieme nombre : ");
			DeuxiemeNombre = op.VerificationNombre(sc);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Operations op = new Operations();
		System.out.println("Bienvenue sur notre calculatrice moderne");
		do {
			ChoixOperation = 0;
			System.out.println(" ");
			System.out.println("Vous allez choisir le type d'operation que vous voulez mener : ");
			System.out.println("1. Addition");
			System.out.println("2. Soustraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Quitter");
			ChoixOperation = op.VerificationNombre(sc);

			switch (ChoixOperation) {
			case 1:
				SetNumbers(PremierNombre, DeuxiemeNombre);
				result = op.Addition(PremierNombre, DeuxiemeNombre);
				System.out.println("l'addition entre " + PremierNombre + " et " + DeuxiemeNombre + " est = " + result);
				break;

			case 2:
				SetNumbers(PremierNombre, DeuxiemeNombre);
				result = op.Soustraction(PremierNombre, DeuxiemeNombre);
				System.out.println(
						"la soustraction entre " + PremierNombre + " et " + DeuxiemeNombre + " est = " + result);
				break;
			case 3:
				SetNumbers(PremierNombre, DeuxiemeNombre);
				result = op.Multiplication(PremierNombre, DeuxiemeNombre);
				System.out.println(
						"la multiplication entre " + PremierNombre + " et " + DeuxiemeNombre + " est = " + result);
				break;
			case 4:
				SetNumbers(PremierNombre, DeuxiemeNombre);
				result = op.Division(PremierNombre, DeuxiemeNombre);
				if (DeuxiemeNombre != 0) {
					System.out.println(
							"la division entre " + PremierNombre + " et " + DeuxiemeNombre + " est = " + result);
				}
				break;
			case 5:
				break;
			default:
				System.out.println("Ce nombre n'a pas été defini pour designer une operation.");
//				break;

			}
		} while (ChoixOperation != 5);
		System.out.println("**************************************************");
		System.out.println("Nous vous remercions d'avoir utilisé ce programme");
		System.out.println("**************************************************");

	}

}
