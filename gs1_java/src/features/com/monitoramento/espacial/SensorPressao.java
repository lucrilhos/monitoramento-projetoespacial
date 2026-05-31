package br.com.monitoramento.espacial;

import java.util.Random;

public class SensorPressao implements Sensor {
    private Random rand = new Random(); // dados randomizados

    @Override
    public double lerValor() {
        return 0.5 + rand.nextDouble() * 1.5;
    }

    @Override
    public boolean verificarFuncionamento() {
        return true;
    }

    @Override
    public String retornarTipo() {
        return "Sensor de Pressão";
    }
}
