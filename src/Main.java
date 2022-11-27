import java.text.DecimalFormat;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DecimalFormat bigNumberSeparator = new DecimalFormat("###,###,###.##");

        System.out.println("Homework 7. Cycles (Part 2).");
        System.out.println("Part 1");
        System.out.println("Task 1");
        double total = 0;
        int deposit = 15_000;
        int month = 1;
        while (total <= 2_459_000) {
            total = total + total / 100;
            total = total + deposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + bigNumberSeparator.format(total) + " рублей");
            month ++;
        }
        System.out.println(" ");

        System.out.println("Task 2");
        int a = 1;
        while (a <= 10) {
            System.out.print (a);
            System.out.print(" ");
            a ++;
        }
        System.out.println(" ");
        for (a = 10; a >= 1; a--) {
            System.out.print(a);
            System.out.print(" ");
        }
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Task 3");
        int population = 12_000_000;
        int year = 0;
        int fertilityBy1000 = 17;
        int mortalityBy1000 = 8;
        int increase = fertilityBy1000 - mortalityBy1000;
        while (year < 10) {
            year++;
            population += population * increase / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + bigNumberSeparator.format(population) + " человек.");
        }
        System.out.println(" ");


        System.out.println("Part 2");
        System.out.println("Task 1,2");
        double deposit1 = 15_000;
        double target1 = 12_000_000;
        int month1 = 0;
        while (deposit1 <= target1) {
            month1++;
            deposit1 = deposit1 + deposit1 * 0.07;
            if (month1 % 6 ==0) {
                System.out.println("месяц " + month1 + ", сумма накоплений = " + bigNumberSeparator.format(deposit1) + " рублей.");
            }
        }
        System.out.println("Необходимая сумма в размере " + bigNumberSeparator.format(target1) + " накопится за " + month1 + " месяцев и будет составлять " + bigNumberSeparator.format(deposit1) + " рублей.");
        System.out.println(" ");

        System.out.println("Task 3");
        double depositOfVasilyy = 15_000;
        int totalNumberOfMonths = 9 * 12;
        int periodMonth = 1;
        for (; periodMonth <= totalNumberOfMonths; periodMonth++) {
            depositOfVasilyy += depositOfVasilyy * 0.07;
            if(periodMonth % 6 ==0) {
                System.out.println("месяц " + periodMonth + ", сумма накоплений = " + bigNumberSeparator.format(depositOfVasilyy) + " рублей.");
            }
        }
        System.out.println(" ");


        System.out.println("Task 4");
        int firstFriday = 1;
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + " число. Необходимо подготовить отчет. ");
        }
        System.out.println(" ");

        System.out.println("Part 3");
        System.out.println("Task 1");
        int year1 = 0;
        int thisYear = LocalDate.now().getYear();
        int startingYear = thisYear - 200;
        int endYear = thisYear + 100;
        int periodicity = 79;
        while (year1 <= endYear ) {
            if (year1 >= startingYear) {
                System.out.println(year1);
            }
            year1 += periodicity;
        }

        System.out.println(" ");

        System.out.println("Task 2");
        for (int a1 = 2, b1 = 1; b1 <= 10; b1++) {
            int c1 = a1 * b1;
            System.out.println(a1 + " * " + b1 + " = " + c1);
        }
    }
}