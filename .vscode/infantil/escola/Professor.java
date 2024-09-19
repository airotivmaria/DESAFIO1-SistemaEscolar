package infantil.escola;

import java.util.Scanner;

public class Professor extends escola {

    public void cadastrarProfessor() {
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.print("Qual o grau de instrução? [Estagiario/Bacharelado/Mestrado/Doutorado] ");
            setGrauInstrucao(scanner.nextLine().toLowerCase());
            try {
                if (getGrauInstrucao().equals("bacharelado") || getGrauInstrucao().equals("estagiario") || getGrauInstrucao().equals("mestrado") || getGrauInstrucao().equals("doutorado")){
                    break;
                }
            } catch (Exception e) {
                System.out.println("Grau de instrução inválido");
            }
        } while (true);

        do {
            System.out.print("Matrícula do professor (6 números): ");
            setMatriculaProfessor(scanner.nextLine());
            try {
                if (getMatriculaProfessor().length() == 6){
                    break;
                }
            } catch (Exception e) {
                System.out.println("Quantidade de números da matrícula inválida");
            }
        } while (true);

        do {
            System.out.print("Nome do professor: ");
            setNomeProfessor(scanner.nextLine());
            try {
                if(getNomeProfessor().length() >= 6 || getNomeProfessor().length() < 150){
                    break;
                }
            } catch (Exception e) {
                System.out.println("O nome deve ser completo.");
            }
        } while (true);

        do {
            System.out.print("Salário base: ");
            setSalario(scanner.nextDouble());
            try {
                if (getSalario() > 0){
                    break;
                }
            } catch (Exception e) {
                System.out.println("Digite apenas números positivos.");
            }
        } while(true);
    }
}
