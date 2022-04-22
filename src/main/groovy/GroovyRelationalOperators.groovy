class GroovyRelationalOperators {
    static void main(String[] args) {
        def x = 5;
        def y = 8;
        def z = 10;
        def t = 5;
        //equality
        if (x == t) {
            println("x is equal to t")
        } else {
            println("x is not equal to t")
        }
        //not equal
        if (z != y) {
            println("z is not equal to y")
        } else {
            println("z is equal to y")
        }
        //grater
        if (z>y){
            println("z is grater than y")
        }else{
            println("z is not grater than y")
        }

        //grater or equal
        if (x>=t){
            println("x is grater than t or equal")
        }else{
            println("x is not grater than t or equal")
        }

    }
}
