package main;

import modules.*;

public class Constants{
	//Generalised bot settings
	public static final String token = ""; //Token the bot uses to sign into its bot account
	public static final String[] developerIDs = {"312269489850941450"/*DevelopedLogic*/}; //Public IDs of the users who are allowed access to the Developer Only commands
	public static final String prefix = "?!"; //Bot's prefix
	public static final String developersPrefix = "!!";
	public static final String botName = "EDJBot";
	
	//Main modules
	public static Object[] modules = {new ProfileStateChanger(), new ProfilePlayingChanger()};
	
	//Optional built-in modules
	public static final boolean enableChatLogging = false;
	public static final boolean enableInfo = true;
}