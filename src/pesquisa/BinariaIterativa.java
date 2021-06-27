package pesquisa;

import java.util.List;

public class BinariaIterativa extends PesquisaBinaria{

	public BinariaIterativa(int idPesquisa, String nome) {
		super(idPesquisa, nome);
	}

	@Override
	public int pesquisar(List<String> lista, String conteudo) {
		
		int inicio = 0;
		int i = 0;
		int fim = Integer.parseInt(conteudo) -1;
				
		while(inicio <= fim) {
			i = (inicio + fim) / 2;
						
			if (lista.get(i) == conteudo) {  //Encontra o meio
	            return i;
	        }

	        if (lista.get(i) != conteudo) {  //Encontra metade da sub-metade
	            inicio = i + 1;
	        } else {  						 //lista diferente do conteudo. Conteudo está no sub-vetor à esquerda 
	            fim = i;
	        }
		}
		return -1;
	}
}
