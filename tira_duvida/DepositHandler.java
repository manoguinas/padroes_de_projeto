public class DepositHandler implements TransactionHandler {
  private TransactionHandler nextHandler;

  @Override
  public void setNextHandler(TransactionHandler nextHandler) {
    this.nextHandler = nextHandler;
  }

  @Override
  public void handle(Transaction transaction) {
    if ("deposit".equals(transaction.getType())) {
      if (transaction.getAmount() > 0) {
        System.out
            .println("Processando depósito de " + transaction.getAmount() + " na conta " + transaction.getToAccount());
        Account account = Bank.getAccount(transaction.getToAccount());
        if (account != null) {
          account.deposit(transaction.getAmount());
          System.out.println("Depósito realizado com sucesso. Novo saldo: " + account.getBalance());
        }
      } else {
        System.out.println("O valor do depósito deve ser positivo.");
      }
    } else if (nextHandler != null) {
      nextHandler.handle(transaction);
    }
  }
}
