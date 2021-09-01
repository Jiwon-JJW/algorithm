public class DistributeCandiesToPeople {
    public int[] distributeCandies(int candies, int num_people) {
        int[] people = new int[num_people];
        int index = 0;
        int num = 1;
        while ((candies - num) > 0) {
            people[index] += num;
            candies -= num;
            index++;
            num++;
            if(index > num_people-1) {
                index = 0;
            }
        }
        if (candies > 0) {
            people[index] += candies;
        }
        return people;
    }
}
