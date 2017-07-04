package br.com.mosaicosolutions.jviacep.net;

import br.com.mosaicosolutions.jviacep.modelos.Cep;

/**
 * @author BrunoXavier
 * @version 1.0
 */
public interface ViaCepRequisicaoPorCep extends ViaCepRequisicao {

    Cep getCep();

    default String toUri() {
       return String.format("%s/%s", getCep(), getFormatoRequisicao());
    }
}
