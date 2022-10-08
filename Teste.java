package TestesContas;

import Contas.ContasAno;
import Contas.Usuario;

public class Teste {

	public static void main(String[] args) {
		
		Usuario Felipe = new Usuario("Felipe Somensi");
		ContasAno contasAnoFelipe = new ContasAno(2022,1);
		System.out.println(contasAnoFelipe.ano);
		
		
	

	}

}
