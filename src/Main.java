import java.time.LocalDate;

public class Main {
    public static int isVisokosny(int year) {
        if (year % 100 == 0) {
            System.out.println(" Год не високосный");
        } else if (year % 4 == 0) {
            System.out.println(" Год високосный");
        } else if (year % 400 == 0) {
            System.out.println(" Год високосный");
        } else {
            System.out.println("Не високосный");
        }
        return year;
    }
    public static void   isIosOrAndroid(short clientOs,int clientDeviceYear){
        int currentYear = LocalDate.now().getYear();
                if (clientOs == 0 && clientDeviceYear < currentYear) {
                    System.out.println("Установите  облегченную версию приложения для iOS по ссылке»");
                }
                else if (clientDeviceYear >= currentYear) {
                    System.out.println("Установите версию приложения для iOS по ссылке»");
                } else {
                    if (clientDeviceYear >= currentYear && clientOs == 0) {

                        System.out.println("Установите версию приложения для Android по ссылке");
                    } else if (clientDeviceYear < currentYear) {
                        System.out.println("Установите  облегченную версию приложения для Android по ссылке");
                    }
                }

            }
            public static int countDayDelivery(int day){
                int deliveryDistanse=9;
                if (deliveryDistanse<=20){
                    System.out.println(" Доставка займет "+" "+ (day+1)+" "+"день");
                }
                else if (deliveryDistanse>20&&deliveryDistanse<60){
                    System.out.println(" Доставка займет "+" "+ (day+2)+" "+"дня");
                }
                else {
                    System.out.println(" Доставка займет "+" "+ (day+3)+" "+"дня");
                }
return day;
            }
    public static void main(String[] args) {

        int year=2023;
        int clientDeviceYear=2014;
        short clientOs=1;
        int day=0;

        System.out.print(year+" ");
        isVisokosny(year);
        System.out.println();
       isIosOrAndroid(clientOs,clientDeviceYear);
        System.out.println();
countDayDelivery(day);

    }
}