package builtinModules;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class BotStopper extends ListenerAdapter{
	public void onMessageReceived(MessageReceivedEvent event){
		String msg = event.getMessage().getContent();
		if(main.DeveloperChecker.isDeveloper(event)){
			if(msg.equals(main.RuntimeVariables.prefix + main.RuntimeVariables.developersPrefix + "stop")){
				event.getChannel().sendMessage("Shutting down...").queue();
				main.Main.stop();
			}
		}
    }
}
