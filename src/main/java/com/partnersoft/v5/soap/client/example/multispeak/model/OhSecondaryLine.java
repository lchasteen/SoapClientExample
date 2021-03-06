//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.16 at 08:50:02 PM EDT 
//


package com.partnersoft.v5.soap.client.example.multispeak.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ohSecondaryLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ohSecondaryLine">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspElectricLine">
 *       &lt;sequence>
 *         &lt;element name="secondaryType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Underbuild"/>
 *               &lt;enumeration value="Secondary"/>
 *               &lt;enumeration value="Service"/>
 *               &lt;enumeration value="Other"/>
 *               &lt;enumeration value="Unknown"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="operVolt" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="condPerPhase" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="lengthSrc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ohSecondaryLine", propOrder = {
    "secondaryType",
    "operVolt",
    "condPerPhase",
    "lengthSrc"
})
public class OhSecondaryLine
    extends MspElectricLine
{

    protected String secondaryType;
    protected Float operVolt;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger condPerPhase;
    protected String lengthSrc;

    /**
     * Gets the value of the secondaryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryType() {
        return secondaryType;
    }

    /**
     * Sets the value of the secondaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryType(String value) {
        this.secondaryType = value;
    }

    /**
     * Gets the value of the operVolt property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOperVolt() {
        return operVolt;
    }

    /**
     * Sets the value of the operVolt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOperVolt(Float value) {
        this.operVolt = value;
    }

    /**
     * Gets the value of the condPerPhase property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCondPerPhase() {
        return condPerPhase;
    }

    /**
     * Sets the value of the condPerPhase property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCondPerPhase(BigInteger value) {
        this.condPerPhase = value;
    }

    /**
     * Gets the value of the lengthSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLengthSrc() {
        return lengthSrc;
    }

    /**
     * Sets the value of the lengthSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLengthSrc(String value) {
        this.lengthSrc = value;
    }

}
