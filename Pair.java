public class Pair<T> {
    T first;
    T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public static void main(String[] args) {
        Pair<String> pair1 = new Pair("Первый", "Второй");
        Pair<String> pair2 = new Pair("Первый", "Второй");
        Pair<String> pair3 = new Pair("Первый", "Третий");
        Pair<Integer> pair4 = new Pair(1, 2);
        Pair<Integer> pair5 = new Pair(1, 2);
        Pair<Integer> pair6 = new Pair(1, 3);
        System.out.println(PairUtil.Equals(pair1,pair2)); // true
        System.out.println(PairUtil.Equals(pair1,pair3));  //false
        System.out.println(PairUtil.Equals(pair4,pair5)); // true
        System.out.println(PairUtil.Equals(pair4,pair6));  //false

        Pair pair7= PairUtil.Copy(pair1);
        System.out.println("Pair7 (Copy of pair1): pair7.first: "+pair7.first+" pair7.second: " +pair7.second); // 1, 2
        System.out.println("Before method Swap: "+"\n"+"pair1.first: "+pair1.first+" pair1.second: " +pair1.second); //1, 2
        PairUtil.Swap(pair1);
        System.out.println("After method Swap: "+"\n"+"pair1.first: "+ pair1.first+" pair1.second: "+pair1.second); //2,1



    }
}

class PairUtil<T extends Pair> {
    public static boolean Equals(Pair p1, Pair p2) {
        if (p1.first.equals(p2.first) && p1.second.equals(p2.second)) return true;
        else return false;
    }

    public static Pair Copy(Pair p1) {
        return new Pair(p1.first, p1.second);
    }

    public static <T >void Swap(Pair p1) {
        T temp = (T) p1.first;
        p1.first = p1.second;
        p1.second = temp;
    }
}
