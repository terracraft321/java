public class Main3 {
    public static void main(String[] args) {
        // 4.4.2 Which of the following statements or expressions are incorrect?
        String s = "Welcome to Java";
        String s1 = "Hello";
        String s2 = "World";
        String s3Concatenation = s1 + s2; // This concatenation is correct
        // s3 = s1 − s2; // Incorrect expression, subtraction is not defined for strings
        boolean incorrectComparison = s1 == s2; // This comparison is correct but might not behave as expected
        boolean correctComparison = s1.equals(s2); // This is the correct way to compare strings
        int compareResult = s1.compareTo(s2); // This is correct, but it returns an int, not boolean
        int length = s1.length(); // This is correct
        // char c = s1(0); // This is incorrect syntax, should be s1.charAt(0)
        char firstChar = s1.charAt(0); // This is the correct way to get the first character
        // char c = s1.charAt(s1.length()); // This is incorrect because index is out of bounds
        char lastChar = s1.charAt(s1.length() - 1); // This is the correct way to get the last character

        // 4.4.3 Show the output of the following statements
        System.out.println("1" + 1); // "11"
        System.out.println('1' + 1); // 50 (ASCII value of '1' is 49, so 49 + 1 = 50)
        System.out.println("1" + 1 + 1); // "111"
        System.out.println("1" + (1 + 1)); // "12"
        System.out.println('1' + 1 + 1); // 51 (ASCII value of '1' is 49, so 49 + 1 + 1 = 51)

        // 4.4.4 Evaluate the following expressions
        System.out.println(1 + "Welcome " + 1 + 1); // "1Welcome 11"
        System.out.println(1 + "Welcome " + (1 + 1)); // "1Welcome 2"
        System.out.println(1 + "Welcome " + ('\u0001' + 1)); // "1Welcome 2"
        System.out.println(1 + "Welcome " + 'a' + 1); // "1Welcome a1"

        // 4.4.5
        s1 = " Welcome ";
        s2 = " welcome ";
        boolean isEqual = s1.equals(s2); // (a) Check whether s1 is equal to s2
        boolean isEqualIgnoreCase = s1.equalsIgnoreCase(s2); // (b) Check whether s1 is equal to s2, ignoring case
        int comparison = s1.compareTo(s2); // (c) Compare s1 with s2
        int comparisonIgnoreCase = s1.compareToIgnoreCase(s2); // (d) Compare s1 with s2, ignoring case
        boolean hasPrefixAAA = s1.startsWith("AAA"); // (e) Check whether s1 has the prefix AAA
        boolean hasSuffixAAA = s1.endsWith("AAA"); // (f) Check whether s1 has the suffix AAA

        // (g) Assign the length of s1 to an int variable x.
        int x = s1.length();
        // (h) Assign the first character of s1 to a char variable x.
        char firstCharS1 = s1.charAt(0);
        // (i) Create a new string s3 that combines s1 with s2.
        String s3 = s1.concat(s2);
        // (j) Create a substring of s1 starting from index 1.
        String substring1 = s1.substring(1);
        // (k) Create a substring of s1 from index 1 to index 4.
        String substring2 = s1.substring(1, 5);
        // (l) Create a new string s3 that converts s1 to lowercase.
        String s3Lowercase = s1.toLowerCase();
        // (m) Create a new string s3 that converts s1 to uppercase.
        String s3Uppercase = s1.toUpperCase();
        // (n) Create a new string s3 that trims whitespaces on both ends of s1.
        String s3Trimmed = s1.trim();
        // (o) Assign the index of the first occurrence of the character e in s1 to an int variable x.
        int indexOfE = s1.indexOf('e');
        // (p) Assign the index of the last occurrence of the string "abc" in s1 to an int variable x.
        int lastIndexOfABC = s1.lastIndexOf("abc");

        // 4.4.6 Write one statement to return the number of digits in an integer i.
        int i = 12345;
        int numberOfDigitsInt = String.valueOf(i).length();

        // 4.4.7 Write one statement to return the number of digits in a double value d.
        double d = 123.456;
        int numberOfDigitsDouble = String.valueOf(d).replaceAll("\\..*$", "").length();

        // Output
        System.out.println("Number of digits in integer i: " + numberOfDigitsInt);
        System.out.println("Number of digits in double d: " + numberOfDigitsDouble);
    }
}
