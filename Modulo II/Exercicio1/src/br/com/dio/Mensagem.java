package br.com.dio;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;

public class Mensagem {

    public static String msg(){
        String saudacao;
        String hora = new SimpleDateFormat("H").format(Calendar.getInstance().getTime());
        int horaConvert = Integer.parseInt(hora);
        if (horaConvert >= 00 && horaConvert <= 11){
            saudacao = "Bom dia!";
        }else if (horaConvert >= 12 && horaConvert <= 17){
            saudacao = "Boa tarde!";
        }else{
            saudacao = "Boa noite!";
        }
        return saudacao;
    }
}
