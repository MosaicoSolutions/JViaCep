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

    RO(11, "Rondônia", "RO"),
    AC(12, "Acre", "AC"),
    AM(13, "Amazonas", "AM"),
    RR(14, "Roraima", "RR"),
    PA(15, "Pará", "PA"),
    AP(16, "Amapá", "AP"),
    TO(17, "Tocantins", "TO"),
    MA(21, "Maranhão", "MA"),
    PI(22, "Piauí", "PI"),
    CE(23, "Ceará", "CE"),
    RN(24, "Rio Grande do Norte", "RN"),
    PB(25, "Paraíba", "PB"),
    PE(26, "Pernambuco", "PE"),
    AL(27, "Alagoas", "AL"),
    SE(28, "Sergipe", "SE"),
    BA(29, "Bahia", "BA"),
    MG(31, "Minas Gerais", "MG"),
    ES(32, "Espírito Santo", "ES"),
    RJ(33, "Rio de Janeiro", "RJ"),
    SP(35, "São Paulo", "SP"),
    PR(41, "Paraná", "PR"),
    SC(42, "Santa Catarina", "SC"),
    RS(43, "Rio Grande do Sul", "RS"),
    MS(50, "Mato Grosso do sul", "MS"),
    MT(51, "Mato Grosso", "MT"),
    GO(52, "Goiás", "GO"),
    DF(53, "Distrito Federal", "DF"),
    ;

    UF(int codigo, String nome, String sigla){
        this.codigo = codigo;
        this.nome = nome;
        this.sigla = sigla;
    }

    private String sigla;
    private String nome;
    private Integer codigo;

    public String getSigla() { return sigla; }

    public String getNome() { return nome; }

    public Integer getCodigo() {
        return codigo;
    }

    public static Stream<UF> todos(){
        return Arrays.stream(UF.values());
    }

    public static Optional<UF> getPelaSigla(String sigla){
        return todos().filter(v -> v.sigla.equals(sigla)).findFirst();
    }

    public static Optional<UF> getPeloCodigo(int codigo){
        return todos().filter(v -> v.sigla.equals(codigo)).findFirst();
    }

    public static Optional<UF> getPeloNome(String nome){
        return todos().filter(v -> v.sigla.equals(nome)).findFirst();
    }

    //public static Stream<UF> onde(Predicate<UF> predicado);

}
