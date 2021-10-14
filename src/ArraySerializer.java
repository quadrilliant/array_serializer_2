import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySerializer {
    public static void main(String[] args) {
        int[] originalArray = new int[200];
        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = (int) (1 + (Math.random() * 999));
        }
        String string = serialize(originalArray);
        System.out.println(string);
        System.out.println(Arrays.toString(deserialize(string)));
    }
    public static String serialize(int[] array) {
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
    public static int[] deserialize(String s)  {
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

