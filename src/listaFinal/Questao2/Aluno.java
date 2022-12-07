public class Aluno {
	private String[] aluno;
    private String nome;
    private int matricula;
    private String curso;
    
    private int topo;
    private int tam_max;
    
    // Construtor
    public Aluno(int quantidade) {
    	aluno = new String[quantidade];
    	tam_max = quantidade;
    	topo = 0;
    }
    
    public void adicionar(String nome, int matricula, String curso) {
    	aluno[topo] = nome + matricula + curso;
//    	System.out.println(aluno[topo]);
    	topo++;
    }
    
    public void qtsPosVazia() {
    	if ((tam_max - topo) == -1) {
    		tam_max = 4;
    		topo = 0;
    	}
    	System.out.println("A quantidade vazia � de: " + (tam_max - topo));
    }
    
    public boolean cheio() {
        return (topo == tam_max);
    }
    
    public void remover() {
    	topo--;
    }
    
    public void novoTamanho(int novoTamanho) {
    	String aluno2[] = new String[aluno.length + novoTamanho];
    	for (int i = 0; i < aluno.length; i++) {
    		aluno2[i] = aluno[i];
		}
    	aluno = aluno2;
    }
    
    public void printVetor() {
    	for (int i = 0; i < aluno.length; i++) {
			System.out.println(aluno[i]);
		}
    }
    
    public void removerAlunoMatricula(int matricula) {
    	for (int i = 0; i < aluno.length; i++) {
	    	String[] result = aluno[i].split(" ");
	    	if (Integer.valueOf(result[1]) == matricula) {

	    	}
    	}
    }
    
    public void  adicionarPrimeiro(String nome, int matricula, String curso) {
    	String novoAluno[] = new String[aluno.length];
    	
    	for (int i = 0; i < (aluno.length); i++) {
    		if(i == 0) {
    			novoAluno[i] = nome + matricula + curso;
    		}else {
    			novoAluno[i] = aluno[i -1];
    		}		
		}
    	aluno = novoAluno;
    }
    
    public void removerAluno(CharSequence matricula) {
    	String removerAluno[] = new String[aluno.length];
    	
    	for (int i = 0; i < aluno.length; i++) {
    		if (this.aluno[i] != null) {
    			if (!this.aluno[i].contains(matricula)) {
    				removerAluno[i] = aluno[i];
    			}
    		}
		}
    	aluno = removerAluno;
    }
}