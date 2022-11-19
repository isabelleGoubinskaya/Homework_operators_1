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





    }
}