package br.com.mosaicosolutions.jviacep.net;

import org.w3c.dom.Document;

/**
 * Representa o conteúdo de uma requisição ViaCep.
 *
 * @author BrunoXavier
 * @version 1.0
 */
public interface ViaCepConteudo {

    String lerComoString();

    String lerComoXmlString();

    Document lerComoXml();

    boolean possuiErro();

    boolean podeSerLidoComoXml();
}
