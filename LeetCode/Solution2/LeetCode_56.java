package Solution2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by hxk
 * 2018/11/13 16:05
 * 合并区间
 * 1.根据start排序
 * 2.从第一个位置开始遍历，维护一个初始的位置信息[start,end]，从第一个以后如下工作
 * 3.如果遍历的区间的起始位置在当前的start，end之间，那么进行合并，并更新end为新老区间最远的哪一个，然后遍历下一个
 * 4.如果不在，证明需要开始一个新的区间了，之后的已经不能同现在的[start,end]合并，
 *   那么久进行[start，end]存储，然后更新为这个区间的位置了
 */

public class LeetCode_56 {

    public class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<Interval>();
        Collections.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval arg0, Interval arg1) {
                return arg0.start - arg1.start;
            }
        });
        if (intervals.size() < 1)
            return result;
        Interval p = intervals.get(0), tmp;
        int i = 1;
        while (i < intervals.size()) {
            tmp = intervals.get(i);
            if (p.end >= tmp.start) {
                p.end = Math.max(p.end, tmp.end);
            } else {
                result.add(p);
                p = tmp;
            }
            i++;
        }
        result.add(p);
        return result;
    }
}
