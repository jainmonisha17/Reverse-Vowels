

// Name: Monisha Jain G.N
// Higher Qualification: MCA (Master of Computer Applications)
// College: PES Banglore/
// github: https://github.com/jainmonisha17?tab=repositories

// Given a string s, reverse only all the vowels in the string and return it.

// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

// Input: s= "hello"
// Output: "holle"

// Input: s = "MonishA"
// Output: "MAnisho"

public class ReverseVowlesTwoPointers {
    
    public static final String vowels = "aeiouAEIOU";

    public String reverseVowels(String s) {
        int first = 0;
        int last = s.length() - 1;
        char[] charArray = s.toCharArray();

        while(first < last) {
            while(first < last && vowels.indexOf(charArray[first]) == -1) {
                first++; // skip non-vowel character (-1 if false first++)
            }
            while(first < last && vowels.indexOf(charArray[last]) == -1) {
                last--; // skip non-vowel character (-1 if false last--)
            }

            // if vowel character?
            // do this!

            char temp = charArray[first];
            charArray[first] = charArray[last];
            charArray[last] = temp;
            first++;
            last--;
        }
        return new String(charArray);
    }


    public static void main(String[] args) {
        ReverseVowlesTwoPointers solution = new ReverseVowlesTwoPointers();
    
        // Test Case 1
        String s1 = "hello";
        String expectedOutput1 = "holle";
        String actualOutput1 = solution.reverseVowels(s1);
        System.out.println("Test Case 1: " + (expectedOutput1.equals(actualOutput1)));

        // Test Case 99
        String s9 = "MonishA";
        String expectedOutput = "MAnisho";
        String actualOutput = solution.reverseVowels(s9);
        System.out.println("TEst case 99: " + (expectedOutput.equals(actualOutput)));
    
        // Test Case 2
        String s2 = "DesignGUrus";
        String expectedOutput2 = "DusUgnGires";
        String actualOutput2 = solution.reverseVowels(s2);
        System.out.println("Test Case 2: " + (expectedOutput2.equals(actualOutput2)));
    
        // Test Case 3
        String s3 = "AEIOU";
        String expectedOutput3 = "UOIEA";
        String actualOutput3 = solution.reverseVowels(s3);
        System.out.println("Test Case 3: " + (expectedOutput3.equals(actualOutput3)));
    
        // Test Case 4
        String s4 = "aA";
        String expectedOutput4 = "Aa";
        String actualOutput4 = solution.reverseVowels(s4);
        System.out.println("Test Case 4: " + (expectedOutput4.equals(actualOutput4)));
    
        // Test Case 5
        String s5 = "";
        String expectedOutput5 = "";
        String actualOutput5 = solution.reverseVowels(s5);
        System.out.println("Test Case 5: " + (expectedOutput5.equals(actualOutput5)));
      }
}
