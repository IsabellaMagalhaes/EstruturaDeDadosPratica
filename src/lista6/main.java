import java.util.*;

public class main {

	public static void insertionSort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	public static boolean buscaBinaria(int x, int numeros[]) {
		int inicio = 0, fim = numeros.length - 1;
		int meio;
		while (inicio <= fim) {
			meio = (inicio + fim) / 2;
			if (x == numeros[meio]) {
				System.out.println("O n�mero " + numeros[meio] + " se encontra na posicao: " + meio);
				return true;
			}
			if (x < numeros[meio])
				fim = meio - 1;
			else
				inicio = meio + 1;
		}
		System.out.println("Nao possui o valor " + x + " no vetor.");
		return false;
	}

	public static void buscaSequencial(int valor, int vetor[]) {
		int cont = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == valor) {
				cont++;
			}
		}
		System.out.println("Possui o total de " + cont + " numeros " + valor + " no vetor.");
	}

	public static void main(String[] args) {
		Random random = new Random();
		Scanner entrada = new Scanner(System.in);
		System.out.print("Qual numero deseja saber a posi��o: ");
		int opc = entrada.nextInt();
		int arrayInsertionSort[] = new int[500];

		for (int i = 0; i < arrayInsertionSort.length; i++) {
			arrayInsertionSort[i] = random.nextInt(10000);
		}

		insertionSort(arrayInsertionSort);
		
		long comecoBinario = System.currentTimeMillis();
		buscaBinaria(opc, arrayInsertionSort);
		long fimBinario = System.currentTimeMillis();
		
		long comecoSequencial = System.currentTimeMillis();
		buscaSequencial(opc,arrayInsertionSort);
		long fimSequencial = System.currentTimeMillis();
		
        System.out.println("============ Tempo de Busca Binaria ==================");
        System.out.println((fimBinario - comecoBinario) / 1000d);
        System.out.println("============ Tempo de Busca Sequencial ==================");
        System.out.println((fimSequencial - comecoSequencial) / 1000d);
		
	}

}