package br.com.dio;


import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Exiba todas as cores uma abaixo da outra
        Set<Arcoires> meuArcoires = new LinkedHashSet<>(){{
            add(new Arcoires("vermelha"));
            add(new Arcoires("laranja"));
            add(new Arcoires("amarela"));
            add(new Arcoires("verde"));
            add(new Arcoires("azul"));
            add(new Arcoires("azul-escuro"));
            add(new Arcoires("violeta"));
        }};
        for (Arcoires arcoires: meuArcoires) System.out.println(arcoires.getCor());
//
//        A quantidade de cores que o arco-íris tem
        System.out.println("O arco-íres possui " + meuArcoires.size() + " cores.");
//
        System.out.println("--Exiba as cores em ordem alfabética--");
        Set<Arcoires> arcoiresOrdem = new TreeSet<>(meuArcoires);
        for (Arcoires arcoires: arcoiresOrdem) System.out.println(arcoires.getCor());
//
        System.out.println("--Exiba as cores na ordem inversa da que foi informada--");
        ArrayList<Arcoires> arcoiresInverse = new ArrayList<>(meuArcoires);
        Collections.reverse(arcoiresInverse);
        for (Arcoires arcoires: arcoiresInverse) System.out.println(arcoires.getCor());

        System.out.println("--Exiba todas as cores que começam com a letra ”v”--");
        for (Arcoires arcoiresV : meuArcoires) {
            if (Character.toString(arcoiresV.getCor().charAt(0)).equals("v")){
                System.out.println(arcoiresV.getCor());
            }
        }
        System.out.println("--Remova todas as cores que não começam com a letra “v”--");
        Iterator<Arcoires> iterator = meuArcoires.iterator();
        while (iterator.hasNext()){
            Arcoires cor = iterator.next();
            if (!Character.toString(cor.getCor().charAt(0)).equals("v")){
                iterator.remove();
            }
        }
        for (Arcoires arcoires: meuArcoires) System.out.println(arcoires.getCor());
//
//        Limpe o conjunto
        meuArcoires.clear();
        System.out.println("--Confira se o conjunto está vazio--\n" + meuArcoires.isEmpty());
    }
}
