package datastructures.stackqueuehashmaphashfunction;

import java.util.Stack;

class StockSpan {

    static void calculateSpan(int[] price) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        System.out.print("1 ");

        for (int i = 1; i < price.length; i++) {
            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();
            }
            int span = stack.isEmpty() ? i + 1 : i - stack.peek();
            System.out.print(span + " ");
            stack.push(i);
        }
    }

    public static void main(String[] args) {
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        calculateSpan(price);
    }
}