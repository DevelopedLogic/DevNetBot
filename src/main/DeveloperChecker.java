package main;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class DeveloperChecker{
	public static boolean isDeveloper(MessageReceivedEvent event){
		boolean isDeveloper = false;
		for(String devId:Constants.developerIDs){
            if(devId.equals(event.getAuthor().getId())){
                isDeveloper = true;
                break;
            }
        }
		if(isDeveloper){
			return true;
		}else{
			return false;
		}
	}
}
