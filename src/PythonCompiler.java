//interface ICompiler {
//    void compile(String code);
//}

public class PythonCompiler implements ICompiler{

    @Override
    public void compile(String code) {
      System.out.println("Python code is compiling  " + code);
        System.out.println("Python code is compilation successful ✅ ");
    }
}
