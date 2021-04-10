package ocp.good;

public abstract class Account {

    protected int amount;
    String type;
    public static String CC ="CC";
    public static String CA ="CA";

    public Account(int amount, String tipo) {
        this.amount = amount;
        this.type = tipo;
    }

    public Account(int amount) {
        this.amount = amount;
    }

    public void toDesposit(int i){
        amount += i;
    }

    public abstract void extract(int i);

}
