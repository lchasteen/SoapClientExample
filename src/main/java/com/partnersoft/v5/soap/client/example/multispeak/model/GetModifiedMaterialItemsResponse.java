//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.16 at 08:50:02 PM EDT 
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
 *         &lt;element name="GetModifiedMaterialItemsResult" type="{http://www.multispeak.org/Version_3.0}ArrayOfMaterialItem" minOccurs="0"/>
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
    "getModifiedMaterialItemsResult"
})
@XmlRootElement(name = "GetModifiedMaterialItemsResponse")
public class GetModifiedMaterialItemsResponse {

    @XmlElement(name = "GetModifiedMaterialItemsResult")
    protected ArrayOfMaterialItem getModifiedMaterialItemsResult;

    /**
     * Gets the value of the getModifiedMaterialItemsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMaterialItem }
     *     
     */
    public ArrayOfMaterialItem getGetModifiedMaterialItemsResult() {
        return getModifiedMaterialItemsResult;
    }

    /**
     * Sets the value of the getModifiedMaterialItemsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMaterialItem }
     *     
     */
    public void setGetModifiedMaterialItemsResult(ArrayOfMaterialItem value) {
        this.getModifiedMaterialItemsResult = value;
    }

}
