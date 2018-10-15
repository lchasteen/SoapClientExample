//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.15 at 05:18:24 PM EDT 
//


package com.partnersoft.v5.soap.client.example.multispeak.model;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for mspObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extensions" type="{http://www.multispeak.org/Version_3.0}extensions" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extensionsList" type="{http://www.multispeak.org/Version_3.0}extensionsList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="objectID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="verb" type="{http://www.multispeak.org/Version_3.0}action" default="Change" />
 *       &lt;attribute name="errorString" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="replaceID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="utility" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mspObject", propOrder = {
    "extensions",
    "comments",
    "extensionsList"
})
@XmlSeeAlso({
    PpmMeterExchange.class,
    OutageEventStatus.class,
    OutageLocation.class,
    PpmTransaction.class,
    BackgroundGraphics.class,
    ChargeableDevice.class,
    ReadingObject.class,
    MaterialManagementAssembly.class,
    Measurement.class,
    HistoryLog.class,
    BillingAccountLoad.class,
    BillingDetail.class,
    GpsLocation.class,
    MeterConnectivity.class,
    ChargeableDeviceList.class,
    PpmBalanceAdjustment.class,
    FeederObject.class,
    PayableItem.class,
    ConnectDisconnectList.class,
    WorkOrder.class,
    MeterExchange.class,
    MeterRead.class,
    OutageDetectionLog.class,
    ServiceLocations.class,
    Regulator.class,
    MspDeviceExchange.class,
    OutageDurationEvent.class,
    CallBackList.class,
    WorkTicket.class,
    Message.class,
    ConnectDisconnectEvent.class,
    EmployeeTimeRecord.class,
    CustomerCall.class,
    CircuitElement.class,
    Usage.class,
    OutageDetectionEvent.class,
    AVLEvent.class,
    LaborCategory.class,
    OutageEvent.class,
    WorkOrderSelection.class,
    MaterialItem.class,
    PpmLocation.class,
    Crew.class,
    Vehicle.class,
    Tender.class,
    MspPolygonObject.class,
    ProfileObject.class,
    Capacitor.class,
    CDStateChange.class,
    Anchor.class,
    CustomersAttachedToDevice.class,
    Employee.class,
    MspResultsBase.class,
    ScadaStatus.class,
    MspSwitchingDevice.class,
    PowerMonitor.class,
    CrewActionEvent.class,
    MspDevice.class,
    LoadManagementEvent.class,
    Equipment.class,
    ScadaAnalog.class,
    BilledUsage.class,
    BillingData.class,
    MeterGroup.class,
    ScadaPoints.class,
    SubstationLoadControlStatus.class,
    MspMeter.class,
    Transformer.class,
    Meters.class,
    CustomersAffectedByOutage.class,
    PowerFactorManagementEvent.class,
    EndDeviceShipment.class,
    LoggedOutageDetectionEvent.class,
    Timesheet.class,
    MspPointObject.class,
    MspLineObject.class,
    Customer.class
})
public abstract class MspObject {

    protected Extensions extensions;
    protected String comments;
    protected ExtensionsList extensionsList;
    @XmlAttribute(name = "objectID")
    protected String objectID;
    @XmlAttribute(name = "verb")
    protected Action verb;
    @XmlAttribute(name = "errorString")
    protected String errorString;
    @XmlAttribute(name = "replaceID")
    protected String replaceID;
    @XmlAttribute(name = "utility")
    protected String utility;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
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
     * Gets the value of the objectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectID() {
        return objectID;
    }

    /**
     * Sets the value of the objectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectID(String value) {
        this.objectID = value;
    }

    /**
     * Gets the value of the verb property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getVerb() {
        if (verb == null) {
            return Action.CHANGE;
        } else {
            return verb;
        }
    }

    /**
     * Sets the value of the verb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setVerb(Action value) {
        this.verb = value;
    }

    /**
     * Gets the value of the errorString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorString() {
        return errorString;
    }

    /**
     * Sets the value of the errorString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorString(String value) {
        this.errorString = value;
    }

    /**
     * Gets the value of the replaceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplaceID() {
        return replaceID;
    }

    /**
     * Sets the value of the replaceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplaceID(String value) {
        this.replaceID = value;
    }

    /**
     * Gets the value of the utility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtility() {
        return utility;
    }

    /**
     * Sets the value of the utility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtility(String value) {
        this.utility = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
