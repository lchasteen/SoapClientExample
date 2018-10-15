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
 * <p>Java class for waterNameplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="waterNameplate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="installType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value=""/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fluidType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *               &lt;enumeration value="5"/>
 *               &lt;enumeration value="6"/>
 *               &lt;enumeration value=""/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="driveType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *               &lt;enumeration value="5"/>
 *               &lt;enumeration value="6"/>
 *               &lt;enumeration value="7"/>
 *               &lt;enumeration value="8"/>
 *               &lt;enumeration value="9"/>
 *               &lt;enumeration value="10"/>
 *               &lt;enumeration value="11"/>
 *               &lt;enumeration value="12"/>
 *               &lt;enumeration value="13"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="pipeSize" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *               &lt;enumeration value="5"/>
 *               &lt;enumeration value="6"/>
 *               &lt;enumeration value="7"/>
 *               &lt;enumeration value="8"/>
 *               &lt;enumeration value="9"/>
 *               &lt;enumeration value="10"/>
 *               &lt;enumeration value="11"/>
 *               &lt;enumeration value="12"/>
 *               &lt;enumeration value="13"/>
 *               &lt;enumeration value="14"/>
 *               &lt;enumeration value="15"/>
 *               &lt;enumeration value="16"/>
 *               &lt;enumeration value="17"/>
 *               &lt;enumeration value="18"/>
 *               &lt;enumeration value="19"/>
 *               &lt;enumeration value="20"/>
 *               &lt;enumeration value="21"/>
 *               &lt;enumeration value="22"/>
 *               &lt;enumeration value="23"/>
 *               &lt;enumeration value="24"/>
 *               &lt;enumeration value="25"/>
 *               &lt;enumeration value=""/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "waterNameplate", propOrder = {
    "installType",
    "fluidType",
    "driveType",
    "pipeSize"
})
public class WaterNameplate {

    protected String installType;
    protected String fluidType;
    protected String driveType;
    protected String pipeSize;

    /**
     * Gets the value of the installType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallType() {
        return installType;
    }

    /**
     * Sets the value of the installType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallType(String value) {
        this.installType = value;
    }

    /**
     * Gets the value of the fluidType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFluidType() {
        return fluidType;
    }

    /**
     * Sets the value of the fluidType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFluidType(String value) {
        this.fluidType = value;
    }

    /**
     * Gets the value of the driveType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriveType() {
        return driveType;
    }

    /**
     * Sets the value of the driveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriveType(String value) {
        this.driveType = value;
    }

    /**
     * Gets the value of the pipeSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPipeSize() {
        return pipeSize;
    }

    /**
     * Sets the value of the pipeSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPipeSize(String value) {
        this.pipeSize = value;
    }

}