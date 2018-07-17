package org.brapi.test.BrAPITestServer;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@ConfigurationProperties("app.baseurl")
//@Component
public class BaseUrlProperty {
	private String baseUrl = "http://localhot:8080/brapi/v1";

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}
}
