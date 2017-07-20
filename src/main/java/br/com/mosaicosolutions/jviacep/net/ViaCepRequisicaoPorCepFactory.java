package br.com.mosaicosolutions.jviacep.net;

import br.com.mosaicosolutions.jviacep.modelos.Cep;

/**
 * @author BrunoXavier
 * @version 1.0
 */
public interface ViaCepRequisicaoPorCepFactory extends ViaCepRequisicaoJsonDe<Cep>,
                                                       ViaCepRequisicaoXmlDe<Cep>,
                                                       ViaCepRequisicaoPipedDe<Cep>,
                                                       ViaCepRequisicaoQuertyDe<Cep>
{ }
