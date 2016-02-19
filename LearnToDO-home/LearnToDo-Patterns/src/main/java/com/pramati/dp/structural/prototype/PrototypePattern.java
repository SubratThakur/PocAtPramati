package com.pramati.dp.structural.prototype;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * Prototype Pattern is used while creating object which take heavy cost to create new object every time
 * we implement the class with cloneable interface and implements its clone method.
 * 
 * whenever we want to create a copy of the object we will just call the clone method of the class like 
 * 
 * PrototypePattern patterns = new PrototypePattern();
 *      patterns.loadData();
 *      
 * PrototypePattern patternsNew = (PrototypePattern) patterns.clone();
 */
public class PrototypePattern implements Cloneable{
	
	private List<String> patternList;
    
    public PrototypePattern(){
    	patternList = new ArrayList<String>();
    }
     
    public PrototypePattern(List<String> list){
        this.patternList=list;
    }
    public void loadData(){
        //read all employees from database and put into the list
    	patternList.add("Singleton");
    	patternList.add("Factory");
    	patternList.add("Builder");
    	patternList.add("Prototype");
    }
     
    public List<String> getPatternList() {
        return patternList;
    }
 
    @Override
    public Object clone() throws CloneNotSupportedException{
            List<String> temp = new ArrayList<String>();
            for(String s : this.getPatternList()){
                temp.add(s);
            }
            return new PrototypePattern(temp);
    }

}
