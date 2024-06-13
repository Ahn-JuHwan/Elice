package JAVA1.ThirdWeek.SelfStudy.Tuesday.Stack;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackQUe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        CustomQueue customQueue = new CustomQueue();
        int input1, input2;

        while ((input1 = sc.nextInt()) != -1) {
            if (input1 == 1) {
                int output1 = queue.poll();
                int output2 = customQueue.poll();

                if (output1 != output2) {
                    throw new RuntimeException("Output mismatch.");
                }
            } else {
                input2 = sc.nextInt();
                queue.add(input2);
                customQueue.add(input2);
            }
        }

        while (!queue.isEmpty()) {
            int output1 = queue.poll();
            int output2 = customQueue.poll();

            if (output1 != output2) {
                throw new RuntimeException("Element mismatch.");
            }
        }
        if (!customQueue.isEmpty()) {
            throw new RuntimeException("CustomQueue is not empty.");
        }
    }
}
