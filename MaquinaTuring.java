
package maquinaTuring;

import java.util.Scanner;

public class MaquinaTuring {

    public static void main(String[] args) {
    	
    	TuringMachine TM1 = MachinesLibrary.EqualBinaryWords();
		
		boolean done = TM1.Run("010000110101#010000110101", false);
		if (done==true)
		{
			System.out.println("The input was accepted.");
		}
		else
		{
			System.out.println("The input was rejected.");
		}	
		/**
		Scanner input = new Scanner(System.in);

        int max = 100;
        String[] estados = new String[max];
        String estadoInicial;
        String[] estadosFinais = new String[max];
        int qtEstados, qtEstadosF, qtAlfabeto, qtAlfabetoAux;
        String[] alfabeto = new String[max];
        String[] alfabetoAux = new String[max];
        String branco, inicial;
        int qtTransicao;
        String[][] transicao = new String[max][max];

        


// Quantidade de estados da maquina de Turing
        System.out.println("Digite a quantidade de Estados: ");
        qtEstados = input.nextInt();

        // Pedindo o nome dos estados.
        input.nextLine(); // "Limpar" uma linha inteira do buffer
        for (int i = 0; i < qtEstados; i++) {

            System.out.println("Digite o nome do " + (i + 1) + "º estado: ");

            estados[i] = input.nextLine();

        }

        System.out.println("------------------------------------------------------------------------------------");
// Mostrar os valores contidos no vetor
        for (int i = 0; i < qtEstados; i++) {

            System.out.println("Estado " + (i + 1) + " = " + estados[i]);

        }
        System.out.println("------------------------------------------------------------------------------------");

// Pedir o estado inicial
        System.out.println("Digite o estado Inicial: ");
        estadoInicial = input.nextLine();

        System.out.println("------------------------------------------------------------------------------------");
// Pedir a quantidade de estados finais
        System.out.println("Digite a quantidade de estados finais existentes: ");
        qtEstadosF = input.nextInt();

        System.out.println("------------------------------------------------------------------------------------");

        if (qtEstadosF > qtEstados) {
            // Se a quantidade de estados finais for maior que a quantidade de estados, da erro
            System.out.println("Erro: a quantidade de estados finais é maior ou iqual a quantidade de estados.");
        } else { /* Se a quantidade de estados finais for menor que a quantidade de estados, pede para informar quais são
             os estados finais

            input.nextLine(); // "Limpar" uma linha inteira do buffer
            for (int i = 0; i < qtEstadosF; i++) {
                System.out.println("Digite os estados finais: ");

                estadosFinais[i] = input.nextLine();
            }

            System.out.println("------------------------------------------------------------------------------------\n");
// Mostrar quais são os estados finais
            for (int i = 0; i < qtEstadosF; i++) {
                System.out.println("Estado Final: " + estadosFinais[i]);
            }

            System.out.println("------------------------------------------------------------------------------------\n");

        }
        // Pedir a quantiade de simbolos do alfabeto da maquina de turing
        System.out.println("Digite a quantidade de simbolos do alfabeto: ");
        qtAlfabeto = input.nextInt();

        input.nextLine();
        // Pedir os simbolos do alfabeto
        for (int i = 0; i < qtAlfabeto; i++) {

            System.out.println("Digite o " + (i + 1) + "º simbolo do Alfabeto: ");
            alfabeto[i] = input.nextLine();

        }
        System.out.print("Alfabeto:");
        //Mostrando o Alfabeto
        for (int i = 0; i < qtAlfabeto; i++) {

            System.out.print(alfabeto[i] + ",");
        }
        System.out.println("");
        // Pedir quantidade de simbolos do alfabeto aux
        System.out.println("Digite a quantidade de simbolos do Alfabeto Auxiliar: ");
        qtAlfabetoAux = input.nextInt();

        System.out.println("------------------------------------------------------------------------------------\n");
        input.nextLine();
        for (int i = 0; i < qtAlfabetoAux; i++) {

            System.out.println("Digite o " + (i + 1) + "º simbolo do alfabeto Auxiliar:");
            alfabetoAux[i] = input.nextLine();

        }
        System.out.println("------------------------------------------------------------------------------------\n");

        for (int i = 0; i < qtAlfabetoAux; i++) {
            // Mostrando o alfabeto aux
            System.out.println("Alfabeto Auxiliar:" + alfabetoAux[i]);
        }

        System.out.println("Quantas transições existem: ");
        qtTransicao = input.nextInt();

        branco = "ß";
        System.out.println("Branco: " + branco);

        inicial = "<";       
        System.out.println("Simbolo Inicial: " + inicial);
        
        // Criando uma Maquina de Turing
        Maquina maquinaTuring = new Maquina(alfabeto, estados, transicao, estadoInicial, estadosFinais, alfabetoAux, branco, inicial);
        
     **/   
    }

    
}