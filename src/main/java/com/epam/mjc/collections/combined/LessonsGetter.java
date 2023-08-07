package com.epam.mjc.collections.combined;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> lessonsSet = new HashSet<>();

        for (List<String> lessons : timetable.values()) {
            lessonsSet.addAll(lessons);
        }

        return lessonsSet;
    }
}

