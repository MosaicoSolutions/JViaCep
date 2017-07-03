package br.com.mosaicosolutions.jviacep.util;

import br.com.mosaicosolutions.jviacep.modelos.Endereco;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Fornece métodos para conversões entre Json e Endereço.
 *
 * @author BrunoXavier
 * @version 1.0
 */
public interface EnderecoConvert {

    Optional<Endereco> deJsonParaEndereco(String json);

    Stream<Endereco> deJsonParaListaDeEndereco(String json);
}
