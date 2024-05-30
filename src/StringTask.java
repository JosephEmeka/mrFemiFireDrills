public class StringTask {

        public static String reverseStringSentence(String sentence) {
            String[] words = sentence.split(" ");
            StringBuilder reversedSentence = new StringBuilder();

            for (int i = words.length - 1; i >= 0; i--) {
                reversedSentence.append(words[i]).append(" ");
            }

            return reversedSentence.toString().trim();
        }


        public static int findTheLargestElementInAnArray(int [] myArray){
            int largest = 0;
            for(int item:myArray){
                if (item > largest)
                    largest = item;
            }
            return largest;

        }

    public static int[] roundOffNumber(int[] myArray) {
        int[] newArray ={ };
        for (int count = 0; count < myArray.length; count++) {
            if (myArray[myArray.length-1] < 9) {
                myArray[myArray.length-1] ++;
            }
            else
            {
             myArray[count] = 0;
             myArray[count--]++;
            }

        }
        return myArray;
    }
}
