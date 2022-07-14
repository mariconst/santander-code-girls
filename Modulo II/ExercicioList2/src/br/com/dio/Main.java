package br.com.dio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> respostas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Telefonou para a vítima? s/n");
        respostas.add(scanner.next());
        System.out.println("Esteve no local do crime? s/n");
        respostas.add(scanner.next());
        System.out.println("Mora perto da vítima? s/n");
        respostas.add(scanner.next());
        System.out.println("Devia para a vítima? s/n");
        respostas.add(scanner.next());
        System.out.println("Já trabalhou com a vítima? s/n");
        respostas.add(scanner.next());

        Iterator<String> iterator = respostas.iterator();
        int count = 0;
        int i = 0;
        while (iterator.hasNext()){
            String auxiliar = iterator.next();
            switch (auxiliar){
                case "s":
                    count += 1;
            }
            i++;
        }
        System.out.println(count);
        if(count == 2){
            System.out.println("Suspeito.");
        }else if(count == 3 || count == 4){
            System.out.println("Cúmplice.");
        }else if (count == 5){
            System.out.println("Assassino.");
        }else {
            System.out.println("Limpo.");
        }
    }
}
