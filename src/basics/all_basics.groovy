package basics

//groovys print to std function
printf("hello world")

//or use javas sout
System.out.println("\nhello world from java")



// ";" - semicolons are optional


//Coments in groovy
        //      This is a single line comment

        /*      This is
                a multi-line
                comment
        */

        /**
        *       This is a
        *       groovy doc comment
        */

        // Sheband line - #!/usr/bin/env groovy     : read documentation for more information



//Assertions in groovy
//always evaluates to true so no output
assert true
//always evaluates to true so no output
assert 1 == 1

def x = [1,2,3,4,5]
assert (x<<6) == [1,2,3,4,5,6]

/*

//fails as outer isnt same as inner expression
assert 1 == 2

assert 25 == (4 + 24) * 453 / (23 - 4)


def y = [1,2,3,4,5]
assert (y<<6) == ["a","b","c","d","e","f"]

*/



//nubers in groovy are
println 1.getClass().getName()
println 1.5.class





