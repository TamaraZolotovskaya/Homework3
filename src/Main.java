public class Main {
    public static void main(String[] args) {
        //        Задача 1
        System.out.println("Задание 1");
        byte b = 123;
        short s = 12345;
        int i = 123456789;
        long l = 123456789123456789L;
        double d = 1.123456789123456;
        float f = 1.1234567f;
        System.out.println("Значение переменной b с типом byte равно "+b);
        System.out.println("Значение переменной s с типом short равно "+s);
        System.out.println("Значение переменной i с типом int равно "+i);
        System.out.println("Значение переменной l с типом long равно "+l);
        System.out.println("Значение переменной d с типом double равно "+d);
        System.out.println("Значение переменной f с типом float равно "+f);
        //        Задача 2
        System.out.println("Задание 2");
        float iFloat = 27.12f;
        long ilong = 987678965549L;
        double idouble = 2.786;
        boolean iBoolean = false;
        char ichar = 569;
        short iShort = -159;
        int iInt = 27897;
        byte iByte = 67;
        //        Задача 3
        System.out.println("Задание 3");
        byte LPClass = 23;
        byte ASClass = 27;
        byte EAClass = 30;
        short papersCount = 480;
        int numberOfSheets = papersCount/(LPClass+ASClass+EAClass);
        System.out.println("На каждого ученика рассчитано "+numberOfSheets+" листов бумаги");
        //        Задача 4
        System.out.println("Задание 4");
        byte bottles = 16;
        byte mins = 2;
        int outputMin = bottles/mins;
        int output20Min = outputMin*20;
        int outputDay = outputMin*60*24;
        int outputMonth = outputDay*30;
        System.out.println("За 20 минут машина произвела бутылок "+output20Min+" штук");
        System.out.println("За день машина произвела бутылок "+outputDay+" штук");
        System.out.println("За 3 дня машина произвела бутылок "+outputDay*3+" штук");
        System.out.println("За месяц машина произвела бутылок "+outputMonth+" штук");
        //        Задача 5
        System.out.println("Задание 5");
        byte total = 120;
        byte whitePerOne = 2;
        byte brownPerOne = 4;
        int numberOfClasses=total/(whitePerOne+brownPerOne);
        int white = whitePerOne*numberOfClasses;
        int brown = brownPerOne*numberOfClasses;
        System.out.println("В школе, где "+numberOfClasses+" классов, нужно "+white+ " банок белой краски и "+brown+" банок коричневой краски.");
        //        Задача 6
        System.out.println("Задание 6");
        short bananaWeight = 5*80;
        short milkWeight = 2*105;
        short iceWeight = 2*100;
        short eggWeight = 4*70;
        int breakfastWeight = bananaWeight+milkWeight+iceWeight+eggWeight;
        double breakfastWeightKg = breakfastWeight/1000;
        System.out.println("Вес завтрака "+breakfastWeightKg+" кг");
        //        Задача 7
        System.out.println("Задание 7");
        byte days250 = 7000/250;
        byte days500 = 7000/500;
        int mediumDays = (days250+days500)/2;
        System.out.println("Если спорсмен будет терять 250 г. ежедневно, он потратит  "+days250+" дней.");
        System.out.println("Если спорсмен будет терять 500 г. ежедневно, он потратит  "+days500 +" дней.");
        System.out.println("В среднем спортсмен потратит потратит  " +mediumDays+ " дней.");
        //        Задача 8
        System.out.println("Задание 8");
        int masha = 67760;
        int denis  = 83690;
        int kristina = 76230;
        int mashaNew = masha+masha/10;
        int denisNew  = denis+ denis/10;
        int kristinaNew = kristina+kristina/10;
        int mashaDifference = masha/10*12;
        int denisDifference = denis/10*12;
        int kristinaDifference = kristina/10*12;
        System.out.println("Маша теперь получает  " +mashaNew+ " рублей. Годовой доход вырос на "+mashaDifference+ " рублей.");
        System.out.println("Денис теперь получает  " +denisNew+ " рублей. Годовой доход вырос на "+denisDifference+ " рублей.");
        System.out.println("Кристина теперь получает  " +kristinaNew+ " рублей. Годовой доход вырос на "+kristinaDifference+ " рублей.");
    }
}