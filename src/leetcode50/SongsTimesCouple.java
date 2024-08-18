package leetcode50;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SongsTimesCouple {
    public static void main(String[] args) {
        String[][] songTimes3 = {
                {"Stairway to Heaven", "8:05"}, {"Immigrant Song", "2:27"},
                {"Rock and Roll", "3:41"}, {"Communication Breakdown", "2:29"},
                {"Hey Hey What Can I Do", "4:00"}, {"Poor Tom", "3:00"},
                {"Black Dog", "4:55"}
        };

        List<String> pairs = findPair(songTimes3);
        for (String pair : pairs) {
            System.out.println(pair);
        }
    }

    public static List<String> findPair(String[][] songTimes) {
        int targetTimeInSeconds = 7 * 60; // 7 minutes in seconds
        Map<Integer, String> timeToSongMap = new HashMap<>();
        List<String> result = new ArrayList<>();

        for (String[] song : songTimes) {
            String songName = song[0];
            int songTime = convertToSeconds(song[1]);

            int complementTime = targetTimeInSeconds - songTime;

            if (timeToSongMap.containsKey(complementTime)) {
                // Found a pair of songs that add up to 7 minutes
                String pair = timeToSongMap.get(complementTime) + " + " + songName;
                result.add(pair);
            }

            // Add the current song's time to the map
            timeToSongMap.put(songTime, songName);
        }

        return result;
    }

    public static int convertToSeconds(String time) {
        String[] parts = time.split(":");
        int minutes = Integer.parseInt(parts[0]);
        int seconds = Integer.parseInt(parts[1]);
        return minutes * 60 + seconds;
    }
}
