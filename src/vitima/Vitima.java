package vitima;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vitima implements Serializable {
    
    @Id
    @GeneratedValue
    private int idVitima;
    private String quantidadeEnvolvidos;
    private String relacaoPessoaAtendida;
    
    @Column(nullable = true)
    private String relacaoPessoaAtendidaOutro;
    
    private String sexoProvavelAutor;
    private String suspeitaAlcool;
    
    
    private String dataNotificacao;
    private String uf;
    private String municipioNotificacao;
    private String codIbgeDadosGerais;
    private String unidadeSaude;
    private String codCnes;
    private String dataOcorrencia;
    private String horaOcorrencia;
    
    private String evolucaoCaso;
    private String dataCasoObito;
    
    
    
    
    private String LocalOcorrencia;
    @Column(nullable = true)
    private String outroLocalOcorrencia;
    private String ufOcorrencia;
    private String municipioOcorrencia;
    private String bairroOcorrencia;
    private String LogradouroOcorrencia;
    private String numeroOcorrencia;
    private String complementoOcorrencia;
    private String zonaOcorrencia;
    private String ocorreuQuantasVezes;
    private String LesaoAutoprovocada;
    private String meioAgressao;
    private String meioAgressaoOutros;
    private String tipoViolencia;
    
    @Column(nullable = true)
    private String tipoViolenciaOutro;
    
    private String nomePessoaAtendida;
    private String dataNascimento;
    private String idade;
    private String tipoIdade;
    private String sexo;
    private String gestante;
    private String cor;
    private String escolaridade;
    private String ocupacao;
    private String situacaoConjugal;
    private String relacoesSexuais;
    private String tipoDeDeficiencia;
    private String NumCartaoSus;
    private String nomeMae;
    
    private String ufResidencia;
    private String municipioResidencia;
    private String codigoIbgeResidencia;
    private String bairroresidencia;
    private String logradouro;
    private String numeroLogradouro;
    private String complemento;
    private String pontoReferencia;
    private String cepResidencia;
    private String telefone;
    private String zonaResidencia;
    // Pais só será preenchido se residir em outro pais.
    private String pais;
    
    private String violenciaSexual;
    
    @Column(nullable = true)
    private String violenciaSexualOutro;
    private String ocorreuPenetracao;
    
    
    
    public int getIdVitima() {
        return idVitima;
    }

    public void setIdVitima(int idVitima) {
        this.idVitima = idVitima;
    }

    public String getQuantidadeEnvolvidos() {
        return quantidadeEnvolvidos;
    }

    public void setQuantidadeEnvolvidos(String quantidadeEnvolvidos) {
        this.quantidadeEnvolvidos = quantidadeEnvolvidos;
    }

    public String getRelacaoPessoaAtendida() {
        return relacaoPessoaAtendida;
    }

    public void setRelacaoPessoaAtendida(String relacaoPessoaAtendida) {
        this.relacaoPessoaAtendida = relacaoPessoaAtendida;
    }

    public String getRelacaoPessoaAtendidaOutro() {
        return relacaoPessoaAtendidaOutro;
    }

    public void setRelacaoPessoaAtendidaOutro(String relacaoPessoaAtendidaOutro) {
        this.relacaoPessoaAtendidaOutro = relacaoPessoaAtendidaOutro;
    }

    public String getLocalOcorrencia() {
        return LocalOcorrencia;
    }

    public void setLocalOcorrencia(String LocalOcorrencia) {
        this.LocalOcorrencia = LocalOcorrencia;
    }

    public String getDataNotificacao() {
        return dataNotificacao;
    }

    public void setDataNotificacao(String dataNotificacao) {
        this.dataNotificacao = dataNotificacao;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getMunicipioNotificacao() {
        return municipioNotificacao;
    }

    public void setMunicipioNotificacao(String municipioNotificacao) {
        this.municipioNotificacao = municipioNotificacao;
    }

    public String getCodIbgeDadosGerais() {
        return codIbgeDadosGerais;
    }

    public void setCodIbgeDadosGerais(String codIbgeDadosGerais) {
        this.codIbgeDadosGerais = codIbgeDadosGerais;
    }

    public String getUnidadeSaude() {
        return unidadeSaude;
    }

    public void setUnidadeSaude(String unidadeSaude) {
        this.unidadeSaude = unidadeSaude;
    }

    public String getCodCnes() {
        return codCnes;
    }

    public void setCodCnes(String codCnes) {
        this.codCnes = codCnes;
    }

    public String getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(String dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }

    public String getHoraOcorrencia() {
        return horaOcorrencia;
    }

    public void setHoraOcorrencia(String horaOcorrencia) {
        this.horaOcorrencia = horaOcorrencia;
    }

    public String getEvolucaoCaso() {
        return evolucaoCaso;
    }

    public void setEvolucaoCaso(String evolucaoCaso) {
        this.evolucaoCaso = evolucaoCaso;
    }

    public String getDataCasoObito() {
        return dataCasoObito;
    }

    public void setDataCasoObito(String dataCasoObito) {
        this.dataCasoObito = dataCasoObito;
    }

    public String getOutroLocalOcorrencia() {
        return outroLocalOcorrencia;
    }

    public void setOutroLocalOcorrencia(String outroLocalOcorrencia) {
        this.outroLocalOcorrencia = outroLocalOcorrencia;
    }

    public String getUfOcorrencia() {
        return ufOcorrencia;
    }

    public void setUfOcorrencia(String ufOcorrencia) {
        this.ufOcorrencia = ufOcorrencia;
    }

    public String getMunicipioOcorrencia() {
        return municipioOcorrencia;
    }

    public void setMunicipioOcorrencia(String municipioOcorrencia) {
        this.municipioOcorrencia = municipioOcorrencia;
    }

    public String getBairroOcorrencia() {
        return bairroOcorrencia;
    }

    public void setBairroOcorrencia(String bairroOcorrencia) {
        this.bairroOcorrencia = bairroOcorrencia;
    }

    public String getLogradouroOcorrencia() {
        return LogradouroOcorrencia;
    }

    public void setLogradouroOcorrencia(String LogradouroOcorrencia) {
        this.LogradouroOcorrencia = LogradouroOcorrencia;
    }

    public String getNumeroOcorrencia() {
        return numeroOcorrencia;
    }

    public void setNumeroOcorrencia(String numeroOcorrencia) {
        this.numeroOcorrencia = numeroOcorrencia;
    }

    public String getComplementoOcorrencia() {
        return complementoOcorrencia;
    }

    public void setComplementoOcorrencia(String complementoOcorrencia) {
        this.complementoOcorrencia = complementoOcorrencia;
    }

    public String getZonaOcorrencia() {
        return zonaOcorrencia;
    }

    public void setZonaOcorrencia(String zonaOcorrencia) {
        this.zonaOcorrencia = zonaOcorrencia;
    }

    public String getOcorreuQuantasVezes() {
        return ocorreuQuantasVezes;
    }

    public void setOcorreuQuantasVezes(String ocorreuQuantasVezes) {
        this.ocorreuQuantasVezes = ocorreuQuantasVezes;
    }

    public String getLesaoAutoprovocada() {
        return LesaoAutoprovocada;
    }

    public void setLesaoAutoprovocada(String LesaoAutoprovocada) {
        this.LesaoAutoprovocada = LesaoAutoprovocada;
    }

    public String getMeioAgressao() {
        return meioAgressao;
    }

    public void setMeioAgressao(String meioAgressao) {
        this.meioAgressao = meioAgressao;
    }

    public String getMeioAgressaoOutros() {
        return meioAgressaoOutros;
    }

    public void setMeioAgressaoOutros(String meioAgressaoOutros) {
        this.meioAgressaoOutros = meioAgressaoOutros;
    }

    public String getTipoViolencia() {
        return tipoViolencia;
    }

    public void setTipoViolencia(String tipoViolencia) {
        this.tipoViolencia = tipoViolencia;
    }

    public String getTipoViolenciaOutro() {
        return tipoViolenciaOutro;
    }

    public void setTipoViolenciaOutro(String tipoViolenciaOutro) {
        this.tipoViolenciaOutro = tipoViolenciaOutro;
    }

    public String getNomePessoaAtendida() {
        return nomePessoaAtendida;
    }

    public void setNomePessoaAtendida(String nomePessoaAtendida) {
        this.nomePessoaAtendida = nomePessoaAtendida;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getTipoIdade() {
        return tipoIdade;
    }

    public void setTipoIdade(String tipoIdade) {
        this.tipoIdade = tipoIdade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getGestante() {
        return gestante;
    }

    public void setGestante(String gestante) {
        this.gestante = gestante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public String getSituacaoConjugal() {
        return situacaoConjugal;
    }

    public void setSituacaoConjugal(String situacaoConjugal) {
        this.situacaoConjugal = situacaoConjugal;
    }

    public String getRelacoesSexuais() {
        return relacoesSexuais;
    }

    public void setRelacoesSexuais(String relacoesSexuais) {
        this.relacoesSexuais = relacoesSexuais;
    }

    public String getTipoDeDeficiencia() {
        return tipoDeDeficiencia;
    }

    public void setTipoDeDeficiencia(String tipoDeDeficiencia) {
        this.tipoDeDeficiencia = tipoDeDeficiencia;
    }

    public String getNumCartaoSus() {
        return NumCartaoSus;
    }

    public void setNumCartaoSus(String NumCartaoSus) {
        this.NumCartaoSus = NumCartaoSus;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getUfResidencia() {
        return ufResidencia;
    }

    public void setUfResidencia(String ufResidencia) {
        this.ufResidencia = ufResidencia;
    }

    public String getMunicipioResidencia() {
        return municipioResidencia;
    }

    public void setMunicipioResidencia(String municipioResidencia) {
        this.municipioResidencia = municipioResidencia;
    }

    public String getCodigoIbgeResidencia() {
        return codigoIbgeResidencia;
    }

    public void setCodigoIbgeResidencia(String codigoIbgeResidencia) {
        this.codigoIbgeResidencia = codigoIbgeResidencia;
    }

    public String getBairroresidencia() {
        return bairroresidencia;
    }

    public void setBairroresidencia(String bairroresidencia) {
        this.bairroresidencia = bairroresidencia;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumeroLogradouro() {
        return numeroLogradouro;
    }

    public void setNumeroLogradouro(String numeroLogradouro) {
        this.numeroLogradouro = numeroLogradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getPontoReferencia() {
        return pontoReferencia;
    }

    public void setPontoReferencia(String pontoReferencia) {
        this.pontoReferencia = pontoReferencia;
    }

    public String getCepResidencia() {
        return cepResidencia;
    }

    public void setCepResidencia(String cepResidencia) {
        this.cepResidencia = cepResidencia;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getZonaResidencia() {
        return zonaResidencia;
    }

    public void setZonaResidencia(String zonaResidencia) {
        this.zonaResidencia = zonaResidencia;
    }
    
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getViolenciaSexual() {
        return violenciaSexual;
    }

    public void setViolenciaSexual(String violenciaSexual) {
        this.violenciaSexual = violenciaSexual;
    }

    public String getViolenciaSexualOutro() {
        return violenciaSexualOutro;
    }

    public void setViolenciaSexualOutro(String violenciaSexualOutro) {
        this.violenciaSexualOutro = violenciaSexualOutro;
    }

    public String getOcorreuPenetracao() {
        return ocorreuPenetracao;
    }

    public void setOcorreuPenetracao(String ocorreuPenetracao) {
        this.ocorreuPenetracao = ocorreuPenetracao;
    }

   
    
}
