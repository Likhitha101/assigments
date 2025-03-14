// OrderRequest.java
package com.example.project2.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public class OrderRequest {
	    private Long customerId;
	    private String packageDescription;
	    private double packageWeight;
	    private String pickupAddress;
	    private String deliveryAddress;
	    private LocalDateTime preferredPickupTime;
	    private LocalDateTime preferredDeliveryTime;
	}
