import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day1 {
    public void Calculate() throws IOException {
        File file = new File("C:\\Users\\Logan\\IdeaProjects\\AoC_2018_1\\src\\Day1Input");
        BufferedReader br = new BufferedReader(new FileReader(file));
        Integer value;
        Integer sum = 0;
        String line;

        while ((line = br.readLine()) != null) {
            value = Integer.parseInt(line.substring(1, line.length()));

            if (line.charAt(0) == '+') {
                sum = add(value, sum);
            } else {
                sum = subtract(value, sum);
            }
        }

        System.out.println("Answer: "+sum);
    }

    public void Calculate2() throws IOException {
        File file = new File("C:\\Users\\Logan\\IdeaProjects\\AoC_2018_1\\src\\Day1Input");
        BufferedReader br = new BufferedReader(new FileReader(file));
        Integer value;
        Integer sum;
        Integer counter = 0;
        String line;
        Boolean hasFoundNotIdenticalFreq = true;
        List<Integer> frequencies = new ArrayList<>();

        sum = 0;
        frequencies.add(sum);

        while (hasFoundNotIdenticalFreq) {
            line = br.readLine();
            if (line == null) {
                System.out.println("Looping through the list again...");
                br = new BufferedReader(new FileReader(file));
                line = br.readLine();
            }

            value = Integer.parseInt(line.substring(1, line.length()));

            if (line.charAt(0) == '+') {
                sum = add(value, sum);
            } else {
                sum = subtract(value, sum);
            }

            if (frequencies.contains(sum)) {
                hasFoundNotIdenticalFreq = false;
            } else {
                frequencies.add(sum);
            }

            System.out.println(counter+"<>"+sum+"<>"+frequencies.indexOf(sum)+"<>"+frequencies.lastIndexOf(sum));

            counter++;
        }

        System.out.println("Answer: "+sum);
    }

    private int add(int value, int sum) {
        sum += value;
        return sum;
    }

    private int subtract(int value, int sum) {
        sum -= value;
        return sum;
    }
}
