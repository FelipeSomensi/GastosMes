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
		while(escolhaPrograma != 0 ) {  //menu
			
			System.out.println("CONTAS MENSAIS");
			System.out.println("1 -- para adicionar gasto");
			System.out.println("2 -- para verificar gastos");
			System.out.println("3 -- para somar gastos de um mes");
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
				break;
			
			case 2:
				System.out.println("Informe o ano e o mes da pesquisa: ");
				nAno=scan.nextInt();
				nMes=scan.nextInt();
				if(nMes > 12 && nMes > 1) {
					System.out.println("Bah coloca um mes certo ae campeao");	
					} else {
				Felipe.informaGastos(nAno, nMes); //anoGasto, mesGasto
					}
				break;
				
			case 3:
				System.out.println("Informe o ano e o mes da pesquisa: ");
				nAno=scan.nextInt();
				nMes=scan.nextInt();
				Felipe.somarGastosMes(nAno, nMes);
				break;
				
			case 0:
				System.out.println("Voce escolheu sair");
				System.exit(nAno); //forca o cancelamento do codigo			
			
			}
		
		}
		
	}

}
