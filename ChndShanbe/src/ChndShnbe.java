import java.util.Arrays;
import java.util.Scanner;
public class ChndShnbe {

    public static void main(String[] args) {
        String[] months = {"Farvardin", "Ordibehesht", "Khordad", "Tir", "Mordad", "Shahrivar", "Mehr", "Aban", "Azar", "Dey", "Bahman", "Esfand"};
        String[] days = {"shanbe", "1shanbe", "2shanbe", "3shanbe", "4shanbe", "5shanbe", "jome"};
        Scanner input = new Scanner(System.in);
        int itr = input.nextInt();
        input.nextLine();
        //main code
        for (int i = 1; i <= itr; i++) {
            int DayCount = 0;
            String T1 = input.nextLine();
            String[] spl1 = T1.split("\\s+");
            int day1 = Integer.parseInt(spl1[0]);
            String monthT1 = spl1[1];
            String rooz = spl1[2];
            int month1 = Arrays.asList(months).indexOf(monthT1) + 1;
            int rooz1 = Arrays.asList(days).indexOf(rooz);
            if (month1 < 6) {
                DayCount += 31 - day1;
                for (int j = 0; j <= 6 - (month1 + 1); j++) {
                    DayCount += 31;
                }
                DayCount += 179;
            }
            if (month1 == 6) {
                DayCount += 31 - day1;
                DayCount += 179;
            }
            if (month1 > 6 && month1 < 12) {

                DayCount += (30 - day1);
                for (int k = 0; k < 11 - (month1); k++) {
                    DayCount += 30;
                }
                DayCount += 29;
            }
            if (month1 == 12) {
                DayCount += 29 - day1;
            }
            String T2 = input.nextLine();
            String[] spl2 = T2.split("\\s+");
            String monthT2 = spl2[1];
            int day2 = Integer.parseInt(spl2[0]);
            int month2 = Arrays.asList(months).indexOf(monthT2) + 1;
            int FLG = 0;
            if (month2 < 6) {
                FLG += 31 - day2;
                for (int j = 0; j <= 6 - (month2 + 1); j++) {
                    FLG += 31;
                }
                FLG += 179;
            }
            if (month2 == 6) {
                FLG += 31 - day2;
                FLG += 179;
            }
            if (month2 > 6 && month2 < 12) {

                FLG += (30 - day2);
                for (int k = 0; k < 11 - (month2); k++) {
                    FLG += 30;
                }
                FLG += 29;
            }
            if (month2 == 12) {
                FLG += 29 - day2;
            }
            DayCount += 365 - FLG;
            int rooz2 = DayCount % 7;
            if (rooz2 != 0) {
                System.out.println(days[((rooz1 +(rooz2 - 1))%7)]);
            }
            if (rooz2==0){
                System.out.println(rooz);
            }
        }
    }
}
