package decompose;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int Nombre = 0;

	static int VerificationNombre(Scanner s) {
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

	static void SetNumbers() {
		System.out.println("Entrez Votre nombre a decomposer : ");
		Nombre = VerificationNombre(sc);
	}

	static int NombreDeChiffre(int Nombre) {
		int i = 0;
		while (Nombre >= 10) {
			Nombre = Nombre / 10;
			i++;
		}

		return i + 1;
	}

	static void decompose(int nombre, int[] p, int nombreChiffre) {
		int i = 0;
		while (nombre > 0) {
//			System.out.println(nombre % 10);
			p[i] = nombre % 10;
			nombre = nombre / 10;
			i++;
		}
		do {
//			System.out.println(i-1);
			System.out.println(p[i - 1]);
			i--;
		} while (i != 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("  Bienvenue sur notre outil de decomposition de nombre  ");
		SetNumbers();
		System.out.println("Nombre de chiffre " + NombreDeChiffre(Nombre));
		ArrayList<?> i = new ArrayList<int[]>();
		
		int[] p = new int[NombreDeChiffre(Nombre)];
		decompose(Nombre, p, NombreDeChiffre(Nombre));

	}

}
