package infantil.escola;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Alunos extends escola{

    //METÓDO DE CADASTRO DOS ALUNOS QUE É CHAMADO LÁ NA MAIN
    public void cadastrar(){
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        do {
            System.out.print("Nome completo do Aluno: ");
            setNomeAluno(scanner.nextLine());
            try {
                if (getNomeAluno().length() >= 6 && getNomeAluno().length() < 150){
                    break;
                } else {
                    System.out.println("O nome deve ser completo");
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
                } else {
                    System.out.println("Quantidade de números da matrícula inválida");
                }
            } catch (Exception e) {
                System.out.println("Quantidade de números da matrícula inválida");
            }
        } while (true);

        do {
            System.out.print("Data de nascimento (dd/mm/aaaa): ");
            String dataString = scanner.nextLine();
            try {
               LocalDate dataNascimento = LocalDate.parse(dataString, formatter);
               if (dataNascimento.isAfter(LocalDate.now())){
                    System.out.println("Digite uma data válida, data de nascimento não pode ser futura.");
               } else {
                    break;
               }
            } catch (Exception e) {
                System.out.println("Data inválida. Por favor digite novamente no formato dd/mm/aaaa.");
            }
        } while (true);
        do {
            System.out.print("Nome da mãe: ");
            setNomeMae(scanner.nextLine());
            try {
                if (getNomeMae().length() >= 6 && getNomeMae().length() < 150){
                    break;
                } else {
                    System.out.println("O nome deve ser completo.");
                }
            } catch (Exception e) {
                System.out.println("O nome deve ser completo.");
            }
        } while (true);

    }
    @Override
    public String toString() {
        return "Aluno= " + getNomeAluno() +
                ", matricula= " + getMatricula() + ", turma= " + getNomeTurma();
    }
}


