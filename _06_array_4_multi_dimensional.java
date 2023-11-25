public class _06_array_4_multi_dimensional {
    public static void main (String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "Octorber", "Nocvember", "December"};
        int[] preciptationPerMonth = {5, 3, 6, 2, 1, 0, 0, 8, 10, 5, 3, 6};
        
        // Printing precipation per month
        for (int i = 0; i < preciptationPerMonth.length; i++) {
            System.out.printf("%s= %s\n", months[i], preciptationPerMonth[i]);
        }

        String[] states = {"California", "Florida", "Nevada", "Texas"};
        int[][] preciptationPerMonthPerState = {
            {11, 13, 16, 15, 10, 10, 15, 18, 10, 15, 10, 12},
            {19, 21, 25, 22, 31, 35, 50, 38, 20, 45, 25, 24},
            {10, 11, 12, 12, 15, 20, 11, 12, 15, 17, 15, 18},
            {11, 11, 13, 11, 21, 13, 10, 15, 14, 13, 15, 27},
        };
        
        System.out.println("Precipitation Per State/Month report:");
        for (int i = 0; i < states.length; i++) {
            System.out.printf("State: %s\n", states[i]);
            for (int j = 0; j < preciptationPerMonthPerState[i].length; j++) {
                System.out.printf("  %s= %s\n", months[j], preciptationPerMonthPerState[i][j]);
            }
        }
    }
}
