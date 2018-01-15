
package kata3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Histogram <T> {
    Map<T,Integer> map = new HashMap<>();
    
    public Integer get(T key) {
        return map.get(key);
    }
    
    public Set<T> keySet() {
        return map.keySet();
    }
    
    public void increment(T key, int value) {
        map.put(key, value);
    }
    
    
}
