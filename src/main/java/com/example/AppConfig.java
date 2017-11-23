package com.example;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public AnnotationBean annotationBean() {
		AnnotationBean annotationBean = new AnnotationBean();
		annotationBean.setP1(99);
		annotationBean.setP2("Name");
		annotationBean.setDataSource(dataSource());
		return annotationBean;
	}

	@Bean(destroyMethod = "close")
	DataSource dataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("org.mariadb.jdbc.Driver");
		ds.setUsername("app");
		ds.setPassword("app");
		ds.setUrl("jdbc:mariadb://localhost:3306/app");
		return ds;
	}

}
