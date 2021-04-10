package ocp;

import ocp.bad.Account;
import ocp.good.CurrentAccount;

public class Run {

    public static void main(String[] args) {

        Account account = new Account(100, Account.CA);
        account.extract(200);

        ocp.good.Account currentAccount = new CurrentAccount(100);
        currentAccount.extract(200);



    }
}
