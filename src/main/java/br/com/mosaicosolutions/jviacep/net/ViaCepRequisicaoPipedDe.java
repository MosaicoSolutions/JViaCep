package br.com.mosaicosolutions.jviacep.net;

/**
 * @author BrunoXavier
 * @version 1.0
 */
@FunctionalInterface
public interface ViaCepRequisicaoPipedDe<T> {

    ViaCepRequisicaoPor<T> novaRequisicaoPiped(T dados);
}
