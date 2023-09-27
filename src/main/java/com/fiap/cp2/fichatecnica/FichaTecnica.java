package com.fiap.cp2.fichatecnica;

import jakarta.persistence.Embeddable;

@Embeddable
public class FichaTecnica {

    private String genero;
    private String direcao;
    private String elenco;
    private String roteiro;
    private String classificacaoIndic;
    private String producao;

    public FichaTecnica() {
    }

    public FichaTecnica(DadosFichaTecnica dados) {
        this.genero = dados.genero();
        this.direcao = dados.direcao();
        this.elenco = dados.elenco();
        this.roteiro = dados.roteiro();
        this.classificacaoIndic = dados.classificacaoIndic();
        this.producao = dados.producao();

    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public String getElenco() {
        return elenco;
    }


    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public String getRoteiro() {
        return roteiro;
    }

    public void setRoteiro(String roteiro) {
        this.roteiro = roteiro;
    }


    public String getClassificacaoIndic() {
        return classificacaoIndic;
    }



    public void setClassificacaoIndic(String classificacaoIndic) {
        this.classificacaoIndic = classificacaoIndic;
    }



    public String getProducao() {
        return producao;
    }



    public void setProducao(String producao) {
        this.producao = producao;
    }
}