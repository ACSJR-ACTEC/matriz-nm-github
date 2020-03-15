package Aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número de linhas da matriz: ");
		int nLinhas = sc.nextInt();
		System.out.println("Digite o número de colunas da matriz: ");
		int nColunas = sc.nextInt();
		int[][] matriz = new int[nLinhas][nColunas];
		
		System.out.println("Digite agora sua matriz:\n");
		
		for(int i=0; i<nLinhas; i++) {
			for(int j=0; j<nColunas; j++) {
				
				matriz[i][j] = sc.nextInt();
				
			}
		}
		
		System.out.println("\nDigite agora um número a ser pesquisado na matriz:");
		
		int numeroPesquisado = sc.nextInt();
		int numeroLido;
		int ocorrencias = 0;
		
			for(int i=0; i<nLinhas; i++) {
				for(int j=0; j<nColunas; j++) {
					
					numeroLido = matriz[i][j];
					
					if(numeroLido == numeroPesquisado) {
						
						++ ocorrencias;
						
						System.out.println("\nOcorrencia encontrada na posicao " + i + "," + j);
						
						if(j - 1 >= 0) {
							System.out.println("Left: " + matriz[i][j - 1 ]);
						} else System.out.println("Left: nao existente");
						
						if(j + 1 < nColunas) {
							System.out.println("Right: " + matriz[i][j + 1]);
						} else System.out.println("Right: nao existente");
						
						if(i - 1 >= 0) {
							System.out.println("Up: " + matriz[i - 1][j]);
						} else System.out.println("Up: nao existente");
												
						if(i + 1 < nLinhas) {
							System.out.println("Down: " + matriz[i + 1][j]);
						} else System.out.println("Down: nao existente");
						
					}
					
				}
				
				
			}
			
			if(ocorrencias > 0) {
				System.out.println("\nForam encontradas " + ocorrencias + " ocorrencias de pesquisa.");
			} else System.out.println("\nO numero pesquisado nao pertence a matriz.");
		
		
		
		
		sc.close();

	}

}
