public class Main {

	public static void main(String[] args) {
		Aluno a1 = new Aluno(5);
		a1.adicionar("Isabella ", 1, " TI");
		a1.adicionar("Fernanda ", 2, " TI");
		a1.adicionar("Luis ", 3, " TI");
		a1.adicionar("Geraldo ", 4, " TI");
		a1.adicionarPrimeiro("Cris ", 5, " TI");
		
		a1.removerAluno("1");
		a1.printVetor();

	}

}