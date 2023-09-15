package com.learning;

import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.stream.Collectors;

class TrainTime {
    Integer arrival;
    Integer departure;

    public TrainTime(Integer arrival, Integer departure) {
        this.arrival = arrival;
        this.departure = departure;
    }
}

class Result {

    /*
     * Complete the 'getMinimumPlatforms' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arrivalTimes
     *  2. INTEGER_ARRAY depTimes
     */

    public static int getMinimumPlatforms(List<Integer> arrivalTimes, List<Integer> depTimes) {

        int maxPlatforms = 0;

        List<TrainTime> currentTrainsOnPlatform = new ArrayList<>();

        for (int i = 0; i < arrivalTimes.size(); i++) {
            TrainTime trainTime = new TrainTime(arrivalTimes.get(i), depTimes.get(i));

            currentTrainsOnPlatform = currentTrainsOnPlatform
                    .stream()
                    .filter(trainTime1 -> trainTime1.departure > trainTime.arrival)
                    .collect(Collectors.toList());

            currentTrainsOnPlatform.add(trainTime);

            if (maxPlatforms < currentTrainsOnPlatform.size()) {
                maxPlatforms = currentTrainsOnPlatform.size();
            }
        }

        return maxPlatforms;
    }

    public static void main(String[] args) {
        System.out.println(Result.getMinimumPlatforms(List.of(5, 9,11, 13, 10, 5), List.of(5, 12, 14, 16, 15, 7)));
    }
}
