// o nome original do arquivo 'SensorRadiaçao' deu problema por causa do 'ç' então tivemos que renomear

package br.com.monitoramento.espacial;

import java.util.Random;

public class SensorRadiacao implements Sensor {
    private Random rand = new Random();

    @Override
    public double lerValor() {
        return rand.nextDouble() * 100; // gera aleatoriedade nos resultados do terminal
                                        // serve para as outras classes de sensor
    }

    @Override
    public boolean verificarFuncionamento() {
        return true;
    }

    @Override
    public String retornarTipo() {
        return "Sensor de Radiação";
    }
}
