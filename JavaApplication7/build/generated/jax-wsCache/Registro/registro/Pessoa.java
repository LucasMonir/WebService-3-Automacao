
package registro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de pessoa complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pessoa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="renda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="etnia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="escolaridade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orientacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emprego" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deficiencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pessoa", propOrder = {
    "nome",
    "renda",
    "etnia",
    "sexo",
    "escolaridade",
    "idade",
    "orientacao",
    "emprego",
    "deficiencia"
})
public class Pessoa {

    protected String nome;
    protected String renda;
    protected String etnia;
    protected String sexo;
    protected String escolaridade;
    protected String idade;
    protected String orientacao;
    protected String emprego;
    protected String deficiencia;

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade renda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenda() {
        return renda;
    }

    /**
     * Define o valor da propriedade renda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenda(String value) {
        this.renda = value;
    }

    /**
     * Obtém o valor da propriedade etnia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtnia() {
        return etnia;
    }

    /**
     * Define o valor da propriedade etnia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtnia(String value) {
        this.etnia = value;
    }

    /**
     * Obtém o valor da propriedade sexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Define o valor da propriedade sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexo(String value) {
        this.sexo = value;
    }

    /**
     * Obtém o valor da propriedade escolaridade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscolaridade() {
        return escolaridade;
    }

    /**
     * Define o valor da propriedade escolaridade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscolaridade(String value) {
        this.escolaridade = value;
    }

    /**
     * Obtém o valor da propriedade idade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdade() {
        return idade;
    }

    /**
     * Define o valor da propriedade idade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdade(String value) {
        this.idade = value;
    }

    /**
     * Obtém o valor da propriedade orientacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientacao() {
        return orientacao;
    }

    /**
     * Define o valor da propriedade orientacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientacao(String value) {
        this.orientacao = value;
    }

    /**
     * Obtém o valor da propriedade emprego.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmprego() {
        return emprego;
    }

    /**
     * Define o valor da propriedade emprego.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmprego(String value) {
        this.emprego = value;
    }

    /**
     * Obtém o valor da propriedade deficiencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeficiencia() {
        return deficiencia;
    }

    /**
     * Define o valor da propriedade deficiencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeficiencia(String value) {
        this.deficiencia = value;
    }

}
