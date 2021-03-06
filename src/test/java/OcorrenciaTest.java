
import com.github.viniciussoaresti.pmgus.negocio.Endereco;
import com.github.viniciussoaresti.pmgus.negocio.Municipio;
import com.github.viniciussoaresti.pmgus.negocio.Ocorrencia;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sb Grafica
 */
public class OcorrenciaTest {

    Ocorrencia ocorrencia;
    Endereco endereco;
    Municipio municipio;

    public OcorrenciaTest() {
    }

    @Before
    public void setUp() {
        ocorrencia = new Ocorrencia();
        endereco = new Endereco();
        municipio = new Municipio();
        ocorrencia.setCodigo(1);
        ocorrencia.setOcorrencia("");
        ocorrencia.setDescricaoOcorrencia("");
        ocorrencia.setEfetivoDeApreensao("");
        ocorrencia.setZona("");
        ocorrencia.setMunicipio(municipio);
        ocorrencia.setEndereco(endereco);
        ocorrencia.setQtdeArma(0);
        ocorrencia.setQtdeDroga(0);
        ocorrencia.setOutrasApreensoes("");
        ocorrencia.setNomeImputado("");
        ocorrencia.setIdadeImputado(11);
        ocorrencia.setEnderecoImputado("");
        ocorrencia.setProfissaoImputado("");
        ocorrencia.setEstadoCivilImputado("");
        ocorrencia.setNomeVitima("");
        ocorrencia.setIdadeVitima(0);
        ocorrencia.setEnderecoVitima("");
        ocorrencia.setProfissaoVitima("");
        ocorrencia.setEstadoCivilVitima("");
    }
    
    @Test
    public void testValidaOcorrencia() {
        Assert.assertEquals(ocorrencia.validaOcorrencia(), true);
    }
    @Test
    public void testValidaDescricaoOcorrencia() {
        Assert.assertEquals(ocorrencia.validaDescricaoOcorrencia(), true);
    }
    @Test
    public void testValidaEfetivos() {
        Assert.assertEquals(ocorrencia.validaEfetivos(), true);
    }
    
    //teste date
    
    @Test
    public void testValidaZona() {
        Assert.assertEquals(ocorrencia.validaZona(), true);
    }
    @Test
    public void testValidaMunicipio() {
        Assert.assertEquals(ocorrencia.validaMunicipio(), true);
    }
    @Test
    public void testValidaEndereco() {
        Assert.assertEquals(ocorrencia.validaEndereco(), true);
    }
    @Test
    public void testValidaQtdeArma() {
        Assert.assertEquals(ocorrencia.validaQtdeArma(), true);
    }
     @Test
    public void testValidaQtdeDroga() {
        Assert.assertEquals(ocorrencia.validaQtdeDroga(), true);
    }
    @Test
    public void testValidaOutrasApreensoes() {
        Assert.assertEquals(ocorrencia.validaOutrasApreensoes(), true);
    }
    @Test
    public void testValidaNomeImputado() {
        Assert.assertEquals(ocorrencia.validaNomeImputado(), true);
    }
    @Test
    public void testValidaIdadeImputado() {
        Assert.assertEquals(ocorrencia.validaIdadeImputado(), true);
    }
    @Test
    public void testValidaEnderecoImputado() {
        Assert.assertEquals(ocorrencia.validaEnderecoImputado(), true);
    }
    @Test
    public void testValidaProfissaoImputado() {
        Assert.assertEquals(ocorrencia.validaProfissaoImputado(), true);
    }
    @Test
    public void testValidaEstadoCivilImputado() {
        Assert.assertEquals(ocorrencia.validaEstadoCivilImputado(), true);
    }
     @Test
    public void testValidaNomeVitima() {
        Assert.assertEquals(ocorrencia.validaNomeVitima(), true);
    }
    @Test
    public void testValidaIdadeVitima() {
        Assert.assertEquals(ocorrencia.validaIdadeVitima(), true);
    }
    @Test
    public void testValidaEnderecoVitima() {
        Assert.assertEquals(ocorrencia.validaEnderecoVitima(), true);
    }
    @Test
    public void testValidaProfissaoVitima() {
        Assert.assertEquals(ocorrencia.validaProfissaoVitima(), true);
    }
    @Test
    public void testValidaEstadoCivilVitima() {
        Assert.assertEquals(ocorrencia.validaEstadoCivilVitima(), true);
    }
}
