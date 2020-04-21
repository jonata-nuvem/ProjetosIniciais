package colecao;

/* amostras biol�gicas que entram na cole��o de um museu
 * Atributo nomeCientifico - apos identifica��o da amostra biologica: Canis lupus
 * Atributo numeroCatalogo - Exemplo: numero 1648: varia de 00001 -- at� 500.000, por exemplo
 * Atributo numeroExemplares - quantidade de exemplares dentro do  numreo 1648: 3 individuos
*/

public class AmostraBiologica {

	private String nomeCientifico;
	private int numeroCatalogo;
	private int numeroExemplares;

	//Constructor
	public AmostraBiologica(String nomeCientifico, int numeroCatalogo, int numeroExemplares) {
		this.nomeCientifico = nomeCientifico;
		this.numeroCatalogo = numeroCatalogo;
		this.numeroExemplares = numeroExemplares;
	}

	//gets e sets
	public String getNomeCientifico() {
		return nomeCientifico;
	}

	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}

	public int getNumeroCatalogo() {
		return numeroCatalogo;
	}

	public void setNumeroCatalogo(int numeroCatalogo) {
		this.numeroCatalogo = numeroCatalogo;
	}

	public int getNumeroExemplares() {
		return numeroExemplares;
	}

	public void setNumeroExemplares(int numeroExemplares) {
		this.numeroExemplares = numeroExemplares;
	}
	
	//Quando utilizar o Listar Amostras esse 'toString' n�o retornar� o endere�o de mem�ria e sim os dados inseridos na lista
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome Cient�fico: " + nomeCientifico + " | N�mero Cat�logo: " + numeroCatalogo + " | N�mero Exemplares: " + numeroExemplares + "\n");
		return sb.toString();
	}

}
