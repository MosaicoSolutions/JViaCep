package br.com.mosaicosolutions.jviacep.modelos;

/**
 * @author BrunoXavier
 * @version 1.0
 */
public enum Regiao {

    CENTRO_OESTE("Centro-Oeste");

    private final String nome;

    Regiao(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    //public Stream<UF> getEstados();

    //public static Function<Regiao, UF> getEstadosPorRegiao();
}
