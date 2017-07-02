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

    private UF estado;
    private String cidade;
    private String logradouro;

    public EnderecoRequisicao(UF estado, String cidade, String logradouro){
        this.estado = estado;
        this.cidade = cidade;
        this.logradouro = logradouro;
    }

    public String getCidade() { return cidade; }

    public String getLogradouro() { return logradouro; }

    public boolean isValido() {
        return false;
    }

    private boolean isCidadeValida(){ return this.cidade != null && this.cidade.length() >= qtdCaracteres; }

    private boolean isLogradouroValida(){ return this.logradouro != null && this.logradouro.length() >= qtdCaracteres; }

    @Override
    public String toString() { return "EnderecoRequisicao {" + "UF=" + estado.getSigla() + ", cidade='" + cidade + '\'' + ", logradouro='" + logradouro + '\'' + '}'; }
}
