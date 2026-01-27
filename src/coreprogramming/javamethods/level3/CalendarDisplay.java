package coreprogramming.methods.level3;
import java.util.Scanner;

public class CalendarDisplay {

    static String[] months = {
            "January","February","March","April","May","June",
            "July","August","September","October","November","December"
    };

    static int[] daysInMonth = {
            31,28,31,30,31,30,31,31,30,31,30,31
    };

    public static boolean isLeapYear(int year) {
        return year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    public static int firstDay(int d, int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + (31*m0)/12) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();

        int days = daysInMonth[month-1];
        if (month == 2 && isLeapYear(year)) days = 29;

        System.out.println(months[month-1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int start = firstDay(1, month, year);
        for (int i = 0; i < start; i++) System.out.print("    ");

        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((day + start) % 7 == 0) System.out.println();
        }
    }
}
