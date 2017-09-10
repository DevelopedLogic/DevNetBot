package builtinModules;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class InfoProvider extends ListenerAdapter{
	public void onMessageReceived(MessageReceivedEvent event){
        if(event.getMessage().getContent().equals(main.RuntimeVariables.prefix + "info")){
        	event.getChannel().sendMessage(main.Constants.botName + " using DevelopedLogic's EDJB Backend! On GitHub!").queue();
        }
    }
}
