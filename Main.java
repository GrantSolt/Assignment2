import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Task1();
        System.out.println();
        Task2();


    }

    public static void Task1() throws IOException {
        MinPQ<Job> T1 = new MinPQ<Job>();
//        T1.Enqueue(new Job(1, 4));
//        T1.Enqueue(new Job(2, 2));
//        T1.Enqueue(new Job(3, 8));
//        T1.Enqueue(new Job(4, 6));
//        T1.Enqueue(new Job(5, 1));

        File file = new File("/Users/grantsolt/Desktop/49205929/Assignment2/task1-input.txt");
        Scanner sc = new Scanner(file);
        int count=0;
        while(sc.hasNext()){
            count++;
            int iD=sc.nextInt();
            int time=sc.nextInt();
            T1.Enqueue(new Job(iD, time));

        }


        System.out.print("Execution order: [");
        int x = 0;
        double time=0;
        double avgTime=0;
        while (!T1.isEmpty()) {
            Job curr = T1.Dequeue();
            time=time+curr.getTime();
            avgTime=avgTime+time;
            if (x > 0)
                System.out.print(", ");
            System.out.print(curr.getID());
            x++;
        }
        System.out.println("]");
        System.out.println("Average completion time: "+(avgTime/x));
    }


    public static void Task2()throws IOException{
        MinPQ<Job> T2 = new MinPQ<Job>();
//        Job temp=new Job(1, 4);
//        temp.setPriority(1);
//        T2.Enqueue(temp);
//        temp=new Job(2, 2);
//        temp.setPriority(2);
//        T2.Enqueue(temp);
//        temp=new Job(3, 8);
//        temp.setPriority(2);
//        T2.Enqueue(temp);
//        temp=new Job(4, 6);
//        temp.setPriority(1);
//        T2.Enqueue(temp);
//        temp=new Job(5, 1);
//        temp.setPriority(2);
//        T2.Enqueue(temp);

        File file = new File("/Users/grantsolt/Desktop/49205929/Assignment2/task2-input.txt");
        Scanner sc = new Scanner(file);
        int count=0;
        while(sc.hasNext()){
            count++;
            int iD=sc.nextInt();
            int time=sc.nextInt();
            int priority=sc.nextInt();
            Job temp = new Job(iD, time);
            temp.setPriority(priority);
            T2.Enqueue(temp);

        }
        System.out.print("Execution order: [");
        int x = 0;
        double time=0;
        double avgTime=0;
        while (!T2.isEmpty()) {
            Job curr = T2.Dequeue();
            time=time+curr.getTime();
            avgTime=avgTime+time;
            if (x > 0)
                System.out.print(", ");
            System.out.print(curr.getID());
            x++;
        }
        System.out.println("]");
        System.out.println("Average completion time: "+(avgTime/x));
    }








//        File file = new File("/Users/grantsolt/Desktop/49205929/Assignment2/task1-inputP.txt");
//        Scanner sc = new Scanner(file);
//        int count=0;
//        while(sc.hasNext()){
//            count++;
//            String line = sc.nextLine();
//
//        }



}