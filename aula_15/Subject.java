public interface Subject {
    void anexar(Observer observer);
    void separar(Observer observer);
    void notificarObservadores(String titulo, String genero);
}
