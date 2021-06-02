package Stack;

public class Main {


    public static void main(String[] args) {
        DynamicStack dynamicStack = new DynamicStack();
        for (int i = 0; i < 10000; i++) {
            dynamicStack.push(i);
        }
         dynamicStack.pop();
        System.out.println(dynamicStack.peek());

    }
}
