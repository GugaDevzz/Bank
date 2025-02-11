package co.pasta.bank;

public class App {
    public static void main(String[] args) {
        //limitar o nome = 12 caracteres
        //sacar valores
        //nao pode sacar mais do que tem
        //depositar
        //informar para o usuario as operações (saques, depositos)

        //criar uma conta (agencia, conta, nome)
        Account account = new Account("0001", "1234", "Gustavo");

        boolean succeed = account.withDrawl(200.0);
        if (!succeed){
            System.out.println("Você não tem saldo suficiente!");
        }

        account.deposit(100);
        account.deposit(50);
        account.deposit(100);

        if  (!account.withDrawl(200)){
            System.out.println("Você não tem saldo suficiente para sacar!");
        }
        if (!account.withDrawl(200)){
            System.out.println("Você não tem saldo suficiente para sacar!");
        }

        System.out.println(account);
    }
}
