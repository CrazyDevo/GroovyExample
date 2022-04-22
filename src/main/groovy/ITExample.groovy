class ITExample {
    static void main(String[] args) {
        def talk={ println it}
        talk 5
        talk "Ali"
        def square={ println (it * it)}

        square 5

    }
}
