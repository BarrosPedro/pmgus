package com.github.viniciussoaresti.pmgus.negocio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author BarrosPedro
 */
@Entity
public class Ocorrencia implements Serializable {

    @Id
    @GeneratedValue
    private int codigo;
    @Column(length = 150)
    private String ocorrencia;
    @Column(length = 600)
    private String descricaoOcorrencia;
    @Column(name = "DATA_OCORRENCIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataOcorrencia;
    @Column(length = 60)
    private String efetivoDeApreensao;
    
    @Column(length = 50)
    private String zona;
    @OneToOne(optional = false)
    private Municipio municipio;
    @OneToOne(optional = false)
    private Endereco endereco;

    @OneToOne(optional = false)
    private Arma arma;
    @OneToOne(optional = false)
    private TipoDroga droga;
    @OneToOne(optional = false)
    private UnidadeDroga unidade;
    @Column(length = 70)
    private String outrasApreensoes;
     @Column(length = 10)
    private int qtdeArma;
      @Column(length = 10)
    private int qtdeDroga;
    
    @Column(length = 45) 
    private String nomeImputado;
    @Column(length = 20)
    private String estadoCivilImputado;
    @Column(length = 25)
    private String profissaoImputado;
    @Column(length = 3)
    private int idadeImputado;
    @Column(length = 60)
    private String enderecoImputado;
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(String ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    public String getDescricaoOcorrencia() {
        return descricaoOcorrencia;
    }

    public void setDescricaoOcorrencia(String descricaoOcorrencia) {
        this.descricaoOcorrencia = descricaoOcorrencia;
    }

    public Date getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(Date dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    public Municipio getMunicipio() {
         return municipio;

    }
    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public TipoDroga getDroga(){
            return droga;
        }
    
    public void setDroga(TipoDroga droga) {
        this.droga = droga;
    }

    public UnidadeDroga getUnidade() {
          return unidade;
        }

    public void setUnidade(UnidadeDroga unidade) {
        this.unidade = unidade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getOutrasApreensoes() {
        return outrasApreensoes;
    }

    public void setOutrasApreensoes(String outrasApreensoes) {
        this.outrasApreensoes = outrasApreensoes;
    }

    public String getNomeImputado() {
        return nomeImputado;
    }

    public void setNomeImputado(String nomeImputado) {
        this.nomeImputado = nomeImputado;
    }

    public String getEstadoCivilImputado() {
        return estadoCivilImputado;
    }

    public void setEstadoCivilImputado(String estadoCivilImputado) {
        this.estadoCivilImputado = estadoCivilImputado;
    }

    public String getProfissaoImputado() {
        return profissaoImputado;
    }

    public void setProfissaoImputado(String profissaoImputado) {
        this.profissaoImputado = profissaoImputado;
    }

    public int getIdadeImputado() {
        return idadeImputado;
    }

    public void setIdadeImputado(int idadeImputado) {
        this.idadeImputado = idadeImputado;
    }

    public String getEnderecoImputado() {
        return enderecoImputado;
    }

    public void setEnderecoImputado(String enderecoImputado) {
        this.enderecoImputado = enderecoImputado;
    }

    public int getQtdeArma() {
        return qtdeArma;
    }

    public void setQtdeArma(int qtdeArma) {
        this.qtdeArma = qtdeArma;
    }

    public int getQtdeDroga() {
        return qtdeDroga;
    }

    public void setQtdeDroga(int qtdeDroga) {
        this.qtdeDroga = qtdeDroga;
    }

    public String getEfetivoDeApreensao() {
        return efetivoDeApreensao;
    }

    public void setEfetivoDeApreensao(String efetivoDeApreensao) {
        this.efetivoDeApreensao = efetivoDeApreensao;
    }
    
    
    public Ocorrencia() {
    }

    public Ocorrencia(int codigo, String ocorrencia, String descricaoOcorrencia, Date dataOcorrencia, String zona, Municipio municipio, Endereco endereco, Arma arma, TipoDroga droga, UnidadeDroga unidade, String outrasApreensoes, int qtdeArma, int qtdeDroga, String nomeImputado, String estadoCivilImputado, String profissaoImputado, int idadeImputado, String enderecoImputado, String efetivoDeApreensao) {
        this.codigo = codigo;
        this.ocorrencia = ocorrencia;
        this.descricaoOcorrencia = descricaoOcorrencia;
        this.dataOcorrencia = dataOcorrencia;
        this.zona = zona;
        this.municipio = municipio;
        this.endereco = endereco;
        this.arma = arma;
        this.droga = droga;
        this.unidade = unidade;
        this.outrasApreensoes = outrasApreensoes;
        this.qtdeArma = qtdeArma;
        this.qtdeDroga = qtdeDroga;
        this.nomeImputado = nomeImputado;
        this.estadoCivilImputado = estadoCivilImputado;
        this.profissaoImputado = profissaoImputado;
        this.idadeImputado = idadeImputado;
        this.enderecoImputado = enderecoImputado;
        this.efetivoDeApreensao = efetivoDeApreensao;
    }
    

   public String dadosImputado(){ 
       return this.nomeImputado + ", " + this.idadeImputado + ", " + this.estadoCivilImputado + ", " + this.enderecoImputado;
   }
   public String dadosArma(){ 
       if(this.arma == null){
           return "NENHUMA ARMA APREENDIDA";
       }
       return this.qtdeArma + " " + this.arma.getModelo() + "(" + this.arma.getTipoDeArma() + ")";
   }
   public String dadosDroga(){ 
       if(this.droga == null && this.unidade == null){
           return "NENHUMA DROGA APREENDIDA";
       }
       return this.qtdeDroga + " " + this.unidade.getUnidadeDroga() + " " + this.droga.getNome();
   }
           
}
