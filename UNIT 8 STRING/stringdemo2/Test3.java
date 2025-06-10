public class Test3
{
    public static void main(String[] args)
    {
        String str1 = "Deepak@gmail.com";
        String str2 = "deepak123";

        // Compare strings
        System.out.println(str1.equals(str2));  // false
        if (str1.equalsIgnoreCase("deepak@gmail.com") && str2.equals("deepak123")) {
            System.out.println("login successfully");
        } else {
            System.out.println("failed");
        }

        System.out.println("..........................");

        // compareToIgnoreCase
        String str11 = "a";
        String str22 = "A";
        System.out.println(str11.compareToIgnoreCase(str22));  // 0

        // Char to int (ASCII value)
        char ch1 = 'a';  // 97
        char ch2 = 'A';  // 65
        System.out.println((int) ch1);  // 97
        System.out.println((int) ch2);  // 65

        System.out.println("..........................");

        // String concatenation
        String str3 = "deepak";
        String str4 = "java";
        System.out.println(str3 + str4);           // deepakjava
        System.out.println(str3.concat(str4));     // deepakjava

        System.out.println("..........................");

        // Substring and subSequence
        String str5 = "deepak java";
        System.out.println(str5.substring(3, 8));      // pak j
        System.out.println(str5.subSequence(3, 8));    // pak j

        System.out.println("..........................");

        // Replace characters
        String str6 = "deepak java";
        System.out.println(str6.replace("e", "x"));    // dxpxak java

        System.out.println("..........................");

        // Various String methods
        String str7 = "deepak is teaching java";
        System.out.println(str7.lastIndexOf("is"));     // 7
        System.out.println(str7.contains("ep"));        // true
        System.out.println(str7.charAt(7));             // ' '
        System.out.println(str7.startsWith("deea"));    // false
        System.out.println(str7.endsWith("java"));      // true

        System.out.println("..........................");

        // Change case
        String str8 = "Deepak Panwar";
        System.out.println(str8.toLowerCase());         // deepak panwar

        System.out.println("..........................");

        // Convert int to String and get length
        int rollno = 1001;
        System.out.println(String.valueOf(rollno).length()); // 4

        // Convert to char array and print
        String str9 = "deepak";
        char[] arr = str9.toCharArray();
        System.out.println(arr);                        // deepak

        // Replace first occurrence
        System.out.println(str9.replaceFirst("e", "z")); // dzepak

        System.out.println("..........................");

        // Split string
        String str10 = "this is my first demo";
        String[] splitArr = str10.split("is");
        for (String s : splitArr) {
            System.out.println(s);  // th
                                    //  my first demo
        }
    }
}
