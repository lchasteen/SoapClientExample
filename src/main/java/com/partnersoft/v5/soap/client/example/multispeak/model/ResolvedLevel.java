//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.16 at 08:50:02 PM EDT 
//


package com.partnersoft.v5.soap.client.example.multispeak.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resolvedLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="resolvedLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Meter"/>
 *     &lt;enumeration value="Address"/>
 *     &lt;enumeration value="Unresolved"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "resolvedLevel")
@XmlEnum
public enum ResolvedLevel {

    @XmlEnumValue("Meter")
    METER("Meter"),
    @XmlEnumValue("Address")
    ADDRESS("Address"),
    @XmlEnumValue("Unresolved")
    UNRESOLVED("Unresolved");
    private final String value;

    ResolvedLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResolvedLevel fromValue(String v) {
        for (ResolvedLevel c: ResolvedLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
