//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.15 at 05:18:24 PM EDT 
//


package com.partnersoft.v5.soap.client.example.multispeak.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutageCustomerListOutageCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutageCustomerListOutageCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outageCustomer" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.multispeak.org/Version_3.0}outageCustomer">
 *                 &lt;sequence>
 *                   &lt;element name="servLoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="meterNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "ArrayOfOutageCustomerListOutageCustomer", propOrder = {
    "outageCustomer"
})
public class ArrayOfOutageCustomerListOutageCustomer {

    protected List<ArrayOfOutageCustomerListOutageCustomer.OutageCustomer> outageCustomer;

    /**
     * Gets the value of the outageCustomer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outageCustomer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutageCustomer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfOutageCustomerListOutageCustomer.OutageCustomer }
     * 
     * 
     */
    public List<ArrayOfOutageCustomerListOutageCustomer.OutageCustomer> getOutageCustomer() {
        if (outageCustomer == null) {
            outageCustomer = new ArrayList<ArrayOfOutageCustomerListOutageCustomer.OutageCustomer>();
        }
        return this.outageCustomer;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.multispeak.org/Version_3.0}outageCustomer">
     *       &lt;sequence>
     *         &lt;element name="servLoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="meterNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "servLoc",
        "meterNo"
    })
    public static class OutageCustomer
        extends com.partnersoft.v5.soap.client.example.multispeak.model.OutageCustomer
    {

        protected String servLoc;
        protected String meterNo;

        /**
         * Gets the value of the servLoc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServLoc() {
            return servLoc;
        }

        /**
         * Sets the value of the servLoc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServLoc(String value) {
            this.servLoc = value;
        }

        /**
         * Gets the value of the meterNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMeterNo() {
            return meterNo;
        }

        /**
         * Sets the value of the meterNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMeterNo(String value) {
            this.meterNo = value;
        }

    }

}