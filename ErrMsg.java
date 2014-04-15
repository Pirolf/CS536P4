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
    static String multDecl(int lineNum, int charNum){
        return (lineNum + ":" + charNum + " ***ERROR*** " + "Multiply declared identifier");
    }
    //  The first character of the undeclared identifier
    static String useOfUndeclID(int lineNum, int charNum){
        return (lineNum + ":" + charNum + " ***ERROR*** " + "Undeclared identifier");
    }
    //The first character of the ID corresponding to the LHS of the dot-access.
    static String badStructAccessLHS(int lineNum, int charNum){
        return (lineNum + ":" + charNum + " ***ERROR*** " + "Dot-access of non-struct type");
    }
    //The first character of the ID corresponding to the RHS of the dot-access.
    static String badStructAccessRHS(int lineNum, int charNum){
        return (lineNum + ":" + charNum + " ***ERROR*** " + "Invalid struct field name");
    }
    //The first character of the ID in the bad declaration.
    static String badVoidDecl(int lineNum, int charNum){
        return (lineNum + ":" + charNum + " ***ERROR*** " + "Non-function declared void");
    }
    //The first character of the ID corresponding to the struct type in the bad declaration.
    static String badStructDecl(int lineNum, int charNum){
        return (lineNum + ":" + charNum + " ***ERROR*** " + "Invalid name of struct type");
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
