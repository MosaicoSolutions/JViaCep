package br.com.mosaicosolutions.jviacep.util;

import br.com.mosaicosolutions.jviacep.modelos.Endereco;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author BrunoXavier
 * @version 1.0
 */
public final class DefaultEnderecoConvert implements EnderecoConvert {

    private final Gson gson = new Gson();

    @Override
    public Optional<Endereco> deJsonParaEndereco(String json) {
        return Optional.ofNullable(gson.fromJson(json, Endereco.class));
    }

    @Override
    public Stream<Endereco> deJsonParaListaDeEndereco(String json) {
        return Stream.of(gson.fromJson(json, new TypeToken<Endereco[]>(){}.getType()));
    }
}
