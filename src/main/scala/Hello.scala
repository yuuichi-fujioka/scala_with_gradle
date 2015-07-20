object Hello {
    def main(args: Array[String]) {
        println("Hello, Scala!");
        println("Test! " + foo(10,20));
    }

    def foo(a: Int, b: Int) : Int = {
        a + b
    }
}
