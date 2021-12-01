package com.belhard.university;

public class datastructures {

	String[] data = {};

	void Add(String elem, int ind) {
		String[] temp = new String[data.length + 1];
		System.arraycopy(data, 0, temp, 0, ind);
		System.arraycopy(data, ind, temp, ind + 1, data.length - ind);
		temp[ind] = elem;
		this.data = temp;

	}
	void Remove(int ind) {
		String temp[] = new String[data.length-1];
		System.arraycopy(data, 0, temp, 0, ind);
		System.arraycopy(data, ind+1, temp, ind , data.length - ind-1);
		this.data = temp;
		
		
	}
			
			
			
			
			
			
			
			
	DymamicArray darr = new DynamicArray();
	System.out.println(Arrays.toString(dynamicArray.data));
	dynamicArray.add(4,3);
	System.out.println(Arrays.toString(dynamicArray.data));
	

}
