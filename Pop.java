/*
* This program uses a custom class.
*
* @author  Jonathan Pasco-Arnone
* @version 1.0
* @since   2021-12-01
*/

/**
* This is the main outer function.
*/
final class Pop {
    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Pop() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This is the main function.
    *
    * @param args this will not be used
    */
    public static void main(final String[] args) {
        // use MrCoxallStack class
        final MrCoxallStack aStack = new MrCoxallStack();
        final String addedNewNumber = "Added new number";
        final String popNumber = "Popped the top number";
        final String newStack = "New Stack: ";

        final int fourtyTwo = 42;
        final int ninetyOne = 91;
        System.out.println("Initial stack: ");
        aStack.showStack();

        // Adding 42
        System.out.println(addedNewNumber);
        aStack.push(fourtyTwo);
        System.out.println(newStack);
        aStack.showStack();

        // Adding 91
        System.out.println(addedNewNumber);
        aStack.push(ninetyOne);
        System.out.println(newStack);
        aStack.showStack();

        // Removing the top number (currently 42)
        System.out.println(popNumber);
        aStack.pop();
        aStack.showStack();
    }
}
