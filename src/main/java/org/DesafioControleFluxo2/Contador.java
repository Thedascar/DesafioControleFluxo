package org.DesafioControleFluxo2;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {

        Scanner scanner = new Scanner(System.in);


            System.out.println("Digite o 1º parâmetro: ");
            int parametroUm =  scanner.nextInt();
            System.out.println("Digite o 2º parâmetro: ");
            int parametroDois = scanner.nextInt();

            try{
                contar(parametroUm,parametroDois);

            }catch (ParametrosInvalidosException e){
                System.out.println(" O 2º parâmetro deve ser maior do que o 1º parâmetro");
            }
        }


    private static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

                if (parametroDois < parametroUm) {
                    throw new ParametrosInvalidosException();
                }else{
                        int contagem = parametroDois - parametroUm;
                        for (int i = 0; i < contagem; i++) {
                            int c;
                            c = i;
                            System.out.println("Imprimindo nº -> " + (c + 1));
                        }
                    }
                }
    }
