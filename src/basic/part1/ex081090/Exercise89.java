package basic.part1.ex081090;

//89. Write a Java program to check whether a security manager has already been established for the current application or not.
public class Exercise89 {
    public static void main(String[] args) {
        SecurityManager securityManager = System.getSecurityManager();
        System.out.format("Security manager has %sbeen established",
                (securityManager != null) ? "" : "not ");
        if (securityManager != null)
            System.out.println(securityManager);

    }
}
