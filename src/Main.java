public class Main {
    public static void main(String[] args) {
        // chap1

        byte birthday = 18;
        if (birthday >= 18){
            System.out.println("congratulation for your majority");
        }
        if (birthday < 18){
            System.out.println("you have to wait a little");
        }

        byte age = 7;
        if (age <= 7){
            System.out.println("go to school");
        }
        if (age <=18){
            System.out.println("go to university");
        }
        if (age<=24){
            System.out.println("time to search your first job");
        }

        byte placeUsed = 66;
        if (placeUsed <= 60){
            System.out.println("you can take a seat");
        }
        if (placeUsed > 60){
            System.out.println("you stay up hohoho");
        }
        if (placeUsed == 102){
            System.out.println("there are no place for you");
        }

        // chap2

        byte birthday1 = 18;
        if (birthday1 >= 18){
            System.out.println("congratulation for your majority");
        } else {
            System.out.println("you have to wait a little");
        }

        byte age1 = 25;
        if (age1 <= 7){
            System.out.println("go to school");
        } else if (age1 <=18) {
            System.out.println("go to university");
        } else {
            System.out.println("time to search your first job");
        }


        byte placeUsed1 = 66;
        if (placeUsed1 <= 60){
            System.out.println("you can take a seat");
        } else if (placeUsed1 > 60){
            System.out.println("you stay up hohoho");
        } else {
            System.out.println("there are no place for you");
        }

        //chap3

        byte age2 = 9;
        if (age2 >= 2 && age2 <=6 ){
            System.out.println("go to kindergarden");
        } else if (age2 >=7 && age2 <=18) {
            System.out.println("go to school");
        } else if (age2 >=18 && age2 <=24) {
            System.out.println("go to university");
        } else {
            System.out.println("time to search your first job");
        }

        byte childAge = 10;
        if (childAge < 5){
            System.out.println("you can't ride the attraction");
        } else if (childAge >=5 && childAge <14) {
            System.out.println("you need your parents");
        } else {
            System.out.println("you can ride without parents");
        }

        int one = 1;
        int two = 2;
        int free = 777;
        if (one > two && one > free){
            System.out.println("one is the higher");
        } else if (two > one && two > free) {
            System.out.println("two is the higher");
        } else {
            System.out.println("free is the higher");
        }


    }
}