import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySerializer {
    public static void main(String[] args) {
        int[] serializedArray = new int[200];
        for (int i = 0; i < serializedArray.length; i++) {
            serializedArray[i] = (int) (1 + (Math.random() * 999));
        }

        System.out.println(pushArray(serializedArray));
        System.out.println(Arrays.toString(pullArray(pushArray(serializedArray))));
    }

    public static String pushArray(int[] array) {
        String s = "";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                s = s + array[i];
            } else {
                s = s + array[i] + ",";
            }
        }
        return s;
    }

    public static int[] pullArray(String s)  {
        String[] string = s.split(",");
        List<Integer> list = new ArrayList<>();
        for (String i : string) {
            list.add(Integer.parseInt(i));
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}

