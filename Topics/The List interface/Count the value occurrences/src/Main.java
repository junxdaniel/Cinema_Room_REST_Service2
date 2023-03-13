class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        // implement the method
        int list1Count = 0;
        int list2Count = 0;

        for (Integer i : list1) {
            if (i == elem) {
                list1Count++;
            }
        }
        for (Integer i : list2) {
            if (i == elem) {
                list2Count++;
            }
        }
        if (list1Count == list2Count) {
            return true;
        } else {
            return false;
        }
    }
}