package com.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orm.Dao.ProductOrmDao;
import com.orm.Entity.ProductOrm;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
    
    	ProductOrmDao dao=(ProductOrmDao) context.getBean("ProductDao");
    
  

    	ProductOrm product=new ProductOrm(); 
    
    	product.setPid(1001);
    	product.setPname("Atlas Micro-1");
    	int r=dao.insert(product);
    	
    	System.out.println("Done! Result: "+r);
    	
    	/*for (ProductOrm val : dao.fetchProduct(1)) {
			System.out.println(val.getPid()+" "+val.getPname());
		}*/
    }
}
