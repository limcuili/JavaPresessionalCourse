class Eliza {

    public static void main (String[] args) {
        System.out.print("Hello ");
        System.out.print(args[0]);
        System.out.println(", how are you today?");
        System.out.println(">> " + args[1]);
        if ( args[1].equals("fine") ) {
            System.out.println("It is excellent that you are feeling well.");
        } else if ( args[1].equals("bad") ) {
            System.out.println("I am sorry to hear that you are not well.");
        } else if ( args[1].equals("miserable") ) {
            System.out.println("What do you call a square that's been in a car crash?");
            System.out.println("... a WRECK-tangle!");
        } else {
            System.out.println("Sorry I did not understand you.");
        }
    }

}

/*
To run the above code, we require two arguments, a name and a feeling.
compile with 'javac Eliza.java',
run with 'java Eliza Tristan well',
run with 'java Eliza Tristan bad',
run with 'java Eliza Konrad miserable',
 */