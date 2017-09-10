package modules;

import net.dv8tion.jda.core.entities.Game;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class ProfilePlayingChanger extends ListenerAdapter{
	public void onMessageReceived(MessageReceivedEvent event){
		if(main.DeveloperChecker.isDeveloper(event)){
			String msg = event.getMessage().getContent();
			String[] args = msg.split(" ");
			if(args[0].equals(main.RuntimeVariables.prefix + main.RuntimeVariables.developersPrefix + "setplaying")){
				String compiled = "";
				for(int i = 1; i < args.length; i++){
					compiled = compiled+" "+args[i];
				}
				main.RuntimeVariables.jda.getPresence().setGame(Game.of(compiled));
				event.getChannel().sendMessage("Now playing" + compiled).queue();
			}
		}
    }
}
