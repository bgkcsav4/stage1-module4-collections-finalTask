package com.epam.mjc.collections.combined;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();

        for (String project : projects.keySet()) {
            if (projects.get(project).contains(developer)) {
                result.add(project);
            }
        }

        result.sort((p1, p2) -> {
            // Sort by project name length in descending order
            int nameLengthComparison = Integer.compare(p2.length(), p1.length());

            // If project name length is the same, sort alphabetically in reverse order
            if (nameLengthComparison == 0) {
                return p2.compareTo(p1);
            }

            return nameLengthComparison;
        });

        return result;
    }

}

