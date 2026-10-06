public abstract class Sortable {
    public abstract int compare(Sortable other);

    public static void shell_sort(Sortable[] values) {
        for (int gap = values.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < values.length; i++) {
                Sortable current = values[i];
                int j = i;

                while (j >= gap && values[j - gap].compare(current) > 0) {
                    values[j] = values[j - gap];
                    j -= gap;
                }

                values[j] = current;
            }
        }
    }
}
