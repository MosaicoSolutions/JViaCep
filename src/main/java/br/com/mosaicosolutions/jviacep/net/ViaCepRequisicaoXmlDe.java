package br.com.mosaicosolutions.jviacep.net;

/**
 * @author BrunoXavier
 * @version 1.0
 */
@FunctionalInterface
public interface ViaCepRequisicaoXmlDe<T> {

    ViaCepRequisicaoPor<T> novaRequisicaoXml(T dados);
}
