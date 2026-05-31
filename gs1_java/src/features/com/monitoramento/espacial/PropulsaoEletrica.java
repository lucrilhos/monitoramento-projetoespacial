package br.com.monitoramento.espacial;

public class PropulsaoEletrica extends SistemaPropulsao {
    @Override
    public double acelerar(int potencia) {
        if (potencia < 0 || potencia > 100) {
            throw new IllegalArgumentException("Potência inválida");
        }
        this.potencia = potencia;
        return potencia * 0.8; // propulsão com potencia mocada
    }
}
