public class IfStatements {

    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        boolean isAwesomeDay = true;
        boolean shouldWork = x < y;
        String name = "Alex";


        //if (boolean condition) {
            // execute code
        // }

        // OPERATORS
        if (shouldWork && isAwesomeDay) { // and

        }

        if (shouldWork || isAwesomeDay) { // or

        }

        if (shouldWork ^ isAwesomeDay) { // xor

        }

        if (!shouldWork) { // not

        }


    //EXAMPLES
        if (!(x < y && shouldWork) || (y > x && !shouldWork)) {

        }

        if (shouldWork) System.out.println("Should work"); // one liner

        //else
        if (shouldWork) {

        } else { // else block

        }

        //elif
        if (x == 10) {

        } else if (shouldWork) { // elif block

        } else if (x == y) {

        } else { // not required in an if or if/elif block

        }

        // object equality is not the same as primitive equality (Strings break ifs)
        if (name == "Alex") { // breaks. no workos
            // BAD
            // (compares memory addresses instead of values)
        }

        if ("Alex".equals(name)) { //works (builtin equality func)
            // preferred "Alex".equals(name) vs name.equals("Alex")
            // why? if name is null or empty, code breaks
        }


        // CODE SMELL (anti-pattern)
        if (shouldWork == true) { // do not do this
            // DO NOT DO IT
        }

    }
}