import java.util.Scanner;
import java.util.SimpleTimeZone;

public class TaNoroz {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int days = 1;
        String Date = input.next();
        String spl[] = Date.split("/");
        int month = Integer.parseInt(spl[1]);
        int day = Integer.parseInt(spl[2]);
        if(month < 6){
        days += 31-day;
        for(int i =0; i<=6-(month+1); i++){
                    days += 31;
                }
            days+= 179;
            System.out.print(days);
        }
        if(month == 6){
            days += 31-day;
            days+= 179;
            System.out.print(days);
        }
        if (month>6 && month<12){

            days += (30-day);
            for(int k =0; k<11-(month); k++){
                days += 30;
            }
            days+= 29;
            System.out.print(days);
        }
        if (month ==12){
            days += 29-day;
            System.out.print(days);
        }
    }

}

