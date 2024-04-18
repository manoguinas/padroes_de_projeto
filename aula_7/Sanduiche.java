import java.util.ArrayList;
import java.util.List;

class Sanduiche {
  private String pao;
  private String carne;
  private String queijo;
  private List<String> ingredientesExtras;

  public Sanduiche() {
    this.ingredientesExtras = new ArrayList<>();
  }

  public String getPao() {
    return pao;
  }

  public void setPao(String pao) {
    this.pao = pao;
  }

  public String getCarne() {
    return carne;
  }

  public void setCarne(String carne) {
    this.carne = carne;
  }

  public String getQueijo() {
    return queijo;
  }

  public void setQueijo(String queijo) {
    this.queijo = queijo;
  }

  public List<String> getIngredientesExtras() {
    return ingredientesExtras;
  }

  public void setIngredientesExtras(List<String> ingredientesExtras) {
    this.ingredientesExtras = ingredientesExtras;
  }

  @Override
  public String toString() {
    return "Sanduíche{" +
        "pão='" + pao + '\'' +
        ", carne='" + carne + '\'' +
        ", queijo='" + queijo + '\'' +
        ", ingredientesExtras=" + ingredientesExtras +
        '}';
  }
}