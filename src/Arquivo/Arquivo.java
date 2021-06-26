package Arquivo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.List;

public class Arquivo {

	private int idArquivo;
	private String nome;
	private String tipoArquivo;
	private String caminho;
	
	public Arquivo(int idArquivo, String nome, String tipoArquivo, String caminho) {
		this.idArquivo = idArquivo;
		this.nome = nome;
		this.tipoArquivo = tipoArquivo;
		this.caminho = caminho;
	}

	public int getIdArquivo() {
		return idArquivo;
	}

	public void setIdArquivo(int idArquivo) {
		this.idArquivo = idArquivo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipoArquivo() {
		return tipoArquivo;
	}

	public void setTipoArquivo(String tipoArquivo) {
		this.tipoArquivo = tipoArquivo;
	}

	public String getCaminho() {
		return caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho; 
	}

	public List<Integer> lerArquivo(BufferedWriter bufferedWriter){
		return null;
	}
	
	public void escreverArquivo(BufferedReader bufferdWriter, List<Integer> lnumeros){
		
	}
	
	public void fecharArquivoLeitura(BufferedReader bufferedReader) {
		
	}
	
	public BufferedWriter abrirArquivoLeitura() {
		return null;
	}
	
	public void fecharArquivoEscrita(BufferedWriter bufferdWriter) {
		
	}
	
	public BufferedWriter abrirArquivoEscrita() {
		return null;
	}
}
