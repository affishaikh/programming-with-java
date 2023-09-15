import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'findDistinct' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY names
     *  2. STRING prefix
     */

    public static List<String> findDistinct(List<String> names, String prefix) {

        return names.stream()
                .filter(name -> name.startsWith(prefix))
                .map(name -> {
                    StringBuilder unique = new StringBuilder();

                    for (int i = 0; i < name.length(); i++) {
                        String s = String.valueOf(name.charAt(i));
                        if (!unique.toString().contains(s)) {
                            unique.append(s);
                        }
                    }

                    return String.format("%s - %d", name, unique.length());
                })
                .collect(toList());
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int namesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> names = IntStream.range(0, namesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        String prefix = bufferedReader.readLine();

        List<String> result = Result.findDistinct(names, prefix);

        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
