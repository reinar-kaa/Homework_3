public class Main {
    public static void main(String[] args) {
        // Task #1
        int amurTiger = 570;
        byte panda = 1;
        short sharkTeeth = 1500;
        long horse = 428405320L;
        float rice = 5743.13f;
        double tomato = 837629.8204;
        System.out.println("В наши дни на планете проживает " + amurTiger + " Амурских тигров");
        System.out.println("Вам представлен " + panda + " бамбуковый мишка");
        System.out.println("Примерно " + sharkTeeth + " зубов у акулы");
        System.out.println("Пусть даже " + horse + " лошадей. Их мало не бывает!" );
        System.out.println("Я каким-то образом посчитал ровно " + rice + " рисовых зерён. Скажите, ведь не чудо ли это?");
        System.out.println("Даже не спрашивайте, как Я сосчитал " + tomato + " помидорок. Меня мама заставила :(");

        // Task #2
        float santimeter = 27.12f;
        long cryptoCoin = 987678965549L;
        double ruble = 2.786;
        boolean applePie = false;
        short looooooongGiraffeNeck = 569;
        int farenheitDegrees = -159;
        int populationCity = 27897;
        byte cat = 67;
        System.out.println("Длина стопы равно " + santimeter + " сантиметров");
        System.out.println("Стоимость криптовалюты равна $" + cryptoCoin);
        System.out.println("Рубль рухнул на " + ruble + " рубля");
        System.out.println("Правда ли что это Яблочный пирог? " + applePie);
        System.out.println("Ровно на " + looooooongGiraffeNeck + " сантиметров вытянулась шея у самого любопытного жирафа");
        System.out.println("Для экспериментов учёные достигли температуры в " + farenheitDegrees + " по Фаренгейту");
        System.out.println("Население среднестатистических малых городов России составляет " + populationCity + " человек");
        System.out.println("В приюте находится " + cat + " кошек. Грустно.. Заберите кошку :(");

        // Task #3
        int ludochkaPavlaDoch = 23;
        byte annushkaCeregiDoch = 27;
        short katyushaDryuniDoch = 30;
        int paperForAll = 480;
        paperForAll = paperForAll / (ludochkaPavlaDoch + annushkaCeregiDoch + katyushaDryuniDoch);
        System.out.println("На каждого ученика рассчитано " + paperForAll + " листов бумаги");

        // Task #4
        int efficiencyBottle = 16 / 2; // производство бутылок в минуту
        int in20Minute = efficiencyBottle * 20;
        System.out.println("За 20 минут машины произвела бутылок " + in20Minute + " штук");
        int inDay = efficiencyBottle * 60 * 24;
        System.out.println("За одни сутки машины произвела бутылок " + inDay + " штук");
        int in3Day = efficiencyBottle * 60 * 24 * 3;
        System.out.println("За трое суток машины произвела бутылок " + in3Day + " штук");
        int inMonth = efficiencyBottle * 60 * 24 * 31;
        System.out.println("За один месяц машины произвела бутылок " + inMonth + " штук");


        // Task #5
        byte whitePaint = 2;
        byte brownPaint = 4;
        int paintForAllClasses = 120/ (whitePaint + brownPaint);
        System.out.println("В школе всего " + paintForAllClasses + " классов");
        int whiteForAllClasses = paintForAllClasses * whitePaint;
        System.out.println(whiteForAllClasses + " банок белой краски");
        int brownForAllClasses = paintForAllClasses * brownPaint;
        System.out.println(brownForAllClasses + " банок коричневой краски");
        System.out.println("В школе, где " + paintForAllClasses + " классов, нужно "+ whiteForAllClasses + " банок белой краски и " + brownForAllClasses + " банок коричневой краски");

        // Task #6
        short banana = 5 * 80;
        short milk = 2 * 105;
        short iceCream = 2 * 100;
        short egg = 4 * 70;
        double allComponents = banana + milk + iceCream + egg;
        double sportsFood = allComponents / 1000;
        System.out.println("Общая масса спорт-завтрака составляет " + sportsFood + " кг");

        // Task #7
        byte needLoseWeight = 7;
        int a = 250, b = 500;
        int c = (a + b) / 2;
        int firstDiet = needLoseWeight * 1000 / a;
        System.out.println("При ежедневной потере веса в " + a + "г, потребуется " + firstDiet + " дней");
        int secondDiet = needLoseWeight * 1000 / b;
        System.out.println("При ежедневной потере веса в " + b + "г, потребуется " + secondDiet + " дней");
        int averageValueDiet = needLoseWeight * 1000 / c;
        System.out.println("При ежедневной потере веса в " + c + "г, потребуется " + averageValueDiet + " дней");

        // Task #8
        int Maria = 67_760;
        int Denis = 83_690;
        int Christina = 76_230;
        int percentageM = (Maria * 10 / 100) + Maria;
        int percentageD = (Denis * 10 / 100) + Denis;
        int percentageC = (Christina * 10 / 100) + Christina;
        System.out.println("Ежемясячный доход Марии вырос с " + Maria + " до " + percentageM + " рублей");
        System.out.println("Ежемясячный доход Дениса вырос с " + Denis + " до " + percentageD + " рублей");
        System.out.println("Ежемясячный доход Кристины вырос с " + Christina + " до " + percentageC + " рублей");
        int annualIncomeM = Maria * 12;
        int annualIncomeD = Denis * 12;
        int annualIncomeC = Christina * 12;
        System.out.println("До повышения годовой доход Марии составлял " + annualIncomeM + " рублей");
        System.out.println("До повышения годовой доход Дениса составлял " + annualIncomeD + " рублей");
        System.out.println("До повышения годовой доход Кристины составлял " + annualIncomeC + " рублей");
        int afterIncreaseM = percentageM * 12;
        int afterIncreaseD = percentageD * 12;
        int afterIncreaseC = percentageC * 12;
        System.out.println("После повышения годовой доход Марии составляет " + afterIncreaseM + " рублей");
        System.out.println("После повышения годовой доход Дениса составляет " + afterIncreaseD + " рублей");
        System.out.println("После повышения годовой доход Кристины составляет " + afterIncreaseC + " рублей");
        int annualIncomeDifferenceM = afterIncreaseM - annualIncomeM;
        int annualIncomeDifferenceD = afterIncreaseD - annualIncomeD;
        int annualIncomeDifferenceC = afterIncreaseC - annualIncomeC;
        System.out.println("Разница годового дохода Марии до и после повышения ежемячной заработной платы составляет " + annualIncomeDifferenceM + " составляет");
        System.out.println("Разница годового дохода Дениса до и после повышения ежемячной заработной платы составляет " + annualIncomeDifferenceD + " составляет");
        System.out.println("Разница годового дохода Кристины до и после повышения ежемячной заработной платы составляет " + annualIncomeDifferenceC + " составляет");
        System.out.println("Ежемесячный доход Марии сейчас составляет " + percentageM + " рублей. " + "Годовой доход вырос на " + annualIncomeDifferenceM + " рублей");
        System.out.println("Ежемесячный доход Дениса сейчас составляет " + percentageD + " рублей. " + "Годовой доход вырос на " + annualIncomeDifferenceD + " рублей");
        System.out.println("Ежемесячный доход Кристины сейчас составляет " + percentageC + " рублей. " + "Годовой доход вырос на " + annualIncomeDifferenceC + " рублей");



    }
}