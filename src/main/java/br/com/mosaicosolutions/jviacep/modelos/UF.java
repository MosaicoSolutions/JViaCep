package br.com.mosaicosolutions.jviacep.modelos;

/**
 * @author Johnnys Martins
 *
 * @version 1.0
 *
 */
public enum UF {
    PERNAMBUCO(1, "Pernambuco", "PE"),
    PARAIBA(2, "Paraiba", "PB");

    private UF(Integer codigo, String descricao, String sigla){
        this.codigo = codigo;
        this.descricao = descricao;
        this.sigla = sigla;
    }

    private String sigla;
    private String descricao;
    private Integer codigo;


    public static UF recuperaUF(Integer codigo){
        for(UF item : values()){
            if(item.getCodigo().equals(codigo))
                return item;
        }
        return null;
    }

    public String getSigla() { return sigla; }

    public String getDescricao() { return descricao; }

    public Integer getCodigo() {
        return codigo;
    }
}
