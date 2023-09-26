import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual seu nome? ");
        String nome = sc.nextLine();
        System.out.print("Qual seu peso? ");
        double peso = sc.nextDouble();
        System.out.print("Qual sua altura? ");
        double altura = sc.nextDouble();
        System.out.print("Nome do seu médico? ");
        sc.nextLine();
        String nomeMedico = sc.nextLine();
        Paciente paciente = new Paciente(nome, peso, altura, nomeMedico);

        System.out.println();
        System.out.println("Dados do paciente: ");
        System.out.println("Nome: " + paciente.getNome());
        System.out.println("Peso: " + paciente.getPeso());
        System.out.println("Altura: " + paciente.getAltura());
        System.out.println("Médico: " + paciente.getNomeMedico());
        System.out.print("Seu ICM é de: ");
        System.out.println(String.format("%.2f ", new Object[]{paciente.calculoIcm()}));

        double icm = paciente.calculoIcm();
        if (icm < 18.5){
            System.out.println("Você esta abaixo do peso");
        }
        else if(icm >= 18.5 && icm <= 25) {
            System.out.println("Parabens! Você está no peso ideal!");
        }
        else {
            System.out.println("Você está acima do peso!!");
        }
    }
}

