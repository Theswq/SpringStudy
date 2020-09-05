package com.swq.dao2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class stu {
    // 1数组
    private  String[] courses;

    // list
    private List<String> list;

    // map
    private Map<String, String> maps;

    // set
     private Set<String>  sets;

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    @Override
    public String toString() {
        return "stu{" +
                "courses=" + Arrays.toString(courses) +
                ", list=" + list +
                ", maps=" + maps +
                ", sets=" + sets +
                '}';
    }
}
