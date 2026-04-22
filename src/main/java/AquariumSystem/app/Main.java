package AquariumSystem.app;

import AquariumSystem.interfaces.Fish;
import AquariumSystem.simpleaquarium.*;
import AquariumSystem.controller.AquariumController;
import AquariumSystem.view.ConsoleUI;
import AquariumSystem.interfaces.Aquarium;
import AquariumSystem.view.SwingUI;


public class Main {
    public static void main(String[] args) {

        SimpleAquariumFactory factory = new SimpleAquariumFactory();

        Aquarium aquarium = factory.createAquarium();

        Fish f1 = factory.createFish("Wogglie");
        Fish f2 = factory.createFish("Swimmie");

        AquariumController controller = new AquariumController(aquarium);
        controller.addFish(f1);
        controller.addFish(f2);

        ConsoleUI ui= new ConsoleUI(controller);
        ui.start();
        //new SwingUI(controller);
    }
}

