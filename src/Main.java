import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Task:");
            String text = scan.nextLine();
            if(text.equals("1")){
                while (true) {
                    System.out.println("Go or q");
                    text = scan.nextLine();
                    if (text.equals("go")) {
                        int a = Integer.parseInt(scan.nextLine());
                        for(int i = 10;i < a; i++){
                            if ((i % 2) == 1){
                                System.out.println(i * i);
                            }
                        }
                    }
                    else if (text.equals("q")) {
                        break;
                    }
                }
            }
            else if(text.equals("2")) {
                while (true) {
                    System.out.println("Go or q");
                    text = scan.nextLine();
                    if (text.equals("go")) {

                    }
                    else if (text.equals("q")) {
                        break;
                    }
                }
            }
            else if(text.equals("3")){
                while (true) {
                    System.out.println("Go or q");
                    text = scan.nextLine();
                    if (text.equals("go")) {

                    }
                    else if (text.equals("q")) {
                        break;
                    }
                }
            }
            else if(text.equals("4")) {
                while(true) {
                    System.out.println("Go or q");
                    text = scan.nextLine();
                    if (text.equals("go")) {

                    }
                    else if (text.equals("q")) {
                        break;
                    }
                }
            }
            else if(text.equals("5")){
                while(true) {
                    System.out.println("Go or q");
                    text = scan.nextLine();
                    if (text.equals("go")) {

                    }
                    else if (text.equals("q")) {
                        break;
                    }
                }
            }
            else if(text.equals("6")){
                while (true) {
                    System.out.println("Go or q");
                    text = scan.nextLine();
                    if (text.equals("go")) {

                    }
                    else if (text.equals("q")) {
                        break;
                    }
                }
            }
            else if(text.equals("q")){
                break;
            }
        }
    }
}