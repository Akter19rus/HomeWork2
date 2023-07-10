public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
            var dog = 8.0;
            var cat = 3.6;
            var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    }

    public static void task2 () {
        System.out.println("Задача 2");
            var dog = 8.0 + 2;
            var cat = 3.6 + 2;
            var paper = 763789 +2;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task3 () {
        System.out.println("Задача 3");
            var dog = 8.0 - 3.5;
            var cat = 3.6 - 1.6;
            var paper = 763789 - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task4 () {
        System.out.println("Задача 4");
            var friend = 19;
        System.out.println(friend);
            friend = friend + 2;
        System.out.println(friend);
            friend = friend / 7;
        System.out.println(friend);
    }

    public static void task5 () {
        System.out.println("Задача 5");
            var frog = 3.5;
        System.out.println(frog);
            frog = frog * 10;
        System.out.println(frog);
            frog = frog / 3.5;
        System.out.println(frog);
            frog = frog + 4;
        System.out.println(frog);
    }

    public static void task6 () {
        System.out.println("Задача 6");
            var boxer1 = 78.2;
            var boxer2 = 82.7;
            var totalWeight = boxer1 + boxer2;
        System.out.println("Общий вес бойцов " + totalWeight + " кг!");
            var differenceWeight = boxer2 - boxer1;
        System.out.println("Вес второго бойца на " + differenceWeight + "кг. больше первого бойца.");
    }

    public static void task7 () {
        System.out.println("Задача 7");
            var boxer1 = 78.2;
            var boxer2 = 82.7;
            var differenceWeight = boxer2 - boxer1; //Первый способ
        System.out.println("(Первый способ) Вес первого бойца на " + differenceWeight + "кг. меньше другого!");
            var differenceWeight_2 = (boxer2 + boxer1) % boxer1; //Второй способ
        System.out.println("(Второй способ) Вес первого бойца, так же на " + differenceWeight_2 + "кг. меньше другого! ");
    }

    public static void task8 () {
        System.out.println("Задача 8");
            var fullTime = 640;
            var workTime = 8;
            var fullWorker = fullTime / workTime;
        System.out.println("Всего работников в компании - " + fullWorker + " человек");
            var moreWorker = 94;
            var becameWorker = fullWorker + moreWorker;
            var fullTime_2 = becameWorker * workTime;
        System.out.println("Если в компании работает " + becameWorker + " человека, то всего " + fullTime_2 + " часа работы может быть поделено между сотрудниками!");
    }
}