public class WithdrawHandler implements TransactionHandler {
  private TransactionHandler nextHandler;

  @Override
  public void setNextHandler(TransactionHandler nextHandler) {
    this.nextHandler = nextHandler;
  }

  @Override
  public void handle(Transaction transaction) {
    if ("withdraw".equals(transaction.getType())) {
      Account account = Bank.getAccount(transaction.getFromAccount());
      if (account != null) {
        if (transaction.getAmount() > 0 && account.getBalance() >= transaction.getAmount()) {
          System.out
              .println("Processando saque de " + transaction.getAmount() + " da conta " + transaction.getFromAccount());
          account.withdraw(transaction.getAmount());
          System.out.println("Saque realizado com sucesso. Novo saldo: " + account.getBalance());
        } else {
          System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
      }
    } else if (nextHandler != null) {
      nextHandler.handle(transaction);
    }
  }
}
