import java.util.*;
public class Problems {
    public static void main(String[] args) {
        List<String> veg = new ArrayList<String>();
        for (int i = 1; i < 10; i+= 2) {
            veg.add(String.valueOf(i));
        }
        List<String> fruit = new ArrayList<String>();
        for (int i = 0; i < 10; i+= 2) {
            fruit.add(String.valueOf(i));
        }
        List<String> both = combine(fruit, veg);
        print(both); // both

        List<String> dupedList = new ArrayList<String>();
        dupedList.add("1");
        dupedList.add("2");
        dupedList.add("1");
        removeDupes(dupedList);
        print(dupedList); // {1, 2}

        print(andList(dupedList, veg)); // {1}

        List<Integer> ints = new ArrayList<Integer>();
        ints.add(3);
        ints.add(4);
        ints.add(5);
        ints.add(1);
        binInsertion(ints, 3);
        print(ints);
        reverse(ints);
        print(ints);

        List<Integer> points_no_points = new ArrayList<Integer>();
        points_no_points.add(3);
        points_no_points.add(4);
        points_no_points.add(7);
        points_no_points.add(7);
        points_no_points.add(1);
        points_no_points.add(0);

        List<Point> points_with_points = getPoints(points_no_points);
        print(points_with_points);
        print(getMidPoints(points_with_points));
        Collections.sort(points_with_points);
        print(points_with_points);
        System.out.println("Ta-da");

    }

    public static void print(List l) {
        String s = "[";
        for (Object i : l) {
            s += i.toString();
            s += ", ";
        }
        s = s.substring(0, s.length()-2);
        s += "]";
        System.out.println(s);
    }

    public static List<String> combine(List<String> fruits, List<String> vegetables) {
        ArrayList<String> combined = new ArrayList<String>(fruits);
        for (String veg : vegetables) {
            combined.add(veg);
        }
        Collections.sort(combined);
        return combined;
    }

    public static List<String> andList(List<String> firstList, List<String> secondList) {
        firstList.retainAll(secondList);
        return firstList;

    }

    public static void removeDupes(List<String> list) {
        Collections.sort(list);
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).equals(list.get(i+1))) {
                list.remove(i);
            }
        }
    }

    public static void binInsertion(List<Integer> list, int into) {
        Collections.sort(list);
        int left = 0;
        int right = list.size();
        int midpoint = (right + left) / 2;
        while (left < right) {
            midpoint = (right + left) / 2;
            if (list.get(midpoint).intValue() > into) {
                right = midpoint;
            } else {
                left = midpoint + 1;
            }
        }
        list.add(left, Integer.valueOf(into));
    }

    public static void reverse(List<Integer> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            Integer temp = list.get(i);
            list.set(i, list.get(list.size()-( i + 1)));
            list.set(list.size()-(i+1), temp);
        }
    }

    public static List<Point> getPoints(List<Integer> ints) {
        ArrayList<Point> points = new ArrayList<Point>(ints.size()/2);
        for (int i = 0; i < ints.size()-1; i+=2) {
            points.add(new Point(ints.get(i), ints.get(i+1)));
        }
        return points;
    }

    public static List<Point> getMidPoints(List<Point> points) {
        ArrayList<Point> newPoints = new ArrayList<Point>(points);
        for (int i = 0; i < points.size()-1; i ++) {
            newPoints.add((2* i + 1), Point.getMid(points.get(i), points.get(i+1)));
        }
        return newPoints;
    }


}