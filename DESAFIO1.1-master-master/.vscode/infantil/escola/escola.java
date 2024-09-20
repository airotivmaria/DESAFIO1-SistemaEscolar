package infantil.escola;
import java.time.LocalDate;
import java.util.ArrayList;

public class escola {
    ArrayList<String> TurmaAlunos = new ArrayList<>();

    //ATRIBUTOS ALUNOS
    private static String nomeAluno;
    private String matricula;
    private LocalDate dataNascimento;
    private String nomeMae;
    
    //Getters and Setters Alunos
    public static String getNomeAluno() {
        return nomeAluno;
    }
    public void setNomeAluno(String nomeAluno) {
        escola.nomeAluno = nomeAluno;
        TurmaAlunos.add(nomeAluno);
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getNomeMae() {
        return nomeMae;
    }
    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

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

    //ATRIBUTOS DE TURMA
    private String codigoTurma;
    private static String nomeTurma;
    private int sala;
    private String horario;

    // GETTERS AND SETTERS DE TURMA
    public String getCodigoTurma() {
        return codigoTurma;
    }
    public void setCodigoTurma(String codigoTurma) {
        this.codigoTurma = codigoTurma;
    }
    public static String getNomeTurma() {
        return nomeTurma;
    }
    public void setNomeTurma(String nomeTurma) {
        escola.nomeTurma = nomeTurma;
        TurmaAlunos.add(nomeTurma);
    }
    public int getSala() {
        return sala;
    }
    public void setSala(int sala) {
        this.sala = sala;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
}
