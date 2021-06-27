package pesquisa;

import java.util.List;

public class PesquisaLinear extends Pesquisa{

	public PesquisaLinear(int idPesquisa, String nome) {
		super(idPesquisa, nome);
	}
	
	@Override
	public int pesquisar(List<String> lista, String conteudo) {
		return 0;
	}
}
