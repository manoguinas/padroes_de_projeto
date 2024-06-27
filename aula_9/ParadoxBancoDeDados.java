public class ParadoxBancoDeDados implements BancoDeDados {
    @Override
    public void conectar() {
        System.out.println("Conectando ao banco de dados Paradox...");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando do banco de dados Paradox...");
    }

    @Override
    public void executarConsulta(String consulta) {
        System.out.println("Executando consulta no banco de dados Paradox: " + consulta);
    }
}
