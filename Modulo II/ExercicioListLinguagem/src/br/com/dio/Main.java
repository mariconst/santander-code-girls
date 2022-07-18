package br.com.dio;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        Ordem de Inserção
        Set<LinguagemFavorita> minhasLinguagens = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("PHP", 1995, "phpide"));
            add(new LinguagemFavorita("C#", 1988, "Netbeans"));
            add(new LinguagemFavorita("Java", 2002, "Eclipse"));
            add(new LinguagemFavorita("Pyton", 1840, "pytonedit"));
            add(new LinguagemFavorita("PHP", 1740, "aeroedit"));
        }};
        for (LinguagemFavorita linguagem : minhasLinguagens)
            System.out.println("Nome: " + linguagem.getNome() + " - Ano de crição: " + linguagem.getAnoDeCriacao() + " - IDE: " + linguagem.getIde());

        System.out.println("-- Ordem Natural (nome) --");
        Set<LinguagemFavorita> linguagemOrdem = new TreeSet<>(minhasLinguagens);
        for (LinguagemFavorita linguagem : linguagemOrdem)
            System.out.println("Nome: " + linguagem.getNome() + " - Ano de crição: " + linguagem.getAnoDeCriacao() + " - IDE: " + linguagem.getIde());

        System.out.println("--IDE --");
        Set<LinguagemFavorita> minhasLinguagem2 = new TreeSet<>(new ComparatorIde());
        minhasLinguagem2.addAll(minhasLinguagens);
        for (LinguagemFavorita linguagem : minhasLinguagem2)
            System.out.println("Nome: " + linguagem.getNome() + " - Ano de crição: " + linguagem.getAnoDeCriacao() + " - IDE: " + linguagem.getIde());

//
        System.out.println("-- Ano de criação e nome --");
        Set<LinguagemFavorita> minhasLinguagem3 = new TreeSet<>(new ComparatorAnoNome());
        minhasLinguagem3.addAll(minhasLinguagens);
        for (LinguagemFavorita linguagem : minhasLinguagem3)
            System.out.println("Nome: " + linguagem.getNome() + " - Ano de crição: " + linguagem.getAnoDeCriacao() + " - IDE: " + linguagem.getIde());

//
        System.out.println("-- Nome, ano de criacao e IDE --");
        Set<LinguagemFavorita> minhasLinguagem4 = new TreeSet<>(minhasLinguagens);
        minhasLinguagem4.addAll(minhasLinguagens);
        for (LinguagemFavorita linguagem : minhasLinguagem4)
            System.out.println("Nome: " + linguagem.getNome() + " - Ano de crição: " + linguagem.getAnoDeCriacao() + " - IDE: " + linguagem.getIde());

    }
}
