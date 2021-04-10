package ocp.good;

public class SavingAccount extends Account {

    public SavingAccount(int monto, String tipo) {
        super(monto, tipo);
    }

    @Override
    public void extract(int i) {
        if (amount >0)
            amount -= i;
        else
            System.out.println("sin fondos");
    }
}
