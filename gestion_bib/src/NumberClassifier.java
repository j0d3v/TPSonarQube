import java.util.List;
import java.util.stream.IntStream;

class NumberClassifier {
    private static final List<String> CLASSIFICATIONS =
            List.of("is even", "something else", "is even",
                    "divisible by 3", "is even", "something else");

    public void printClassifications(int n) {
        IntStream.range(0, n).mapToObj(this::classify).forEach(System.out::println);
    }

    private String classify(int i) {
        return i + " " + CLASSIFICATIONS.get(Math.floorMod(i, 6));
    }
}