package labdarbs1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

enum STATE {
    deficient,
    perfect,
    abundant
}
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input number:");
        String number = reader.readLine();
        System.out.print("Given number type is - " + PerfectNumber.detect(Integer.parseInt(number)));
    }
}

class PerfectNumber {
    public static STATE detect(Integer number) {
        Integer sum = IntStream.range(1, number).filter(i -> number % i == 0).sum();
        if(sum == number) {
            return STATE.perfect;
        } else if (sum > number) {
            return STATE.abundant;
        } else {
            return STATE.deficient;
        }
    }
}