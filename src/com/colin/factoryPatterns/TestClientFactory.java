/**
 * 
 */
package com.colin.factoryPatterns;

/**
 * @author cfletch
 *
 */
public class TestClientFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductFactory pf = new ProductFactory();
		Product prod;
		prod = pf.createProduct("A");
		prod.writeName("Colin Fletcher");
		prod = pf.createProduct("B");
		prod.writeName("Colin Fletcher");
	}

}
