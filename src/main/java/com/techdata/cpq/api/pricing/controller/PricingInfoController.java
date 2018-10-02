package com.techdata.cpq.api.pricing.controller;

import java.math.BigDecimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techdata.cpq.api.pricing.model.request.PricingInfoRequest;
import com.techdata.cpq.api.pricing.model.response.PricingInfoResponse;

/**
 * 
 * @author CPQ Pricing Wrapper API Development
 *
 */
@RestController
public class PricingInfoController {
	
	private final static Logger logger = LogManager.getLogger(PricingInfoController.class);
	@RequestMapping(value="/getInfo", method=RequestMethod.POST)
	public PricingInfoResponse getPricingInfo(@RequestBody PricingInfoRequest pricingInfoRequest) {
		String documentId = pricingInfoRequest.getDocumentId();
		logger.info(" documentId from the request is : "+documentId);
		PricingInfoResponse pricingInfoResp = new PricingInfoResponse();
		pricingInfoResp.setMarginPercentage(new BigDecimal(Math.random()));
		pricingInfoResp.setPrice(new BigDecimal(Math.random()));
		logger.info(" Response has been sent!! ");
		return pricingInfoResp;
	}

}
