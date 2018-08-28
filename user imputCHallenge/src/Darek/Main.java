package Darek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int suma = 0;
        int i= 1;
        while (i<11){
            System.out.println("Podaj liczbe nr: "+i);
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt){
                int liczba= scanner.nextInt();
                System.out.println("Podano cyfre#"+i);
                scanner.nextLine();
                suma += liczba;
                i++;
            }else{
                System.out.println("Niepoprawna wartość podaj poprawna:");
                scanner.nextLine();
            }
        }
        System.out.println("Suma podanych cyfr ="+ suma);

        scanner.close();
	// write your code here
    }
}
