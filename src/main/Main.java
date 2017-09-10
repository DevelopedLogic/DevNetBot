package main;

import javax.security.auth.login.LoginException;
import javax.swing.JButton;
import javax.swing.JFrame;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.exceptions.RateLimitedException;
import net.dv8tion.jda.core.JDABuilder;

public class Main{
	public static JFrame frame = new JFrame(Constants.botName + " - Running on DevelopedLogic's EDJB Backend");
	
    public static void main(String[] args) throws LoginException, RateLimitedException, InterruptedException{
        JDA jda = new JDABuilder(AccountType.BOT).setToken(Constants.token).buildBlocking();
        
        JButton stopbutton = new JButton("Terminate " + Constants.botName);
        frame.add(stopbutton);
        frame.setSize(500, 500);
        stopbutton.addActionListener(new UIShutdownButtonAction());
        frame.setVisible(true);
        
        BuiltinLoader.loadBuiltins(jda);
        BuiltinLoader.loadRuntimeVariables(jda);
        
        for(Object module:Constants.modules){
            jda.addEventListener(module);
        }
    }
    
    public static void stop(){
    	frame.dispose();
    	RuntimeVariables.jda.shutdown();
    }
}