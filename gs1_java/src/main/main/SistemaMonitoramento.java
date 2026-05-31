package monitoramentoespacial.main;

import br.com.monitoramento.espacial.SensorTemperatura;
import br.com.monitoramento.espacial.SensorPressao;
import br.com.monitoramento.espacial.SensorRadiacao;
import br.com.monitoramento.espacial.PropulsaoQuimica;
import br.com.monitoramento.espacial.PropulsaoEletrica;
import br.com.monitoramento.espacial.DadosMissao;

import java.util.Scanner;

public class SistemaMonitoramento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SensorTemperatura temp = new SensorTemperatura();
        SensorPressao pressao = new SensorPressao();
        SensorRadiacao radiacao = new SensorRadiacao();
        PropulsaoQuimica quimica = new PropulsaoQuimica();
        PropulsaoEletrica eletrica = new PropulsaoEletrica();
        DadosMissao dados = new DadosMissao("1234");

        int opcao;
        do {
            System.out.println("\n--- Menu Monitoramento ---");
            System.out.println("1. Checar sensores");
            System.out.println("2. Controlar a propulsão");
            System.out.println("3. Gerenciar os dados da missão");
            System.out.println("0. Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(temp.retornarTipo() + ": " + temp.lerValor());
                    System.out.println(pressao.retornarTipo() + ": " + pressao.lerValor());
                    System.out.println(radiacao.retornarTipo() + ":  " + radiacao.lerValor());
                    break;
                case 2:
                    System.out.println("Aceleração química: " + quimica.acelerar(50));
                    System.out.println("Aceleração elétrica: " + eletrica.acelerar(50)); // ganho de velocidade ou potência
                    break;
                case 3:
                    dados.setTripulantes(5);
                    System.out.println("Tripulantes: " + dados.getTripulantes());
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}
