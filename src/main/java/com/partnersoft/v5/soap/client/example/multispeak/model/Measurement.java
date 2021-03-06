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
 * <p>Java class for measurement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="measurement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="measurementDeviceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="measurementTypeList" type="{http://www.multispeak.org/Version_3.0}ArrayOfMeasurementType" minOccurs="0"/>
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
@XmlType(name = "measurement", propOrder = {
    "measurementDeviceID",
    "measurementTypeList"
})
public class Measurement
    extends MspObject
{

    protected String measurementDeviceID;
    protected ArrayOfMeasurementType measurementTypeList;

    /**
     * Gets the value of the measurementDeviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementDeviceID() {
        return measurementDeviceID;
    }

    /**
     * Sets the value of the measurementDeviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementDeviceID(String value) {
        this.measurementDeviceID = value;
    }

    /**
     * Gets the value of the measurementTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMeasurementType }
     *     
     */
    public ArrayOfMeasurementType getMeasurementTypeList() {
        return measurementTypeList;
    }

    /**
     * Sets the value of the measurementTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMeasurementType }
     *     
     */
    public void setMeasurementTypeList(ArrayOfMeasurementType value) {
        this.measurementTypeList = value;
    }

}
