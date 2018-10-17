//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.16 at 08:50:02 PM EDT 
//


package com.partnersoft.v5.soap.client.example.multispeak.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payableItemList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="payableItemList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="payableItem" type="{http://www.multispeak.org/Version_3.0}payableItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="allowableTransactionTypes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="transactionType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
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
@XmlType(name = "payableItemList", propOrder = {
    "payableItem",
    "allowableTransactionTypes"
})
public class PayableItemList {

    protected List<PayableItem> payableItem;
    protected PayableItemList.AllowableTransactionTypes allowableTransactionTypes;

    /**
     * Gets the value of the payableItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payableItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayableItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayableItem }
     * 
     * 
     */
    public List<PayableItem> getPayableItem() {
        if (payableItem == null) {
            payableItem = new ArrayList<PayableItem>();
        }
        return this.payableItem;
    }

    /**
     * Gets the value of the allowableTransactionTypes property.
     * 
     * @return
     *     possible object is
     *     {@link PayableItemList.AllowableTransactionTypes }
     *     
     */
    public PayableItemList.AllowableTransactionTypes getAllowableTransactionTypes() {
        return allowableTransactionTypes;
    }

    /**
     * Sets the value of the allowableTransactionTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayableItemList.AllowableTransactionTypes }
     *     
     */
    public void setAllowableTransactionTypes(PayableItemList.AllowableTransactionTypes value) {
        this.allowableTransactionTypes = value;
    }


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
     *         &lt;element name="transactionType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "transactionType"
    })
    public static class AllowableTransactionTypes {

        protected List<String> transactionType;

        /**
         * Gets the value of the transactionType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the transactionType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTransactionType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTransactionType() {
            if (transactionType == null) {
                transactionType = new ArrayList<String>();
            }
            return this.transactionType;
        }

    }

}
