class FindAllGroovy {
    static void main(String[] args) {
        def myList=[3,4,5,6,6,7,8];
        //get the all values greater than 2
        def allValuesGreaterThanTwo = myList.findAll { it > 2 }
        println(allValuesGreaterThanTwo);

        def people = ['Tom', 'Dick', 'Harry', 'Kester']
        //get the all people if name length is more than 4
        def peopleWithMoreThanFourLetters = people.findAll { it.length() > 4 }
        println(peopleWithMoreThanFourLetters);

    }
}
