package ocp.good;

public class CurrentAccount extends Account {


    public CurrentAccount(int amount) {
        super(amount);
    }

    @Override
    public void extract(int i) {
            amount -= i;
    }
}
