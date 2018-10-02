package com.techdata.cpq.api.pricing.model.request;

/**
 * 
 * @author CPQ Pricing Wrapper API Development
 *
 */
public class PricingInfoRequest {
	
private String documentId;

public PricingInfoRequest() {
	super();
	// TODO Auto-generated constructor stub
}

public PricingInfoRequest(String documentId) {
	super();
	this.documentId = documentId;
}

public String getDocumentId() {
	return documentId;
}

public void setDocumentId(String documentId) {
	this.documentId = documentId;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("PricingInfoRequest [documentId=");
	builder.append(documentId);
	builder.append("]");
	return builder.toString();
}

}
