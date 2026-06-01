import static java.util.stream.Collectors.toList;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

class Result {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
    HashMap<Integer,Integer> map = new HashMap<>();
    
    for(int i=0; i<arr.size(); i++){
        map.put(arr.get(i),map.getOrDefault(arr.get(i), 0) +1);
    }
     int maxFrequency = 0;
        int resultBirdId = 0;

    for (int birdId : map.keySet()) {
        int frequency = map.get(birdId);

        if(frequency>maxFrequency || (frequency == maxFrequency && birdId < resultBirdId)) {
            maxFrequency = frequency;
            resultBirdId = birdId;
        }
    }
            return resultBirdId;

    }

}

public class MigrateBirds {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

