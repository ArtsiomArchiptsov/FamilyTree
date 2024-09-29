
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;  // Импортируем ArrayList
import java.util.List;

public class Main {
    public static void main(String[] args) {
          FamilyTree familyTree = new FamilyTree();

        // Преобразование строки в LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthDay1 = LocalDate.parse("15-05-1985", formatter); // муж 39лет
        LocalDate birthDay2 = LocalDate.parse("21-09-1991", formatter); // жена 33года
        LocalDate birthDay3 = LocalDate.parse("08-10-2011", formatter); // сын 13лет
        LocalDate birthDay4 = LocalDate.parse("10-06-2016", formatter); // дочь 8лет
        LocalDate birthDay5 = LocalDate.parse("31-12-1954", formatter); // родители мужа - отец 70лет
        LocalDate birthDay6 = LocalDate.parse("15-04-1961", formatter); // родители мужа - мать 63года
        LocalDate birthDay7 = LocalDate.parse("24-10-1956", formatter); // родители жены - отец 68лет
        LocalDate birthDay8 = LocalDate.parse("21-08-1964", formatter); // родители жены - мать 60лет

        // Супруги

        Human husband = new PersonalDates("Антон Непомнящий", birthDay1, 39, "мужчина");
        Human wife = new PersonalDates("Арина Непомнящий", birthDay2,33,"женщина");

        // Дети
        Human son = new PersonalDates("Вадим Непомнящий",birthDay3,13,"мальчик");
        Human daughter = new PersonalDates("Светлана Непомнящий", birthDay4, 8, "девочка");

        // Родители супругов
        // Родители мужа
        Human fatherHusband = new PersonalDates("Стас Непомнящий", birthDay5,70,"мужчина");
        Human motherHusband = new PersonalDates("Юлия Непомнящий", birthDay6,63,"женщина");

        // Родители жены
        Human fatherWife = new PersonalDates("Вадим Юрьев",birthDay7,68,"мужщина");
        Human motherWife = new PersonalDates("Анфиса Юрьева",birthDay8,60,"женщина");

        // Родственные связи для супругов
        // Супруги
        husband.addSpouse(wife);
        wife.addSpouse(husband);

        // Дети
        husband.addKid(son);
        wife.addKid(daughter);
        husband.addKid(daughter);
        wife.addKid(son);

        // Родители мужа
        husband.addParent(fatherHusband);
        husband.addParent(motherHusband);

        // Родители жены
        wife.addParent(fatherWife);
        wife.addParent(motherWife);

        // Родители мужа для жены
        wife.addParentInLaw(fatherHusband);
        wife.addParentInLaw(motherHusband);

        // Родители жены для мужа
        husband.addParentInLaw(fatherWife);
        husband.addParentInLaw(motherWife);

        // Родственные связи для детей
        // Для сына
        son.addParent(husband);
        son.addParent(wife);
        son.addSister(daughter);
        son.addGrandparentesFather(fatherHusband);
        son.addGrandparentesFather(motherHusband);
        son.addGrandparentesMother(fatherWife);
        son.addGrandparentesMother(motherWife);

        // Для дочери
        daughter.addParent(husband);
        daughter.addParent(wife);
        daughter.addBrother(son);
        daughter.addGrandparentesFather(fatherHusband);
        daughter.addGrandparentesFather(motherHusband);
        daughter.addGrandparentesMother(fatherWife);
        daughter.addGrandparentesMother(motherWife);

        // Родственные связи для родителей мужа
        // отец
        fatherHusband.addSpouse(motherHusband);
        fatherHusband.addKid(husband);
        fatherHusband.addGrandKids(son);
        fatherHusband.addGrandKids(daughter);
        fatherHusband.addSisterInLaw(wife);

        // мать
        motherHusband.addSpouse(fatherHusband);
        motherHusband.addKid(husband);
        motherHusband.addGrandKids(son);
        motherHusband.addGrandKids(daughter);
        motherHusband.addSisterInLaw(wife);

        // Родственные связи для родителей жены
        // отец
        fatherWife.addSpouse(motherWife);
        fatherWife.addKid(wife);
        fatherWife.addGrandKids(son);
        fatherWife.addGrandKids(daughter);
        fatherWife.addSonInLaw(husband);

        // мать
        motherWife.addSpouse(fatherWife);
        motherWife.addKid(wife);
        motherWife.addGrandKids(son);
        motherWife.addGrandKids(daughter);
        motherWife.addSonInLaw(husband);

        familyTree.addHuman(husband);
        familyTree.addHuman(wife);
        familyTree.addHuman(son);
        familyTree.addHuman(daughter);
        familyTree.addHuman(fatherHusband);
        familyTree.addHuman(motherHusband);
        familyTree.addHuman(fatherWife);
        familyTree.addHuman(motherWife);


        // Полная информация
        System.out.println(familyTree);


//        // Исследуем древо
//
        // Получение информации о муже (полная информация)
        List<Human> spouses1 = familyTree.getSpousesOf(husband);
        System.out.println("Супруга:");

        for (Human spouse : spouses1) {
            System.out.println(spouse.toString());
        }

        // Получение информации о жене (полная информация)
        List<Human> spouses2 = familyTree.getSpousesOf(wife);
        System.out.println("Супруг:");

        for (Human spouse : spouses2) {
            System.out.println(spouse.toString());
        }







//        // Получение информации о сыне (полная информация)
//        List<Human> kids1 = familyTree.getKidsOf(son);
//        System.out.println("Сын:");
//
//        for (Human kid : kids1) {
//            System.out.println(kid.toString());
//        }
//
//        // Получение информации о дочери (полная информация)
//        List<Human> kids2 = familyTree.getKidsOf(daughter);
//        System.out.println("Дочь:");
//
//        for (Human kid : kids2) {
//            System.out.println(kid.toString());
//        }
                // Получение супруга по имени
//        List<Human> spouses = familyTree.getSpousesOf(husband);
//        System.out.println("Супруга:");
//
//        for (Human spouse : spouses) {
//            System.out.println(spouse.getName());
//        }
//
//        // Получение супруги по имени
//        List<Human> spouses1 = familyTree.getSpousesOf(wife);
//        System.out.println("Супруг:");
//
//        for (Human spouse : spouses1) {
//            System.out.println(spouse.getName());
//        }


    }
}