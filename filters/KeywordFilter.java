package filters;

import java.util.ArrayList;

public class KeywordFilter extends Filter{

	private String myCommandName = "keyword"; 
	private String myKeyword; 
	public KeywordFilter(ArrayList<Object> parameters) {
		myKeyword = (String)parameters.get(0); 
	    
    }

    public String getCommandName() {
	    
	    return myCommandName; 
    }

	
    public ArrayList<CalendarEvent> filter(ArrayList<CalendarEvent> myEvents) {
    	  ArrayList<CalendarEvent> myEventsToReturn = new ArrayList<CalendarEvent>();
          for (CalendarEvent currentEvent: myEvents){
                  // if the event has an index != -1. it means it contains the word
                  // and therefore adds it to the list
                  if (currentEvent.getMyName().indexOf(myKeyword) != -1){
                          myEventsToReturn.add(currentEvent);
                  }
          }
          return myEventsToReturn;
    }

	

}
