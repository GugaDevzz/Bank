package co.pasta.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String ag;

    private List<Account> accounts;

    private int lastaccount = 1;

    public Bank (String ag){
        this.ag = ag;
        this.accounts = new ArrayList<>();
    }

    public List<Account> getAccounts(){
        return accounts;
    }

    public void insertAccount (Account account){
        accounts.add(account);
    }

    public Account generateaccount (String name) {
        Account account = new Account(ag, "" + lastaccount, name);
        lastaccount++;
        return account;
    }

    public void outputtotal() {
          double total = 0;
          for (Account account : accounts){
          double balance = account.getbalance();
          total += balance;
        }
          System.out.println("Banco agora possui: R$ " + total);
    }

}

