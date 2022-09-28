package ContasMes;

public class ContasMes {

	private double dinheiroSaldo;  //mostra o saldo no banco
	private double gastoMes;			//gasto do mes
	private double gasto;			// gasto generico
	
	

	
	
	public double getDinheiroSaldo() {
		return dinheiroSaldo;
	}
	public void setDinheiroSaldo(double dinheiroSaldo) {
		this.dinheiroSaldo = dinheiroSaldo;
	}
	public double getGastoMes() {
		return gastoMes;
	}
	public void setGastoMes(double gastoMes) {
		this.gastoMes = gastoMes;
	}
	
	public void lancarGasto(double gasto) {
		this.gasto = gasto;
		dinheiroSaldo = dinheiroSaldo - this.gasto;
		gastoMes += this.gasto;
	}
	
	
	
	
}
