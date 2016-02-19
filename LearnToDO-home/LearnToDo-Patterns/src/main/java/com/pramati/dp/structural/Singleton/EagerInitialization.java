package com.pramati.dp.structural.Singleton;
/*
 * This method is most basic way to create Singleton object.
 * Drawbacks: 1)Instance created at class load so even the apllication don't use it 
 * objects is created.
 * 2)No Exception handling
 * 
 * Next: StaticBlockInitialization
 */
public class EagerInitialization {
	
	/*
	 * This is the private single reference of the class
	 */
	private static EagerInitialization instance=new EagerInitialization();
	
	//private constructor so that it can't be instantiate from other class
	private EagerInitialization(){
		
	}
	/*
	 * This is the global access point to get instance of EagerInitialization class.
	 */
	public static EagerInitialization getInstance(){
		return instance;
	}

}
