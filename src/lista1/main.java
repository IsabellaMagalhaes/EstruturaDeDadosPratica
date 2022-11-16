public class main {

	public static void main(String[] args) {
		Agenda a = new Agenda(4);
		if (!a.cheio()) {
			a.adicionar("Ana", "(31) 786747654");
		} else {
			System.out.println("Agenda cheia");
		}
		
		if (!a.cheio()) {
			a.adicionar("Mariana", "(31) 9987653214");
		} else {
			System.out.println("Agenda cheia");
		}
		
		if (!a.cheio()) {
			a.adicionar("Isa", "(31) 993451276");
		} else {
			System.out.println("Agenda cheia");
		}
		
		System.out.println(a.top());
		a.remover();
		System.out.println(a.top());
		System.out.println(a.tamanho());

	}

}
