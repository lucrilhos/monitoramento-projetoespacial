package br.com.monitoramento.espacial;

public abstract class ComponenteEspacial {
    protected int id;
    protected String nome;
    protected String status;
    protected double temperatura;

    public void ligar() {
        status = "ligado";
    }

    public void desligar() {
        status = "desligado";
    }

    public abstract void verificar();
}
