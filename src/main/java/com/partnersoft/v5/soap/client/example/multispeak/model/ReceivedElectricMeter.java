//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.16 at 08:50:02 PM EDT 
//


package com.partnersoft.v5.soap.client.example.multispeak.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for receivedElectricMeter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receivedElectricMeter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspMeter">
 *       &lt;sequence>
 *         &lt;element name="electricNameplate" type="{http://www.multispeak.org/Version_3.0}electricNameplate" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receivedElectricMeter", propOrder = {
    "electricNameplate"
})
@XmlSeeAlso({
    TestedElectricMeter.class
})
public class ReceivedElectricMeter
    extends MspMeter
{

    protected ElectricNameplate electricNameplate;

    /**
     * Gets the value of the electricNameplate property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricNameplate }
     *     
     */
    public ElectricNameplate getElectricNameplate() {
        return electricNameplate;
    }

    /**
     * Sets the value of the electricNameplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricNameplate }
     *     
     */
    public void setElectricNameplate(ElectricNameplate value) {
        this.electricNameplate = value;
    }

}
