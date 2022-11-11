package com.acc.lkm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="assets")
public class AssetEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer assetId;
	@Column(name="assetName")
	private String assetName;
	@Column(name="asset_BrandName")
	private String assetBrandName;
	@Column(name="Validity")
	private Integer validity;
	public Integer getAssetId() {
		return assetId;
	}
	public void setAssetId(Integer assetId) {
		this.assetId = assetId;
	}
	public String getAssetName() {
		return assetName;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
	public String getAssetBrandName() {
		return assetBrandName;
	}
	public void setAssetBrandName(String assetBrandName) {
		this.assetBrandName = assetBrandName;
	}
	public Integer getValidity() {
		return validity;
	}
	public void setValidity(Integer validity) {
		this.validity = validity;
	}
	public AssetEntity() {
		super();
	}

}
