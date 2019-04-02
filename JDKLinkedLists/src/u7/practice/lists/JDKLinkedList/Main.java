package u7.practice.lists.JDKLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 784);

        LinkedList<Employee> list = new LinkedList<>();

        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);

        list.addLast(billEnd);

        list.removeFirst();
        list.removeLast();

        Iterator iter = list.iterator();
        System.out.println("HEAD");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.print("NULL");

//        for (Employee employee : list) {
//            System.out.println(employee);
//        }

    }
}
