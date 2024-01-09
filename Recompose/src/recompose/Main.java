package recompose;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int Nombre = 0;

	static int VerificationChiffre(Scanner s) {
		int y = 0;
		boolean isNumber = true;
		while (isNumber) {
			System.out.println(" ");
			try {
				y = (int) Integer.valueOf(s.next());
				if ((y<0) || (y>9)){
					System.out.println("Entrez un nombre compris entre 0 et 9 :");
				}else {
					isNumber = false;
					
				}
			} catch (Exception e) {
				System.out.println("Vous devez entrer des nombres / chiffres ");
			}

		}
		return y;
	}

	static void SetChiffres() {
		Nombre = VerificationChiffre(sc);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		System.out.println("Bienvenue sur notre outil de recomposition de nombre  ");
		System.out.println("Entrez Votre nombre a decomposer : ");
		System.out.println("Entrez les chiffres :  ");
		do {
			i++;
			SetChiffres();
			int [] b = new int[i];
			b[i-1]=Nombre;
			
		}while (Nombre !=0); 
		
//		System.out.println("Vous avez entree "+ Nombre);
		

	}

}
