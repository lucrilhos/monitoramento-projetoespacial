package br.com.monitoramento.espacial;

import java.util.Random;

public class SensorTemperatura implements Sensor {
    private Random rand = new Random();

    @Override
    public double lerValor() {
        return 15 + rand.nextDouble() * 20;
    }

    @Override
    public boolean verificarFuncionamento() {
        return true;
    }

    @Override
    public String retornarTipo() {
        return "Sensor de Temperatura";
    }
}
