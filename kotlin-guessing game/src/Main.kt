/**
 * A LITTLE GUESSING GAME IN KOTLIN
 */

fun main() {
    println("_____________")
    println("guessing game 5 million")
    println("______________")
    println()

    val playername = getString(prompt:"Enter your name"

    val numToGuess = (1..100). random()

    println("I'm thinking of a number between 1 and 100)")
    println("can you guess it?")

    //Main loop
    while (ture) {
        // Ask the user for a guess
        // check if it's correct or not
        // Break out of loop of correct
        // otherwise give high or lower feedback
    }

    /**
     * Function to get a string from the user
     * Parameters:
     * Returns
     * -string that the user types
     */
    Fun getstirng(prompt:String):String {

         while (true){
             print(prompt)

             val userInput = readLn()
             if (userInput.isNotBlank()) break
         }

        return userInput
    }

    /** finction to get an Int from the user
     *
     */
    fun getInt(prompt: String) : Int{
        var intValue : Int

        while(true)
        val userInput = getSring(prompt)
        intValue = userInput.toIntOrNull()
        if (intValue != null ) break
    }


}