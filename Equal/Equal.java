class Equal {

    public static void main (String[] args) {
        System.out.println("I will check the equality of your first two arguments");
        System.out.println(">> First argument is: " + args[0]);
        System.out.println(">> Second argument is: " + args[1]);
        if ( args[0].equals(args[1]) ) {
            System.out.println("Oh, they are equal!");
        } else {
            System.out.println("Sorry, not equal. Capitalization matters!");
        }
    }

}