package com.elivelton;

import java.util.Locale;
import java.util.Scanner;

import com.elivelton.ParametroInvalidoExceptionxcepetion;

public class DesafioControleFluxo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Digite o primeiro número ");
		int parametroUm = scanner.nextInt();

		System.out.println("Digite o Segundo Número");
		int parametroDois = scanner.nextInt();

        try {
           contar(parametroUm, parametroDois); 

        } 
        catch (ParametroInvalidoExceptionxcepetion e) {
             e.printStackTrace();   
        }
    }  

    static void contar(int parametroUm, int parametroDois) throws ParametroInvalidoExceptionxcepetion {
        if (parametroUm <= parametroDois) { 
            throw new ParametroInvalidoExceptionxcepetion();
        } else {
            int contador = parametroUm - parametroDois;
            for (int i = 0; i <= contador; i++) {
                System.out.println(i);
            }
        }
    }
}

