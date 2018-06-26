/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

import java.util.Scanner;

/**
 *
 * @author Artu
 */
public class Lab07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        Diretorio d = new Diretorio();
        int x = 1;
        while (x > 0) {
            System.err.println("============MENU============\n");
            System.err.println("Adicionar contato:(1):\n");
            System.err.println("Listar contatos:(2)\n");
            x = ler.nextInt();
            switch (x) {
                case 1: {
                    System.err.println("Digite o nome:");
                    String nome = ler.next();
                    System.err.println("Digite o telefone:");
                    String telefone = ler.next();
                    int resultado = d.adicionarContato(nome, telefone);
                    if (resultado == 1) {
                        System.err.println("Contato cadastrado!\n");

                    } else {
                        System.err.println("O contato ja existe!\n");
                    }
                    break;
                }
                case 2: {
                    System.err.println("Lista:\n");
                    d.listarCntatos();

                    break;
                }

                default:
                    System.err.println("NNN");
                    break;
            }   

        }

    }

}
