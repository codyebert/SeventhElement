import java.util.LinkedList;

public class Event 
{
	String eventName;
	String location;
	
	//LinkedList<Character> enemies = new LinkedList<Character>();
	
	String eventText[];
	
	Event nextEvent;

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}


	public String[] getEventText() {
		return eventText;
	}

	public void setEventText(String[] eventText) {
		this.eventText = eventText;
	}

	public Event getNextEvent() {
		return nextEvent;
	}

	public void setNextEvent(Event nextEvent) {
		this.nextEvent = nextEvent;
	}
	
	public boolean doEventBattle()
	{
		//User chooses desired party member
		//Computer chooses enemy from list
		//battle
		return true;
	}
	public boolean doEvent()
	{
		return true;
	}
	
}
