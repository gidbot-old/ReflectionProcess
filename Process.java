import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import filters.CalendarEvent;
import filters.FilterFactory;



public class Process {
	
	FilterFactory myFilterFactory;
	
	public Process() throws ClassNotFoundException{
		try {
	        myFilterFactory = new FilterFactory();
        } 
		catch (Exception e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
        } 
	}
	
	public ArrayList<CalendarEvent> filter (String myCommand, ArrayList<Object> myParameters, ArrayList<CalendarEvent> eventsToFilter) throws SecurityException, IllegalArgumentException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException{
		
		return myFilterFactory.getFilter(myCommand).filter(myParameters, eventsToFilter); 
		
	}

}
