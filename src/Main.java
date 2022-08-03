public class Main {
    public static void main(String[] args) {
        // Задание 1

        byte flowers = 25;
        short chiks = 10;
        int dog = 3;
        long cat = 2L;

        float sandWeight = 3.50f;
        double metWeight =6.50;

        char a = 56;
        System.out.println(a);
        boolean dogisAdult = dog > 5;
        System.out.println(dogisAdult);

        // Задание 2

        float boxer1 = 78.2f;
        float boxer2 = 82.7f;
        float weightOfAllBoxers = boxer1 + boxer2;
        System.out.println(" Общий вес боксёров = " + weightOfAllBoxers + " кг ");

        float weightDifference = boxer2 - boxer1;
        System.out.println(" Разница боксёров в весовой категории = " + weightDifference + " кг ");

        // Задание 3

        byte bananas = 5;
        byte weight1Banana = 80;
        System.out.println(" Общий вес бананов = " + (bananas * weight1Banana)+ " г ");

        byte portionsOfMilk = 2;
        byte weightOf1ServingOfMilk = 105;
        System.out.println(" Общий вес молока = " + (portionsOfMilk * weightOf1ServingOfMilk)+ " г ");

        byte iceCreamSundae = 2;
        byte weightOf1BlockOfIceCream = 100;
        System.out.println(" Общий вес мороженного = " + (iceCreamSundae * weightOf1BlockOfIceCream)+ " г ");

        byte eggs = 4;
        byte weightOf1Egg = 70;
        System.out.println(" Общий вес яиц = " + (eggs * weightOf1Egg)+ " г ");

        short totalWeightOfBananas = 400;
        short totalWeightOfMilk = 210;
        short totalWeightOfIceCream = 200;
        short totalWeightOfEggs = 280;
        System.out.println(" Вес спорт-завтрака = " + (totalWeightOfBananas + totalWeightOfMilk + totalWeightOfIceCream + totalWeightOfEggs) + " г ");

        float sportsBreakfastWeight = 1090;
        float weight1Kg = 1000;
        System.out.println(" Вес спорт-завтрака в кг = " +(sportsBreakfastWeight / weight1Kg)+ " кг ");

        // Задание 4

        byte c = 7;
        short b = 1000;
        System.out.println("7 кг = " + (c * b) + " г ");

        short g = 7000;
        short d = 250;
        short f = 500;
        System.out.println(" Понадобится " + (g / d) + " дней, если сбрасывать по 250 г в день ");
        System.out.println(" Понадобится " + (g / f) + " дней, если сбрасывать по 500 г в день ");

        byte i = 28;
        byte o = 14;
        byte p = 2;
        System.out.println(" В среднем, чтобы сбросить 7кг потребуется " + ((i + o) / 2) + " день ");

        // Задача 5

        int Masha = 67760;
        int Denis = 83690;
        int Cristina = 76230;
        byte oneYear = 12;
        double tenPercent = 0.1;

        System.out.println(" 10% от нынешней зарплаты Маши составляет - " + (Masha * tenPercent)+ " руб ");

        short tenPercentMasha = 6776;
        System.out.println(" Зарплата Маши с прибавкой в 10% составляет - " + (Masha + tenPercentMasha)+ " руб ");

        int MashasSalaryWithAnIncrease = 74536;
        System.out.println("Годовая зарплата Маши с прибавкой в 10% - " + (MashasSalaryWithAnIncrease * oneYear) + " руб ");

        int MashasAnnualSalaryWithARaise = 894432;
        int MashasAnnualSalaryWithoutARaise = Masha * oneYear;
        System.out.println(" Маша теперь получает " + MashasSalaryWithAnIncrease + " руб. " + " Годовой доход вырос на " + (MashasAnnualSalaryWithARaise - MashasAnnualSalaryWithoutARaise) + " руб ");

        System.out.println(" 10% от нынешней зарплаты Дениса составляет - " + (Denis * tenPercent) + " руб ");

        short tenPercentDenis = 8369;
        System.out.println(" Зарплата Дениса с прибавкой в 10% составляет - " + (Denis + tenPercentDenis)+ " руб ");

        int DenisSalaryWithAnIncrease = 92059;
        System.out.println("Годовая зарплата Дениса с прибавкой в 10% - " + (DenisSalaryWithAnIncrease * oneYear) + " руб ");

        int DenisAnnualSalaryWithARaise = 1104708;
        int DenisAnnualSalaryWithoutARaise = Denis * oneYear;
        System.out.println(" Денис теперь получает " + DenisSalaryWithAnIncrease + " руб. " + " Годовой доход вырос на " + (DenisAnnualSalaryWithARaise - DenisAnnualSalaryWithoutARaise) + " руб ");

        System.out.println(" 10% от нынешней зарплаты Кристины составляет - " + (Cristina * tenPercent)+ " руб ");

        short tenPercentCristina = 7623;
        System.out.println(" Зарплата Кристины с прибавкой в 10% составляет - " + (Cristina + tenPercentCristina)+ " руб ");

        int CristinaSalaryWithAnIncrease = 83853;
        System.out.println("Годовая зарплата Кристины с прибавкой в 10% - " + (CristinaSalaryWithAnIncrease * oneYear) + " руб ");

        int CristinaAnnualSalaryWithARaise = 1006236;
        int CristinaAnnualSalaryWithoutARaise = Cristina * oneYear;
        System.out.println(" Кристина теперь получает " + CristinaSalaryWithAnIncrease + " руб. " + " Годовой доход вырос на " + (CristinaAnnualSalaryWithARaise - CristinaAnnualSalaryWithoutARaise) + " руб ");
    }
}