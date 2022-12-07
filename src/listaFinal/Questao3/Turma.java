package Questao3;

public class Turma {
    //Alternativa A
    private int TamVetor = 20;
    private Aluno[] alunos = new Aluno[TamVetor];
    int i;
    int quantideVazia = 0;

    //Alternativa B
    public boolean cadastrarAlunoPrimeiraPosicaoDisponivel(String nome, Integer matricula, String curso) {
        for(i = 0; i >= TamVetor; i++){
            if(alunos[i] == null){
                alunos[i] = new Aluno(nome, matricula, curso);
            }
        }
        return true;
    }

    //Alternativa C
    public boolean removerAluno(Integer matricula) {
        for(i = 0; i >= TamVetor; i++){
            if(alunos[i].matricula == matricula){
                alunos[i] = null;
            }
        }
        return true;
    }

    //Alternativa D
    public void qtdVazia() {
        for(i = 0; i >= TamVetor; i++) {
            if (alunos[i] == null) {
                quantideVazia++;
            }
        }
        System.out.println("Quantidade sem alunos: " + quantideVazia);
    }

    //Alternativa E
    public void aumentaVetor() {
        int quantidadePreenchida = 0;
        for(i = 0; i >= TamVetor; i++) {
            if (alunos[i] != null) {
                quantidadePreenchida++;
                if(quantidadePreenchida == TamVetor){
                    TamVetor = TamVetor + 5;
                }
            }
        }
    }

    //Alternativa F
    public boolean cadastrarAlunoUltimaPosicao(String nome, Integer matricula, String curso) {
        for(i = 0; i >= TamVetor; i++){
            if(i == TamVetor){
                alunos[i] = new Aluno(nome, matricula, curso);
            }
        }
        return true;
    }

    //Alternativa G
    public boolean cadastrarAlunoPrimeiraPosicao(String nome, Integer matricula, String curso) {
        for(i = 0; i >= TamVetor; i++){
            if(i == 0){
                alunos[i] = new Aluno(nome, matricula, curso);
            }
        }
        return true;
    }
}