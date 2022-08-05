public class Main {

    public static void main(String[] args) {
	// task 1
        int i=0;
        while (i<10) {
            i++;
            System.out.print(i+" " );
        }
        System.out.println();
        for (; i>=1; i--){
            System.out.printf("%d", i);
        }
        System.out.println();

        // task 2
        int firstFridayMonth=5;
        for (int friday=firstFridayMonth;friday<=31;friday+=7) {
            System.out.printf("Сегодня пятница,%d-е число. Необходимо подготовить отчет.%n", friday);
        }
            // task 3
           int period=79;
           int currentYear=2022;
           int start=currentYear-200;
           int end=currentYear+100;
           int startYear=0;
           for (int year=start;year<=end;year++){
               if (year % period==startYear){
                   System.out.println(year);
               }
            }

        }

    }

