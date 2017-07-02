package br.com.mosaicosolutions.jviacep.modelos;

import java.io.Serializable;

/**
 *
 * @author Johnnys Martins
 *
 * @version 1.0
 *
 */
public final class Endereco implements Serializable {

    private static final long serialVersionUID = 8114768366006896644L;

    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String UF;
    private String unidade;
    private String IBGE;
    private String gia;


    public Endereco(){
        this.cep = "";
        this.logradouro = "";
        this.complemento = "";
        this.bairro = "";
        this.localidade = "";
        this.UF = "";
        this.unidade = "";
        this.IBGE = "";
        this.gia = "";
    }

    public Endereco(String cep, String logradouro, String complemento, String bairro, String localidade, String UF, String unidade, String IBGE, String gia){
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.localidade = localidade;
        this.UF = UF;
        this.unidade = unidade;
        this.IBGE = IBGE;
        this.gia = gia;
    }

    public String getCep() { return cep; }

    public void setCep(String cep) { this.cep = cep; }

    public String getLogradouro() { return logradouro; }

    public void setLogradouro(String logradouro) { this.logradouro = logradouro; }

    public String getComplemento() { return complemento; }

    public void setComplemento(String complemento) { this.complemento = complemento; }

    public String getBairro() { return bairro; }

    public void setBairro(String bairro) { this.bairro = bairro; }

    public String getLocalidade() { return localidade; }

    public void setLocalidade(String localidade) { this.localidade = localidade; }

    public String getUF() { return UF; }

    public void setUF(String UF) { this.UF = UF; }

    public String getUnidade() { return unidade; }

    public void setUnidade(String unidade) { this.unidade = unidade; }

    public String getIBGE() { return IBGE; }

    public void setIBGE(String IBGE) { this.IBGE = IBGE; }

    public String getGia() { return gia; }

    public void setGia(String gia) { this.gia = gia; }


}
