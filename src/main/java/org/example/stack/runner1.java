package org.example.stack;

public class runner1 {
    public static void main(String[] args) {
        Stack nums = new Stack();
        nums.push(15);
        nums.push(12);
        System.out.println(nums.peek());
        nums.push(13);
        nums.push(14);

        System.out.println(nums.pop());
        nums.show();

    }
}
