package co.pasta.bank;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Bank bank = new Bank("Nubank");

        while (true){
            System.out.println("O que deseja fazer? C=criar conta E=sair");
            String op = scanner.nextLine();

            if (op.equals("C")){
                System.out.println("Digite seu nome:");
                String name = scanner.nextLine();
                Account account = bank.generateaccount(name);
                bank.insertAccount(account);

                operateaccount(account);
            } else if (op.equals("E")){
                break;
            } else {
                System.out.println("Comando Inválido, tente novamente!");
            }
        }

        List<Account> accountList = bank.getAccounts();
        for (Account cc : accountList){
            System.out.println(cc);
        }

        bank.outputtotal();

    }

    static void operateaccount (Account account){

        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("O que deseja fazer? D=depositar S=sacar E=sair da conta");
            String op = scanner.nextLine();

            if (op.equals("D")) {
                System.out.println("Qual o valor deseja depositar?");
                double value = scanner.nextDouble();
                account.deposit(value);
            } else if (op.equals("S")){
                System.out.println("Qual o valor deseja sacar?");
                double value = scanner.nextDouble();
                if (!account.withDrawl(value)){
                    System.out.println("Não foi possível efetuar o saque de R$ " + value);
                }
            } else if (op.equals("E")){
                System.out.println("Você saiu da conta.");
                break;
            } else {
                System.out.println("Comando Inválido, tente novamente!");
            }

                  scanner = new Scanner(System.in);
        }
    }
}
