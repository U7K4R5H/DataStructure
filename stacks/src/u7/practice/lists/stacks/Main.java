package u7.practice.lists.stacks;

public class Main {

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 1874));
        stack.push(new Employee("Mary", "Smith", 3482));
        stack.push(new Employee("Mike", "Wilson", 2045));
        stack.push(new Employee("Bill", "End", 7026));

        //stack.printStack();

        //System.out.println(stack.peek());
        //stack.printStack();

        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.peek());

    }
}
