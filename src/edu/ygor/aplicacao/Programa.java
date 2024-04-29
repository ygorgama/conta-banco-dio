package edu.ygor.aplicacao;

import java.util.Scanner;

import edu.ygor.entidades.ContaBanco;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBanco contaBanco;
    
        System.out.print("Por favor, digite o número da Agência: ");
        int numeroAgencia = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Por favor, digite o nome da Agência: ");
        String nomeAgencia = scanner.nextLine();

        System.out.print("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.nextLine();


        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        contaBanco = new ContaBanco(numeroAgencia, nomeAgencia, nomeCliente, saldo);

        System.out.printf(
            "Olá %s obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque%n",
            contaBanco.getNomeCliente(), contaBanco.getAgencia(), contaBanco.getNumero(), contaBanco.getSaldo()
        );

        scanner.close();
    }
}
