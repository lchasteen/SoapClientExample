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
 * <p>Java class for serviceLocations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceLocations">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="electricServiceLocations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="electricServiceLocation" type="{http://www.multispeak.org/Version_3.0}electricServiceLocation" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="waterServiceLocations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="waterServiceLocation" type="{http://www.multispeak.org/Version_3.0}waterServiceLocation" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gasServiceLocations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="gasServiceLocation" type="{http://www.multispeak.org/Version_3.0}gasServiceLocation" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="propaneServiceLocations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="propaneServiceLocation" type="{http://www.multispeak.org/Version_3.0}propaneServiceLocation" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "serviceLocations", propOrder = {
    "electricServiceLocations",
    "waterServiceLocations",
    "gasServiceLocations",
    "propaneServiceLocations"
})
public class ServiceLocations
    extends MspObject
{

    protected ServiceLocations.ElectricServiceLocations electricServiceLocations;
    protected ServiceLocations.WaterServiceLocations waterServiceLocations;
    protected ServiceLocations.GasServiceLocations gasServiceLocations;
    protected ServiceLocations.PropaneServiceLocations propaneServiceLocations;

    /**
     * Gets the value of the electricServiceLocations property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLocations.ElectricServiceLocations }
     *     
     */
    public ServiceLocations.ElectricServiceLocations getElectricServiceLocations() {
        return electricServiceLocations;
    }

    /**
     * Sets the value of the electricServiceLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLocations.ElectricServiceLocations }
     *     
     */
    public void setElectricServiceLocations(ServiceLocations.ElectricServiceLocations value) {
        this.electricServiceLocations = value;
    }

    /**
     * Gets the value of the waterServiceLocations property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLocations.WaterServiceLocations }
     *     
     */
    public ServiceLocations.WaterServiceLocations getWaterServiceLocations() {
        return waterServiceLocations;
    }

    /**
     * Sets the value of the waterServiceLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLocations.WaterServiceLocations }
     *     
     */
    public void setWaterServiceLocations(ServiceLocations.WaterServiceLocations value) {
        this.waterServiceLocations = value;
    }

    /**
     * Gets the value of the gasServiceLocations property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLocations.GasServiceLocations }
     *     
     */
    public ServiceLocations.GasServiceLocations getGasServiceLocations() {
        return gasServiceLocations;
    }

    /**
     * Sets the value of the gasServiceLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLocations.GasServiceLocations }
     *     
     */
    public void setGasServiceLocations(ServiceLocations.GasServiceLocations value) {
        this.gasServiceLocations = value;
    }

    /**
     * Gets the value of the propaneServiceLocations property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLocations.PropaneServiceLocations }
     *     
     */
    public ServiceLocations.PropaneServiceLocations getPropaneServiceLocations() {
        return propaneServiceLocations;
    }

    /**
     * Sets the value of the propaneServiceLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLocations.PropaneServiceLocations }
     *     
     */
    public void setPropaneServiceLocations(ServiceLocations.PropaneServiceLocations value) {
        this.propaneServiceLocations = value;
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
     *         &lt;element name="electricServiceLocation" type="{http://www.multispeak.org/Version_3.0}electricServiceLocation" maxOccurs="unbounded" minOccurs="0"/>
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
        "electricServiceLocation"
    })
    public static class ElectricServiceLocations {

        protected List<ElectricServiceLocation> electricServiceLocation;

        /**
         * Gets the value of the electricServiceLocation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the electricServiceLocation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getElectricServiceLocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ElectricServiceLocation }
         * 
         * 
         */
        public List<ElectricServiceLocation> getElectricServiceLocation() {
            if (electricServiceLocation == null) {
                electricServiceLocation = new ArrayList<ElectricServiceLocation>();
            }
            return this.electricServiceLocation;
        }

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
     *         &lt;element name="gasServiceLocation" type="{http://www.multispeak.org/Version_3.0}gasServiceLocation" maxOccurs="unbounded" minOccurs="0"/>
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
        "gasServiceLocation"
    })
    public static class GasServiceLocations {

        protected List<GasServiceLocation> gasServiceLocation;

        /**
         * Gets the value of the gasServiceLocation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the gasServiceLocation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGasServiceLocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GasServiceLocation }
         * 
         * 
         */
        public List<GasServiceLocation> getGasServiceLocation() {
            if (gasServiceLocation == null) {
                gasServiceLocation = new ArrayList<GasServiceLocation>();
            }
            return this.gasServiceLocation;
        }

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
     *         &lt;element name="propaneServiceLocation" type="{http://www.multispeak.org/Version_3.0}propaneServiceLocation" maxOccurs="unbounded" minOccurs="0"/>
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
        "propaneServiceLocation"
    })
    public static class PropaneServiceLocations {

        protected List<PropaneServiceLocation> propaneServiceLocation;

        /**
         * Gets the value of the propaneServiceLocation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the propaneServiceLocation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPropaneServiceLocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PropaneServiceLocation }
         * 
         * 
         */
        public List<PropaneServiceLocation> getPropaneServiceLocation() {
            if (propaneServiceLocation == null) {
                propaneServiceLocation = new ArrayList<PropaneServiceLocation>();
            }
            return this.propaneServiceLocation;
        }

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
     *         &lt;element name="waterServiceLocation" type="{http://www.multispeak.org/Version_3.0}waterServiceLocation" maxOccurs="unbounded" minOccurs="0"/>
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
        "waterServiceLocation"
    })
    public static class WaterServiceLocations {

        protected List<WaterServiceLocation> waterServiceLocation;

        /**
         * Gets the value of the waterServiceLocation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the waterServiceLocation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWaterServiceLocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WaterServiceLocation }
         * 
         * 
         */
        public List<WaterServiceLocation> getWaterServiceLocation() {
            if (waterServiceLocation == null) {
                waterServiceLocation = new ArrayList<WaterServiceLocation>();
            }
            return this.waterServiceLocation;
        }

    }

}
