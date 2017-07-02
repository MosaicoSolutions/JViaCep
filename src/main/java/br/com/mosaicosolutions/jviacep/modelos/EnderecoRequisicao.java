package br.com.mosaicosolutions.jviacep.modelos;

import java.io.Serializable;

/**
 * @author Johnnys Martns
 *
 * @version 1.0
 *
 */
public final class EnderecoRequisicao implements Serializable{

    private static final long serialVersionUID = -855640977773704651L;

    private UF uf;
    private String localidade;
    private String logradouro;

    private static final int qtdCaracteres = 3;


    public EnderecoRequisicao(UF uf, String localidade, String logradouro){
        this.uf = uf;
        this.localidade = localidade;
        this.logradouro = logradouro;
    }

    /**
     * Metodos que verifica se localidade é diferente de nulo e possue mais de 3 caracteres.
     *
     * @return true se o objeto for validado apartir das condições impostas.
     *
     */
    public boolean isCidadeValida(){ return this.localidade != null && this.localidade.length() >= qtdCaracteres; }

    /**
     * Metodos que verifica se logradouro é diferente de nulo e possue mais de 3 caracteres.
     *
     * @return true se o objeto for validado apartir das condições impostas.
     *
     */
    public boolean isLogradouroValida(){ return this.logradouro != null && this.logradouro.length() >= qtdCaracteres; }

    public String getLocalidade() { return localidade; }

    public String getLogradouro() { return logradouro; }

    @Override
    public String toString() { return "EnderecoRequisicao {" + "UF=" + uf.getSigla() + ", localidade='" + localidade + '\'' + ", logradouro='" + logradouro + '\'' + '}'; }



}
