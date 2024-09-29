import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private List<Human> humans;


    public FamilyTree() {
        humans = new ArrayList<>();
    }

    public void addHuman(Human human) {
        humans.add(human);
    }

    public List<Human> getSpousesOf(Human human) {
        return human.getSpouses();
    }

    public List<Human> getKidsOf(Human human) {
        return human.getKids();
    }

    public Human getByName(String name) {
        for (Human human : humans) {
            if (human.getName().equals(name)) {
                return human;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Семейное древо:\n");
        for (Human human : humans) {
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}