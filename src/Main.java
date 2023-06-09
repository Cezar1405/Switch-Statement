public class Main {
    public static void main(String[] args) {
        //Loop infinite times asking the user to input a number between 1 and 10
        //Print the name of the number (e.g. 5 --> five)
        //If the user input a number lower than 1 or greater than 10, print Cannot give you the name
        int number = 2;
/*
        if (number == 1){
            System.out.println("1 --> one");
        }else{
            System.out.println("Cannot give you the name.");
        }
        if (number == 2){
            System.out.println("2 --> one");
        }else{
            System.out.println("Cannot give you the name.");
        }
*/
        switch (number){
            case 1: System.out.println("1 --> one"); break;
            case 2: System.out.println("2 --> two"); break;
            case 3: System.out.println("3 --> three"); break;
            case 4: System.out.println("4 --> four"); break;
            case 5: System.out.println("5 --> five"); break;
            case 6: System.out.println("6 --> six"); break;
            case 7: System.out.println("7 --> seven"); break;
            case 8: System.out.println("8 --> eight"); break;
            case 9: System.out.println("9 --> nine"); break;
            case 10: System.out.println("10 --> ten"); break;
            default: System.out.println("Cannot give you the name.");
        }
    }
}