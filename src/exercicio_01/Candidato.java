package exercicio_01;

public class Candidato {
    private String nome;
    private double nota;
    private int anosExperiencia;

    public Candidato(String nome, double nota, int anosExperiencia) {
        this.nome = nome;
        this.nota = nota;
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | Nota técnica: %.2f | Anos de experiência: %d",nome,nota,anosExperiencia);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
}
