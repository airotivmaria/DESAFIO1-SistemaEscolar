package infantil.escola;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Turma extends escola {

    public void cadastrarTurma() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Cadastre o código da turma (3 números): ");
            setCodigoTurma(scanner.nextLine());
            try {
                if (getCodigoTurma().length() == 3){
                    break;
                } else {
                    System.out.println("Digite os 3 números.");
                }
            } catch (Exception e) {
                System.out.println("Digite apenas 3 números.");
            }
        } while (true);
        do {
            System.out.print("Nome da turma [A] [B] [C]: ");
            setNomeTurma(scanner.nextLine());
            try {
                if (getNomeTurma().equals("A") || getNomeTurma().equals("B") || getNomeTurma().equals("C")){
                    break;
                } else {
                    System.out.println("O nome da turma deve ser A, B ou C");
                }
            } catch (Exception e) {
                System.out.println("O nome da turma deve ser A, B ou C");
            }
        } while (true);
        do {
            System.out.print("Qual a sala da turma (num de 1 a 10): ");
            setSala(scanner.nextInt());
            try {
                if(getSala() > 0 && getSala() < 10){
                    break;
                } else {
                    System.out.println("A sala da turma deve ser entre 1 a 10.");
                }
            } catch (Exception e) {
                System.out.println("A sala da turma deve ser entre 1 a 10.");
            }
        } while (true);
        do {
            System.out.print("Qual o horário da turma [Manhã] [Tarde]: ");
            setHorario(scanner.nextLine().toLowerCase());
            try {
                if(!(getHorario().equals("manhã") || getHorario().equals("tarde"))){
                    break;
                } else {
                    System.out.println("O horário deve ser 'manhã' ou 'tarde'");
                }
            } catch (Exception e) {
                System.out.println("O horário deve ser 'manhã' ou 'tarde'");
            }
        } while (true);
    }
}
