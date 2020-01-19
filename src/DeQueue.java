import java.util.Scanner;

public class DeQueue {
    private static Scanner scan = new Scanner(System.in);
    private static final int MAX = 5;
    private static int[] deQueue = new int[MAX];
    private static int FRONT , REAR;
    static {
        FRONT = -1;
        REAR = -1;
        System.out.println("DEQUEUE IMPLEMENTATION");
    }
    public static void main(String[] args){
        int choice;
        boolean flag = true;
        while (flag) {
            System.out.println("\n1 : INSERT FROM REAR");
            System.out.println("2 : INSERT FROM FRONT");
            System.out.println("3 : DELETE FROM REAR");
            System.out.println("4 : DELETE FROM FRONT");
            System.out.println("5 : READ THE DE-QUEUE");
            System.out.println("6 : EXIT");
            System.out.print("\nENTER OPTION : ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    insertElementFromRear();
                    break;
                case 2:
                    insertElementFromFront();
                    break;
                case 3:
                    deleteElementFromRear();
                    break;
                case 4:
                    deleteElementFromFront();
                    break;

                case 5:
                    readDeQueue();
                    break;
                case 6: System.out.println("** END OF QUEUE **");
                    flag = false;
                    break;
                default:
                    System.out.println("INVALID CHOICE");
            }
        }

    }
    private static void insertElementFromRear(){
        if((REAR==(MAX-1) && FRONT==0 )|| FRONT==REAR+1){
            System.out.println("OVER FLOW");
        }else if(REAR == -1){
            FRONT = 0;
            REAR = 0;
            System.out.print("\nENTER THE ELEMENT : ");
            deQueue[REAR] = scan.nextInt();
        }else if(REAR==(MAX-1)){
            REAR = 0;
            System.out.println("\nENTER THE ELEMENT : ");
            deQueue[REAR] = scan.nextInt();
        }else{
          ++REAR;
          System.out.println("\nENTER THE ELEMENT : ");
          deQueue[REAR] = scan.nextInt();
        }
    }

    private static void insertElementFromFront(){
        if((REAR==(MAX-1) && FRONT==0 )|| FRONT==REAR+1){
            System.out.println("OVER FLOW");
        }else if(FRONT==-1){
            FRONT = 0;
            REAR = 0;
            System.out.print("\nENTER THE ELEMENT : ");
            deQueue[FRONT] = scan.nextInt();
        }else if()
    }

    private static void readQueue(){

    }

    private static void deleteElement(){

    }
}
