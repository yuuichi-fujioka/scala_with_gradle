import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.FunSpec

@RunWith(classOf[JUnitRunner])
class HelloTest extends FunSpec {
    describe("foo's") {
        describe("addition") {
            it("1 plus 2 equal 3") {
                var v = Hello.foo(1,2)
                assert(v === 3)
            }
        }
        describe("substraction") {
            it("1 plus -2 equal -1") {
                var v = Hello.foo(1,-2)
                assert(v === -1)
            }
        }
    }
}
