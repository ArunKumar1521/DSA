package org.example.stack;

public class runner1 {
    public static void main(String[] args) {
        Dstack nums = new Dstack();
        nums.push(1);
        nums.push(11);
        nums.push(111);
        nums.push(1111);
        nums.push(1111);
        nums.push(111);

        nums.pop();
        nums.pop();
        nums.pop();
        nums.pop();
        nums.pop();

        nums.show();
    }
}
