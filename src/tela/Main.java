package tela;

import java.util.ArrayList;
import java.util.List;

import pesquisa.Pesquisa;
import pesquisa.PesquisaLinear;

public class Main {
	
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		lista.add("1");
		lista.add("2");
		lista.add("3"); 
		Pesquisa pesquisa = new PesquisaLinear(0, "Linear");
		pesquisa.pesquisar(lista, "1"); 
	}
}
