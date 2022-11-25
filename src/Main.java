public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 7. Cycles (Part 2).");
//        System.out.println("Part 1");
//        System.out.println("Task 1");
//        double total = 0;
//        int deposit = 15_000;
//        int month = 1;
//        while (total <= 2_459_000) {
//            total = total + total / 100;
//            total = total + deposit;
//            String result = String.format("%.2f", total);
//            System.out.println("Месяц " + month + ", сумма накоплений равна " + result + " рублей");
//            month ++;
//        }
//        System.out.println(" ");
//
//        System.out.println("Task 2");
//        int a = 1;
//        while (a <= 10) {
//            System.out.print (a);
//            System.out.print(" ");
//            a ++;
//        }
//        System.out.println(" ");
//        for (a = 10; a >= 1; a--) {
//            System.out.print(a);
//            System.out.print(" ");
//        }
//        System.out.println(" ");
//
//        System.out.println("Task 3");
//        int population = 12_000_000;
//        int year = 0;
//        while (year < 10) {
//            year++;
//            int fertility = population / 1000 * 17;
//            int mortality = population / 1000 * 8;
//            population = population + fertility - mortality;
//            System.out.println("Год " + year + ", численность населения составляет " + population + " человек.");
//        }
//        System.out.println(" ");


        System.out.println("Part 2");
        System.out.println("Task 1,2");
        double deposit = 15_000;
        double target = 12_000_000;
        String ziel = String.format("%.2f", target);
        int month = 0;
        while (deposit <= target) {
            month++;
            deposit = deposit + deposit * 0.07;
            String result = String.format("%.2f", deposit);
            if (month % 6 ==0) {
                System.out.println("месяц " + month + ", сумма накоплений = " + result + " рублей.");
            }
        }
        String result = String.format("%.2f", deposit);
        System.out.println("Необходимая сумма в размере " + ziel + " накопится за " + month + " месяцев и будет составлять " + result + " рублей.");
        System.out.println(" ");

        System.out.println("Task 3");
        double depositOfVasilyy = 15_000;
        int totalNumberOfMonths = 9 * 12;
        int periodMonth = 0;
        for (; periodMonth <= totalNumberOfMonths; periodMonth++) {
            depositOfVasilyy += depositOfVasilyy * 0.07;
            String targetOfVasilyy = String.format("%.2f", depositOfVasilyy);
            if(periodMonth > 0 && periodMonth % 6 ==0) {
                System.out.println("месяц " + periodMonth + ", сумма накоплений = " + targetOfVasilyy + " рублей.");
            }
        }
        System.out.println(" ");


        System.out.println("Task 4");
        int i = 4;
        for (i = 4; i <= 31; i += 7) {
            System.out.println("Сегодня пятница, " + i + " число. Необходимо подготовить отчет. ");
        }
        System.out.println(" ");

        System.out.println("Part 3");
        System.out.println("Task 1");
        for (int year = 1822; year <= 2122; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
        System.out.println(" ");




    }
}