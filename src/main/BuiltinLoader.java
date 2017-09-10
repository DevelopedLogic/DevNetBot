package main;

import builtinModules.*;
import net.dv8tion.jda.core.JDA;

public class BuiltinLoader{
	public static void loadBuiltins(JDA jda){
		if(Constants.enableChatLogging){
			jda.addEventListener(new ChatLogger());
		}
		if(Constants.enableInfo){
			jda.addEventListener(new InfoProvider());
		}
		
		jda.addEventListener(new BotStopper());
	}
	
	public static void loadRuntimeVariables(JDA jda){
		RuntimeVariables.jda = jda;
		RuntimeVariables.prefix = Constants.prefix;
		RuntimeVariables.developersPrefix = Constants.developersPrefix;
	}
}
