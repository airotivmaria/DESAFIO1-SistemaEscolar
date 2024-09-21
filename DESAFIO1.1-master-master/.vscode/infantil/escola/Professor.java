package infantil.escola;

import java.util.ArrayList;
import java.util.Scanner;

public class Professor {

    //ATRIBUTOS PROFESSOR
    private String grauInstrucao;
    private String matriculaProfessor;
    private String nomeProfessor;
    private double salario;
    
    //Getters e setters Professor
    public String getGrauInstrucao() {
        return grauInstrucao;
    }
    public void setGrauInstrucao(String grauInstrucao) {
        this.grauInstrucao = grauInstrucao;
    }
    public String getMatriculaProfessor() {
        return matriculaProfessor;
    }
    public void setMatriculaProfessor(String matriculaProfessor) {
        this.matriculaProfessor = matriculaProfessor;
    }
    public String getNomeProfessor() {
        return nomeProfessor;
    }
    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    private ArrayList<pagamento> pagamentos = new ArrayList<>();
    public ArrayList<pagamento> getPagamentos() {
        return pagamentos;
    }
    public void pagamentoProfessor(ArrayList<Professor> professores){
        for (Professor professor : professores){
            pagamento pagamento = new pagamento(professor.getNomeProfessor(), professor.getSalario());
            pagamentos.add(pagamento);

            System.out.println("Professor: " + pagamento.getNomeProfessor() + ", salário: R$ " + pagamento.getSalario());
        }
    }
    public class pagamento {
        private String nomeProfessor;
        private double salario;
    
        public pagamento(String nomeProfessor, double salario) {
            this.nomeProfessor = nomeProfessor;
            this.salario = salario;
        }
    
        public String getNomeProfessor() {
            return nomeProfessor;
        }
    
        public double getSalario() {
            return salario;
        }
}


//MÉTODO DE CADASTRO DE PROFESSORES QUE É CHAMADO LÁ NA MAIN
public void cadastrarProfessor() {
    Scanner scanner = new Scanner(System.in);
    
    do {
        System.out.print("Qual o grau de instrução? [Estagiario/Bacharelado/Mestrado/Doutorado] ");
        setGrauInstrucao(scanner.nextLine().toLowerCase());
        try {
            if (getGrauInstrucao().equals("bacharelado") || getGrauInstrucao().equals("estagiario") || getGrauInstrucao().equals("mestrado") || getGrauInstrucao().equals("doutorado")){
                break;
            } else {
                System.out.println("Grau de instrução inválido");
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
            } else {
                System.out.println("Quantidade de números da matrícula inválida");
            }
        } catch (Exception e) {
            System.out.println("Quantidade de números da matrícula inválida");
        }
    } while (true);

    do {
        System.out.print("Nome do professor: ");
        setNomeProfessor(scanner.nextLine());
        try {
            if(getNomeProfessor().length() >= 6 && getNomeProfessor().length() < 150){
                break;
            } else {
                System.out.println("O nome deve ser completo.");
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
            } else {
                System.out.println("Digite apenas números positivos.");
            }
        } catch (Exception e) {
            System.out.println("Digite apenas números e números positivos.");
        }
    } while(true);
}  
    @Override
    public String toString() {
        return "Professor= " + getNomeProfessor() +
                ", matricula= " + getMatriculaProfessor();
    }

}
