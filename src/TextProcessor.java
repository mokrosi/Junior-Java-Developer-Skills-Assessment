public class TextProcessor {
    // Count words in a sentence
    public static int countWords(String sentence) {
        // Handle empty strings
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        // Split the sentence and count words
        String[] words = sentence.trim().split(" ");
        return words.length;
    }

    // Replace specific words
    public static String replaceWord(String text, String oldWord, String newWord) {
        // Replace all occurrences of oldWord with newWord
        return text.replace(oldWord, newWord);

    }

    public static void main(String[] args) {
        // Test with: "Java is fun and Java is powerful"
        // Count words
        // Replace "Java" with "Programming"
        String sentence = "Java is fun and Java is powerful" ;
        System.out.println(sentence);
        // Count words
        System.out.println("Number of  words :");
        System.out.println(">> " + countWords(sentence) );
        // Replace "Java" with "Programming"
        System.out.println("Replace all occurrences of oldWord with newWords :");
        System.out.println(replaceWord(sentence, "Java", "Programming"));

    }

}