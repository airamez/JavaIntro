public class _06_array_3_multi_dimensional {
    public static void main (String[] args) {
        int[][] biDimensional = {
            {10, 11, 12, 13, 14},
            {15, 16, 17, 19, 19},
            {20, 21, 22, 23, 24},
            {25, 26, 27, 28, 29},
        };
        printArrayBiDimensional(biDimensional);

        int[][][] triDimensional = {
            {
                {10, 11, 12, 13, 14},
                {15, 16, 17, 19, 19},
                {20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29},
            },
            {
                {30, 31, 32, 33, 34},
                {35, 36, 37, 39, 49},
                {40, 41, 42, 43, 44},
                {45, 46, 47, 48, 49},
            },
            {
                {50, 51, 52, 53, 54},
                {55, 56, 57, 58, 59},
                {60, 61, 62, 63, 64},
                {65, 66, 67, 68, 69},
            },
            {
                {70, 71, 72, 73, 74},
                {75, 76, 77, 78, 79},
                {80, 81, 82, 83, 84},
                {85, 86, 87, 88, 89},
            }
        };
        printArrayTriDimensional(triDimensional);
    }

    public static void printArrayBiDimensional(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(String.format("%s ", array[i][j]));
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printArrayTriDimensional(int[][][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(String.format("%s ", array[i][j][k]));
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }
}
