package com.javawhizz.RestAPI.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
	
	@Entity

	public class Load {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String loadingPoint;
	    private String unloadingPoint;
	    private String productType;
	    private String truckType;
	    private int noOfTrucks;
	    private double weight;
	    private String comment;
	    private String shipperId;
	    private String date;
		public Load(Long id, String loadingPoint, String unloadingPoint, String productType, String truckType,
				int noOfTrucks, double weight, String comment, String shipperId, String date) {
			super();
			this.id = id;
			this.loadingPoint = loadingPoint;
			this.unloadingPoint = unloadingPoint;
			this.productType = productType;
			this.truckType = truckType;
			this.noOfTrucks = noOfTrucks;
			this.weight = weight;
			this.comment = comment;
			this.shipperId = shipperId;
			this.date = date;
		}
		public Load() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
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
		public String getComment() {
			return comment;
		}
		public void setComment(String comment) {
			this.comment = comment;
		}
		public String getShipperId() {
			return shipperId;
		}
		public void setShipperId(String shipperId) {
			this.shipperId = shipperId;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		@Override
		public String toString() {
			return "Load [id=" + id + ", loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint
					+ ", productType=" + productType + ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks
					+ ", weight=" + weight + ", comment=" + comment + ", shipperId=" + shipperId + ", date=" + date
					+ "]";
		}

	    // Getters and setters (omit for brevity, generate them or use Lombok)
	}
	
