package Testes;

import java.util.Scanner;

import ContasMes.Usuario;

public class TesteContasMes {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int nMes; int nAno; double nValor; String informacao;
		nMes=scan.nextInt();
		nAno=scan.nextInt();
		nValor=scan.nextDouble();
		informacao=scan.nextLine();
		
		//------------------------
		System.out.println("CONTAS MENSAIS");
		System.out.println("Por favor crie um usuário informando seu nome");
		
		
		
		Usuario Felipe = new Usuario("Felipe");
		Felipe.lancarContaMes(2022, 22, 20.2, "teste"); // anoGasto,mesGasto,gasto,obs
		//Felipe.lancarContaMes(2022, 2, 100, "cabeleleilo");

		
		Felipe.informaGastos(2022, 2); //anoGasto, mesGasto
		
		

	}

}
