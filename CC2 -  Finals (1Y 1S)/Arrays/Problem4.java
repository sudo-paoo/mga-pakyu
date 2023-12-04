package com.mycompany.arrayjava;
/**
 * @author pao
 * BSCS 1B
 */
public class Problem4 {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("| Word Compressor |");
        System.out.println("-------------------");
        StringBuilder compressed = new StringBuilder();
        String str = "aabcccccaaa";
        System.out.println("Word to be compressed: " + str);
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i));
                compressed.append(count);
                count = 1;
            }
        }
        System.out.println("Compressed word: " + compressed);
    }
}
