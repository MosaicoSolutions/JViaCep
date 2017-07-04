package br.com.mosaicosolutions.jviacep.modelos;

/**
 * @author BrunoXavier
 * @version 1.0
 */
public enum ViaCepFormatoRequisicao {

    JSON("json"),
    XML("xml"),
    PIPED("piped"),
    QUERTY("querty");

    private final String valor;

    ViaCepFormatoRequisicao(String valor) {
        this.valor = valor;
    }

    public String getValor() { return valor; }

    @Override
    public String toString() { return valor; }
}
