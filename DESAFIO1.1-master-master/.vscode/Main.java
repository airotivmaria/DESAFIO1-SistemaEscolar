import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import infantil.escola.Alunos;
import infantil.escola.Professor;
import infantil.escola.Turma;
import infantil.escola.escola;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Alunos> alunos = new ArrayList<>();
        ArrayList<Professor> professores = new ArrayList<>();
        ArrayList<Turma> turmas = new ArrayList<>();
        ArrayList<escola> TurmaAlunos = new ArrayList<>();

        while (true) {
            mostrarMenu();
        String menuOpcao = scanner.nextLine();

        switch (menuOpcao) {
            case "1":
                cadastrarAluno(alunos);
                System.out.println("Aluno cadastrado com sucesso.");
                break;
            case "2":
                cadastrarProfessor(professores);
                System.out.println("Professor cadastrado com sucesso.");
                break;
            case "3":
                cadastrarTurma(turmas);
                break;
            case "4":
                relatorios();
                menuOpcao = scanner.nextLine();
                if (menuOpcao == "1") {
                        System.out.print("Qual a turma: ");
                        String opcaoTurma = scanner.nextLine().toUpperCase();
                        if (opcaoTurma == "A"){
                            System.out.println("***Materiais Turma A***");
                            materaisTurmaA(scanner);
                        } else if (opcaoTurma == "B") {
                            System.out.println("***Materiais Turma B***");
                            materiaisTurmaB();
                        } else if (opcaoTurma == "C") {
                            System.out.println("***Materiais Turma C***");
                            materiaisTurmaC();
                        } else {
                            System.out.println("Turma inválida");
                            break;
                    }} else if (menuOpcao == "2"){
                        System.out.println("Qual a turma: ");
                        String nomeTurma = scanner.nextLine();
                        listarAlunos(TurmaAlunos, nomeTurma);
                        break;
                    } else if (menuOpcao == "3"){
                        listarProfessor(professores);
                    } else
                break;
            case "5":
                return;

            default:
            System.out.println("Opção inválida.");
                break;
            }
        }

    }

    private static void mostrarMenu() {
        String menu = """
                **********************
                1 - Cadastrar aluno
                2 - Cadastrar professor
                3 - Cadastrar turma
                4 - Relatórios
                5 - Sair
                **********************
                """;
        System.out.println(menu);
    }

    private static void cadastrarAluno(ArrayList<Alunos> alunos) {
        Alunos aluno = new Alunos();
        aluno.cadastrar();
        alunos.add(aluno);
    }

    private static void cadastrarProfessor(ArrayList<Professor> professores) {
        Professor professor = new Professor();
        professor.cadastrarProfessor();
        professores.add(professor);
    }

    private static void cadastrarTurma(ArrayList<Turma> turmas) {
        Turma turma = new Turma();
        turma.cadastrarTurma();
        turmas.add(turma);
    }

    private static void relatorios() {
        String menu2 = """
                1 - Materiais que devem ser entreguem para os alunos
                2 - Listagem alunos
                3 - Listagem professores
                4 - Folha de pagamento
                """;
        System.out.println(menu2);
    }

    private static void materaisTurmaA(Scanner scanner) {
        // TURMA A
        List<String> materialTurmaA = new ArrayList<>();
        List<String> materiaisA = List.of("Caderno", "Lapís", "Garrafa de água", "Agenda");
        materialTurmaA.addAll(materiaisA);
        for (String material : materialTurmaA) {
            System.out.println("-" + material);
        }
    }

    private static void materiaisTurmaB() {
        // TURMA B
        List<String> materialTurmaB = new ArrayList<>();
        List<String> materiaisB = List.of("Fichário", "Caneta", "Mochila", "Estojo");
        materiaisB.addAll(materiaisB);
        for (String material : materialTurmaB) {
            System.out.println("-" + material);
        }
    }

    private static void materiaisTurmaC() {
        // TURMA C
        List<String> materialTurmaC = new ArrayList<>();
        List<String> materiaisC = List.of("Livro", "Lapiseira", "Lancheira", "Avental de pintura");
        materiaisC.addAll(materiaisC);
        for (String material : materialTurmaC) {
            System.out.println("-" + material);
        }
    }

    private static void listarAlunos(ArrayList<escola> TurmaAlunos, String nomeTurma) {
        for (escola aluno : TurmaAlunos) {
            if (escola.getNomeTurma().equals(nomeTurma.toUpperCase())){
                System.out.println(escola.getNomeAluno());
            }
            System.out.println(aluno);
        }
    }

    private static void listarProfessor(ArrayList<Professor> professores){
        for (Professor professor : professores){
            System.out.println("-" + professor);
        }
    }
}
