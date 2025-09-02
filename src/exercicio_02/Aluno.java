package exercicio_02;

import java.util.Objects;

public class Aluno {
    private String nome;
    private int rm;
    private String curso;

    public Aluno(String nome, int rm, String curso) {
        this.nome = nome;
        this.rm = rm;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return String.format("RM: %d | Nome: %s | Curso: %s",rm,nome,curso);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Aluno aluno)) return false;
        return rm == aluno.rm;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rm);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
