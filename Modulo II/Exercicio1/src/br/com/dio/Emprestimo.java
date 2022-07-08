package br.com.dio;

public class Emprestimo {

    public static double calcular(double valor, double taxa, int parcelas, int tipoJuros){
        //juros simples
        if (tipoJuros == 1){
            double total;
            total = valor * taxa * parcelas;
            return total;
        } else if (tipoJuros == 2) {
            double total = valor;
            while (parcelas > 0){
                total += total * taxa;
                parcelas--;
            }
            return total;
        }
        return 0;
    }

}
