package br.com.mosaicosolutions.jviacep.net;

/**
 * @author BrunoXavier
 * @version 1.0
 */
@FunctionalInterface
public interface ViaCepRequisicaoJsonDe<T> {

    ViaCepRequisicaoPor<T> novaRequisicaoJson(T dados);
}
