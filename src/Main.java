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
    }
}

