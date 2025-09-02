package exercicio_01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Candidato> candidatos = new ArrayList<>();

        candidatos.add(new Candidato("Rafael",8.19,3));
        candidatos.add(new Candidato("Renato",6.34,2));
        candidatos.add(new Candidato("Rafaela",8.19,5));
        candidatos.add(new Candidato("Andre",2.50,10));
        candidatos.add(new Candidato("Reinaldo",8.19,3));

        //candidatos.sort(Comparator.comparing(Candidato :: getNota).thenComparing(Candidato::getAnosExperiencia).reversed().thenComparing(Candidato :: getNome));

        Comparator<Candidato> criterio = Comparator.comparing(Candidato :: getNota)
                .thenComparing(Candidato :: getAnosExperiencia).reversed()
                .thenComparing(Candidato ::  getNome);

        candidatos.sort(criterio);

        candidatos.forEach(c -> System.out.println(c));
    }
}
