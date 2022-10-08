package Contas;

public class ContasAno{
	

	public int ano;	// representa o ano
	public int mesDoAno;
	public String nomeMesDoAno;
	
	//fazer array para os meses do ano.
	
	//Qual ano você esta?, Qual o mes?
	public ContasAno(int ano, int mesDoAno) {  //define o ano// Dentro do objeto ano terá um objeto contasMes para cada mes do ano
		this.ano = ano;
		this.mesDoAno = mesDoAno;
		if(mesDoAno == 1) {
		nomeMesDoAno = "Janeiro";
			} else {
				if(mesDoAno == 2) {
				nomeMesDoAno = "Fevereiro";
				}
		}
		System.out.println("Voce esta no ano: " + ano);
		System.out.println("Voce esta no mes: " + nomeMesDoAno);
		
	}
	
}
