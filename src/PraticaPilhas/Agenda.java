public class Agenda {
    private String[] agendaList;
    private int topo;
    private int tamanhoMax;

    private String[] newAgendaList;


    public Agenda(int quantidade) {
        agendaList = new String[quantidade];
        tamanhoMax = quantidade;
        topo = 0;
    }

    public void adiciona(String nome, String telefone) {
        agendaList[topo] = nome + telefone;
        topo++;
    }

    public void remove() {
        topo--;
    }
    public String[] retorna() {
        return this.agendaList;
    }

    public String top() {
        return agendaList[topo -1];
    }

    public boolean maximo() {
        return (topo == tamanhoMax);
    }

    public int tamanho() {
        return topo;
    }
    public int newQuantidade() {
        return (tamanhoMax * 2);
    }

    public void copyAgenda() {
        newAgendaList = new String[newQuantidade()];
        for(int i = 0; i < tamanhoMax; i++ ){
            newAgendaList[i] = agendaList[i];
        }
    }
    public void newAgenda() {
        agendaList = new String[newQuantidade()];
        for(int i = 0; i < tamanhoMax; i++ ){
            agendaList[i] = newAgendaList[i];
        }
        newAgendaList = null;
    }
}
