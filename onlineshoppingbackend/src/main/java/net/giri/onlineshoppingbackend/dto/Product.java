package net.giri.onlineshoppingbackend.dto;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "PRODUCT")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;
    @JsonIgnore
    private String description;
    private String brand;
    private int views;
    private int purchases;
    @Column(name = "unit_price")
    private double unitPrice;
    @Column(name = "is_active")
    private boolean active;
    @Column(name = "category_id")
    @JsonIgnore
    private int categoryId;
    private int quantity;
    @Column(name = "supplier_id")
    @JsonIgnore
    private int supplierId;

    private String name;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getQuantity() {
	return quantity;
    }

    public void setQuantity(int quantity) {
	this.quantity = quantity;
    }

    public int getId() {
	return id;
    }

    public Product() {
	this.code = "PRD" + UUID.randomUUID().toString().substring(26).toUpperCase();
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getCode() {
	return code;
    }

    public void setCode(String code) {
	this.code = code;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public String getBrand() {
	return brand;
    }

    public void setBrand(String brand) {
	this.brand = brand;
    }

    public int getViews() {
	return views;
    }

    public void setViews(int views) {
	this.views = views;
    }

    public int getPurchases() {
	return purchases;
    }

    public void setPurchases(int purchases) {
	this.purchases = purchases;
    }

    public double getUnitPrice() {
	return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
	this.unitPrice = unitPrice;
    }

    public boolean isActive() {
	return active;
    }

    public void setActive(boolean active) {
	this.active = active;
    }

    public int getCategoryId() {
	return categoryId;
    }

    public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
    }

    public int getSupplierId() {
	return supplierId;
    }

    public void setSupplierId(int supplierId) {
	this.supplierId = supplierId;
    }

}
