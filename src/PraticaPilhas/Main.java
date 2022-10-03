import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Agenda agenda = new Agenda(2);
        Scanner myObj = new Scanner(System.in);


        while (!agenda.maximo()){
            System.out.println("Digite o nome:");
            String nomeInput = myObj.next();
            System.out.println("Digite o telefone:");
            String telefoneInput = myObj.next();
            agenda.adiciona(String.valueOf(nomeInput), String.valueOf(telefoneInput));
        }

        System.out.println("Agenda cheia");
        if(agenda.maximo()){
           agenda.copyAgenda();
           agenda.remove();
           agenda.newAgenda();
        }

    }
}