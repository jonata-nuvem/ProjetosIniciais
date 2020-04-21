package repositorios;

import java.util.ArrayList;
import java.util.List;
import colecao.AmostraBiologica;
import interfaces.RepositorioAmostraBiologica;

public class ListaRepositorioAmostraBiologica implements RepositorioAmostraBiologica {

	// Atributo
	private List<AmostraBiologica> amostras;

	// Constructor
	public ListaRepositorioAmostraBiologica() {
		amostras = new ArrayList<AmostraBiologica>();
	}

	// Cadastrar - Inserir Amostra na Lista
	@Override
	public void addAmostra(AmostraBiologica amBio) {
		amostras.add(amBio);
	}

	// Listar Amostras cadastradas na Lista.
	public void listAmostra() {
		if (amostras.size() != 0) {
			for (AmostraBiologica amo : amostras) {
				System.out.println(amo.toString());
			}
		} else {
			System.out.println("Nenhum Cadastro Realizado!");
		}
	}
}
