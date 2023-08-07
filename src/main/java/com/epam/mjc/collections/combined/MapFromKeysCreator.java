package com.epam.mjc.collections.combined;

import java.util.Map;
import java.util.Set;
import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> resultMap = new HashMap<>();

        for (String key : sourceMap.keySet()) {
            int keyLength = key.length();
            Set<String> keysWithSameLength = resultMap.getOrDefault(keyLength, new HashSet<>());
            keysWithSameLength.add(key);
            resultMap.put(keyLength, keysWithSameLength);
        }

        return resultMap;
    }
}
