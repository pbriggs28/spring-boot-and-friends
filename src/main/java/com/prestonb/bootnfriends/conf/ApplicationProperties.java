package com.prestonb.bootnfriends.conf;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

	@Validated
	@Component
	@ConfigurationProperties(prefix="com.prestonb")
	public class ApplicationProperties {

		@NotNull(message = "Must set the max number of retries.")
		@Max(value = 10, message = "Max number of retries is 10")
		@Min(value = 0, message = "Max number of retries must be positive")
		private Integer maxNumRetries;
		
		/** Ignore the case of the username when attempting authentication. */
		private Boolean ignoreUsernameCase = true;
		
		/** Redirect all HTTP traffic to HTTPS */
		private Boolean requireSecure;
		
		/** Turn off CSRF tokenization. This helps fix an issue with REST POSTs
		 * interfering with our security mechanism in non-prod environments.
		 * NOTE: This will be ignored in any non-local environment. 
		 */
		private Boolean disableCsrf;
		
		// Getter/setters
		
		public Boolean getIgnoreUsernameCase() {
			return ignoreUsernameCase;
		}
		public void setIgnoreUsernameCase(Boolean ignoreUsernameCase) {
			this.ignoreUsernameCase = ignoreUsernameCase;
		}
		public Boolean getRequireSecure() {
			return requireSecure;
		}
		public void setRequireSecure(Boolean requireSecure) {
			this.requireSecure = requireSecure;
		}
		public Boolean getDisableCsrf() {
			return disableCsrf;
		}
		public void setDisableCsrf(Boolean disableCsrf) {
			this.disableCsrf = disableCsrf;
		}
		public Integer getMaxNumRetries() {
			return maxNumRetries;
		}
		public void setMaxNumRetries(Integer maxNumRetries) {
			this.maxNumRetries = maxNumRetries;
		}
		
		
		
	
	}
