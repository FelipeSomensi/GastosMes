package Contas;

public class ContasMes {

	
	private double dinheiroSaldo;  //mostra o saldo no banco
	public String mes;             // representa o mes 
	private double gastoMes;			//gasto do mes
	private double gasto;			// gasto generico
	


	public void setMes(String mes) {  //define o mes// Esta inserido dentro do ano
		this.mes = mes;
		System.out.println("Voce criou um novo mes: " + mes);
		
	}
	
	public void lancarGasto(double gasto) {
		this.gasto = gasto;
		dinheiroSaldo = dinheiroSaldo - this.gasto;
		gastoMes += this.gasto;
	}
	
	
	
	
}
