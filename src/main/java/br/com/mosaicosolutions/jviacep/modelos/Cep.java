package br.com.mosaicosolutions.jviacep.modelos;

import java.io.Serializable;
import java.util.regex.Pattern;

/**
 * Código de endereçamento postal.
 *
 * @author BrunoXavier
 * @version 1.0
 */
public final class Cep implements Serializable, Comparable<Cep> {

    private static final long serialVersionUID = -4324758175117652005L;

    private static final String CEP_FORMATADO = "\\d{5}-\\d{3}";
    private static final String CEP_NAO_FORMATADO = "\\d{8}";
    private static final String CEP_PADRAO = CEP_FORMATADO + "|" + CEP_NAO_FORMATADO;

    private final String cep;

    public static Cep of(String cep) {
        return new Cep(cep);
    }

    private Cep(String cep) {
        //TODO: Trocar a exception que está sendo lançada para CepInvalidoException.
        //TODO: Trocar também no método deveLancarException() da classe de Teste Unitário.
        if (!Cep.isCepValido(cep))
            throw new RuntimeException("O cep não é valido, apenas os seguintes formatos são aceitos: 00000-000 ou 00000000.");

        this.cep = cep.matches(CEP_FORMATADO) ? formataCepSomenteNumeros(cep) : cep;
    }

    public static boolean isCepValido(String cep) {
        return cep.matches(Cep.CEP_PADRAO);
    }

    private String formataCepSomenteNumeros(String cep) {
        return cep.replace("-","");
    }

    public String getCepFormatado() {
        return String.format("%s-%s", this.cep.substring(0, 5), this.cep.substring(5, 8));
    }

    public String get() {
        return this.cep;
    }

    /**
     * Retorna a expressão regular para validar o Cep.
     * @return Um {@link #Pattern} contendo a expressão regular.
     */
    public Pattern getPattern() {
        return Pattern.compile(Cep.CEP_PADRAO);
    }

    @Override
    public String toString() {
        return this.cep;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Cep) && this.cep.equals(obj.toString());
    }

    @Override
    public int hashCode() {
        return this.cep.hashCode();
    }

    /**
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     */
    @Override
    public int compareTo(Cep o) {
        return this.cep.compareTo(o.cep);
    }
}
