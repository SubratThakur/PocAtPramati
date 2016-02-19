package com.pramati.dp.structural.Singleton;

/*
 * This is just similar to LayInitialization except this is thread safe implementation as the getInstance method is Synchronized.
 * 
 * But this implementation can be break using reflection 
 */
public class ThreadSafeInitialization {
	/*
	 * This is the private single reference of the class
	 */
	private static ThreadSafeInitialization instance=null;
	
	//private constructor so that it can't be instantiate from other class
	private ThreadSafeInitialization(){
		
	}
	/*
	 * This is the synchronized global access point to get instance of ThreadSafeInitialization class.
	 * this is thread safe way to create singleton instance of an class.
	 * this will make it slow even the check is required for some starting threads. and this cause heavy overhead. SO we can use 
	 * Double Check Locking as showed in getInstanceUsingDoubleHeadCheck() method.
	 */
	public static synchronized ThreadSafeInitialization getInstance(){
		//Check if the instance is not created yet i.e null then only create instance
		if(instance==null){
			try{
			instance=new ThreadSafeInitialization();
			}
			catch(Exception e){
				throw new RuntimeException("Exception occured while creating object");
			}
		}
		return instance;
	}
	
	/*
	 * This is better way to get instance of class as this will not cause heavy slow due to lock alltime.
	 */
	public static ThreadSafeInitialization getInstanceUsingDoubleHeadCheck(){
		//Check if the instance is not created yet i.e null then only create instance
		if(instance==null){
			try{
			synchronized (ThreadSafeInitialization.class){
			instance=new ThreadSafeInitialization();
			}
			}
			catch(Exception e){
				throw new RuntimeException("Exception occured while creating object");
			}
		}
		return instance;
	}

}
