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
 * <p>Java class for testedElectricMeter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="testedElectricMeter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}receivedElectricMeter">
 *       &lt;sequence>
 *         &lt;element name="meterTestList" type="{http://www.multispeak.org/Version_3.0}meterTestList" minOccurs="0"/>
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
@XmlType(name = "testedElectricMeter", propOrder = {
    "meterTestList"
})
public class TestedElectricMeter
    extends ReceivedElectricMeter
{

    protected MeterTestList meterTestList;

    /**
     * Gets the value of the meterTestList property.
     * 
     * @return
     *     possible object is
     *     {@link MeterTestList }
     *     
     */
    public MeterTestList getMeterTestList() {
        return meterTestList;
    }

    /**
     * Sets the value of the meterTestList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterTestList }
     *     
     */
    public void setMeterTestList(MeterTestList value) {
        this.meterTestList = value;
    }

}
