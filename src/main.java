import java.util.Scanner;
//commit 1
//commit 2
//commit 3
//commit 4
//commit 5
//commit 6
public class main {
    public static void main(String[] args) {
        Scanner             userInputReader = new Scanner(System.in);
        operarNumero        resultado1      = new operarNumero();
        avgNumbers          resultado2      = new avgNumbers();
        measuresRectangle   resultado3      = new measuresRectangle();
        randomnumber        resultado4      = new randomnumber();

        System.out.println("Please enter 1 to add a number");
        System.out.println("Please enter 2 to calculate the avg among 3 numbers");
        System.out.println("Please enter 3 to calculate perimeter and base area using base and hight");
        System.out.println("Please enter 4 to request a random number 0-200 shows it and the calculate 30% added");
        System.out.println("--------------------------------------------");
        System.out.println("Please enter a option:");

        int menu = userInputReader.nextInt();
        if (menu == 1){
            System.out.println("Please enter a number to operate");
            int numero = userInputReader.nextInt();
            System.out.println("The new number is: " + numero);
            resultado1.setNumber(numero);
            System.out.println("The new number is: " + resultado1.getNumber());
        }
        else if (menu == 2){
            System.out.println("Please enter the 1st number to operate");
            int resultado2_1 = userInputReader.nextInt();
            System.out.println("Please enter the 2nd number to operate");
            int resultado2_2 = userInputReader.nextInt();
            System.out.println("Please enter the 3rd number to operate");
            int resultado2_3 = userInputReader.nextInt();
            resultado2.setAvgNumber(resultado2_1,resultado2_2,resultado2_3);
            System.out.println("The new number is: " + resultado2.getAvgNumber());
        }
        else if (menu == 3){
            System.out.println("Please enter high to operate");
            int resultado3_1 = userInputReader.nextInt();
            System.out.println("Please enter base to operate");
            int resultado3_2 = userInputReader.nextInt();
            resultado3.setMeasuresRectangleA(resultado3_1,resultado3_2);
            System.out.println("The Area is: " + resultado3.getMeasuresRectangleA());
            resultado3.setMeasuresRectangleP(resultado3_1,resultado3_2);
            System.out.println("The Perimeter is: " + resultado3.getMeasuresRectangleP());
        }
        else if (menu == 4){
            resultado4.ranNumber();
        }
    }
}