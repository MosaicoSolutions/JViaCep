package br.com.mosaicosolutions.jviacep.net;

import br.com.mosaicosolutions.jviacep.modelos.Cep;

/**
 * @author BrunoXavier
 * @version 1.0
 */
public interface ViaCepRequisicaoPorCepFactory {

    ViaCepRequisicaoPorCep novaRequisicaoJson(Cep cep);

    ViaCepRequisicaoPorCep novaRequisicaoXml(Cep cep);

    ViaCepRequisicaoPorCep novaRequisicaoPiped(Cep cep);

    ViaCepRequisicaoPorCep novaRequisicaoQuerty(Cep cep);
}
