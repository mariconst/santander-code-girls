package br.com.dio;

import java.util.Objects;

public class Arcoires implements Comparable<Arcoires>{
    public Arcoires(String cor) {
        this.cor = cor;
    }
    private String cor;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "{" +
                "cor='" + cor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Arcoires arcoires = (Arcoires) o;
        return Objects.equals(cor, arcoires.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cor);
    }


    @Override
    public int compareTo(Arcoires arcoires) {
        return this.getCor().compareTo(arcoires.getCor());
    }
}
