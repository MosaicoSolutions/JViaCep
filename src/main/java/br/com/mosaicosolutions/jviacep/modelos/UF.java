package br.com.mosaicosolutions.jviacep.modelos;

/**
 *
 * @author Johnnys Martins
 * @version 1.0
 */
public enum UF {

    PERNAMBUCO(1, "Pernambuco", "PE"),
    PARAIBA(2, "Paraiba", "PB");

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

    //public static Stream<UF> todos();

    //public static Optional<UF> getPelaSigla(String sigla);

    //public static Optional<UF> getPeloCodigo(int codigo);

    //public static Optional<UF> getPeloNome(String nome);

    //public static Stream<UF> onde(Predicate<UF> predicado);
}
