package ContasMes;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String nomeUser;    //nome do usuário
	private String nomeMesDoAno;
	private ContasMes contasMes;   //objeto do tipo ContasMes
	private double valorGasto;
	private String obsGastos;
	private static List<ContasMes> listaDeContasMensais = new ArrayList<ContasMes>();
	
	private double saldo;
	
	//construtor
	public Usuario(String nomeUser) {
		this.nomeUser = nomeUser;
	
	}	
	
	
	//metodo para criar conta  // necessario limitar as opçoes do usuario
	public void lancarContaMes(int anoContaMes, int mesContaMes, double valorGasto, String obsGastos) {
		if(mesContaMes > 12 || mesContaMes > 1) {
		System.out.println("Bah coloca um mes certo ae campeao");	
		} else {
		
		ContasMes contasMensais = new ContasMes();
		contasMensais.setAnoContas(anoContaMes);
		contasMensais.setMesContas(mesContaMes);
		contasMensais.setValorGasto(valorGasto);
		contasMensais.setObsGastos(obsGastos);
		
		switch (mesContaMes) {
			case 1:
				nomeMesDoAno = "Janeiro";
				break;
			case 2:
				nomeMesDoAno = "Fevereiro";
				break;
			case 3:
				nomeMesDoAno = "Marco";
				break;
			case 4:
				nomeMesDoAno = "Abril";
				break;
			case 5:
				nomeMesDoAno = "Maio";
				break;
			case 6:
				nomeMesDoAno = "Junho";
				break;
			case 7:
				nomeMesDoAno = "Julho";
				break;
			case 8:
				nomeMesDoAno = "Agosto";
				break;
			case 9:
				nomeMesDoAno = "Setembro";
				break;
			case 10:
				nomeMesDoAno = "Outubro";
				break;
			case 11:
				nomeMesDoAno = "Novembro";
				break;
			case 12:
				nomeMesDoAno = "Dezembro";
				break;
			
		}
		contasMensais.setNomeMesContas(this.nomeMesDoAno); //define o nome do mes no objeto ContasMes
		
		System.out.println("Gasto adicionado"+ " Ano: " + anoContaMes + " Mes: " + nomeMesDoAno); //informa as informascoes do lançamento
		System.out.println("Valor: " + valorGasto + " OBS: " + obsGastos);
		listaDeContasMensais.add(contasMensais);
		}
	}
	
	//metodo para informar os gastos de um mes
	public void informaGastos(int anoPesquisa, int mesPesquisa) {
		int tamanhoBusca = listaDeContasMensais.size();
		System.out.println("Os gastos lancados nesse mes:");
		for (int i = 0; i < tamanhoBusca; i++) { 
			if (listaDeContasMensais.get(i).getAnoContas() == anoPesquisa && 
					listaDeContasMensais.get(i).getMesContas() == mesPesquisa) {
						listaDeContasMensais.get(i).getValorAndObsGasto();
			}  
		}
	}
	
	//metodo para informar os gastos de determinado ano //posteriormente 
	public void informaGastosAno(int anoPesquisa) {
		int tamanhoBusca = listaDeContasMensais.size();
		System.out.println("Os gastos lancados nesse mes:");
		for (int i = 0; i < tamanhoBusca; i++) {
			if (listaDeContasMensais.get(i).getAnoContas() == anoPesquisa) {
				
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
