package cigma.pfe;

import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.Client;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MonApplication {
    public static void main(String[] args) {

       /*  ClientController crtl = new ClientController();
        Client client = new Client(1L, "Oussama Mouftah");
        crtl.save(client);
*/

    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    ClientController controller = (ClientController) context.getBean("controller");
        Client client = new Client(1,"ALAMI");
        controller.save(client);
    }

}
