package basic.part1.ex131140;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    140. Write a Java program to merge all overlapping Intervals from a given a collection of intervals.
    ArrayList<Interval> x = new ArrayList<>();

        x.add(new Interval(1, 3));
        x.add(new Interval(2, 6));
        x.add(new Interval(8, 10));
        x.add(new Interval(15, 18));
        x.add(new Interval(17, 20));

    Sample Output:
    1 6
    8 10
    15 20
 */
public class Exercise140 {

    public static void main(String[] args) {
        ArrayList<Interval> intervals = new ArrayList<>();

        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(15, 18));
        intervals.add(new Interval(17, 20));

        intervals = mergeIntervals(intervals);

        System.out.println(intervals);
    }

    public static ArrayList<Interval> mergeIntervals(ArrayList<Interval> list) {
        Collections.sort(list);
        ArrayList<Interval> merged = new ArrayList<>();

        for (int i = 1; i < list.size(); i++) {
            Interval prev = list.get(i-1);
            Interval curr = list.get(i);
            if(prev.end >= curr.start){
              merged.add(new Interval(prev.start, curr.end));
              i++;
            } else {
                merged.add(prev);
                if(i == list.size()-1){
                    merged.add(curr);
                }
            }
        }
        return merged;
    }

    static class Interval implements Comparable<Interval>{
        int start, end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Interval o) {
            return this.start - o.start;
        }

        @Override
        public String toString() {
            return "[" + this.start + ", " + this.end + "]";
        }
    }
}
