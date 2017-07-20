package br.com.mosaicosolutions.jviacep.net;

import br.com.mosaicosolutions.jviacep.modelos.EnderecoRequisicao;

/**
 * @author BrunoXavier
 * @version 1.0
 */
public interface ViaCepRequisicaoPorEndereco extends ViaCepRequisicaoPor<EnderecoRequisicao> {

    default String toUri() {
       return String.format("%s/%s/%s/%s", getDados().getUf().getSigla(),
                                           getDados().getCidade(),
                                           getDados().getLogradouro(),
                                           getFormato());
    }
}
