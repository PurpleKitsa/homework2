public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog -3.5;
        cat = cat -1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend +2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var weightTotalBoxers = weightFirstBoxer + weightSecondBoxer;
        System.out.println("Общий вес боксёров " + weightTotalBoxers);
        var weightDifferenceBoxer = weightSecondBoxer - weightFirstBoxer;
        System.out.println("Разница между весом боксёров " + weightDifferenceBoxer);
        var weightBoxersPersent = weightSecondBoxer % weightFirstBoxer;
        System.out.println("Разница между весом боксёров " + weightBoxersPersent);

        var totalTime = 640;
        var workTime = 8;
        var numberWorkers = totalTime / workTime;
        System.out.println("Всего работников в компании - " + numberWorkers + " человек");

        numberWorkers = numberWorkers + 94;
        var time = totalTime / numberWorkers;
        System.out.println("Если в компании работает " + numberWorkers + " человек, то всего " + time + " часов работы может быть поделено между сотрудниками");

        //Переменные часть 2
        //Задача 1

        int a = 10;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = 100;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short c = 1000;
        System.out.println("Значение переменной c с типом short равно " + c);
        long d = 100000;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 1.0011F;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 10.11000;
        System.out.println("Значение переменной f с типом double равно " + f);

        //Задача 2

        double apples = 27.12;
        long bananas = 987_678_965_549L;
        float tomato = 2.786F;
        boolean cucumber = false;
        int potato = 569;
        short pumpkin = -159;
        short pear = 27897;
        byte cherry = 67;

        //Задача 3

        byte classA = 23;
        byte classB = 27;
        byte classC = 30;
        int student = classA + classB + classC;
        int totalPaper = 480;
        int forOneStudent = totalPaper / student;
        System.out.println("На каждого ученика рассчитано " + forOneStudent + " листов бумаги");

        //Задача 4

        int bottlesForMinute = 16;
        int twoMinute = 2;
        int amountBottles = bottlesForMinute / twoMinute;
        int twentyMinute = 20;
        System.out.println("За "+twentyMinute+ " минут машина произвела бутылок "+amountBottles * twentyMinute +" штук");
        int oneDay = 24 * 60;
        System.out.println("За "+oneDay+ " минут машина произвела бутылок "+amountBottles * oneDay +" штук");
        int threeDay = 3 * oneDay;
        System.out.println("За "+threeDay+ " минут машина произвела бутылок "+amountBottles * threeDay +" штук");
        int oneMonth = 30 * oneDay;
        System.out.println("За "+oneMonth+ " минут машина произвела бутылок "+amountBottles * oneMonth +" штук");

        //Задача 5

        int totalBanks = 120;
        int whiteBanks = 2;
        int brownBanks = 4;
        int totalClass = totalBanks / (whiteBanks + brownBanks);
        int totalWhiteClass = totalClass * whiteBanks;
        int totalBrownClass = totalClass * brownBanks;
        System.out.println("В школе, "+ totalClass + " классов, нужно "+ totalWhiteClass +" банок белой краски и "+ totalBrownClass +" банок коричневой краски");

        //Задача 6

        int totalBananas = 5;
        int weightOneBananas = 80;
        int milk = 2;
        int weightOneMilk =105;
        int iceCream = 2;
        int weightOneIceCream = 100;
        int egg = 4;
        int weightOneEgg = 70;

        double weightSportPit  = (totalBananas * weightOneBananas) + (milk * weightOneMilk) + (iceCream * weightOneIceCream) + (egg * weightOneEgg);
        System.out.println("Вес спорт завтрака "+ weightSportPit / 1000 +" кг!");

        //Задача 7

        int needLostWeight = 7000;
        int minLostWeight = 250;
        int maxLostWeight = 500;
        System.out.println("Потребуется дней " + needLostWeight / minLostWeight +" при потере 250 грамм");
        System.out.println("Потребуется дней " + needLostWeight / maxLostWeight +" при потере 500 грамм");
        System.out.println("Потребуется дней " + (needLostWeight / minLostWeight) % (needLostWeight / maxLostWeight) + " в среднем");


        //Задача 8

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int upSalaryMasha = salaryMasha / 10;
        int upSalaryDenis = salaryDenis / 10;
        int upSalaryKristina = salaryKristina / 10;
        int totalUpSalaryMasha = salaryMasha + upSalaryMasha;
        int totalUpSalaryDenis = salaryDenis + upSalaryDenis;
        int totalUpSalaryKristina = salaryKristina + upSalaryKristina;
        int earlySalaryMasha = salaryMasha * 12;
        int earlySalaryDenis = salaryDenis * 12;
        int earlySalaryKristina = salaryKristina * 12;
        int earlyUpSalaryMasha = totalUpSalaryMasha * 12;
        int earlyUpSalaryDenis = totalUpSalaryDenis * 12;
        int earlyUpSalaryKristina = totalUpSalaryKristina * 12;

        System.out.println("Маша теперь получает "+totalUpSalaryMasha+" рублей. Годовой доход вырос на "+ (earlyUpSalaryMasha - earlySalaryMasha) +" рублей ");
        System.out.println("Денис теперь получает "+totalUpSalaryDenis+" рублей. Годовой доход вырос на "+ (earlyUpSalaryDenis - earlySalaryDenis) +" рублей ");
        System.out.println("Маша теперь получает "+totalUpSalaryKristina+" рублей. Годовой доход вырос на "+ (earlyUpSalaryKristina - earlySalaryKristina) +" рублей ");


    }
}

