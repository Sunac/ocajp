/**
    6.3 Create and overload constructors; including impact on default constructors
 */
public class Lesson3 {
    private String nickName;

    /*
        Order of construction:
        1. java.lang.Object created
        2. super() - Call parent class constructors
        3. static fields initialization
        4. static initializers (if any)
        5. instance field initialization
        6. instance initializers (if any)
        7. this() - Constructor runs

        Note: there may be multiple static and instance initializers. They run
        in the order that they appear in the file.
     */

    /*
         No-args constructor is needed as it NOT automatically added by compiler
         because another constructor is defined.
         The exam may use the term 'default constructor' for the constructor
         automatically added by the compiler.
         Like super(), this() must be the first statement in the constructor.
      */
    public Lesson3() {
        this("Paul"); // call other constructor
    }

    /*
        Careful. This is NOT a constructor! The exam may try to trip you out.
     */
    public void Lesson3() {
        System.out.println("I'm not a constructor");
    }

    public Lesson3(String nickName) {
        /*
            Super is called by default. Generally it is only called if the parent
            constructor is not the default. e.g. super("argument").
            If you do call super(), it must be the first statement, otherwise
            a compiler error occurs.
         */
        super();    // explicit call to parent class constructor
        this.nickName = nickName;
        // super() here will cause a compile error
    }

    public static void main(String[] args) {
        Lesson3 lesson3a = new Lesson3();
        Lesson3 lesson3b = new Lesson3("Bob");
        lesson3a.Lesson3();
    }
}
