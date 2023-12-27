package W4_2;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("array size: ");
        int size = input.nextInt();
        GenericStack<String> x = new GenericStack<String>(size);
        System.out.println("-----------------------------------");

        while (true) {
            System.out.println("1 - pushhhhhh");
            System.out.println("2 - top");
            System.out.println("3 - pop");
            System.out.println("4 - print");
            System.out.println("0 - exit");
            System.out.print("secim :");
            int a = input.nextInt();
            switch (a) {
                case 0:
                    return;
                case 1:
                    System.out.print("data: ");
                    String data = input.next();
                    x.push(data);
                    System.out.println("---------");
                    x.print();
                    System.out.println("---------");
                    break;
                case 2:
                    System.out.println("top: " + x.top());
                    break;
                case 3:
                    System.out.println("pop: " + x.pop());
                    break;
                case 4:
                    x.print();
                    break;
                default:
                    System.out.println("invalid value");
                    break;
            }
            System.out.println("-------------------");
        }
    }
}
