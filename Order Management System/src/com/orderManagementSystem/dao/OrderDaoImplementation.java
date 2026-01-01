package com.orderManagementSystem.dao;

import com.orderManagementSystem.beans.Customer;
import com.orderManagementSystem.beans.Item;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class OrderDaoImplementation implements OrderDao {
	static Map<Customer, List<Item>> hm;
	static {
		hm = new HashMap<>();
		Customer c1 = new Customer(10, "Sushrut", "4444");
		List<Item> lst = new ArrayList<>();
		lst.add(new Item (1001, "chair", 34, 5678));
		 lst.add(new Item(1002,"Table",30,7678));
		 hm.put(c1, lst);
		 
		 Customer c2 = new Customer(10, "Sushrut", "4444");
			List<Item> lst1 = new ArrayList<>();
			lst.add(new Item (1001, "Shelf", 40, 2678));
			 lst.add(new Item(1002,"Drawer",20,5678));
			 hm.put(c2, lst1);
	}
	

	public boolean save(Customer c, List<Item> lst) {
		if(!hm.containsKey(c)) {
			hm.put(c, lst);
			return true;
		}
		return false;
	}
	

	public Map<Customer, List<Item>> findAll(){
		return hm;
	}


	public Entry<Customer, List<Item>> findById(int cid) {
		Set<Map.Entry<Customer,List<Item>>> cset=hm.entrySet();
		for(Map.Entry<Customer,List<Item>> e:cset) {
			if(e.getKey().getCid()==cid)
				return e;
		}
		return null;
		
	}


	@Override
	public boolean removeById(int cid) {
		List<Item> lst= hm.remove(new Customer(cid));
		return lst!=null;
	}
	
	
	
	public boolean addNewItem(int cid, Item item) {
		List<Item> lst = hm.get(new Customer(cid));
		while(lst!=null) {
			lst.add(item);
			return true;
		}
		return false;
	}
	
	@Override 
	public boolean deleteById(int cid,int iid) {
		List<Item> lst =hm.get(new Customer(cid));
		if(lst!=null) {
			return lst.remove(new Item(iid));
		}
		return false;
	}
}	
