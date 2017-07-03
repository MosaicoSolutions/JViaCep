package br.com.mosaicosolutions.jviacep.test.modelos;

import br.com.mosaicosolutions.jviacep.modelos.UF;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author BrunoXavier
 * @version 1.0
 */
public class UFTest {

    @Test
    @DisplayName("Deve encontrar UF pelo código")
    public void deveEncontarUFPeloCodigo() {
        UF pernambuco = UF.getPeloCodigo(26).orElseThrow(() -> new NoSuchElementException());

        assertEquals(pernambuco.getSigla(), "PE");
        assertEquals(pernambuco.getNome(), "Pernambuco");
    }

    @Test
    @DisplayName("Deve encontrar UF pela sigla")
    public void deveEncontarUFPelaSigla() {
        UF pernambuco = UF.getPelaSigla("SP").orElseThrow(() -> new NoSuchElementException());

        assertEquals(pernambuco.getSigla(), "SP");
        assertEquals(pernambuco.getNome(), "São Paulo");
    }

    @Test
    @DisplayName("Deve encontrar UF pelo nome")
    public void deveEncontarUFPeloNome() {
        UF pernambuco = UF.getPeloNome("Rio de Janeiro").orElseThrow(() -> new NoSuchElementException());

        assertEquals(pernambuco.getSigla(), "RJ");
        assertEquals(pernambuco.getCodigo(), 33);
    }
}
