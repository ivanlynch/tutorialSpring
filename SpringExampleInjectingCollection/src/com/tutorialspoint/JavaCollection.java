package com.tutorialspoint;
import java.util.*;

public class JavaCollection {
	List AddressList;
	Set AddressSet;
	Map AddressMap;
	Properties AddressProp;
		
	//a setter method to set List
	public void setAddressList(List AddressList) {
		this.AddressList = AddressList;
	}
	
	//print and return all elements of the list
	public List getAddressList() {
		System.out.println("List Elements : " + AddressList);
		return AddressList;
	}
	
	//a setter method to set List
	public void setAddressSet(Set AddressSet) {
		this.AddressSet = AddressSet;
	}
	
	//print and return all elements of the set
	public Set getAddressSet() {
		System.out.println("Set Elements : " + AddressSet);
		return AddressSet;
	}
	
	//a setter method to set List
	public void setAddressMap(Map AddressMap) {
		this.AddressMap = AddressMap;
	}
	
	//print and return all elements of the Map
	public Map getAddressMap() {
		System.out.println("Map Elements : " + AddressMap);
		return AddressMap;
	}
	
	//a setter method to set Properties
	public void setAddressProp(Properties AddressProp) {
		this.AddressProp = AddressProp;
	}
	
	//print and return all elements of the Properties
	public Properties getAddressProp() {
		System.out.println("Properties Elements : " + AddressProp);
		return AddressProp;
	}
	
	
	

	
	
}
