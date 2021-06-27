package arquivo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {

	private int idArquivo;
	private String nome;
	private String tipoArquivo;
	private String caminho;
	
	public Arquivo() {
	}
	
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

	/**
	 * 
	 * Lendo arquivo e adicionando conteúdo na lista 
	 *
	 * @author Breno
	 * @return lnumeros
	 */
	public List<String> lerArquivo(){
		List<String> lNumero = new ArrayList<>();
		BufferedReader file =  abrirArquivoLeitura();
		String numero;
		
		try {
			numero = file.readLine();
			while(numero != null) {
				lNumero.add(numero);
				numero = file.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			fecharArquivoLeitura(file);
		}
		return lNumero;
	}
	
	/**
	 * 
	 * Coloca o conteúdo da lista no arquivo 
	 *
	 * @author Breno
	 * @param bufferdWriter
	 * @param lnumeros
	 */
	public void escreverArquivo(List<String> lnumeros){
		BufferedWriter file = abrirArquivoEscrita();
		try {
			for (int i = 0; i < lnumeros.size(); i++) {
				file.append(lnumeros.get(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			fecharArquivoEscrita(file);
		}
	}
	
	/**
	 * 
	 * Fechar o arquivo de leitura 
	 *
	 * @author Breno
	 * @param file
	 */
	public void fecharArquivoLeitura(BufferedReader file) {
		try {
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * Abre o arquivo para fazer leitura 
	 *
	 * @author Breno
	 * @return file
	 */
	public BufferedReader abrirArquivoLeitura() {
		try {
			BufferedReader file = null;
			file = new BufferedReader(new FileReader(caminho));
			return file;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 
	 * Fechar o arquivo de escrita 
	 *
	 * @author Breno
	 * @param file
	 */
	public void fecharArquivoEscrita(BufferedWriter file) {
		try {
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * Abrir arquivo para escrita
	 *
	 * @author Breno
	 * @return file
	 */
	public BufferedWriter abrirArquivoEscrita() {
		try{
			BufferedWriter file = null;
			file = new BufferedWriter(new FileWriter(caminho));
			return file;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
