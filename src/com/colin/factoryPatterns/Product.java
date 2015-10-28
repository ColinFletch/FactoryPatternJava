/**
 * 
 */
package com.colin.factoryPatterns;

/**
 * @author cfletch
 *
 */
public abstract class Product {
	public void writeName(String name) {
		System.out.println("My Name is : " + name);
	}
}
