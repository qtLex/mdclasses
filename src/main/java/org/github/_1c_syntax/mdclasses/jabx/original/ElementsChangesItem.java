//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for ElementsChangesItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElementsChangesItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="guid" type="{http://v8.1c.ru/8.1/data/core}UUID"/&gt;
 *         &lt;element name="main" type="{http://v8.1c.ru/8.2/managed-application/logform}MainElement" minOccurs="0"/&gt;
 *         &lt;element name="field" type="{http://v8.1c.ru/8.2/managed-application/logform}FieldLogForm" minOccurs="0"/&gt;
 *         &lt;element name="group" type="{http://v8.1c.ru/8.2/managed-application/logform}GroupLogForm" minOccurs="0"/&gt;
 *         &lt;element name="table" type="{http://v8.1c.ru/8.2/managed-application/logform}TableLogForm" minOccurs="0"/&gt;
 *         &lt;element name="button" type="{http://v8.1c.ru/8.2/managed-application/logform}Button" minOccurs="0"/&gt;
 *         &lt;element name="decoration" type="{http://v8.1c.ru/8.2/managed-application/logform}Decoration" minOccurs="0"/&gt;
 *         &lt;element name="addition" type="{http://v8.1c.ru/8.2/managed-application/logform}Addition" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="pid" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="aid" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementsChangesItem", namespace = "http://v8.1c.ru/8.2/managed-application/logform", propOrder = {
    "guid",
    "main",
    "field",
    "group",
    "table",
    "button",
    "decoration",
    "addition"
})
public class ElementsChangesItem {

    protected String guid;
    protected MainElement main;
    protected FieldLogForm field;
    protected GroupLogForm group;
    protected TableLogForm table;
    protected Button button;
    protected Decoration decoration;
    protected Addition addition;
    @XmlAttribute(name = "type")
    protected BigDecimal type;
    @XmlAttribute(name = "id")
    protected BigDecimal id;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "pid")
    protected BigDecimal pid;
    @XmlAttribute(name = "aid")
    protected BigDecimal aid;

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the main property.
     * 
     * @return
     *     possible object is
     *     {@link MainElement }
     *     
     */
    public MainElement getMain() {
        return main;
    }

    /**
     * Sets the value of the main property.
     * 
     * @param value
     *     allowed object is
     *     {@link MainElement }
     *     
     */
    public void setMain(MainElement value) {
        this.main = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link FieldLogForm }
     *     
     */
    public FieldLogForm getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldLogForm }
     *     
     */
    public void setField(FieldLogForm value) {
        this.field = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link GroupLogForm }
     *     
     */
    public GroupLogForm getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupLogForm }
     *     
     */
    public void setGroup(GroupLogForm value) {
        this.group = value;
    }

    /**
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link TableLogForm }
     *     
     */
    public TableLogForm getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableLogForm }
     *     
     */
    public void setTable(TableLogForm value) {
        this.table = value;
    }

    /**
     * Gets the value of the button property.
     * 
     * @return
     *     possible object is
     *     {@link Button }
     *     
     */
    public Button getButton() {
        return button;
    }

    /**
     * Sets the value of the button property.
     * 
     * @param value
     *     allowed object is
     *     {@link Button }
     *     
     */
    public void setButton(Button value) {
        this.button = value;
    }

    /**
     * Gets the value of the decoration property.
     * 
     * @return
     *     possible object is
     *     {@link Decoration }
     *     
     */
    public Decoration getDecoration() {
        return decoration;
    }

    /**
     * Sets the value of the decoration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decoration }
     *     
     */
    public void setDecoration(Decoration value) {
        this.decoration = value;
    }

    /**
     * Gets the value of the addition property.
     * 
     * @return
     *     possible object is
     *     {@link Addition }
     *     
     */
    public Addition getAddition() {
        return addition;
    }

    /**
     * Sets the value of the addition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Addition }
     *     
     */
    public void setAddition(Addition value) {
        this.addition = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setType(BigDecimal value) {
        this.type = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setId(BigDecimal value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the pid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPid() {
        return pid;
    }

    /**
     * Sets the value of the pid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPid(BigDecimal value) {
        this.pid = value;
    }

    /**
     * Gets the value of the aid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAid() {
        return aid;
    }

    /**
     * Sets the value of the aid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAid(BigDecimal value) {
        this.aid = value;
    }

}