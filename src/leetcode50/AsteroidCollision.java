package leetcode50;

import java.util.Map;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] asteroids = {8, 9, 6, -7, -9, 12, 50, -34};
        int[] asteroids1 = {-2, -2, -2, -2};
        int[] res = asteroidCollision(asteroids1);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            if(stack.isEmpty() || asteroid > 0) {
                stack.push(asteroid);
            }else {
                while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroid)) {
                    stack.pop();
                }
                if(!stack.isEmpty() && stack.peek() == Math.abs(asteroid)){
                    stack.pop();
                }else {
                    if( stack.isEmpty() || stack.peek() < 0) {
                        stack.push(asteroid);
                    }
                }
            }
        }
        int[] res = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            res[i] = stack.get(i);
        }
        return res;
    }
}
/*
if (asteroid > 0 || stack.isEmpty()) {
                stack.push(asteroid);
            } else {
                while (stack.peek() > 0 && stack.peek() < Math.abs(asteroid)) {
                    stack.pop();
                }

                if (Math.abs(stack.peek()) == Math.abs(asteroid)) {
                    stack.pop();
                } else {
                    if (stack.isEmpty() || stack.peek() < 0) {
                        stack.push(asteroid);
                    }
                }
            }*/