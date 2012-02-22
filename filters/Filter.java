package filters;

import java.util.ArrayList;

public abstract class Filter {

	public abstract String getCommandName(); 
	
	public abstract ArrayList<CalendarEvent> filter(ArrayList<CalendarEvent> events); 
	
}
