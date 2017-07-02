package br.com.mosaicosolutions.jviacep.test;

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
        EnderecoRequisicao enderecoTeste = new EnderecoRequisicao(UF.PERNAMBUCO, "Recife", "cafarnaum");

        assertTrue(enderecoTeste.isValido());
    }

    @Test
    @DisplayName("O endereco deve ser invalido")
    public void enderecoInvalido() {
        EnderecoRequisicao enderecoTeste = new EnderecoRequisicao(UF.PARAIBA, "Jo", "ca");

        assertFalse(enderecoTeste.isValido());
    }

}
