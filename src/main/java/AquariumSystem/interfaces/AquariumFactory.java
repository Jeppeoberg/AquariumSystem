package AquariumSystem.interfaces;

public interface AquariumFactory {
    Aquarium createAquarium();
    Fish createFish(String name);
}
