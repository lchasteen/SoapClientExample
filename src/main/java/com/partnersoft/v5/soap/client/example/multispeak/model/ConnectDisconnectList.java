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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for connectDisconnectList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="connectDisconnectList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="disconnectDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CDList" type="{http://www.multispeak.org/Version_3.0}ArrayOfCDCustomer" minOccurs="0"/>
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
@XmlType(name = "connectDisconnectList", propOrder = {
    "disconnectDate",
    "cdList"
})
public class ConnectDisconnectList
    extends MspObject
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar disconnectDate;
    @XmlElement(name = "CDList")
    protected ArrayOfCDCustomer cdList;

    /**
     * Gets the value of the disconnectDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDisconnectDate() {
        return disconnectDate;
    }

    /**
     * Sets the value of the disconnectDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDisconnectDate(XMLGregorianCalendar value) {
        this.disconnectDate = value;
    }

    /**
     * Gets the value of the cdList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCDCustomer }
     *     
     */
    public ArrayOfCDCustomer getCDList() {
        return cdList;
    }

    /**
     * Sets the value of the cdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCDCustomer }
     *     
     */
    public void setCDList(ArrayOfCDCustomer value) {
        this.cdList = value;
    }

}
