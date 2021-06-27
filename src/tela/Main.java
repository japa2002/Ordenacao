package tela;

import java.util.ArrayList;
import java.util.List;

import ordenacao.MergeSort;
import pesquisa.BinariaIterativa;
import pesquisa.Pesquisa;
import pesquisa.PesquisaLinear;

public class Main {
	
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		lista.add("1");
		lista.add("2");
		lista.add("3"); 
		lista.add("4"); 
		BinariaIterativa pesquisa = new BinariaIterativa(0, "Iterativa"); 
		System.out.println(pesquisa.pesquisar(lista, "4"));	
		
		
		
	}
}
