package com.pramati.dp.structural.Singleton;
/*
 * This is Enum initialization of singleton pattern . it helps to get overcome on reflection issue.
 * As Enum is globally accessible and can be instantiate only once .
 * 
 * But it has the issue of automatically creation even the client is not using it.
 */
public enum EnumSingleton {
	Instance;
	
	public static void methodOne(){
		
	}

}
