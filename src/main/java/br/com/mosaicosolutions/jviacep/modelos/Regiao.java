package br.com.mosaicosolutions.jviacep.modelos;

import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author BrunoXavier
 * @version 1.0
 */
public enum Regiao {

    CENTRO_OESTE("Centro-Oeste"),
    NORDESTE("Nordeste"),
    NORTE("Norte"),
    SUDESTE("Sudeste"),
    SUL("Sul");

    private final String nome;

    Regiao(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    //public Stream<UF> getEstados() { return UF.onde(uf -> uf.regiao == this); }

    /*public static Function<Regiao, Stream<UF>> getEstadosPorRegiao() {
        return regiao -> UF.onde(uf -> uf.regiao == regiao);
    }*/
}
