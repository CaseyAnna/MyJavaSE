// insertsort
// 类似打扑克时候摆牌

public class InsertSort {
    public static void main(String[] args) {
        int[] a = { 1, 3, 4, 4, 10, 6, 5, 6, 11, 22 };
        sort(a);
        for (int i = 0; i < a.length; ++i) {
            System.out.print(a[i] + " ");
        }

        System.out.println("");
        int[] b = { 1, 3, 4, 4, 10, 6, 5, 6, 11, 22 };
        insertSort(b);
        for (int i = 0; i < b.length; ++i) {
            System.out.print(b[i] + " ");
        }
    }

    private static void sort(int[] a) {

        int i, j;
        for (i = 1; i < a.length; ++i) {
            int tmp = a[i];
            j = i - 1;
            while (j >= 0 && tmp < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            if (j != i - 1) {
                a[j + 1] = tmp;
            }
        }
    }

    // 这个看着容易些
    private static void insertSort(int[] arr) {
        int i, j;
        int n = arr.length;
        int target;

        //假定第一个元素被放到了正确的位置上
        //这样，仅需遍历1 - n-1
        for (i = 1; i < n; i++) {
            j = i;
            target = arr[i];

            while (j > 0 && target < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = target;
        }
    }

}
