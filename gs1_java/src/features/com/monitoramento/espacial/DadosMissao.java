package br.com.monitoramento.espacial;

public class DadosMissao {
    private String coordenadas;
    private String codigoAcesso;
    private double combustivel;
    private int tripulantes;

    public DadosMissao(String codigoAcesso) {
        this.codigoAcesso = codigoAcesso;
        this.combustivel = 100;
    }

    public String getCoordenadas(String codigo) {
        if (codigo.equals(codigoAcesso)) {
            return coordenadas;
        }
        return "Acesso negado";
    }

    public void setCoordenadas(String codigo, String coordenadas) {
        if (codigo.equals(codigoAcesso)) {
            this.coordenadas = coordenadas;
        }
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        if (combustivel >= 0) {
            this.combustivel = combustivel;
        }
    }

    public int getTripulantes() {
        return tripulantes;
    }

    public void setTripulantes(int tripulantes) {
        if (tripulantes >= 0) {
            this.tripulantes = tripulantes;
        }
    }
}
