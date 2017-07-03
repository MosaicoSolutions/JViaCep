package br.com.mosaicosolutions.jviacep.modelos;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * @author Johnnys Martins
 * @version 1.0
 */
public enum UF {

    RO(11, "Rondônia", "RO", Regiao.NORTE),
    AC(12, "Acre", "AC", Regiao.NORTE),
    AM(13, "Amazonas", "AM", Regiao.NORTE),
    RR(14, "Roraima", "RR", Regiao.NORTE),
    PA(15, "Pará", "PA", Regiao.NORTE),
    AP(16, "Amapá", "AP", Regiao.NORTE),
    TO(17, "Tocantins", "TO", Regiao.NORTE),
    MA(21, "Maranhão", "MA", Regiao.NORDESTE),
    PI(22, "Piauí", "PI", Regiao.NORDESTE),
    CE(23, "Ceará", "CE", Regiao.NORDESTE),
    RN(24, "Rio Grande do Norte", "RN", Regiao.NORDESTE),
    PB(25, "Paraíba", "PB", Regiao.NORDESTE),
    PE(26, "Pernambuco", "PE", Regiao.NORDESTE),
    AL(27, "Alagoas", "AL", Regiao.NORDESTE),
    SE(28, "Sergipe", "SE", Regiao.NORDESTE),
    BA(29, "Bahia", "BA", Regiao.NORDESTE),
    MG(31, "Minas Gerais", "MG", Regiao.SUDESTE),
    ES(32, "Espírito Santo", "ES", Regiao.SUDESTE),
    RJ(33, "Rio de Janeiro", "RJ", Regiao.SUDESTE),
    SP(35, "São Paulo", "SP", Regiao.SUDESTE),
    PR(41, "Paraná", "PR", Regiao.SUL),
    SC(42, "Santa Catarina", "SC", Regiao.SUL),
    RS(43, "Rio Grande do Sul", "RS", Regiao.SUL),
    MS(50, "Mato Grosso do sul", "MS", Regiao.CENTRO_OESTE),
    MT(51, "Mato Grosso", "MT", Regiao.CENTRO_OESTE),
    GO(52, "Goiás", "GO", Regiao.CENTRO_OESTE),
    DF(53, "Distrito Federal", "DF", Regiao.CENTRO_OESTE);

    private String sigla;
    private String nome;
    private int codigo;
    private Regiao regiao;

    UF(int codigo, String nome, String sigla, Regiao regiao) {
        this.codigo = codigo;
        this.nome = nome;
        this.sigla = sigla;
        this.regiao = regiao;
    }

    public String getSigla() { return sigla; }

    public String getNome() { return nome; }

    public int getCodigo() { return codigo; }

    public Regiao getRegiao() { return regiao; }

    public static Stream<UF> todos(){
        return Arrays.stream(UF.values());
    }

    public static Optional<UF> getPelaSigla(String sigla) {
        return todos().filter(uf -> uf.sigla.equals(sigla)).findFirst();
    }

    public static Optional<UF> getPeloCodigo(int codigo) {
        return todos().filter(uf-> uf.codigo == codigo).findFirst();
    }

    public static Optional<UF> getPeloNome(String nome) {
        return todos().filter(uf -> uf.nome.equals(nome)).findFirst();
    }

    //public static Stream<UF> onde(Predicate<UF> predicado);

}
