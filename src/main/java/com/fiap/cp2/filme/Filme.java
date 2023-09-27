package com.fiap.cp2.filme;

import com.fiap.cp2.fichatecnica.FichaTecnica;
import jakarta.persistence.*;

@Table(name = "Filmes")
@Entity(name = "Filme")

public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;
    private String atorPrincipal;
    private String duracao;
    private String anoLancamento;
    private String pais;

    @Column(insertable = false, updatable = false)
    @Enumerated(EnumType.STRING)
    private Genero genero;

    @Embedded
    private FichaTecnica fichaTecnica;

    public Filme() {
    }

    public Filme(DadosCadastrosFilme dados){
        this.titulo = dados.titulo();
        this.atorPrincipal = dados.atorPrincipal();
        this.duracao = dados.duracao();
        this.anoLancamento = dados.anoLancamento();
        this.pais = dados.pais();
        this.genero = dados.genero();
        this.fichaTecnica = new FichaTecnica(dados.fichaTecnica());

    }



    public long getId() {
        return id;
    }



    public void setId(long id) {
        this.id = id;
    }



    public String getTitulo() {
        return titulo;
    }



    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    public String getDuracao() {
        return duracao;
    }



    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }



    public String getAnoLancamento() {
        return anoLancamento;
    }



    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }



    public String getPais() {
        return pais;
    }



    public void setPais(String pais) {
        this.pais = pais;
    }

    public Genero getGenero() {
        return genero;
    }



    public void setGenero(Genero genero) {
        this.genero = genero;
    }



    public FichaTecnica getFichaTecnica() {
        return fichaTecnica;
    }



    public void setFichaTecnica(FichaTecnica fichaTecnica) {
        this.fichaTecnica = fichaTecnica;
    }



    public String getAtorPrincipal() {
        return atorPrincipal;
    }



    public void setAtorPrincipal(String atorPrincipal) {
        this.atorPrincipal = atorPrincipal;
    }



}
