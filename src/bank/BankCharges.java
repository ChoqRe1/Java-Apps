package bank;

/**
 * bank created by Remi on 2016-10-05.
 */
public class BankCharges {
    private double fees;
    private int checks;
    private double cost;
    private double balance;

    public BankCharges(double fees, int checks, double cost, double balance) {
        this.fees = fees;
        this.checks = checks;
        this.cost = cost;
        this.balance = balance;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public void setChecks(int checks) {
        this.checks = checks;
    }

    public int getChecks() {
        return checks;
    }

    public double getFees() {
        return fees;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getBalance() {
        return balance;
    }

    public double getCost() {
        return cost;
    }

    public double calcCost(){
        if(checks >= 60){
            fees = .04;
        }else if(checks >= 40){
            fees = .06;
        }else if(checks >= 20){
            fees = .08;
        }else{
            fees = .1;
        }
        cost = (fees*checks)+10;
        if(balance < 400){
            cost += 15;
        }

        return cost;
    }

}
