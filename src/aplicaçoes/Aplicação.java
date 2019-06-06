package aplicaçoes;

import java.util.Locale;
import java.util.Scanner;

public class Aplicação {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);	
		System.out.print("ENTRE COM O TAMANHO DA MATRIZ N/N: ");
		int n = sc.nextInt();
		int [][] matriz = new int[n][n];
		
		for (int x=0;x<n;x++) {
			for (int y=0;y<n;y++) {
				matriz[x][y] = x+y;
				System.out.printf("%d   ",matriz[x][y]);
				
			}
			System.out.println();
		}
		sc.close();
	}

}
