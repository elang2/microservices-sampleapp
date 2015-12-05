package org.elan.micro.review;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("org.elan.micro.review")
@EnableJpaRepositories
@EnableTransactionManagement
@EntityScan("org.elan.micro.review.model")
public class SpringBootWebApplication {

	@Value("${db.driver.classname}")
	private String driverClassName;

	@Value("${db.username}")
	private String userName;

	@Value("${db.password}")
	private String password;

	@Value("${db.connection.url}")
	private String connectionUrl;

	public static void main(String args[]) {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}

	@Bean(destroyMethod="close")
	public DataSource dataSource() {

		DataSourceBuilder dbSourceBuilder = DataSourceBuilder.create();
		dbSourceBuilder.driverClassName(driverClassName).username(userName).password(password).url(connectionUrl);
		return dbSourceBuilder.build();
		
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConnectionUrl() {
		return connectionUrl;
	}

	public void setConnectionUrl(String connectionUrl) {
		this.connectionUrl = connectionUrl;
	}

}
