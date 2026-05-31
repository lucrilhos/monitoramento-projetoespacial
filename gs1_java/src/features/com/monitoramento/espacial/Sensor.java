package br.com.monitoramento.espacial;

public interface Sensor {
    double lerValor();
    boolean verificarFuncionamento();
    String retornarTipo();
}
