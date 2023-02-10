package entities;

public class Account {
    private final String accNumber;
    private final Holder holderAcc;
    private double accBalance = 0;

    public Account(Holder holderAcc, String accNumber) {
        this.accNumber = accNumber;
        this.holderAcc = holderAcc;
    }

    /*
     * o desafio deixou como possível o titular ter um saldo negativo,
     * por isso não tem validação de saldo para saques
     */
    
    public void withdrawMoney(double amountToWithdraw) {
        double fixedRateForWithdrawal = 5.00;
        this.accBalance -= (amountToWithdraw + fixedRateForWithdrawal);
    }

    public void depositMoney(double amountToDeposit) {
        this.accBalance += amountToDeposit;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public Holder getOwnerAcc() {
        return holderAcc;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public String toString() {
        return String.format(
                "Account %s, Holder: %s, Balance: $ %.2f",
                this.accNumber,
                this.holderAcc.getName(),
                this.accBalance
        );
    }
}
