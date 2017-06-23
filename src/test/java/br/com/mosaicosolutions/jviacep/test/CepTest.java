package br.com.mosaicosolutions.jviacep.test;

import java.util.function.Predicate;

import org.junit.Test;

import br.com.mosaicosolutions.jviacep.modelos.Cep;

import static org.junit.Assert.*;

public class CepTest {

    @Test
    public void deveSerValido() {

        assertTrue(Cep.isCepValido("01001000"));
        assertTrue(Cep.isCepValido("01001-000"));
    }

    @Test
    public void deveSerInvalido() {

        assertFalse(Cep.isCepValido(""));
        assertFalse(Cep.isCepValido("123456")); //Com menos de 8 caracteres.
        assertFalse(Cep.isCepValido("123123123")); // Com mais de 8 caraceres.
    }

    @Test(expected = RuntimeException.class)
    public void deveLancarException() {

        Cep.of("123");
    }

    @Test
    public void testaSeOCepEstaFormatado() {
        Cep cep = Cep.of("01001000");

        assertTrue(cep.getCepFormatado().contains("-"));
    }

    @Test
    public void devemSerIguais() {
        Cep cep1 = Cep.of("01001000");
        Cep cep2 = Cep.of("01001-000");

        assertEquals(cep1, cep2);
        assertEquals(cep1.get(), cep2.get());
        assertNotEquals(cep1, null);
    }

    @Test
    public void testaARegexDoCep() {

        Cep cep = Cep.of("01001000");

        Predicate<String> predicate = cep.getPattern().asPredicate();

        assertTrue(predicate.test("01001000"));
        assertTrue(predicate.test("01001-000"));
        assertFalse(predicate.test("010-01000"));
    }
}
