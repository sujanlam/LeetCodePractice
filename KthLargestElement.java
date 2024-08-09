package leetcode50;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {
    public int findKthLargest(int[] arr, int k) {
        // Create a min-heap with a capacity of k
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        System.out.println(pq);
        // Add the first k elements of the array into the min-heap
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        System.out.println(pq);
        System.out.println(pq.peek());

        // Iterate through the rest of the array
        for (int i = k; i < arr.length; i++) {
            // If the current element is larger than the smallest element in the heap
            if (pq.peek() < arr[i]) {
                // Remove the smallest element from the heap
                pq.remove();
                // Add the current element into the heap
                pq.add(arr[i]);
            }
        }

        // The k-th largest element is the smallest element in the heap
        return pq.peek();
    }

    public static void main(String[] args) {
        KthLargestElement kle = new KthLargestElement();
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 3;
        System.out.println(kle.findKthLargest(arr, k));  // Output: 5
        System.out.println(kle.findKthLargestMaxHEap(arr, k));
    }
    public int findKthLargestMaxHEap(int[] arr, int k) {
        // Create a max-heap using a PriorityQueue with a custom comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Add all elements of the array to the max-heap
        for (int num : arr) {
            maxHeap.add(num);
        }
        System.out.println(maxHeap);

        // Remove the maximum element k-1 times
        for (int i = 0; i < k - 1; i++) {
            maxHeap.poll();
        }
        System.out.println(maxHeap);
        // The k-th largest element is now at the top of the heap
        return maxHeap.peek();
    }

}
