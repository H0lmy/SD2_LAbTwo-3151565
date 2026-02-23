// Maksym Shtymak 3151565
public class Conversions {
    // basic conversions currency method with ternar check
    public double euroToDollar(double euro) {
        return euro > 0 ? euro * 1.1 : 0;
    }

    public double dollarToEuro(double dollar) {
        return dollar > 0 ? dollar * 0.9 : 0;
    }

    // string to int conversion with null and empty check
    public int stringToInteger(String val) {
        return val != null && !val.isEmpty() ? Integer.parseInt(val) : 0;
    }
    // int to string conversion
    public String integerToString(int val) {
        return String.valueOf(val);
    }
    // switch case method
    public String switchCase(String val) {
        // avoid null values
        if (val == null) {
            return null;
        }
        // letter by letter case changing
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < val.length(); i++) {
            char c = val.charAt(i);
            if (!Character.isLetter(c)) {
                result.append(c);
                continue;
            }
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(Character.toUpperCase(c));
            }

        }
        return result.toString();
    }
}
