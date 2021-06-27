
import java.util.ArrayList;
import java.util.List;
import arquivo.Arquivo;

public class TelaOrdenacao {
	
	public static void main(String[] args) {
	
		Arquivo arquivo = new Arquivo(0, null, null, "C:\\Users\\us\\Downloads\\ListaOrdenacao.txt");
		List<String> lista = arquivo.lerArquivo();
		System.out.println(lista);
		
		
		List<String> lista2 = new ArrayList<>(); 
		lista2.add("Banana");
		lista2.add("Maça");
		lista2.add("Laranja");
		arquivo.escreverArquivo(lista2);
		
		
		List<String> lista3 = arquivo.lerArquivo();
		System.out.println(lista3);
	}
}
