package br.com.mosaicosolutions.jviacep.modelos;

import java.io.Serializable;

/**
 *
 * @author Johnnys Martns
 * @version 1.0
 */
public final class EnderecoRequisicao implements Serializable {

    private static final long serialVersionUID = -855640977773704651L;

    private static final int qtdCaracteres = 3;

    private UF uf;
    private String cidade;
    private String logradouro;


    public EnderecoRequisicao(){
        this.cidade = "";
        this.logradouro = "";
    }


    public EnderecoRequisicao(UF estado, String cidade, String logradouro){
        this.uf = estado;
        this.cidade = cidade;
        this.logradouro = logradouro;
    }

    public UF getUf() { return uf; }

    public String getCidade() { return cidade; }

    public String getLogradouro() { return logradouro; }

    public void setUf(UF uf) { this.uf = uf; }

    public void setCidade(String cidade) { this.cidade = cidade; }

    public void setLogradouro(String logradouro) { this.logradouro = logradouro; }

    /**
     * Meotodo que ferifica se as premissas da busca por endereço são validas.
     *
     * @return true, se cidade e logradouro não forem nulos e conterem pelo menos 3 caracteres e uf for diferente de nulo.
     *
     */
    public boolean isValido() { return isCidadeValida() && isLogradouroValida() && this.uf != null; }

    private boolean isCidadeValida(){ return this.cidade != null && this.cidade.length() >= qtdCaracteres; }

    private boolean isLogradouroValida(){ return this.logradouro != null && this.logradouro.length() >= qtdCaracteres; }

    @Override
    public String toString() { return "EnderecoRequisicao {" + "UF=" + uf.getSigla() + ", cidade='" + cidade + '\'' + ", logradouro='" + logradouro + '\'' + '}'; }
}
