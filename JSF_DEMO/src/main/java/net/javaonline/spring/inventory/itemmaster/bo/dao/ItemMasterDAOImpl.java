package net.javaonline.spring.inventory.itemmaster.bo.dao;

public class ItemMasterDAOImpl implements ItemMasterDAO {
	
	public ItemMasterDAOImpl()
	{
		
	}
	
	public boolean add(String item_code,String item_name, float mrp, int stock)
	{
		
	System.out.println(" DAO Add method called");
		
		//Write database code here
		//Access  DB and add the item
		
		//On successful add 
		
		return true;
		
		//else return false;
		
	}

}
