package modules;

import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class ProfileStateChanger extends ListenerAdapter{
	public void onMessageReceived(MessageReceivedEvent event){
		String msg = event.getMessage().getContent();
		if(main.DeveloperChecker.isDeveloper(event)){
			if(msg.equals(main.RuntimeVariables.prefix + main.RuntimeVariables.developersPrefix + "setonline")){
	        	main.RuntimeVariables.jda.getPresence().setStatus(OnlineStatus.ONLINE);
	        	event.getChannel().sendMessage("State changed.").queue();
	        }else if(msg.equals(main.RuntimeVariables.prefix + main.RuntimeVariables.developersPrefix + "setidle")){
	        	main.RuntimeVariables.jda.getPresence().setStatus(OnlineStatus.IDLE);
	        	event.getChannel().sendMessage("State changed.").queue();
	        }else if(msg.equals(main.RuntimeVariables.prefix + main.RuntimeVariables.developersPrefix + "setdnd")){
	        	main.RuntimeVariables.jda.getPresence().setStatus(OnlineStatus.DO_NOT_DISTURB);
	        	event.getChannel().sendMessage("State changed.").queue();
	        }else if(msg.equals(main.RuntimeVariables.prefix + main.RuntimeVariables.developersPrefix + "setinvisible")){
	        	main.RuntimeVariables.jda.getPresence().setStatus(OnlineStatus.INVISIBLE);
	        	event.getChannel().sendMessage("State changed.").queue();
	        }
		}
    }
}
