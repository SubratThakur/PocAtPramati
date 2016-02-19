package com.pramati.dp.structural.builder;

/*
 * This pattern is used mainly by java beans to make them more easy to create object
 * We used to get object using builder class which only requires mandatory fields.
 * The builder class is inner static class so it can be get directly using class name like 
 * 
 *  BuilderPattern comp = new BuilderPattern.BuilderPatternBuilder("Buider", "2", "GB","B12509").setSalary(200)
 *              .setCollege("BIT").build();
 *              
 *              
 *  This pattern is basically used to overcome the limitation of Factory and abstract factory pattern for sending all 
 *  the argument as input.
 *
 */
public class BuilderPattern {
	
	//Mandatory field
	private String name;
	private int age;
	private String dept;
	private String empid;
	
	//Optional field
	private int salary;
	private String college;
	
	//
	public BuilderPattern(BuilderPatternBuilder builderpatternbuilder) {
		super();
		this.name = builderpatternbuilder.name;
		this.age = builderpatternbuilder.age;
		this.dept = builderpatternbuilder.dept;
		this.empid = builderpatternbuilder.empid;
		this.salary = builderpatternbuilder.salary;
		this.college = builderpatternbuilder.college;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getDept() {
		return dept;
	}
	public String getEmpid() {
		return empid;
	}
	public int getSalary() {
		return salary;
	}
	public String getCollege() {
		return college;
	}
	
	
	//Static builder inner class which only needed mandatory fields in it's argument.
	public static class BuilderPatternBuilder{
		
		//Mandatory field
		private String name;
		private int age;
		private String dept;
		private String empid;
		
		//Optional field
		private int salary;
		private String college;
		
		public BuilderPatternBuilder(String name, int age, String dept,
				String empid) {
			this.name = name;
			this.age = age;
			this.dept = dept;
			this.empid = empid;
		}
		
		public void setSalary(int salary){
			this.salary=salary;
		}
		
		public void setCollege(String college){
			this.college=college;
		}
		
		public BuilderPattern build(){
			return new BuilderPattern(this);
		}
	}
}
