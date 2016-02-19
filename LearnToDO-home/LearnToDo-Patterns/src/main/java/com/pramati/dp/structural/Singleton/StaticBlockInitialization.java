package com.pramati.dp.structural.Singleton;

/*
 * This method is provide exception handling but still the object is created 
 * before it's use
 * 
 * next:LazyInitialization
 */
public class StaticBlockInitialization {
	
	/*
	 * This is the private single reference of the class
	 */
	private static StaticBlockInitialization instance;
	
	//private constructor so that it can't be instantiate from other class
	private StaticBlockInitialization(){
		
	}
	/*
	 * This static block is used to provide exception handling while 
	 *instance creating
	*/
	static{
		try{
			instance=new StaticBlockInitialization();
		}
		catch(Exception e){
			throw new RuntimeException("Exception occured while creating object");
		}
	}
	/*
	 * This is the global access point to get instance of EagerInitialization class.
	 */
	public static StaticBlockInitialization getInstance(){
	   return instance;
	}
	

}
