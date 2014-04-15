/**
 * ErrMsg
 *
 * This class is used to generate warning and fatal error messages.
 */
class ErrMsg {

    /**
     * Generates a fatal error message.
     * @param lineNum line number for error location
     * @param charNum character number (i.e., column) for error location
     * @param msg associated message for error
     */
    /*
    static void fatal(int lineNum, int charNum, String msg) {
        System.err.println(lineNum + ":" + charNum + " ***ERROR*** " + msg);
    }
    */
    //The first character of the ID in the duplicate declaration
    static void multDecl(int lineNum, int charNum){
        System.err.println(lineNum + ":" + charNum + " ***ERROR*** " + "Multiply declared identifier");
    }
    //  The first character of the undeclared identifier
    static void useOfUndeclID(int lineNum, int charNum){
        System.err.println(lineNum + ":" + charNum + " ***ERROR*** " + "Undeclared identifier");
    }
    //The first character of the ID corresponding to the LHS of the dot-access.
    static void badStructAccessLHS(int lineNum, int charNum){
        System.err.println(lineNum + ":" + charNum + " ***ERROR*** " + "Dot-access of non-struct type");
    }
    //The first character of the ID corresponding to the RHS of the dot-access.
    static void badStructAccessRHS(int lineNum, int charNum){
        System.err.println(lineNum + ":" + charNum + " ***ERROR*** " + "Invalid struct field name");
    }
    //The first character of the ID in the bad declaration.
    static void badVoidDecl(int lineNum, int charNum){
        System.err.println(lineNum + ":" + charNum + " ***ERROR*** " + "Non-function declared void");
    }
    //The first character of the ID corresponding to the struct type in the bad declaration.
    static void badStructDecl(int lineNum, int charNum){
        System.err.println(lineNum + ":" + charNum + " ***ERROR*** " + "Invalid name of struct type");
    }
    

    /**
     * Generates a warning message.
     * @param lineNum line number for warning location
     * @param charNum character number (i.e., column) for warning location
     * @param msg associated message for warning
     */
    /*
    static void warn(int lineNum, int charNum, String msg) {
        System.err.println(lineNum + ":" + charNum + " ***WARNING*** " + msg);
    }
    */
}
