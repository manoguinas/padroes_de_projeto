public class Transaction {
  private String type;
  private double amount;
  private String fromAccount;
  private String toAccount;

  public Transaction(String type, double amount, String fromAccount, String toAccount) {
    this.type = type;
    this.amount = amount;
    this.fromAccount = fromAccount;
    this.toAccount = toAccount;
  }

  public String getType() {
    return type;
  }

  public double getAmount() {
    return amount;
  }

  public String getFromAccount() {
    return fromAccount;
  }

  public String getToAccount() {
    return toAccount;
  }
}
