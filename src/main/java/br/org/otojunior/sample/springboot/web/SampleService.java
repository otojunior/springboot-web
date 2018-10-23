/**
 * 
 */
package br.org.otojunior.sample.springboot.web;

import org.springframework.stereotype.Service;

/**
 * @author 01456231650
 *
 */
@Service
public class SampleService {
	/**
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public double somar() {
		return (Math.random() + Math.random());
	}
}
