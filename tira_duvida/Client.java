public class Client {
  public static void main(String[] args) {
    TransactionHandler depositHandler = new DepositHandler();
    TransactionHandler withdrawHandler = new WithdrawHandler();
    TransactionHandler transferHandler = new TransferHandler();

    depositHandler.setNextHandler(withdrawHandler);
    withdrawHandler.setNextHandler(transferHandler);

    Account account1 = new Account("12345", 1000);
    Account account2 = new Account("67890", 500);
    Bank.addAccount(account1);
    Bank.addAccount(account2);

    Transaction deposit = new Transaction("deposit", 200, null, "12345");
    Transaction withdraw = new Transaction("withdraw", 300, "12345", null);
    Transaction transfer = new Transaction("transfer", 100, "12345", "67890");
    Transaction invalid = new Transaction("invalid", 100, "12345", "67890");

    depositHandler.handle(deposit);
    depositHandler.handle(withdraw);
    depositHandler.handle(transfer);
    depositHandler.handle(invalid);
  }
}
