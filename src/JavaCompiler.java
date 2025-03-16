public class JavaCompiler implements  ICompiler{
    // as the method declaration in interface is implemented by child class
    // so methods in interface or over-ridden in child class
    @Override
    public void compile(String code) {
        System.out.println("Compiling java code " + code);
        System.out.println("Java Compilation successful ✅");
    }
}
