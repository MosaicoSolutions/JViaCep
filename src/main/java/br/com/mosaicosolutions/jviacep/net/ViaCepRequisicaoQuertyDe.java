package br.com.mosaicosolutions.jviacep.net;

/**
 * @author BrunoXavier
 * @version 1.0
 */
@FunctionalInterface
public interface ViaCepRequisicaoQuertyDe<T> {

    ViaCepRequisicaoPor<T> novaRequisicaoQuerty(T dados);
}
