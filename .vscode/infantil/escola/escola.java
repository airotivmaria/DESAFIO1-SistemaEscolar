package infantil.escola;
import java.time.LocalDateTime;

public class escola {
    private String nome;
    private String matricula;
    private String dataNascimento;
    private String nomeMae;
    
    //Getters and Setters Alunos
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        
        this.dataNascimento = dataNascimento;
    }
    public String getNomeMae() {
        return nomeMae;
    }
    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

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
}
