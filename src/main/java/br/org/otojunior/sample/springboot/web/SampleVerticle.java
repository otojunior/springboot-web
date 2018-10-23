/**
 * 
 */
package br.org.otojunior.sample.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

/**
 * @author 01456231650
 *
 */
@Component
public class SampleVerticle extends AbstractVerticle {
	@Autowired
	private SampleService service;
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void start(Future<Void> startFuture) throws Exception {
		vertx.createHttpServer().requestHandler(req -> {
			req.response().
				putHeader("content-type", "text/plain").
				end("Hello from Vert.x! " + service.somar());
		}).listen(8080, http -> {
			if (http.succeeded()) {
				startFuture.complete();
				System.out.println("HTTP server started on http://localhost:8080");
			} else {
				startFuture.fail(http.cause());
			}
		});
	}
}
