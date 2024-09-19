package infantil.escola;


import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Alunos extends escola{

    public void cadastrar(){
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        do {
            System.out.print("Nome completo do Aluno: ");
            setNome(scanner.nextLine());
            try {
                if (getNome().length() >= 6 || getNome().length() < 150){
                    break;
                }
            } catch (Exception e) {
                System.out.println("O nome deve ser completo.");
            }
        } while (true);

        do {
            System.out.print("Matrícula do Aluno (6 números): ");
            setMatricula(scanner.nextLine());
            try {
                if (getMatricula().length() == 6){
                    break;
                }
            } catch (Exception e) {
                System.out.println("Quantidade de números da matrícula inválida");
            }
        } while (true);

        do {
            System.out.print("Data de nascimento (dd/mm/aaaa): ");
            String dataString = scanner.nextLine();
            try {
               // dataNascimento = LocalDateTime.parse(dataString, formatter);
                break;
            } catch (Exception e) {
                System.out.println("Data inválida. Por favor digite novamente no formato dd/mm/aaaa.");
            }
        } while (true);

    }
}


