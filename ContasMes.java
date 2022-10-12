package Contas;

public class ContasMes {

	
	private double dinheiroSaldo;  //mostra o saldo no banco
	public String mes;             // representa o mes 
	private int i = 0;
	private String informacaoGasto[]; //guarda as informações referente a cada gasto
	private double gastoMes[];			//gasto do mes/array
	private double gasto;			// gasto generico
	private String informacao;		// informacao generica
	
	
	


	public void setMes(String mes) {  //define o mes// Esta inserido dentro do ano
		this.mes = mes;
		System.out.println("Voce criou um novo mes: " + mes);
		
	}
	
	public void lancarGasto(double gasto, String informacao) {
		this.gasto = gastoMes[i];
		this.informacao = informacaoGasto[i];
		dinheiroSaldo = dinheiroSaldo - this.gasto;
		gastoMes[i]+= this.gasto;
		System.out.println("Voce adicionou um gasto de "+ gastoMes[i] + "reais referente a " + informacaoGasto[i]);
		i++;
				
		
	}
	
	
	
	
}
