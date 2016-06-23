package com.Burovitskiy.app.Clinic;

/**
Реализация кота
@autor burovitskiy
@since 06.06.2016
*/
public class Cat implements Pet{
	/**
	Базовая реализация питомца
	*/
	private final String name;

	public Cat(final String name){
		this.name = name;
	}
	/**
	(@inheritDoc)
	*/

	public void makeSound(){
		System.out.println("May, May");
	}
	/**
	(@inheritDoc)
	*/

	public String getName(){
		return this.name;
	}
}