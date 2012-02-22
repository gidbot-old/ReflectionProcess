package filters;

import java.util.ArrayList;

public class TimeFrameFilter {

	private String myCommandName = "keyword"; 
	private DateTime startDate;
	private DateTime endDate; 
	
	public TimeFrameFilter(ArrayList<Object> parameters) {
		startDate = (DateTime)parameters.get(0); 
		endDate = (DateTime)parameters.get(1);
	    
    }

    public String getCommandName() {
	    
	    return myCommandName; 
    }

	
    public ArrayList<CalendarEvent> filter(ArrayList<CalendarEvent> myEvents) {
    	 ArrayList<CalendarEvent> myEventsCopy = new ArrayList<CalendarEvent>();
         for (CalendarEvent currentEvent: myEvents){
                 //Start Date is greater than or equal to start date
                 if (currentEvent.getMyStartDate().isAfter(startDate)){
                         //End Date is less than or equal to finish date
                         if (currentEvent.getMyEndDate().isBefore(endDate)){
                                 myEventsCopy.add(currentEvent);
                         }
                 }
         }
         return myEventsCopy;
    }

}
