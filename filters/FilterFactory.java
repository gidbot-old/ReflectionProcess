package filters;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class FilterFactory {
	private Map<String, Class<?>> myMap; 
	
	public FilterFactory() throws ClassNotFoundException{
		myMap = new HashMap<String, Class<?>>(); 
		
		myMap.put("filter", Class.forName("KeywordFilter")); 
		myMap.put("timeFrame", Class.forName("TimeFrameFilter")); 
	}
	
	public Filter getFilter(String commandName) throws InstantiationException, IllegalAccessException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException{
	
		Class<?> thisFilter = myMap.get(commandName); 
		Constructor<?> filterConstructor = thisFilter.getConstructor();;  
		Filter toReturn = (Filter) filterConstructor.newInstance(); 
		
		return toReturn;
	}
}
