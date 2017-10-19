package com.prestonb.bootnfriends.conf;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

	@Configuration
	public class DaoBeanDefinitionContainer {
		
		@Bean
		@ConfigurationProperties(prefix = "com.prestonb.datasource")
		public DataSource dataSourceBean() {
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			return dataSource;
		}
	}
