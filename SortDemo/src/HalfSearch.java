// 折半插入排序（binary insertion sort）是对插入排序算法的一种改进，
// 由于排序算法过程中，就是不断的依次将元素插入前面已排好序的序列中。
// 由于前半部分为已排好序的数列，这样我们不用按顺序依次寻找插入点，可以采用折半查找的方法来加快寻找插入点的速度。
// 这个例子不是折半排序 是对有序的序列进行折半查找

public class HalfSearch {
    public static void main(String[] args) {
        int[] a = { 1, 3, 4, 4, 4, 8, 9, 10, 11 };

        int index = search(a, 0, a.length - 1, 4);
        System.out.println(index);
    }

    private static int search(int[] a, int low, int high, int x) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] > x) {
                high = mid - 1;
            } else if (a[mid] < x) {
                low = mid + 1;
            } else
                return mid;
        }
        return -1;
    }
}
