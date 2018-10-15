//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.15 at 05:18:24 PM EDT 
//


package com.partnersoft.v5.soap.client.example.multispeak.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outageStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="outageStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Assumed"/>
 *     &lt;enumeration value="Confirmed"/>
 *     &lt;enumeration value="Restored"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Scheduled"/>
 *     &lt;enumeration value="StillOut"/>
 *     &lt;enumeration value="NonPay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "outageStatus")
@XmlEnum
public enum OutageStatus {

    @XmlEnumValue("Assumed")
    ASSUMED("Assumed"),
    @XmlEnumValue("Confirmed")
    CONFIRMED("Confirmed"),
    @XmlEnumValue("Restored")
    RESTORED("Restored"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Scheduled")
    SCHEDULED("Scheduled"),
    @XmlEnumValue("StillOut")
    STILL_OUT("StillOut"),
    @XmlEnumValue("NonPay")
    NON_PAY("NonPay");
    private final String value;

    OutageStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutageStatus fromValue(String v) {
        for (OutageStatus c: OutageStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}