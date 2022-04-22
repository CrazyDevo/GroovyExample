class CollectGroovy {
    static void main(String[] args) {
        def people = ['Tom', 'Dick', 'Harry', 'Kester'];
        //we can make it all uppercase
        def peopleNamesToUpperCase = people.collect { it.toUpperCase() }
        println(peopleNamesToUpperCase);
    }
}
