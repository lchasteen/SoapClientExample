//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.16 at 08:50:02 PM EDT 
//


package com.partnersoft.v5.soap.client.example.multispeak.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for overcurrentDeviceBank complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="overcurrentDeviceBank">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspSwitchingBank">
 *       &lt;sequence>
 *         &lt;element name="mspOverCurrentDeviceList" type="{http://www.multispeak.org/Version_3.0}mspOverCurrentDeviceList" minOccurs="0"/>
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
@XmlType(name = "overcurrentDeviceBank", propOrder = {
    "mspOverCurrentDeviceList"
})
public class OvercurrentDeviceBank
    extends MspSwitchingBank
{

    protected MspOverCurrentDeviceList mspOverCurrentDeviceList;

    /**
     * Gets the value of the mspOverCurrentDeviceList property.
     * 
     * @return
     *     possible object is
     *     {@link MspOverCurrentDeviceList }
     *     
     */
    public MspOverCurrentDeviceList getMspOverCurrentDeviceList() {
        return mspOverCurrentDeviceList;
    }

    /**
     * Sets the value of the mspOverCurrentDeviceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MspOverCurrentDeviceList }
     *     
     */
    public void setMspOverCurrentDeviceList(MspOverCurrentDeviceList value) {
        this.mspOverCurrentDeviceList = value;
    }

}
