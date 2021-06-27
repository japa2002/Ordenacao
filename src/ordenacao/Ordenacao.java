package ordenacao;
import java.util.List;

public abstract class Ordenacao {

	private int id;
	private String nome;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Ordenacao(int id, String nome) {
		setId(id);
		setNome(nome);
	}

	public List<Integer> ordenar(List<Integer> listaOrdenacao) {
		return listaOrdenacao;
	}
}
