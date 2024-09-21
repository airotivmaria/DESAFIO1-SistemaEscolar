import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import infantil.escola.Alunos;
import infantil.escola.Professor;
import infantil.escola.Turma;
import infantil.escola.Professor.pagamento;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Professor professor = new Professor();
        ArrayList<Alunos> alunos = new ArrayList<>();
        ArrayList<Professor> professores = new ArrayList<>();
        ArrayList<Turma> turmas = new ArrayList<>();
        ArrayList<pagamento> pagamentos = professor.getPagamentos();
        professor.pagamentoProfessor(professores);

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
                System.out.println("Turma cadastrada com sucesso.");
                break;
            case "4":
                relatorios();
                System.out.print("Sua escolha: ");
                String menuOpcao2 = scanner.nextLine();
                switch (menuOpcao2) {
                    case "1":
                    System.out.print("Qual a turma: ");
                    String opcaoTurma = scanner.nextLine().toUpperCase();
                        switch (opcaoTurma){
                            case "A":
                                System.out.println("***Materiais Turma A***");
                                materaisTurmaA();
                                continue;
                            case "B":
                                System.out.println("***Materiais Turma B***");
                                materiaisTurmaB();
                                continue;
                            case "C":
                                System.out.println("***Materiais Turma C***");
                                materiaisTurmaC();
                                continue;
                            default:
                                System.out.println("Turma inválida");
                                continue;}
                    case "2":
                        System.out.print("Qual a turma: ");
                        String nomeTurma = scanner.nextLine();
                        listarAlunos(alunos, nomeTurma);
                        continue;
                    case "3":
                        listarProfessor(professores);
                        continue;
                    case "4":
                        if(professores.size() != 0){
                            professor.pagamentoProfessor(professores);
                        } else {
                            System.out.println("É preciso cadastrar um professor primeiro.");
                        }
                        continue;
                    default:
                        System.out.println("Opção inválida");
                        continue;
                }
            case "5":
                System.out.println("Até a próxima!");
                return;
            default:
            System.out.println("Opção inválida.");
                break;
            }
        }
    }

    //MENU INICIAL
    private static void mostrarMenu() {
        String menu = """
                \n**********************
                1 - Cadastrar aluno
                2 - Cadastrar professor
                3 - Cadastrar turma
                4 - Relatórios
                5 - Sair
                **********************
                """;
        System.out.println(menu);
    }

    // FUNÇÕES DE TODA PARTE DE CADASTRO, PUXA MÉTODOS DAS CLASSES ALUNOS, PROFESSORES E TURMAS
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

    //MENU 2 DOS RELATÓRIOS DISPONÍVEIS
    private static void relatorios() {
        String menu2 = """
                1 - Materiais que devem ser entreguem para os alunos
                2 - Listagem alunos
                3 - Listagem professores
                4 - Folha de pagamento
                """;
        System.out.println(menu2);
    }

    //FUNÇÕES DOS MATERIAIS NECESSÁRIOS POR TURMA
    private static void materaisTurmaA() {
        // TURMA A
        List<String> materialTurmaA = new ArrayList<>();
        List<String> materiaisA = List.of("Caderno", "Lapís", "Garrafa de água", "Agenda");
        materialTurmaA.addAll(materiaisA);
        for (String material : materialTurmaA) {
            System.out.println("-" + material);
        }
        return;
    }
    private static void materiaisTurmaB() {
        // TURMA B
        List<String> materialTurmaB = new ArrayList<>();
        List<String> materiaisB = List.of("Fichário", "Caneta", "Mochila", "Estojo");
        materialTurmaB.addAll(materiaisB);
        for (String material : materialTurmaB) {
            System.out.println("-" + material);
        }
    }
    private static void materiaisTurmaC() {
        // TURMA C
        List<String> materiaisTurmaC = new ArrayList<>();
        List<String> materiaisC = List.of("Livro", "Lapiseira", "Lancheira", "Avental de pintura");
        materiaisTurmaC.addAll(materiaisC);
        for (String material : materiaisC) {
            System.out.println("-" + material);
        }
    }

    //LISTA OS ALUNOS CADASTRADOS
    private static void listarAlunos(ArrayList<Alunos> alunos, String nomeTurma) {
        try {
            if (alunos.size() != 0){
                for (Alunos aluno : alunos) {
                    if (Alunos.getNomeTurma().contains(nomeTurma)){
                        System.out.println(aluno);
                    }
                }
            }else{
                System.out.println("A lista de Alunos, está vazia. Cadastre primeiro.");
            }
        } catch (Exception e) {
            System.out.println("É necessário cadastrar a turma primeiro.");
        }
    }

    //LISTA OS PROFESSORES CADASTRADOS
    private static void listarProfessor(ArrayList<Professor> professores){
        if (professores.size() != 0) {
            for (Professor professor : professores) {
                System.out.println("-" + professor);
            }
        } else {
            System.out.println("A lista de professores, está vazia. Cadastre primeiro.");
        }
        
    }

}

