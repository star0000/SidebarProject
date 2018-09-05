package com.moyu.wavesidebarproject;

import java.util.Comparator;

/**
 * Created by 墨羽 on 2018/9/5.
 */

public class PinyinComparator implements Comparator<SortModel> {
    @Override
    public int compare(SortModel o1, SortModel o2) {
        if (o1.getLetters().equals("@")
                || o2.getLetters().equals("#")) {
            return 1;
        } else if (o1.getLetters().equals("#")
                || o2.getLetters().equals("@")) {
            return -1;
        } else {
            return o1.getLetters().compareTo(o2.getLetters());
        }
    }
}
