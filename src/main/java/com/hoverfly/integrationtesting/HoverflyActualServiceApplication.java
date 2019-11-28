package com.hoverfly.integrationtesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class HoverflyActualServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(HoverflyActualServiceApplication.class, args);
	}

	@RestController
	class restController {
		@RequestMapping(value = "/service/hoverfly")
		public HoverflyServiceResponse getSampleResponse() {
			System.out.println("Inside HoverflyActualServiceApplication::getSampleResponse()");
			return new HoverflyServiceResponse("returned value from HoverflyActualServiceApplication", new Date().toString(), UUID.randomUUID().toString());
		}
	}

	class HoverflyServiceResponse {
		private String message;
		private String responseTime;
		private String transactionId;

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getResponseTime() {
			return responseTime;
		}

		public void setResponseTime(String responseTime) {
			this.responseTime = responseTime;
		}

		public String getTransactionId() {
			return transactionId;
		}

		public void setTransactionId(String transactionId) {
			this.transactionId = transactionId;
		}

		public HoverflyServiceResponse(String message, String responseTime, String transactionId) {
			super();
			this.message = message;
			this.responseTime = responseTime;
			this.transactionId = transactionId;
		}


	}
}
