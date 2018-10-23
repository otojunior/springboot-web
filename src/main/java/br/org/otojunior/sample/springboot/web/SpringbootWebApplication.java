/*
 * 
 */
package br.org.otojunior.sample.springboot.web;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.vertx.core.Vertx;

/**
 * 
 * @author Oto Soares Coelho Junior (oto.coelho-junior@serpro.gov.br)
 *
 */
@SpringBootApplication
public class SpringbootWebApplication {
	@Autowired
	private SampleVerticle sampleVerticle;
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebApplication.class, args);
	}
	
	/**
	 * 
	 */
	@PostConstruct
	public void deployVerticle() {
		Vertx vertx = Vertx.vertx();
		vertx.deployVerticle(sampleVerticle);
	}
}
