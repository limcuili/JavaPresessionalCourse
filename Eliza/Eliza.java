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
        } else {
            System.out.println("Sorry I did not understand you.");
        }
    }

}

/*
To run the above code, we require two arguments, a name and a feeling.
compile with 'javac Eliza.java',
run with 'java Tristan well',
run with 'java Tristan bad'.
 */