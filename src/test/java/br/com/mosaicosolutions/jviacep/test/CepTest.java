package br.com.mosaicosolutions.jviacep.test;

import java.util.function.Predicate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import br.com.mosaicosolutions.jviacep.modelos.Cep;
import br.com.mosaicosolutions.jviacep.modelos.CepInvalidoException;

public class CepTest {

    @Test
    @DisplayName("O Cep deve ser válido")
    public void deveSerValido() {

        assertTrue(Cep.isCepValido("01001000"));
        assertTrue(Cep.isCepValido("01001-000"));
    }

    @Test
    @DisplayName("O Cep deve ser inválido")
    public void deveSerInvalido() {

        assertFalse(Cep.isCepValido(""));
        assertFalse(Cep.isCepValido("123456")); //Com menos de 8 caracteres.
        assertFalse(Cep.isCepValido("123123123")); // Com mais de 8 caraceres.
    }

    @Test
    @DisplayName("CepInvalidoException deve ser lançada")
    public void deveLancarException() {

        assertThrows(CepInvalidoException.class, () -> Cep.of("123"));//Cep com menos de 8 caracteres.
        assertThrows(CepInvalidoException.class, () -> Cep.of("123456789"));//Cep com mais de 8 caracteres.
        assertThrows(CepInvalidoException.class, () -> Cep.of("1234as67"));//Cep com caracteres inválidos.
    }

    @Test
    @DisplayName("O Cep deve estar formatado")
    public void testaSeOCepEstaFormatado() {
        Cep cep = Cep.of("01001000");

        assertTrue(cep.getCepFormatado().contains("-"));
        assertEquals(cep.getCepFormatado(), "01001-000");
    }

    @Test
    @DisplayName("Os Cep's devem ser iguais")
    public void devemSerIguais() {
        Cep cep1 = Cep.of("01001000");
        Cep cep2 = Cep.of("01001-000");

        assertEquals(cep1, cep2);
        assertEquals(cep1.get(), cep2.get());
        assertTrue(cep1.equals(cep2));
    }

    @Test
    @DisplayName("Testando a Regex do Cep")
    public void testaARegexDoCep() {

        Cep cep = Cep.of("01001000");

        Predicate<String> predicate = cep.getPattern().asPredicate();

        assertTrue(predicate.test("01001000"));
        assertTrue(predicate.test("01001-000"));
        assertFalse(predicate.test("010-01000"));
    }
}
