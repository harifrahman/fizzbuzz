package fizzbuzz.lib;

public class Fizzbuzz {

    public String printTill(int nInput) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= nInput; i++) {

            result = fizzBuzzChecker(result, i);

            if (i < nInput) {
                result.append(",");
            }
        }

        return result.toString();
    }

    private StringBuilder fizzBuzzChecker(StringBuilder result, int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return result.append("fizzbuzz");
        }

        if (i % 3 == 0) {
            return result.append("fizz");
        }

        if (i % 5 == 0) {
            return result.append("buzz");
        }

        return result.append(i);
    }
}
