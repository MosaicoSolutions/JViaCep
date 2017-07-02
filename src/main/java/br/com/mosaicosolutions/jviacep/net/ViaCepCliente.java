package br.com.mosaicosolutions.jviacep.net;

import java.util.function.Supplier;

/**
 * Cliente responsável por gerenciar as requisições ao serviço ViaCep.
 *
 * @author BrunoXavier
 * @version 1.0
 */
public interface ViaCepCliente {

    /**
     * Executa uma requisição ao serviço ViaCep.
     * @param uri Um {@link Supplier<String>} que retorna o URI do recurso a ser consumido.
     * @return Um {@link ViaCepResposta} que representa a resposta da requisição.
     */
    ViaCepResposta execute(Supplier<String> uri);
}
