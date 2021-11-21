package listeners;

import java.sql.Date;

import jakarta.servlet.ServletContextAttributeEvent;
import jakarta.servlet.ServletContextAttributeListener;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.ServletRequestAttributeEvent;
import jakarta.servlet.ServletRequestAttributeListener;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

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
}
