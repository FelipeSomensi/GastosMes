package ContasMes;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String nomeUser;    //nome do usuário
	private String nomeMesDoAno;
	public ContasMes contasMes;   //objeto do tipo ContasMes
	private double valorGasto;
	private String obsGastos;
	private static List<ContasMes> listaDeContasMensais = new ArrayList<ContasMes>();
	
	
	
	//construtor
	public Usuario(String nomeUser) {
		this.nomeUser = nomeUser;
	
	}	
	
	
	//metodo para criar conta  // necessario limitar as opçoes do usuario
	public void lancarContaMes(int anoContaMes, int mesContaMes, double valorGasto, String obsGastos) {
		ContasMes contasMensais = new ContasMes();
		contasMensais.setAnoContas(anoContaMes);
		contasMensais.setMesContas(mesContaMes);
		contasMensais.setValorGasto(valorGasto);
		contasMensais.setObsGastos(obsGastos);
		
		if(mesContaMes == 1)  //define o nome do mes pelo numero que o usuario coloca
			{nomeMesDoAno = "Janeiro";} 
		else if(mesContaMes == 2) 
			{nomeMesDoAno = "Fevereiro";}
		else if(mesContaMes == 3) 
			{nomeMesDoAno = "Marco";}
		else if(mesContaMes == 4) 
			{nomeMesDoAno = "Abril";}
		else if(mesContaMes == 5) 
			{nomeMesDoAno = "Maio";}
		else if(mesContaMes == 10) 
			{nomeMesDoAno = "Outubro";}
		
		System.out.println("Gasto lançado"+ " Ano: " + anoContaMes + " Mes: " + nomeMesDoAno); //informa as informascoes do lançamento
		System.out.println("Valor: " + valorGasto + " OBS: " + obsGastos);
		listaDeContasMensais.add(contasMensais);
	}

	//metodo para informar os gastos de um mes
	public void informaGastos(int metoAnoGasto, int metoMesGasto) {
		int tamanhoBusca = listaDeContasMensais.size();
		System.out.println("Os gastos lancados nesse mes:");
		for (int i = 0; i < tamanhoBusca; i++) { 
			if (listaDeContasMensais.get(i).getAnoContas() == metoAnoGasto && 
					listaDeContasMensais.get(i).getMesContas() == metoMesGasto) {
						listaDeContasMensais.get(i).getValorAndObsGasto();
			}  
		}
	}
	

	public String getNomeUser() {
		return nomeUser;
	}


	public void setNomeUser(String nomeUser) {
		this.nomeUser = nomeUser;
	}


	public ContasMes getContasMes() {
		return contasMes;
	}


	public void setContasMes(ContasMes contasMes) {
		this.contasMes = contasMes;
	}
	

	
}
