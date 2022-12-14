package main.java.com.triagem.calc;

import main.controller.GeralController;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.text.DecimalFormat;

public class CALC {
    static int z=0;

    public static void main(String[] args) throws InterruptedException, AWTException {
        GeralController teste = new GeralController();
        teste.GERALCALC();

    }
    public static void calc(double utilizar, float valor, float n_indice, int i){
        String teste="311.82,339.36,339.36,339.36,339.36,339.36,678.72, 452.47, 339.36, 364.23, 364.23, 364.23, 364.23, 364.23, 364.23, 364.23, 364.23, 364.23, 849.86, 364.23, 364.23, 364.23, 364.23, 416.53, 416.53, 416.53,416.53, 431.50, 431.50, 431.50, 863.00, 575.32, 431.50, 431.50, 431.50, 431.50, 194.18, 477.42, 477.42, 477.42, 477.42, 477.42, 954.84, 477.42, 477.42, 494.61, 494.61,494.61, 494.61, 938.80, 704.12,704.12, 704.12, 704.12, 1408.24, 704.12, 729.47,729.47, 729.47, 729.47, 972.60, 729.47, 729.47, 755.73, 755.73, 755.73, 1511.46, 755.73,755.73, 755.73, 1007.61,755.73,755.73, 755.73, 755.73, 755.73, 730.53, 26.07, 782.95, 1826.86,846.50,846.50,888.82,888.82,888.82,888.82,888.82,888.82,888.82,888.82,888.82,1777.64,1039.22,1039.22,747.01,747.01,747.01,747.01, 747.01,747.01, 747.01, 448.21";
        List<String> VALOR_BASE = new ArrayList<>(Arrays.asList(teste.split(",")));
        double IPCA= utilizar;


        String padrao = "#,##0.00";
        DecimalFormat df = new DecimalFormat(padrao);

        double valor_util = Double.parseDouble(VALOR_BASE.get(i));
        double VALOR_CORRIGIDO = valor_util * IPCA;
        System.out.println(valor_util+"\n"+IPCA);
        System.out.println(df.format(VALOR_CORRIGIDO));
        double PSS = VALOR_CORRIGIDO * 11 / 100;
        System.out.println(df.format(PSS));
        double VALOR_SEM_PSS = VALOR_CORRIGIDO - PSS;
        System.out.println(df.format(VALOR_SEM_PSS));
        double juros_poupanca = valor / 100;
        double valorjuros = juros_poupanca * VALOR_SEM_PSS;
        System.out.println(df.format(valorjuros));
        double txselic = 4.020 / 100;
        double selicbase = valorjuros + VALOR_SEM_PSS;
        System.out.println(df.format(selicbase));
        System.out.println(df.format(txselic));
        double basecalcselic = selicbase * txselic;
        System.out.println(df.format(basecalcselic));
        double s = VALOR_CORRIGIDO + valorjuros + basecalcselic;
        System.out.println(df.format(s));

        z=z+1;
        System.out.println(z);

    }

}
