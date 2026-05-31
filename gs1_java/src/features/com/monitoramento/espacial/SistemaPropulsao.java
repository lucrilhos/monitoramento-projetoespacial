package br.com.monitoramento.espacial;

public abstract class SistemaPropulsao {
    protected boolean ligado; // atributo 'protected' para intermediar a acessibilidade do sistema pelos dois arquivos de propulsão
    protected int potencia;

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }

    public abstract double acelerar(int potencia);
}
