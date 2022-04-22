class MaxMinSumGroovy {
    static void main(String[] args) {
        def myList = [2, 3, 4, 4, 4, 5, 5, 6,9,12,15,20,19,0]
        //we can find all sum
        def sumOfAllElements = myList.sum();
        println('Sum of all elements ' + sumOfAllElements);
        //we can filter and sum
        def sumOfMyListValuesGreaterThanFour = myList.findAll { it > 4 }.sum()
        println('Sum Of MyList Values Greater Than Four ' + sumOfMyListValuesGreaterThanFour);
        //we can find min
        def min = myList.min();
        println('Min ' + min);
        //we can filter and find min
        def minValueGreaterThanTwo = myList.findAll { it > 2 }.min()
        println('Min Value Greater Than Two ' + minValueGreaterThanTwo);
        //we can find max
        def max = myList.max();
        println('Max ' + max);
        //we can filter and find max
        def maxValueBetweenThreeAndFive = myList.findAll { it > 3 && it < 5 }.max()
        println('Max Value Between Three And Five ' + maxValueBetweenThreeAndFive);

    }
}
