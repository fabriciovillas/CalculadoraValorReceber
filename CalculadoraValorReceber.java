import java.util.Scanner;

public class CalculadoraValorReceber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do professor: ");
        String nomeProfessor = scanner.nextLine();

        System.out.print("Digite o regime de pagamento (CLT, Horista ou PJ): ");
        String regimePagamento = scanner.nextLine();

        double valorReceber = 0.0;

        switch (regimePagamento.toUpperCase()) {
            case "CLT":
                System.out.print("Digite o salário mensal do professor: ");
                double salarioMensal = scanner.nextDouble();
                valorReceber = salarioMensal;
                break;
            case "HORISTA":
                System.out.print("Digite o número de horas trabalhadas pelo professor: ");
                double horasTrabalhadas = scanner.nextDouble();

                System.out.print("Digite o valor da hora de trabalho: ");
                double valorHoraTrabalho = scanner.nextDouble();

                valorReceber = horasTrabalhadas * valorHoraTrabalho;
                break;
            case "PJ":
                System.out.print("Digite o valor do contrato do professor: ");
                double valorContrato = scanner.nextDouble();
                valorReceber = valorContrato;
                break;
            default:
                System.out.println("Regime de pagamento inválido!");
                System.exit(0);
        }

        System.out.println("Nome do professor: " + nomeProfessor);
        
        System.out.println("Valor a receber: " + valorReceber);
        scanner.close();
    }
}
