public class Test {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] st = new Throwable().getStackTrace();
        if (st.length < 3){
             return null;
        }
        return st[2].getClassName() + "#" + st[2].getMethodName();
    }
}