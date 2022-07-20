package br.com.dio;


import java.util.*;

public class Main {

    public static void main(String[] args) {
/*Estado = PE - População = 9.616.621
Estado = AL - População = 3.351.543
Estado = CE - População = 9.187.103
Estado = RN - População = 3.534.265*/

//        Crie um dicionário e relacione os estados e suas populações;
        Map<String, Integer> meusEstados = new LinkedHashMap<>(){{
            put("PE",9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
       System.out.println(meusEstados);

        System.out.println("Substitua a população do estado do RN por 3.534.165;");
        meusEstados.put("RN", 3534165);
        System.out.println(meusEstados);

        System.out.println("Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;");
        if(!meusEstados.containsKey("PB")){
            System.out.println("PB adicionado!");
            meusEstados.put("PB", 4039277);
        }else {
            System.out.println("PB Já está no dicionário.");
        }
        System.out.println(meusEstados);
//
        System.out.println("Exiba a população PE;");
        System.out.println(meusEstados.get("PE"));

        System.out.println("Exiba todos os estados e suas populações na ordem que foi informado;");
        System.out.println(meusEstados);

        System.out.println("Exiba os estados e suas populações em ordem alfabética;");
        Map<String, Integer> meusEstadosOrdem = new TreeMap<>(meusEstados);

        System.out.println(meusEstadosOrdem);

//
//        Exiba o estado com o menor população e sua quantidade;
//        Exiba o estado com a maior população e sua quantidade;
        Collection<Integer> populacao = meusEstados.values();
        String estadoMaiorPopulacao = "";
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry : meusEstados.entrySet()) {
            if (entry.getValue().equals(Collections.max(populacao))) estadoMaiorPopulacao = entry.getKey();
            if (entry.getValue().equals(Collections.min(populacao))) estadoMenorPopulacao = entry.getKey();
        }
        System.out.printf("Exiba o estado com o menor população (%s) e seu respectivo valor (%d)\n",
                estadoMenorPopulacao, Collections.min(populacao));

        System.out.printf("Exiba o estado com a maior população (%s) e seu respectivo valor (%d)\n",
                estadoMaiorPopulacao, Collections.max(populacao));

//

        int soma = 0;
        Iterator<Integer> iterator = meusEstados.values().iterator();
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma da população desses estados; " + soma);
        System.out.println("Exiba a média da população deste dicionário de estados " + soma/meusEstados.size());

//        Remova os estados com a população menor que 4.000.000;
        Iterator<Integer> iterator2 = meusEstados.values().iterator();
        while (iterator2.hasNext()){
            if (iterator2.next() <=4000000) iterator2.remove();
        }
        System.out.println(meusEstados);
        System.out.printf("Apague o dicionário de estados;");
        meusEstados.clear();
        System.out.println(meusEstados);
        System.out.printf("Confira se o dicionário está vazio: " + meusEstados.isEmpty());

    }
}


