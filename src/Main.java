public class Main {
    public static void main(String[] args) {
        // Client calls the factory to get the appropriate compiler
        // ICompiler compiler is the parent ref that will hold the child object
        // say if the JavaCompiler is detected in Factory then it will hold the JavaCompiler child obj
        // via instance variable compiler
        ICompiler compiler = CompileFactory.getCompiler("PYTHON");// this will call the
        // getCompiler() method in the CompileFactory class
      // once the compiler is detected it will be attached to ref variable compiler
        // Now, use the compiler to compile the code or call the compile method in the child class
        compiler.compile("System.out.println('Hello, Java!');");

//        if (language.equalsIgnoreCase("JAVA")) { IgnoreCase will ignore the case sensitivity of ch's
//            return new JavaCompiler();
//        }   if you dont want any case sensitivity then use IgnoreCase this will treat JAVA = java or
        // JavA = jaVA
    }
}
