
package com.ebay.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowControlDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowControlDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InContextReturnURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowControlDetailsType", propOrder = {
    "errorURL",
    "inContextReturnURL"
})
public class FlowControlDetailsType {

    @XmlElement(name = "ErrorURL")
    protected String errorURL;
    @XmlElement(name = "InContextReturnURL")
    protected String inContextReturnURL;

    /**
     * Gets the value of the errorURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorURL() {
        return errorURL;
    }

    /**
     * Sets the value of the errorURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorURL(String value) {
        this.errorURL = value;
    }

    /**
     * Gets the value of the inContextReturnURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInContextReturnURL() {
        return inContextReturnURL;
    }

    /**
     * Sets the value of the inContextReturnURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInContextReturnURL(String value) {
        this.inContextReturnURL = value;
    }

}
