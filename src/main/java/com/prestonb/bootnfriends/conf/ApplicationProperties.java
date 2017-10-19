package com.prestonb.bootnfriends.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

	@Component
	@ConfigurationProperties(prefix="com.prestonb")
	public class ApplicationProperties {
		
		
		/** Ignore the case of the username when attempting authentication. */
		private Boolean ignoreUsernameCase = true;
		
		/** Redirect all HTTP traffic to HTTPS */
		private Boolean requireSecure;
		
		/** Turn off CSRF tokenization. This helps fix an issue with REST POSTs
		 * interfering with our security mechanism in non-prod environments.
		 * NOTE: This will be ignored in any non-local environment. 
		 */
		private Boolean disableCsrf;
		private int maxNumRetries;
		
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
		public int getMaxNumRetries() {
			return maxNumRetries;
		}
		public void setMaxNumRetries(int maxNumRetries) {
			this.maxNumRetries = maxNumRetries;
		}
		
		
		
	
	}
