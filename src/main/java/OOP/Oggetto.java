package OOP;

import java.util.Arrays;

public class Oggetto {

    private int size = 10;
    private char[] array;

    public Oggetto() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public char[] getArray() {
        return array;
    }

    public void setArray(char[] array) {
        this.array = array;
    }

    public Oggetto(int size) {
        this.size = size;
    }

    public Oggetto(int size, char[] array) {
        this.size = size;
        this.array = array;
    }

    public boolean isPalindrome(Oggetto oggetto) {

        char[] reverseStr = new char[oggetto.size];
        for (int i = 0; i < oggetto.size; i++) {
            reverseStr[oggetto.size - i - 1] = oggetto.array[i];
        }

        System.out.println(Arrays.toString(reverseStr));
        System.out.println(Arrays.toString(oggetto.array));

        return Arrays.toString(reverseStr).equals(Arrays.toString(oggetto.array));
    }
}


