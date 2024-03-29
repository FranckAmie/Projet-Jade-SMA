package main;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.util.ExtendedProperties;
import jade.util.leap.Properties;
import jade.wrapper.AgentContainer;

public class MainContainer {

	public static void main(String[] args) {
		
		try {
			Runtime runtime = Runtime.instance();
			Properties properties = new ExtendedProperties();
			properties.setProperty(Profile.GUI, "true");
			ProfileImpl impl = new ProfileImpl(properties);
			AgentContainer agentContainer = runtime.createMainContainer(impl);
			agentContainer.start();
			//agentContainer.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
