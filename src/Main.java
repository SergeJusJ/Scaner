import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Evesk: ");
        String input = sc.nextLine();
        System.out.println("Labai gerai " + input);
        System.out.println("Ivesk integer: ");
       // int inputInt = sc.nextInt();
        //System.out.println(inputInt);
    int inputInt= 0;
        try { inputInt = sc.nextInt();}
        catch (Exception e){
                            System.out.println("Blogas Formatas");
            }

    }
}