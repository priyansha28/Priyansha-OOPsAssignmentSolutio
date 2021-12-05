package com.greatlearning.main;

import com.greatlearning.assignemnt.*;

public class Driver {
	 SuperDepartment dep = new SuperDepartment();
	 
	 public static void main(String[] args) {
		AdminDepartment admin = new AdminDepartment();
		SuperDepartment dep = new SuperDepartment(); 
	    System.out.println("Welcome to " + admin.departmentName());
	    System.out.println(admin.getTodaysWork());
	    System.out.println(admin.getWorkDeadline());
	    System.out.println(dep.isTodayAHoliday()+"\r");
	    
	    
	    //Hr Departmnet
	    HrDepartment hr = new HrDepartment();
	    System.out.println("Welcome to " + hr.departmentName());
	    System.out.println(hr.doActivity());
	    System.out.println(hr.getTodaysWork());
	    System.out.println(hr.getWorkDeadline());
	    System.out.println(dep.isTodayAHoliday()+"\r");
	    
	    //Tech Departmnet
	    TechDepartment tech = new TechDepartment();
	    System.out.println( "Welcome to " + tech.departmentName());
	    System.out.println(tech.getTodaysWork());
	    System.out.println(tech.getWorkDeadline());
	    System.out.println(tech.doActivity());
	    System.out.println(dep.isTodayAHoliday());
	 }
}
