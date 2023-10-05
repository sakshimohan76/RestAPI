package com.restful.springrest.entities;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Loads {
	
	@Id
	private int loadId;
	private String loadingPoint;
	private String unloadingPoint;
	private String productType;
	private String truckType;
	private int noOfTrucks;
	private double weight;
	private UUID shipperId;
	private Date date;
	
	public Loads() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Loads(int loadId, String loadingPoint, String unloadingPoint, String productType, String truckType, int noOfTrucks,
			double weight, UUID shipperId, Date date) {
		super();
		this.loadId=loadId;
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight=weight;
		this.shipperId = shipperId;
		this.date = date;
	}
	public int getLoadId() {
		return loadId;
	}
	public void setLoadId(int loadId) {
		this.loadId = loadId;
	}
	public UUID getShipperId() {
		return shipperId;
	}
	public void setShipperId(UUID shipperId) {
		this.shipperId = shipperId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public int getNoOfTrucks() {
		return noOfTrucks;
	}
	public void setNoOfTrucks(int noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Load [loadId=" +loadId +"loadingPoint=" +loadingPoint +", unloadingPoint=" +unloadingPoint +", productType=" +productType +", truckType" +truckType +", noOfTrucks=" +noOfTrucks +", weight=" +weight +", shipperId=" +shipperId +", Date=" +date +"]";
	}

}
