package br.com.mosaicosolutions.jviacep.net;

import br.com.mosaicosolutions.jviacep.modelos.ViaCepFormatoRequisicao;

/**
 * Representa uma requisição ao serviço ViaCep.
 *
 * @author BrunoXavier
 * @version 1.0
 */
public interface ViaCepRequisicaoPor<T> extends ViaCepUri {

    T getDados();

    ViaCepFormatoRequisicao getFormato();
}
