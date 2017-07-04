package br.com.mosaicosolutions.jviacep.net;

import br.com.mosaicosolutions.jviacep.modelos.EnderecoRequisicao;

/**
 * @author BrunoXavier
 * @version 1.0
 */
public interface ViaCepRequisicaoPorEnderecoFactory {

    ViaCepRequisicaoPorEndereco novaRequisicaoJson(EnderecoRequisicao enderecoRequisicao);

    ViaCepRequisicaoPorEndereco novaRequisicaoXml(EnderecoRequisicao enderecoRequisicao);
}
