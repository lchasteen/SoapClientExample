//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.16 at 08:50:02 PM EDT 
//


package com.partnersoft.v5.soap.client.example.multispeak.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for telemetry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="telemetry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="speed" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="heading" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="cardinalHeading" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="odometer" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="maxVehSpeedLastReading" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="maxEngineSpeedLastReading" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="engineRunningState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gearShiftPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VTCUEvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "telemetry", propOrder = {
    "speed",
    "heading",
    "cardinalHeading",
    "odometer",
    "maxVehSpeedLastReading",
    "maxEngineSpeedLastReading",
    "engineRunningState",
    "gearShiftPosition",
    "vtcuEvent"
})
public class Telemetry {

    protected Float speed;
    protected Float heading;
    protected String cardinalHeading;
    protected Float odometer;
    protected Float maxVehSpeedLastReading;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxEngineSpeedLastReading;
    protected String engineRunningState;
    protected String gearShiftPosition;
    @XmlElement(name = "VTCUEvent")
    protected String vtcuEvent;

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSpeed(Float value) {
        this.speed = value;
    }

    /**
     * Gets the value of the heading property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHeading() {
        return heading;
    }

    /**
     * Sets the value of the heading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHeading(Float value) {
        this.heading = value;
    }

    /**
     * Gets the value of the cardinalHeading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardinalHeading() {
        return cardinalHeading;
    }

    /**
     * Sets the value of the cardinalHeading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardinalHeading(String value) {
        this.cardinalHeading = value;
    }

    /**
     * Gets the value of the odometer property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOdometer() {
        return odometer;
    }

    /**
     * Sets the value of the odometer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOdometer(Float value) {
        this.odometer = value;
    }

    /**
     * Gets the value of the maxVehSpeedLastReading property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxVehSpeedLastReading() {
        return maxVehSpeedLastReading;
    }

    /**
     * Sets the value of the maxVehSpeedLastReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxVehSpeedLastReading(Float value) {
        this.maxVehSpeedLastReading = value;
    }

    /**
     * Gets the value of the maxEngineSpeedLastReading property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxEngineSpeedLastReading() {
        return maxEngineSpeedLastReading;
    }

    /**
     * Sets the value of the maxEngineSpeedLastReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxEngineSpeedLastReading(BigInteger value) {
        this.maxEngineSpeedLastReading = value;
    }

    /**
     * Gets the value of the engineRunningState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineRunningState() {
        return engineRunningState;
    }

    /**
     * Sets the value of the engineRunningState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineRunningState(String value) {
        this.engineRunningState = value;
    }

    /**
     * Gets the value of the gearShiftPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGearShiftPosition() {
        return gearShiftPosition;
    }

    /**
     * Sets the value of the gearShiftPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGearShiftPosition(String value) {
        this.gearShiftPosition = value;
    }

    /**
     * Gets the value of the vtcuEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTCUEvent() {
        return vtcuEvent;
    }

    /**
     * Sets the value of the vtcuEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTCUEvent(String value) {
        this.vtcuEvent = value;
    }

}
