package net.javaonline.spring.inventory.itemmaster.bo;

import net.javaonline.spring.inventory.itemmaster.bo.dao.ItemMasterDAO;
import net.javaonline.spring.inventory.itemmaster.bo.dao.ItemMasterDAOImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


/**
 * ItemMaster BO implementation  
 *
 */
@Service
public class ItemMasterBoImpl implements ItemMasterBo {
	

	public ItemMasterBoImpl(){}

	
	public boolean addItem(String item_code,String item_name, float mrp, int stock) {
		
		boolean result=false;
	
    //	Write Business Logic here... 
		
		//....
		//....
		
		System.out.println("Item Details");
		
		System.out.println("item_code : "+ item_code + " item_name:" + item_name + " Maximum Retail Price : "+ mrp + " Stock : "+stock);
		
		if (mrp<=0 || stock<=0)
			result= false;
		else
		{
		   //Calling Data Access Object
			//This class may be injected using spring DI	
			ItemMasterDAOImpl itemMasterDao=new ItemMasterDAOImpl();
			
			return itemMasterDao.add(item_code, item_name, mrp, stock);
		}		
	
		return result;
		
	}
	
	
}
