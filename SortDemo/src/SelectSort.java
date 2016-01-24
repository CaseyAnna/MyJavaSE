// SelectSort
// 还是先来看看选择排序的思想。选择排序的思想非常直接，不是要排序么？那好，我就从所有序列中先找到最小的，然后放到第一个位置。之后再看剩余元素中最小的，放到第二个位置……以此类推，就可以完成整个的排序工作了。
// 相比于插入排序的固定元素找位置，是两种思维方式。
// 从选择排序的思想或者是上面的代码中，我们都不难看出，寻找最小的元素需要一个循环的过程，而排序又是需要一个循环的过程。因此显而易见，这个算法的时间复杂度也是O(n*n)的。
// 这就意味值在n比较小的情况下，算法可以保证一定的速度，当n足够大时，算法的效率会降低。并且随着n的增大，算法的时间增长很快。因此使用时需要特别注意。

public class SelectSort {
    public static void main(String[] args) {
        int[] a = { 1, 3, 4, 4, 10, 6, 5, 6, 11, 22 };
        sort(a);
        for (int i = 0; i < a.length; ++i) {
            System.out.print(a[i] + " ");
        }
    }

    private static void sort(int[] a) {
        int i, j, k;

        for (i = 0; i < a.length; ++i) {
            k = i;
            for (j = i + 1; j < a.length; ++j) {
                if (a[j] < a[k]) {
                    k = j;
                }
            }
            if (k != i) {
                int tmp = a[k];
                a[k] = a[i];
                a[i] = tmp;
            }
        }
    }
}
