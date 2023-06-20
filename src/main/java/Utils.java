import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Utils {
    public static String sortedString(String stringToSort) {
        String sorted = stringToSort.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
        return sorted;
    }

    public static <K, V> Set<K> getKeys(Map<K, V> map, V value) {
        Set<K> keys = new HashSet<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                keys.add(entry.getKey());
            }
        }
        return keys;
    }
}
