import java.util.ArrayList;
import java.util.List;

public class VideoPlataforma implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void anexar(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void separar(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservadores(String titulo, String genero) {
        for (Observer observer : observers) {
            observer.update(titulo, genero);
        }
    }

    public void addFilme(String titulo, String genero) {
        System.out.println("Novo filme/série adicionado: " + titulo + " [Gênero: " + genero + "]");
        notificarObservadores(titulo, genero);
    }
}
