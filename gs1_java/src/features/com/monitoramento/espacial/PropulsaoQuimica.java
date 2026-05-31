package br.com.monitoramento.espacial;

public class PropulsaoQuimica extends SistemaPropulsao {
    @Override
    public double acelerar(int potencia) {
        if (potencia < 0 || potencia > 100) {
            throw new IllegalArgumentException("Potência inválida");
        }
        this.potencia = potencia;
        return potencia * 1.5; // propulsão com potencia mocada
    }
}
