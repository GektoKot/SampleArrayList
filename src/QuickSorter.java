public class QuickSorter {
    static public void quickSort(Object[] array, int pointer) {
        sort(array, 0, pointer - 1);
    }

    static private <T extends Comparable<T>> void sort(Object[] array, int left, int right) {
        if (left < right) {
            int pivot = divide(array, left, right);
            sort(array, left, pivot - 1);
            sort(array, pivot, right);
        }
    }

    static private <T extends Comparable<T>> int divide(Object[] array, int left, int right) {
        int mid = (left + right) / 2;
        T pivot = (T) array[mid];
        while (right >= left) {
            while (((T) array[left]).compareTo(pivot) < 0) {
                left++;
            }
            while (pivot.compareTo((T) array[right]) < 0) {
                right--;
            }
            if (right >= left) {
                T swap = (T) array[left];
                array[left] = array[right];
                array[right] = swap;
                ++left;
                --right;
            }
        }
        return left;
    }
}
