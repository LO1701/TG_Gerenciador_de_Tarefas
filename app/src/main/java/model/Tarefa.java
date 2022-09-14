package model;

import java.util.Date;

public class Tarefa {
    private int id;
    private String nome;
    private String descricao;
    private String status;
    private String obs;
    private Date prazo;
    private Date dataCriacao;
    private Date dataModificacao;        
    private int idProjeto;

    public Tarefa(int id, String nome, String descricao, String status, String obs, Date prazo, Date dataCriacao, Date dataModificacao, int idProjeto) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
        this.obs = obs;
        this.prazo = prazo;
        this.dataCriacao = dataCriacao;
        this.dataModificacao = dataModificacao;
        this.idProjeto = idProjeto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Date getPrazo() {
        return prazo;
    }

    public void setPrazo(Date prazo) {
        this.prazo = prazo;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataModificacao() {
        return dataModificacao;
    }

    public void setDataModificacao(Date dataModificacao) {
        this.dataModificacao = dataModificacao;
    }

    public int getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
    }
}
