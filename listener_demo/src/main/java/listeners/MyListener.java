package listeners;


import java.util.Date;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MyListener
 *
 */


public class MyListener implements ServletContextListener, ServletContextAttributeListener, HttpSessionListener, HttpSessionAttributeListener, ServletRequestListener, ServletRequestAttributeListener {

    /**
     * Default constructor. 
     */
    public MyListener() {
        // TODO Auto-generated constructor stub
    }
    public void attributeAdded(HttpSessionBindingEvent arg0) {
    	System.out.println("From Listener key with " 
    			+ arg0.getName() + "and value is " + arg0.getValue() + " added succesfully");
    }
    
    public void attributeRemoved(HttpSessionBindingEvent arg0) {
    	System.out.println("From Listener key with " 
    			+ arg0.getName() + "and value is " + arg0.getValue() + " removed succesfully");
    }

    public void attributeReplaced(HttpSessionBindingEvent arg0) {
    	System.out.println("From Listener key with " 
    			+ arg0.getName() + "and value is " + arg0.getValue() + " modified succesfully");
    }

    public void sessionCreated(HttpSessionEvent arg0) {
    	System.out.println("Hello from Listener Session created at " 
    			+ new Date(arg0.getSession().getCreationTime()));
    }
    public void sessionDestroyed(HttpSessionEvent arg0) {
    	System.out.println("Hello from Listener Session destroyed at " 
    			+ new Date(arg0.getSession().getCreationTime()));
    }
	@Override
	public void attributeAdded(ServletRequestAttributeEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void attributeAdded(ServletContextAttributeEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void attributeRemoved(ServletContextAttributeEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
