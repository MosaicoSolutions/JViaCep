package br.com.mosaicosolutions.jviacep.net;

import br.com.mosaicosolutions.jviacep.modelos.EnderecoRequisicao;

/**
 * @author BrunoXavier
 * @version 1.0
 */
public interface ViaCepRequisicaoPorEndereco extends ViaCepRequisicao {

    EnderecoRequisicao getEnderecoRequisicao();

    default String toUri() {
       return String.format("%s/%s/%s/%s", getEnderecoRequisicao().getUf().getSigla(),
                                           getEnderecoRequisicao().getCidade(),
                                           getEnderecoRequisicao().getLogradouro(),
                                           getFormatoRequisicao());
    }
}
