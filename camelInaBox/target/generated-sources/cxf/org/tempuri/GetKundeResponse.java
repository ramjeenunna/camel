
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfserviceenumvalues.Kunde;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getKundeResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceenumvalues}Kunde" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getKundeResult"
})
@XmlRootElement(name = "getKundeResponse")
public class GetKundeResponse {

    @XmlElementRef(name = "getKundeResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<Kunde> getKundeResult;

    /**
     * Gets the value of the getKundeResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Kunde }{@code >}
     *     
     */
    public JAXBElement<Kunde> getGetKundeResult() {
        return getKundeResult;
    }

    /**
     * Sets the value of the getKundeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Kunde }{@code >}
     *     
     */
    public void setGetKundeResult(JAXBElement<Kunde> value) {
        this.getKundeResult = ((JAXBElement<Kunde> ) value);
    }

}
