package ocp.bad;

public class Account {

    int amount;
    String type;
    public static String CC ="CC";
    public static String CA ="CA";

    public Account(int amount, String tipo) {
        this.amount = amount;
        this.type = tipo;
    }

    public void toDesposit(int i){
        amount += i;
    }

    public void extract(int i){
        if (CA.equals(type))
            if (amount >i)
                amount -= i;
            else
                System.out.println("Fondos insuficientes");
        if (CC.equals(type))
            amount -= i;
    }

}
