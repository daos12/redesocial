package br.com.redesocial.modelo.dto;

import java.util.Date;

/**
 * Classe para representação de um artigo
 * @author Daniel Moreira Cardoso
 */
public class Artigo {
    private Integer id;
    private String idioma;
    private String revista;
    private Integer issn;
    private String autor;
    private Date data;
    private String areaConhecimento;
    private String titulo;
    private String resumo;
    private String url;
    private byte[] artigo;

    public Artigo() {
    
    }

    public Artigo(Integer id, String idioma, String revista, Integer issn, String autor, Date data, String areaConhecimento, String titulo, String resumo, String url, byte[] artigo) {
        this.id = id;
        this.idioma = idioma;
        this.revista = revista;
        this.issn = issn;
        this.autor = autor;
        this.data = data;
        this.areaConhecimento = areaConhecimento;
        this.titulo = titulo;
        this.resumo = resumo;
        this.url = url;
        this.artigo = artigo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getRevista() {
        return revista;
    }

    public void setRevista(String revista) {
        this.revista = revista;
    }

    public Integer getIssn() {
        return issn;
    }

    public void setIssn(Integer issn) {
        this.issn = issn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getAreaConhecimento() {
        return areaConhecimento;
    }

    public void setAreaConhecimento(String areaConhecimento) {
        this.areaConhecimento = areaConhecimento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public byte[] getArtigo() {
        return artigo;
    }

    public void setArtigo(byte[] artigo) {
        this.artigo = artigo;
    }
}
