package basics.class_exercise

@groovy.transform.ToString
class Tweet {
    String username
    String tweetText
    int retweets
    int favorites
    Date createdOn

    Tweet(String username, String tweetText) {
        this.username = username
        this.tweetText = tweetText
        retweets = 0
        favorites = 0
        createdOn = new Date()
    }

    void addRetweets(){
        retweets += 1
    }
    void addFavourite(){
        favorites += 1
    }
}


/*  BONUS
// This generates an error - Error:(3, 1) Groovyc: Invalid duplicate class definition of class. Contains at least two definitions of the class.
// One of the classes is an explicit generated class using the class statement, the other is a class generated from the script body based on the file name.

// Solution: To fix it change the filename or change the class name

def tweet = new Tweet("tej","my first class assignment")
tweet.addRetweets()
tweet.addRetweets()
tweet.addRetweets()
tweet.addFavourite()

println tweet

*/


