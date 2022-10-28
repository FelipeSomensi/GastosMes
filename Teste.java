package Testes;

import java.util.Scanner;

import ContasMes.Usuario;

public class TesteContasMes {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
	    int nMes; int nAno = 0; double nValor = 0; String informacao; 
		int escolhaPrograma = 99;
		
	
		Usuario Felipe = new Usuario("Felipe");
		
		
		//------------------------
		while(escolhaPrograma != 0 ) {
			
			System.out.println("CONTAS MENSAIS");
			System.out.println("1 -- para adicionar gasto");
			System.out.println("2 -- para verificar gastos");
			System.out.println("0 -- Para Sair  ");
			escolhaPrograma = scan.nextInt();
			
			switch(escolhaPrograma) {
			case 1:
				System.out.println("Por favor informe o ano:");
				nAno=scan.nextInt();
				
				System.out.println("Por favor informe o mes:");
				nMes=scan.nextInt();
				try {
				System.out.println("Por favor informe o valor");
				nValor=scan.nextDouble();
				} catch(java.util.InputMismatchException exception) {
					System.out.println("Eh necessario usar virgula, nao ponto");
					//System.exit(nAno); //forca o cancelamento do codigo
					break;
				}
				System.out.println("Por favor informe a informacao sobre o gasto");
				informacao = scan.next();
				
				Felipe.lancarContaMes(nAno, nMes, nValor, informacao); // anoGasto,mesGasto,gasto,obs
				//Felipe.lancarContaMes(2022, 2, 100, "cabeleleilo");
				break;
			
			case 2:
				Felipe.informaGastos(2022, 2); //anoGasto, mesGasto
				break;
				
			case 0:
				System.out.println("Voce escolheu sair");
				System.exit(nAno); //forca o cancelamento do codigo
			
			
			
			}
		
		}
		
	}

}
