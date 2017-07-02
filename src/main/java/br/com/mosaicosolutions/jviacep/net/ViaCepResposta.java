package br.com.mosaicosolutions.jviacep.net;

/**
 * Representa a resposta de uma requisição ViaCep.
 *
 * @author BrunoXavier
 * @version 1.0
 */
public interface ViaCepResposta {

    int getCodigoDeStatus();

    String getReasonPhrase();

    boolean isCodigoDeSucesso();

    ViaCepConteudo getConteudo();
}
