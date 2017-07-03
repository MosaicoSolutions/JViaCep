package br.com.mosaicosolutions.jviacep.test.modelos;

import br.com.mosaicosolutions.jviacep.modelos.EnderecoRequisicao;
import br.com.mosaicosolutions.jviacep.modelos.UF;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Johnnys Martins
 * @version 1.0
 */

public class EnderecoRequisaoTest {

    @Test
    @DisplayName("O endereço deve ser valido")
    public void enderecoValido() {
        EnderecoRequisicao enderecoTeste = new EnderecoRequisicao(UF.AM, "Recife", "cafarnaum");

        assertTrue(enderecoTeste.isValido());
    }

    @Test
    @DisplayName("O endereco deve conter cidade e logradouro invalido invalida")
    public void enderecoInvalido() {
        EnderecoRequisicao enderecoTeste = new EnderecoRequisicao(UF.AM, "Jo", "ca");

        assertFalse(enderecoTeste.isValido());
    }

    @Test
    @DisplayName("O endereco deve conter logradouro invalida")
    public void logradouroInvalido() {
        EnderecoRequisicao enderecoTeste = new EnderecoRequisicao();
        enderecoTeste.setUf(UF.AM);
        enderecoTeste.setCidade("joao pessoa");
        enderecoTeste.setLogradouro("a");

        assertFalse(enderecoTeste.isValido());
    }

    @Test
    @DisplayName("O endereco deve conter cidade invalida")
    public void cidadeInvalida() {
        EnderecoRequisicao enderecoTeste = new EnderecoRequisicao();
        enderecoTeste.setUf(UF.AM);
        enderecoTeste.setCidade("jo");
        enderecoTeste.setLogradouro("bernado");

        assertFalse(enderecoTeste.isValido());
    }

}
