package com.pramati.dp.structural.Singleton;


/*
 * This resolve the issue with eager and static block initialization issue of creating instance at class load time 
 * and exception handling both.
 * This implementation will fail in case of multi-threaded system. 
 * 
 * For making thread safe we just have to make getInstance method synchronized.
 *  
 * next: ThreadSafeInitialization
 */
public class LazyInitialization {
	
	/*
	 * This is the private single reference of the class
	 */
	private static LazyInitialization instance=null;
	
	//private constructor so that it can't be instantiate from other class
	private LazyInitialization(){
		
	}
	/*
	 * This is the global access point to get instance of EagerInitialization class.
	 */
	public static LazyInitialization getInstance(){
		//Check if the instance is not created yet i.e null then only create instance
		if(instance==null){
			try{
			instance=new LazyInitialization();
			}
			catch(Exception e){
				throw new RuntimeException("Exception occured while creating object");
			}
		}
		return instance;
	}

}
