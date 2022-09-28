package TestesContas;

import ContasMes.ContasMes;

public class Teste {

	public static void main(String[] args) {
		
		ContasMes contasFelipeAbril = new ContasMes();
		contasFelipeAbril.setDinheiroSaldo(2000.0);
		System.out.println("O Saldo atual de sua conta eh: "+contasFelipeAbril.getDinheiroSaldo());
		contasFelipeAbril.lancarGasto(200);
		System.out.println("O Saldo atual de sua conta eh: "+contasFelipeAbril.getDinheiroSaldo());

	}

}
