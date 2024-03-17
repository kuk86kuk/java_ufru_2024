package LABORATORY_WORK_2.Example7;

public class Example7 {
    public static void main(String[] args) {
        BankAccount account = new BankAccountImpl();

        account.deposit(1000); // Депозит 1000
        account.withdraw(500); // Снятие 500
        account.deposit(200);  // Депозит 200
        account.withdraw(1500); // Попытка снять 1500 (недостаточно средств)

        System.out.println("Текущий баланс: " + account.getBalance()); // Текущий баланс
    }
}
