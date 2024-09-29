import java.util.ArrayList;
import java.util.List;

public class Human {
    private String name;
    private List<Human> spouses; // Создание списка супругов
    private List<Human> kids; // Создание списка детей
    private List<Human> parents; // Создание списка родителей
    private List<Human> brothers; // Создание списка братьев
    private List<Human> sisters; // Создание списка сестер
    private List<Human> grandparentesFather; // Создание списка бабушек и дедушек по отцу
    private List<Human> grandparentesMother; // Создание списка бабушек и дедушек по матери
    private List<Human> grandKids; // Создание списка внуков
    private List<Human> sistersInLaw; // Создание списка невесток
    private List<Human> sonsInLaw; // Создание списка зятьев
    private List<Human> parentsInLaw; // Создание списка свекрови, свекра, тестя и тещи

    public Human(String name) {
        this.name = name;
        this.spouses = new ArrayList<>();
        this.kids = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.brothers = new ArrayList<>();
        this.sisters = new ArrayList<>();
        this.grandparentesFather = new ArrayList<>();
        this.grandparentesMother = new ArrayList<>();
        this.grandKids = new ArrayList<>();
        this.sistersInLaw = new ArrayList<>();
        this.sonsInLaw = new ArrayList<>();
        this.parentsInLaw = new ArrayList<>();
    }

    public Human() {

        this.name = "Неизвестное имя";
        this.spouses = new ArrayList<>();
        this.kids = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.brothers = new ArrayList<>();
        this.sisters = new ArrayList<>();
        this.grandparentesFather = new ArrayList<>();
        this.grandparentesMother = new ArrayList<>();
        this.grandKids = new ArrayList<>();
        this.sistersInLaw = new ArrayList<>();
        this.sonsInLaw = new ArrayList<>();
        this.parentsInLaw = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Метод для добавления супруга
    public void addSpouse(Human spouse) {
        spouses.add(spouse);
    }

    // Метод для получения списка супругов
    public List<Human> getSpouses() {
        return spouses;
    }

    // Метод для получения списка детей
    public List<Human> getKids() {
        return kids;
    }

    // Метод для добавления ребенка
    public void addKid(Human kid) { kids.add(kid);
    }

    // Метод для получения списка супругов
    public List<Human> getParents() {
        return parents;
    }

    // Метод для добавления родителя
    public void addParent(Human parent) {
        parents.add(parent);
    }

    public List<Human> getBrothers() {
        return brothers;
    }

    // Метод для добавления брата
    public void addBrother(Human brother) {
        brothers.add(brother);
    }


    // Метод для добавления сестры
    public void addSister(Human sister) {
        sisters.add(sister);
    }

    public List<Human> getSisters() {
        return sisters;
    }

    // Метод для добавления бабушки и дедушки по отцу
    public void addGrandparentesFather(Human grandparenteFather) {
        grandparentesFather.add(grandparenteFather);
    }

    public List<Human> getGrandparentesFather() {
        return grandparentesFather;
    }

    // Метод для добавления бабушки и дедушки по матери
    public void addGrandparentesMother(Human grandparenteMother) {
        grandparentesMother.add(grandparenteMother);
    }

    public List<Human> getGrandparentesMother() {
        return grandparentesMother;
    }

    // Метод для добавления внуков
    public void addGrandKids(Human grandKid) {
        grandKids.add(grandKid);
    }

    public List<Human> getGrandKids() {
        return grandKids;
    }

    // Метод для добавления невестки
    public void addSisterInLaw(Human sisterInLaw) {
        sistersInLaw.add(sisterInLaw);
    }

    public List<Human> getSistersInLaw() {
        return sistersInLaw;
    }

    // Метод для добавления зятьев
    public void addSonInLaw(Human sonInLaw) {
        sonsInLaw.add(sonInLaw);
    }

    public List<Human> getSonsInLaw() {
        return sonsInLaw;
    }

    // Метод для добавления свекра, свекрови, тещи и тестя
    public void addParentInLaw(Human parentInLaw) {
        parentsInLaw.add(parentInLaw);
    }

    public List<Human> getParentsInLaw() {
        return parentsInLaw;
    }



    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Имя: ").append(name != null ? name : "Неизвестно"); // Проверка на null

        // Добавляем информацию о супругах (если есть)
        if (!spouses.isEmpty()) {
            sb.append(", супруг(-а): ");
            for (Human spouse : spouses) {
                sb.append(spouse.getName()).append(", ");
            }
            // Убираем последнюю запятую и пробел
            sb.setLength(sb.length() - 2);
        }

        // Добавляем информацию о детях (если есть)
        if (!kids.isEmpty()) {
            sb.append(", сын/дочь: ");
            for (Human kid : kids) {
                sb.append(kid.getName()).append(", ");
            }
            // Убираем последнюю запятую и пробел
            sb.setLength(sb.length() - 2);
        }

        // Добавляем информацию о детях (если есть)
        if (!parents.isEmpty()) {
            sb.append(", родители: ");
            for (Human parent : parents) {
                sb.append(parent.getName()).append(", ");
            }
            // Убираем последнюю запятую и пробел
            sb.setLength(sb.length() - 2);
        }

        // Добавляем информацию о братьях (если есть)
        if (!brothers.isEmpty()) {
            sb.append(", брат(братья): ");
            for (Human brother : brothers) {
                sb.append(brother.getName()).append(", ");
            }
            // Убираем последнюю запятую и пробел
            sb.setLength(sb.length() - 2);
        }

        // Добавляем информацию о сестрах (если есть)
        if (!sisters.isEmpty()) {
            sb.append(", сестра(сестры): ");
            for (Human sister : sisters) {
                sb.append(sister.getName()).append(", ");
            }
            // Убираем последнюю запятую и пробел
            sb.setLength(sb.length() - 2);
        }

        // Добавляем информацию о бабушке и дедушке по отцовской линии (если есть)
        if (!grandparentesFather.isEmpty()) {
            sb.append(", бабушка и дедушка по отцу: ");
            for (Human  grandparenteFather: grandparentesFather) {
                sb.append(grandparenteFather.getName()).append(", ");
            }
            // Убираем последнюю запятую и пробел
            sb.setLength(sb.length() - 2);
        }

        // Добавляем информацию о бабушке и дедушке по материнской линии (если есть)
        if (!grandparentesMother.isEmpty()) {
            sb.append(", бабушка и дедушка по матери: ");
            for (Human  grandparenteMother: grandparentesMother) {
                sb.append(grandparenteMother.getName()).append(", ");
            }
            // Убираем последнюю запятую и пробел
            sb.setLength(sb.length() - 2);
        }

        // Добавляем информацию о внуках (если есть)
        if (!grandKids.isEmpty()) {
            sb.append(", внук(-и): ");
            for (Human  grandKid: grandKids) {
                sb.append(grandKid.getName()).append(", ");
            }
            // Убираем последнюю запятую и пробел
            sb.setLength(sb.length() - 2);
        }

        // Добавляем информацию о невестках (если есть)
        if (!sistersInLaw.isEmpty()) {
            sb.append(", невестка(-и): ");
            for (Human  sisterInLaw: sistersInLaw) {
                sb.append(sisterInLaw.getName()).append(", ");
            }
            // Убираем последнюю запятую и пробел
            sb.setLength(sb.length() - 2);
        }

        // Добавляем информацию о невестках (если есть)
        if (!sonsInLaw.isEmpty()) {
            sb.append(", зять(-я): ");
            for (Human  sonInLaw: sonsInLaw) {
                sb.append(sonInLaw.getName()).append(", ");
            }
            // Убираем последнюю запятую и пробел
            sb.setLength(sb.length() - 2);
        }

        // Добавляем информацию о родственых связях с родителями мужа либо жены (если есть)
        if (!parentsInLaw.isEmpty()) {
            sb.append(", свекр и свекровь(тесть и теща): ");
            for (Human  parentInLaw: parentsInLaw) {
                sb.append(parentInLaw.getName()).append(", ");
            }
            // Убираем последнюю запятую и пробел
            sb.setLength(sb.length() - 2);
        }


        return sb.toString();
    }
}