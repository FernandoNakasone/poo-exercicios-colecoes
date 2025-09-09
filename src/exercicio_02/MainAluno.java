package exercicio_02;

import java.util.HashSet;
import java.util.Set;

public class MainAluno {
    public static void main(String[] args) {
        Set<Aluno> turmaBD = new HashSet<>();

        turmaBD.add(new Aluno("Rafael",123456,"Banco de dados"));
        turmaBD.add(new Aluno("Renata",663757,"Banco de dados"));
        turmaBD.add(new Aluno("Andre",663887,"Banco de dados"));
        turmaBD.add(new Aluno("Andre",663887,"Banco de dados"));

        Set<Aluno> turmaED = new HashSet<>();
        turmaED.add(new Aluno("Rafael",123456,"Estruturas de dados"));
        turmaED.add(new Aluno("Rafaela",123457,"Estruturas de dados"));
        turmaED.add(new Aluno("Renato",123757,"Estruturas de dados"));


        System.out.println("Lista de todos os alunos matriculados");
        Set<Aluno> uniao = new HashSet<>(turmaBD);
        uniao.addAll(turmaED);
        //turmaBD.forEach(a -> System.out.println(a));
        uniao.forEach(a -> System.out.println(a));

        System.out.println("\nLista dos alunos matriculados em banco de dados");
        Set<Aluno> soBD = new HashSet<>(turmaBD);
        soBD.removeAll(turmaED);
        soBD.forEach(a -> System.out.println(a));

        System.out.println("\nLista dos alunos matriculados em ambas");
        Set<Aluno> ambos = new HashSet<>(turmaBD);
        ambos.retainAll(turmaED);
        //ambos.forEach(a -> System.out.println(a));
        ambos.forEach(System.out :: println);
    }
}
