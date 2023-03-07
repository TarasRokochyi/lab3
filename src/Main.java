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
                        int numb = Integer.parseInt(scan.nextLine());
                        for (int i = 1; i < 10;i++){
                            System.out.println(i+" x "+numb+" = "+(i * numb));
                        }
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
                        int a = Integer.parseInt(scan.nextLine());
                        int b = Integer.parseInt(scan.nextLine());
                        int h = Integer.parseInt(scan.nextLine());
                        int amount = 0;
                        int sum = 0;
                        int o = h;
                        for (int i = a;i <= b;i++){
                            if (o == h) {
                                sum = sum + i;
                                o = 0;
                                amount =amount + 1;
                                continue;
                            }
                            o++;
                        }
                        System.out.println("Average is: "+(sum/amount));
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
                        int x = Integer.parseInt(scan.nextLine());
                        int y = Integer.parseInt(scan.nextLine());
                        int product = 0;
                        for (int i = 0; i < x; i++){
                            product = product + y;
                        }
                        System.out.println("Product is: "+product);
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
                        int number = Integer.parseInt(scan.nextLine());
                        int result = 0;
                        for(int n = 1; n <= number; n++){
                            result += (2*n)-1;
                        }
                        System.out.println(result);
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
                        int a = Integer.parseInt(scan.nextLine());
                        int b = Integer.parseInt(scan.nextLine());
                        if (a > b){
                            int n = a;
                            a = b;
                            b = n;
                        }
                        System.out.println("Всі числа кратні 3 і не кратні 5: ");
                        for(int i = a; i <= b; i++){
                            if ((i % 3 == 0) && (i % 5 != 0)){
                                System.out.println(i);
                            }
                        }
                        System.out.println("Всі числа які є квадратами парних чисел: ");
                        for (int i = a; i <= b; i++){
                            if (Math.sqrt(i) % 2 == 0){
                                System.out.println(i);
                            }
                        }
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