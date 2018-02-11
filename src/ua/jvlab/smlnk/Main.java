package ua.jvlab.smlnk;

import ua.jvlab.smlnk.objects.Cat;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Cat catOne = new Cat("Vaska", 2, "White");
        Cat catTwo = new Cat("Murka", 5, "Red");
        Cat catThree = new Cat("Umka", 10, "Grey");
        Cat catFour = new Cat("Kuzia", 6, "Black");
        Cat catFive = new Cat("Monia", 5, "Green");

        Cat[] catArr = new Cat[]{catOne, catTwo, catThree, catFour, catFive};

        for (Cat cat : catArr) { System.out.println(cat);}

        Arrays.sort(catArr);

        System.out.println();
        for (Cat cat : catArr) { System.out.println(cat);}

        System.out.println();

        // сортировка с помощью лямда функций;
        Arrays.sort(catArr,(a,b)-> a.getName().compareTo(b.getName()));
        for (Cat cat : catArr) { System.out.println(cat);}
    }
}
