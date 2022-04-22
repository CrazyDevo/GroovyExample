class FindInGroovy {
    static void main(String[] args) {
        def myList=[3,4,5,6,6,7,8];
        //return first match greater than five
        def greaterThanFive=myList.find{it>5};
        println(greaterThanFive);

        //return first match greater than five
        def greaterThanTwo=myList.find{it>2};
        println(greaterThanTwo);
    }
}
