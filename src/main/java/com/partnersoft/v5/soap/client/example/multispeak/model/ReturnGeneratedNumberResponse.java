//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.15 at 05:18:24 PM EDT 
//


package com.partnersoft.v5.soap.client.example.multispeak.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ReturnGeneratedNumberResult" type="{http://www.multispeak.org/Version_3.0}errorObject" minOccurs="0"/>
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
    "returnGeneratedNumberResult"
})
@XmlRootElement(name = "ReturnGeneratedNumberResponse")
public class ReturnGeneratedNumberResponse {

    @XmlElement(name = "ReturnGeneratedNumberResult")
    protected ErrorObject returnGeneratedNumberResult;

    /**
     * Gets the value of the returnGeneratedNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorObject }
     *     
     */
    public ErrorObject getReturnGeneratedNumberResult() {
        return returnGeneratedNumberResult;
    }

    /**
     * Sets the value of the returnGeneratedNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorObject }
     *     
     */
    public void setReturnGeneratedNumberResult(ErrorObject value) {
        this.returnGeneratedNumberResult = value;
    }

}
