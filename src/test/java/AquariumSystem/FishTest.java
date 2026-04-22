package AquariumSystem;

import AquariumSystem.simpleaquarium.SimpleFish;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FishTest {

    @Test
    void fish_shouldReturnCorrectName() {
        SimpleFish fish = new SimpleFish("Wogglie");

        assertEquals("Wogglie", fish.getName());
    }

    @Test
    void toString_shouldReturnName() {
        SimpleFish fish = new SimpleFish("Swimmie");

        assertEquals("Swimmie", fish.toString());
    }
}