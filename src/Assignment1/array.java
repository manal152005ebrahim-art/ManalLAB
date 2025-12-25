package Assignment1;

public class array {
    public class ArrayOperations {

        static int[] removeElement(int[] arr, int element) {
            int count = 0;
            for (int x : arr)
                if (x != element) count++;

            int[] result = new int[count];
            int index = 0;
            for (int x : arr)
                if (x != element)
                    result[index++] = x;

            return result;
        }



    }

}