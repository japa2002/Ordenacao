package dado;

import java.util.List;

import arquivo.Arquivo;
import ordenacao.Ordenacao;
import pesquisa.Pesquisa;

public class Dado {
	
	private Arquivo arquivo;
	private Ordenacao ordenacao;
	private Pesquisa pesquisa;
	private Resultado resultado;
	
	public Arquivo getArquivo() {
		return arquivo;
	}
	public void setArquivo(Arquivo arquivo) {
		this.arquivo = arquivo;
	}
	public Ordenacao getOrdenacao() {
		return ordenacao;
	}
	public void setOrdenacao(Ordenacao ordenacao) {
		this.ordenacao = ordenacao;
	}
	public Pesquisa getPesquisa() {
		return pesquisa;
	}
	public void setPesquisa(Pesquisa pesquisa) {
		this.pesquisa = pesquisa;
	}
	public Resultado getResultado() {
		return resultado;
	}
	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}
	
	public List<String> listarDadosArquivo(String caminho){
		arquivo.setCaminho(caminho);
		return arquivo.lerArquivo();
	}
	
	public List<String> ordenar(List<String> lista){
		return ordenacao.ordenar(lista);
	}
}
