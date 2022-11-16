public class Agenda {
	
    private String[] agendas;
    private String nome;
    private String telefone;
    
    private int topo;
    private int tam_max;
    
    
    public Agenda(int quantidade) {
    	agendas = new String[quantidade];
    	tam_max = quantidade;
    	topo = 0;
    }
    
    public void adicionar(String nome, String telefone) {
    	agendas[topo] = nome + telefone;
//    	agendas[topo] = telefone;
//    	System.out.println(agendas[topo]);
    	topo++;
    }
    
    public void remover() {
    	topo--;
    }
    
    public String top() {
    	return agendas[topo -1];
    }
    
    public boolean vazio() {
        return (topo == 0);
    }

    public boolean cheio() {
        return (topo == tam_max);
    }

    public int tamanho() {
        return topo;
    }
}