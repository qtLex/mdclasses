//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package com.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonAttributeAuthenticationSeparation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommonAttributeAuthenticationSeparation"&gt;
 *   &lt;restriction base="{http://v8.1c.ru/8.3/xcf/enums}BaseEnumType"&gt;
 *     &lt;enumeration value="Separate"/&gt;
 *     &lt;enumeration value="DontUse"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CommonAttributeAuthenticationSeparation", namespace = "http://v8.1c.ru/8.3/xcf/enums")
@XmlEnum
public enum CommonAttributeAuthenticationSeparation {

    @XmlEnumValue("Separate")
    SEPARATE("Separate"),
    @XmlEnumValue("DontUse")
    DONT_USE("DontUse");
    private final String value;

    CommonAttributeAuthenticationSeparation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommonAttributeAuthenticationSeparation fromValue(String v) {
        for (CommonAttributeAuthenticationSeparation c: CommonAttributeAuthenticationSeparation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}