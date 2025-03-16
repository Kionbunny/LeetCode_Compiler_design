// make interface ICompiler as public to use it in other child class as well as the Client class(Main class)
public interface ICompiler {
    // interfaces will have only the method declarations implementations are handled by its child class
     void compile(String code);
}
