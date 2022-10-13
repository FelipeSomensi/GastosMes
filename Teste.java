package TestesContas;

import Contas.ContasAno;
import Contas.ContasMes;
import Contas.Usuario;

public class Teste {

	public static void main(String[] args) {
		
		Usuario Felipe = new Usuario("Felipe Somensi");
		ContasAno contasFelipe = new ContasAno(2022,1);
		//ContasMes contaMesFelipe = new ContasMes(contasFelipe);
		contasFelipe.ContasDoMes.lancarGasto(20.00, "corrida de uber");
		//contasFelipe.ContasDoMes.lancarGasto(15, "compra Remedio");
		
		
	

	}

}
