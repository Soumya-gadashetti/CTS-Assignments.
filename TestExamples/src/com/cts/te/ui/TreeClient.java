package com.cts.te.ui;

import java.util.Map;
import java.util.TreeMap;

public class TreeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> hm=new  TreeMap<>(); 
		hm.put("java","Language");
		hm.put("c#","lang");
		hm.put("dotnet","framework");
		for(String key:hm.keySet())
			System.out.printf("%s:%s\n",key,hm.get(key));
	}

}
