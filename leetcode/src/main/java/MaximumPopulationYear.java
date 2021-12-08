public class MaximumPopulationYear {
    public int maximumPopulation(int[][] logs) {
        int maxPop = 0, answer = 1950;
        int[] years = new int[101];

        for(int[] log : logs) {
            for(int i = log[0]; i < log[1]; i++) {
                years[i - 1950]++;
            }
        }

        for(int i = 0; i < years.length; i++ ) {
            if(years[i] > maxPop) {
                maxPop = years[i];
                answer = 1950 + i;
            }
        }

        return answer;
    }
}
