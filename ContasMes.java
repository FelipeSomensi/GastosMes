package ContasMes;

import java.util.ArrayList;
import java.util.List;

public class ContasMes {

	private int mesContas;
	private String nomeMesDoAno;
	private int anoContas;
	private double valorGasto;
	private String obsGastos;
	private static List<Gastos> ListaGastos = new ArrayList<Gastos>();
	
	//construtor
	public ContasMes() {
		
	}

	public void atribuirGasto(double valorGasto,String obsGastos ) {
		//ListaGastos gastoMes = new Gastos();
		
	}
	//retorna valor e OBS de determinado gasto
	public void getValorAndObsGasto(){
		System.out.println("  Gasto: "+ valorGasto + " OBS: "+ obsGastos);
		
	}


	public int getMesContas() {
		return mesContas;
	}



	public void setMesContas(int mesContas) {
		this.mesContas = mesContas;
	}



	public int getAnoContas() {
		return anoContas;
	}



	public void setAnoContas(int anoContas) {
		this.anoContas = anoContas;
	}



	public double getValorGasto() {
		return valorGasto;
	}



	public void setValorGasto(double valorGasto) {
		this.valorGasto = valorGasto;
	}



	public String getObsGastos() {
		return obsGastos;
	}



	public void setObsGastos(String obsGastos) {
		this.obsGastos = obsGastos;
	}

	public String getNomeMesContas() {
		return nomeMesDoAno;
	}

	public void setNomeMesContas(String nomeMesContas) {
		this.nomeMesDoAno = nomeMesContas;
	}
	
	
	
}
