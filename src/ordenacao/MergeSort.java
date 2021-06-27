package ordenacao;
import java.util.List;

public class MergeSort extends Ordenacao{

	public MergeSort(int id, String nome) {
		super(id, nome);
		MergeSort mergeSort = new MergeSort(0, "TESTE");
	}
	
	@Override
	public List<String> ordenar(List<String> listaOrdenacao) {
		return null;
	}
	/*
	 * MAIN int []vetor1 = {5,6,7,8,3}; int []vetorAuxiliar = new int[vetor.length];
	 *
	 * mergeSort(vetor1, vetorAuxiliar, 0, vetor1 - 1);
	 */

	private static void mergeSort(int vetor1[], int vetorAuxiliar[], int inicio, int fim) {
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			mergeSort(vetor1, vetorAuxiliar, inicio, meio);
			mergeSort(vetor1, vetorAuxiliar, meio + 1, fim);
			intercalar(vetor1, vetorAuxiliar, inicio, meio, fim);
		}
	}

	private static void intercalar(int vetor1[], int vetorAuxiliar[], int inicio, int fim, int meio) {
		for (int k = inicio; k <= fim; k++) {
			vetorAuxiliar[k] = vetor1[k];
			int i = inicio;
			int j = meio + 1;

			for (k = inicio; k <= fim; k++) {
				if (i > meio)
					vetor1[k] = vetorAuxiliar[j++];
				else if (j > fim)
					vetor1[k] = vetorAuxiliar[i++];
				else if (vetorAuxiliar[i] < vetorAuxiliar[j])
					vetor1[k] = vetorAuxiliar[i++];
				else
					vetor1[k] = vetorAuxiliar[j++];
			}
		}
	}
}
