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
 * <p>Java class for laborComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="laborComponent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extensions" type="{http://www.multispeak.org/Version_3.0}extensions" minOccurs="0"/>
 *         &lt;element name="extensionsList" type="{http://www.multispeak.org/Version_3.0}extensionsList" minOccurs="0"/>
 *         &lt;element name="laborCategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="constMH" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="retireMH" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="salvageMH" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="hotConstMH" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="hotRetireMH" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="hotSalvageMH" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "laborComponent", propOrder = {
    "extensions",
    "extensionsList",
    "laborCategoryID",
    "constMH",
    "retireMH",
    "salvageMH",
    "hotConstMH",
    "hotRetireMH",
    "hotSalvageMH"
})
public class LaborComponent {

    protected Extensions extensions;
    protected ExtensionsList extensionsList;
    protected String laborCategoryID;
    protected Float constMH;
    protected Float retireMH;
    protected Float salvageMH;
    protected Float hotConstMH;
    protected Float hotRetireMH;
    protected Float hotSalvageMH;

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

    /**
     * Gets the value of the extensionsList property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsList }
     *     
     */
    public ExtensionsList getExtensionsList() {
        return extensionsList;
    }

    /**
     * Sets the value of the extensionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsList }
     *     
     */
    public void setExtensionsList(ExtensionsList value) {
        this.extensionsList = value;
    }

    /**
     * Gets the value of the laborCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaborCategoryID() {
        return laborCategoryID;
    }

    /**
     * Sets the value of the laborCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaborCategoryID(String value) {
        this.laborCategoryID = value;
    }

    /**
     * Gets the value of the constMH property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getConstMH() {
        return constMH;
    }

    /**
     * Sets the value of the constMH property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setConstMH(Float value) {
        this.constMH = value;
    }

    /**
     * Gets the value of the retireMH property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRetireMH() {
        return retireMH;
    }

    /**
     * Sets the value of the retireMH property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRetireMH(Float value) {
        this.retireMH = value;
    }

    /**
     * Gets the value of the salvageMH property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSalvageMH() {
        return salvageMH;
    }

    /**
     * Sets the value of the salvageMH property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSalvageMH(Float value) {
        this.salvageMH = value;
    }

    /**
     * Gets the value of the hotConstMH property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHotConstMH() {
        return hotConstMH;
    }

    /**
     * Sets the value of the hotConstMH property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHotConstMH(Float value) {
        this.hotConstMH = value;
    }

    /**
     * Gets the value of the hotRetireMH property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHotRetireMH() {
        return hotRetireMH;
    }

    /**
     * Sets the value of the hotRetireMH property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHotRetireMH(Float value) {
        this.hotRetireMH = value;
    }

    /**
     * Gets the value of the hotSalvageMH property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHotSalvageMH() {
        return hotSalvageMH;
    }

    /**
     * Sets the value of the hotSalvageMH property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHotSalvageMH(Float value) {
        this.hotSalvageMH = value;
    }

}
