public class TransferHandler implements TransactionHandler {
  private TransactionHandler nextHandler;

  @Override
  public void setNextHandler(TransactionHandler nextHandler) {
    this.nextHandler = nextHandler;
  }

  @Override
  public void handle(Transaction transaction) {
    if ("transfer".equals(transaction.getType())) {
      Account fromAccount = Bank.getAccount(transaction.getFromAccount());
      Account toAccount = Bank.getAccount(transaction.getToAccount());
      if (fromAccount != null && toAccount != null) {
        if (transaction.getAmount() > 0 && fromAccount.getBalance() >= transaction.getAmount()) {
          System.out.println("Processando transferência de " + transaction.getAmount() + " da conta "
              + transaction.getFromAccount() + " para a conta " + transaction.getToAccount());
          fromAccount.withdraw(transaction.getAmount());
          toAccount.deposit(transaction.getAmount());
          System.out.println("Transferência realizada com sucesso. Novo saldo da conta de origem: "
              + fromAccount.getBalance() + ". Novo saldo da conta de destino: " + toAccount.getBalance());
        } else {
          System.out.println("Saldo insuficiente ou valor de transferência inválido.");
        }
      }
    } else if (nextHandler != null) {
      nextHandler.handle(transaction);
    }
  }
}
