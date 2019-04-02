package u7.practice.trees;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Tree intTree = new Tree();

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

//        intTree.insert(7);
//        intTree.insert(2);
//        intTree.insert(1);
        intTree.insert(5);
        intTree.insert(3);
        intTree.insert(8);

        intTree.traversePreOrder();
        System.out.println();
        System.out.println(intTree.getRoot().getData());

        intTree.seralization(intTree.getRoot(), arrayList);
        arrayList.forEach(e -> System.out.print(e + ", "));

//        intTree.insert(25);
//        intTree.insert(20);
//        intTree.insert(15);
//        intTree.insert(27);
//        intTree.insert(30);
//        intTree.insert(29);
//        intTree.insert(26);
//        intTree.insert(22);
//        intTree.insert(32);
//        intTree.insert(17);
//
//        intTree.traverseInOrder();
//        System.out.println();
//
//        System.out.println(intTree.get(27).getData());
//        System.out.println(intTree.get(17).getData());
//        System.out.println(intTree.get(88));

//        System.out.println(intTree.min());
//        System.out.println(intTree.max());

//        intTree.delete(255);
//        intTree.traverseInOrder();
//        System.out.println();

//        intTree.traversePreOrder();
//        System.out.println();
//
//        intTree.traversePostOrder();
//        System.out.println();

    }
}
