package leetcode50;

import java.util.HashMap;
import java.util.Map;

public class HighestScoreCalc {
    public static void main(String[] args) {
        String[][] studScores = {
                {"SAM", "100"},
                {"HAM", "87"},
                {"SAM", "98"},
                {"POM", "64"}
        };
        highestScore(studScores);
    }

    private static void highestScore(String[][] studScores) {
        Map<String, int[]> scoresMap = new HashMap<>();

            for (String[] entry : studScores) {
                String student = entry[0];
            int score = Integer.parseInt(entry[1]);

            // If the student is already in the map, update their total score and count
            if (scoresMap.containsKey(student)) {
                int[] totalAndCount = scoresMap.get(student);
                totalAndCount[0] += score; // Update total score
                totalAndCount[1] += 1; // Update count
            } else {
                // If the student is not in the map, add them with their score and count 1
                scoresMap.put(student, new int[]{score, 1});
            }
        }

        // Variables to track the student with the highest average score
        String topStudent = null;
        double highestAverage = 0.0;

        // Calculate average scores and determine the highest
        for (Map.Entry<String, int[]> entry : scoresMap.entrySet()) {
            String student = entry.getKey();
            int[] totalAndCount = entry.getValue();
            double average = (double) totalAndCount[0] / totalAndCount[1];

            if (average > highestAverage) {
                highestAverage = average;
                topStudent = student;
            }
        }

        // Print the highest average score
        System.out.println("Student with the highest average score: " + topStudent + ", Average Score: " + highestAverage);
    }
}
