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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for meterBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="meterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servLoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="premiseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="form" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baseType" type="{http://www.multispeak.org/Version_3.0}baseType" minOccurs="0"/>
 *         &lt;element name="instrumentTransformers" type="{http://www.multispeak.org/Version_3.0}instrumentTransformers" minOccurs="0"/>
 *         &lt;element name="deviceList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CDDeviceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="loadManagementlDeviceList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="loadManagementDeviceID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "meterBase", propOrder = {
    "meterID",
    "meterNo",
    "servLoc",
    "premiseID",
    "form",
    "clazz",
    "baseType",
    "instrumentTransformers",
    "deviceList"
})
public class MeterBase
    extends MspPointObject
{

    protected String meterID;
    protected String meterNo;
    protected String servLoc;
    protected String premiseID;
    protected String form;
    @XmlElement(name = "class")
    protected String clazz;
    protected BaseType baseType;
    protected InstrumentTransformers instrumentTransformers;
    protected MeterBase.DeviceList deviceList;

    /**
     * Gets the value of the meterID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterID() {
        return meterID;
    }

    /**
     * Sets the value of the meterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterID(String value) {
        this.meterID = value;
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
     * Gets the value of the premiseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremiseID() {
        return premiseID;
    }

    /**
     * Sets the value of the premiseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPremiseID(String value) {
        this.premiseID = value;
    }

    /**
     * Gets the value of the form property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForm() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForm(String value) {
        this.form = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the baseType property.
     * 
     * @return
     *     possible object is
     *     {@link BaseType }
     *     
     */
    public BaseType getBaseType() {
        return baseType;
    }

    /**
     * Sets the value of the baseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseType }
     *     
     */
    public void setBaseType(BaseType value) {
        this.baseType = value;
    }

    /**
     * Gets the value of the instrumentTransformers property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentTransformers }
     *     
     */
    public InstrumentTransformers getInstrumentTransformers() {
        return instrumentTransformers;
    }

    /**
     * Sets the value of the instrumentTransformers property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentTransformers }
     *     
     */
    public void setInstrumentTransformers(InstrumentTransformers value) {
        this.instrumentTransformers = value;
    }

    /**
     * Gets the value of the deviceList property.
     * 
     * @return
     *     possible object is
     *     {@link MeterBase.DeviceList }
     *     
     */
    public MeterBase.DeviceList getDeviceList() {
        return deviceList;
    }

    /**
     * Sets the value of the deviceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterBase.DeviceList }
     *     
     */
    public void setDeviceList(MeterBase.DeviceList value) {
        this.deviceList = value;
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
     *         &lt;element name="CDDeviceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="loadManagementlDeviceList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="loadManagementDeviceID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "cdDeviceID",
        "loadManagementlDeviceList"
    })
    public static class DeviceList {

        @XmlElement(name = "CDDeviceID")
        protected String cdDeviceID;
        protected MeterBase.DeviceList.LoadManagementlDeviceList loadManagementlDeviceList;

        /**
         * Gets the value of the cdDeviceID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCDDeviceID() {
            return cdDeviceID;
        }

        /**
         * Sets the value of the cdDeviceID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCDDeviceID(String value) {
            this.cdDeviceID = value;
        }

        /**
         * Gets the value of the loadManagementlDeviceList property.
         * 
         * @return
         *     possible object is
         *     {@link MeterBase.DeviceList.LoadManagementlDeviceList }
         *     
         */
        public MeterBase.DeviceList.LoadManagementlDeviceList getLoadManagementlDeviceList() {
            return loadManagementlDeviceList;
        }

        /**
         * Sets the value of the loadManagementlDeviceList property.
         * 
         * @param value
         *     allowed object is
         *     {@link MeterBase.DeviceList.LoadManagementlDeviceList }
         *     
         */
        public void setLoadManagementlDeviceList(MeterBase.DeviceList.LoadManagementlDeviceList value) {
            this.loadManagementlDeviceList = value;
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
         *         &lt;element name="loadManagementDeviceID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
            "loadManagementDeviceID"
        })
        public static class LoadManagementlDeviceList {

            protected List<String> loadManagementDeviceID;

            /**
             * Gets the value of the loadManagementDeviceID property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the loadManagementDeviceID property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLoadManagementDeviceID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getLoadManagementDeviceID() {
                if (loadManagementDeviceID == null) {
                    loadManagementDeviceID = new ArrayList<String>();
                }
                return this.loadManagementDeviceID;
            }

        }

    }

}
