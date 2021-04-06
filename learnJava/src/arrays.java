public class arrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int length = numbers[2];
        char[] chars = new char[length];
        chars[numbers.length - 1] = 'y'; // what is this about? that it's adding 'y' to that index in the array?
        System.out.println("Done!");
        }
    }
