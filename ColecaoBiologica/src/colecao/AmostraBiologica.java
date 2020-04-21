package colecao;

//amostras biologicas que entrão na coleção de uma museu// 
public class AmostraBiologica {
//nomes cientificos apos identificação da amostra biologica: Canis lupus // 
public String nomecientifico;
//numero no catalogo Exemplo: numero 1648: varia de 00001 -- até 500.000, por exemplo //
public int numerocatalogo;
//numero de exemplares: quantidade de exemplares dentro do  numreo 1648: 3 individuos //
public int numeroexemplares;

//////////////////////////////////////////////////////////////////////////////////////////////
//construtor da classe//
public AmostraBiologica(String nomecientifico, int numerocatalogo, int numeroexemplares, String conservacao, String habitat ){
	this.nomecientifico = nomecientifico;
	this.numerocatalogo = numerocatalogo;
	this.numeroexemplares = numeroexemplares;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////
//get e sets dos atributos da amostra biológica//

public String getNomecientifico() {
	return nomecientifico;
}

public void setNomecientifico(String nomecientifico) {
	this.nomecientifico = nomecientifico;
}

public int getNumerocatalogo() {
	return numerocatalogo;
}

public void setNumerocatalogo(int numerocatalogo) {
	this.numerocatalogo = numerocatalogo;
}

public int getNumeroexemplares() {
	return numeroexemplares;
}

public void setNumeroexemplares(int numeroexemplares) {
	this.numeroexemplares = numeroexemplares;
}


}
