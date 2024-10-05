package LABORATORY_WORK_2.Example7;

public class BankAccountImpl implements BankAccount {
    private double balance;

    public BankAccountImpl() {
        this.balance = 0.0;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Внесен депозит в размере " + amount + ". Новый баланс равен " + balance);
        } else {
            System.out.println("Сумма депозита должна быть положительной.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Вывод " + amount + " обработан. Оставшийся баланс равен " + balance);
            } else {
                System.out.println("Недостаточно средств.");
            }
        } else {
            System.out.println("Сумма вывода должна быть положительной.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}