package consommateur;

import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.ControllerException;

public class ConsommateurContainer {

	public static void main(String[] args) {
		
		try {
			Runtime runtime = Runtime.instance();
			ProfileImpl impl = new ProfileImpl(false);
			impl.setParameter(ProfileImpl.MAIN_HOST, "localhost");
			AgentContainer agentContainer = runtime.createAgentContainer(impl);
			AgentController agentController = agentContainer.createNewAgent("Consommateur", "consommateur.ConsommateurAgent", null);
			agentController.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ezr");
		}

	}

}
