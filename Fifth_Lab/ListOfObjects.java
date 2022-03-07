package Fifth_Lab;

import java.util.Scanner;

/**
 * Created by ${*  Osama Abo Adel  *} on 2/8/2022.
 */
public class ListOfObjects {
    public static void main(String[] args) {
        DoublyLinkedList<Student> list = new DoublyLinkedList<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("id\tname\tmajor");
            Student s=new Student(in.nextInt(),in.next(),in.next());
            list.addLast(s);
        }
        while (!list.isEmpty()) System.out.println(list.removeFirst());
    }
}
