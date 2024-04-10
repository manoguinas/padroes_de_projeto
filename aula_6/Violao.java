public class Violao implements Cloneable {
    private String tipo;
    private String cordas;
    private String timbre;

    public Violao(String tipo, String cordas, String timbre) {
        this.tipo = tipo;
        this.cordas = cordas;
        this.timbre = timbre;
    }

    public Violao clone() throws CloneNotSupportedException {
        return (Violao) super.clone();
    }

    public void exibirInfo() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Cordas: " + cordas);
        System.out.println("Timbre: " + timbre);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCordas() {
        return cordas;
    }

    public void setCordas(String cordas) {
        this.cordas = cordas;
    }

    public String getTimbre() {
        return timbre;
    }

    public void setTimbre(String timbre) {
        this.timbre = timbre;
    }

}