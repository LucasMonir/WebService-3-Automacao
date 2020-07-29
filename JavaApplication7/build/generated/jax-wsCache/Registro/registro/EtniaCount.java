
package registro;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de etniaCount complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="etniaCount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parametroBusca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listaDados" type="{http://registro/}pessoa" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "etniaCount", propOrder = {
    "parametroBusca",
    "listaDados"
})
public class EtniaCount {

    protected String parametroBusca;
    protected List<Pessoa> listaDados;

    /**
     * Obtém o valor da propriedade parametroBusca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametroBusca() {
        return parametroBusca;
    }

    /**
     * Define o valor da propriedade parametroBusca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametroBusca(String value) {
        this.parametroBusca = value;
    }

    /**
     * Gets the value of the listaDados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaDados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaDados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pessoa }
     * 
     * 
     */
    public List<Pessoa> getListaDados() {
        if (listaDados == null) {
            listaDados = new ArrayList<Pessoa>();
        }
        return this.listaDados;
    }

}
