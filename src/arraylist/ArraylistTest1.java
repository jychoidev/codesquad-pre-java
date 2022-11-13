package arraylist;

public class ArraylistTest1 {

    public static void main(String[] args) {

//        int[] arr1 = new int[10];
//        Book[] library = new Book[5];
//        int[][] arr = new int[2][3];

        /* 1 . 문자 배열을 만들어 A-Z 까지 배열에 저장하고 이를 다시 출력하기 */

        char[] alphabetArr = {'A', 'B', 'C', 'D', 'E',
                              'F', 'G', 'H', 'I', 'J',
                              'K', 'L', 'M', 'N', 'O',
                              'P', 'Q', 'R', 'S', 'T',
                              'U', 'V', 'W', 'X', 'Y', 'Z'};

        String str = new String(alphabetArr);
        System.out.println(str);

    }
}
