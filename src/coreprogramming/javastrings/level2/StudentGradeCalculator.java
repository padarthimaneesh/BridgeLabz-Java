package coreprogramming.string.Level2;
import java.util.Random;

public class StudentGradeCalculator {

    // a. Generate random 2-digit PCM marks
    public static int[][] generatePCM(int students) {
        Random r = new Random();
        int[][] pcm = new int[students][3];
        for (int i = 0; i < students; i++) {
            pcm[i][0] = 10 + r.nextInt(90);
            pcm[i][1] = 10 + r.nextInt(90);
            pcm[i][2] = 10 + r.nextInt(90);
        }
        return pcm;
    }

    // b. Calculate total, average, percentage
    public static double[][] calculateStats(int[][] pcm) {
        double[][] stats = new double[pcm.length][3];
        for (int i = 0; i < pcm.length; i++) {
            double total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double avg = Math.round((total / 3) * 100.0) / 100.0;
            double perc = Math.round((total / 300 * 100) * 100.0) / 100.0;
            stats[i][0] = total;
            stats[i][1] = avg;
            stats[i][2] = perc;
        }
        return stats;
    }

    // c. Calculate grade
    public static String[] calculateGrade(double[][] stats) {
        String[] grade = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double p = stats[i][2];
            if (p >= 80) grade[i] = "A";
            else if (p >= 70) grade[i] = "B";
            else if (p >= 60) grade[i] = "C";
            else if (p >= 50) grade[i] = "D";
            else if (p >= 40) grade[i] = "E";
            else grade[i] = "R";
        }
        return grade;
    }

    // d. Display scorecard
    public static void display(int[][] pcm, double[][] stats, String[] grade) {
        System.out.println("Phy Chem Math Total Avg % Grade");
        for (int i = 0; i < pcm.length; i++) {
            System.out.println(
                    pcm[i][0] + "   " + pcm[i][1] + "   " + pcm[i][2] + "   " +
                            stats[i][0] + "   " + stats[i][1] + "   " +
                            stats[i][2] + "   " + grade[i]
            );
        }
    }

    public static void main(String[] args) {
        int students = 5;
        int[][] pcm = generatePCM(students);
        double[][] stats = calculateStats(pcm);
        String[] grade = calculateGrade(stats);
        display(pcm, stats, grade);
    }
}
