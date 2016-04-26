package com.polomos.config;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.hsqldb.util.DatabaseManagerSwing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;


@Configuration
@ComponentScan({"com.polomos"})
public class AppConfig {
	
//	@Autowired
//	DataSource dataSource;
//	
//	@Bean
//	public JdbcTemplate getJdbcTemplate() {
//		return new JdbcTemplate(dataSource);
//	}
//	
//	@PostConstruct
//	public void startDBManager() {
//	
//		//hsqldb
//		DatabaseManagerSwing.main(new String[] { "--url", "jdbc:hsqldb:mem:testdb", "--user", "sa", "--password", "" });
//
//	}
}
