package com.techdata.cpq.api.pricing.model.response;

import java.math.BigDecimal;

/**
 * 
 * @author CPQ Pricing Wrapper API Development
 *
 */
public class PricingInfoResponse {

	private BigDecimal price;
	private BigDecimal marginPercentage;
	
	public PricingInfoResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PricingInfoResponse(BigDecimal price, BigDecimal marginPercentage) {
		super();
		this.price = price;
		this.marginPercentage = marginPercentage;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getMarginPercentage() {
		return marginPercentage;
	}
	public void setMarginPercentage(BigDecimal marginPercentage) {
		this.marginPercentage = marginPercentage;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PricingInfoResponse [price=");
		builder.append(price);
		builder.append(", marginPercentage=");
		builder.append(marginPercentage);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marginPercentage == null) ? 0 : marginPercentage.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PricingInfoResponse other = (PricingInfoResponse) obj;
		if (marginPercentage == null) {
			if (other.marginPercentage != null)
				return false;
		} else if (!marginPercentage.equals(other.marginPercentage))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}
}
