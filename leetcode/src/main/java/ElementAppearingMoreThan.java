public class ElementAppearingMoreThan {

    public int findSpecialInteger(int[] arr) {
        if (arr.length == 1) {
            return 1;
        }
        float minFreq = arr.length / 4;
        int count = 1;
        int ele = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == ele) {
                count ++ ;
            } else {
                count = 1;
                ele = arr[i];
            }

            if(count > minFreq) {
                return ele;
            }
        }

        return 0;
    }
}
