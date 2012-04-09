package edu.nyu.adbms.repcrec;

import java.util.ArrayList;
import java.util.List;


public class Variable {
	String name;
	int value;
	boolean hasExclusiveLock;
	boolean isObsolete;
	Transaction owner;
	boolean isReplicated;
	List<Transaction> sharedOwners; 
	
	public Variable (String name){
	  this.name=name;
	  this.hasExclusiveLock =false;
    //for write lock
    this.owner = null;
    //for shared locks
    this.sharedOwners = new ArrayList<Transaction>();
	  
	}
	
	public Variable(String name, int initValue) {
		this.name = name;
		this.value = initValue;
		this.hasExclusiveLock =false;
		
		//for write lock
		this.owner = null;
		
		//for shared locks
		this.sharedOwners = new ArrayList<Transaction>();		
	}
}
