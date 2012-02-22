package filters;

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
	
	public Filter getFilter(String commandName, ArrayList<Object> myParameters) throws InstantiationException, IllegalAccessException{
	
		Class<?> thisFilter = myMap.get(commandName); 
		
		
		return (Filter)thisFilter.newInstance(); 
		
	}
}
