import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Task {

    public static ArrayList findEquals(String[] array) {
        ArrayList<String> listOfStrings = new ArrayList(List.of(array));
        HashMap<Integer, String> map = new HashMap();
        ArrayList isAlreadyPrinted = new ArrayList<>();
        ArrayList toReturn = new ArrayList<>();

        for (int i = 0; i < listOfStrings.size(); i++) {
            String str = Utils.sortedString(listOfStrings.get(i));
            map.put(i, str);
        }

        for (int i = 0; i < map.size(); i++) {
            String value = map.get(i);
            Set keys = Utils.getKeys(map, value);
            if (keys.size() != 1 && !isAlreadyPrinted.contains(value)) {
                String output = String.format("%s = %s", value, keys);
                System.out.println(output);
                isAlreadyPrinted.add(value);
                toReturn.add(output);
            }
        }
        return toReturn;
    }

    public static void main(String[] args) {
        String[] array = {"a", "f", "ffa", "faf", "bb", "bwb", "w2bb", "bb2w"};
        Task.findEquals(array);
    }
}
