package br.com.mosaicosolutions.jviacep.net;

/**
 * Representa uma requisição ao serviço ViaCep.
 *
 * @author BrunoXavier
 * @version 1.0
 */
public interface ViaCepRequisicao {

    String toUri();

    //TODO: Método que retorna o formato da Requisição.
    //ViaCepFormatoRequisicao getFormatoRequisicao();
}
