//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.15 at 05:18:24 PM EDT 
//


package com.partnersoft.v5.soap.client.example.multispeak.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for riser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="riser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="constType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="riserHeight" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="material" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "riser", propOrder = {
    "constType",
    "riserHeight",
    "material"
})
public class Riser
    extends MspPointObject
{

    protected String constType;
    protected Long riserHeight;
    protected String material;

    /**
     * Gets the value of the constType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstType() {
        return constType;
    }

    /**
     * Sets the value of the constType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstType(String value) {
        this.constType = value;
    }

    /**
     * Gets the value of the riserHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRiserHeight() {
        return riserHeight;
    }

    /**
     * Sets the value of the riserHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRiserHeight(Long value) {
        this.riserHeight = value;
    }

    /**
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Sets the value of the material property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterial(String value) {
        this.material = value;
    }

}