public class CompileFactory {
    public static ICompiler getCompiler(String language) {
        switch(language) {
            case "JAVA":
                return new JavaCompiler(); // no need of break; as we returning it directly
            case "PYTHON":
                return new PythonCompiler();
            default:
                throw new IllegalArgumentException("Unsupported language: " + language);
        }
    }
}
