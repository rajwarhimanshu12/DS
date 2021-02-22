package com.oops;

import java.util.HashMap;
import java.util.Map;

public class HashCode {
	
	 int id;
	 String name;
	
	public HashCode(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		HashCode obj1 = new HashCode(1, "Himanshu");
		HashCode obj2 = new HashCode(1, "Himanshu");
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		Map<HashCode,String> map = new HashMap<HashCode,String>();
		map.put(obj1,"One");
		map.put(obj2,"two");
		 System.out.println(map.size());
	
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashCode other = (HashCode) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
