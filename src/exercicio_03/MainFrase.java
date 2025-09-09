package exercicio_03;

import java.util.*;

public class MainFrase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;

        Map<Character, Integer> contador = new HashMap<>();

        System.out.print("Digite uma frase:");
        frase = sc.nextLine();
        //Que o silêncio das notificações do teu Whatsapp seja o teu maior tormento

        for(char c : frase.toLowerCase().toCharArray()){

            if(Character.isLetter(c)){
                /*int valor = contador.get(c);
                System.out.println(valor);*/
                contador.put(c,contador.getOrDefault(c,0)+1);
            }
        }

        //impressão em ordem alfabética
        Set<Character> chave = contador.keySet();
        TreeSet<Character> arvore = new TreeSet<>(chave);

        for(char c : arvore){
            System.out.println(c + " --> " + contador.get(c));
        }

        sc.close();
    }
}
