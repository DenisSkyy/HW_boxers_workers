public class Main {
    public static void main(String[] args) {
        var dog =8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog +4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog*10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var liftingCapacity = 50;
        var stuffWeight = 20;
        var capacityLeft = liftingCapacity - stuffWeight;
        System.out.println("Еще можно положить " + capacityLeft + " кг вещей");


        var appleWeight = 2;
        var orangeWeight = 3;
        var fruitWeight = appleWeight + orangeWeight;
        System.out.println("Общий вес фрутков " + fruitWeight);

        var meatWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var cucumbersWeight = 2;
        var peppersWeight = 2;
        var zucchiniWeight = 2;
        var vegetablesWeight = tomatoesWeight + cucumbersWeight + peppersWeight + zucchiniWeight;
        var productsWeight = fruitWeight + vegetablesWeight + meatWeight + waterWeight;
        System.out.println("Общий вес продуктов " + productsWeight + " кг!");

        var leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Места осталось " + leftWeight + " кг!");


        productsWeight = productsWeight * 2;
        System.out.println("Теперь вес продуктов " + productsWeight);

        leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Теперь места осталось " + leftWeight + " кг!");

        var overload = (stuffWeight + productsWeight) % liftingCapacity;
        System.out.println("Перегруз на " + overload + " кг!");

        var ProductsInOneCar = productsWeight / 2;
        System.out.println("Продуктов в одной машине " + ProductsInOneCar);

        var firstBoxerWeight =78.2;
        var secondBoxerWeight =82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес двух боксеров " + totalWeight + " кг");

        var differenceWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница между весами боксеров " + differenceWeight + " кг");

        var differenceWeightv2 = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница между весами боксеров (версия 2) " + differenceWeightv2 + " кг");

        var workingHours = 640;
        var workingDay = 8;
        var workers = workingHours / workingDay;
        System.out.println("Всего работников в компании – " + workers + " человек");

        var workersNew = workers + 94;
        var workingHoursNew = workersNew * workingDay;
        System.out.println("Если в компании работает " + workersNew + " человек, то всего " +  workingHoursNew + " часов работы может быть поделено между сотрудниками");




    }
}