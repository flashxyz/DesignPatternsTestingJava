public class Main {

    public static void main(String[] args) {
        System.out.println("Strategy Demo");

        Context context = new Context(new OpAdd());
        System.out.println(context.exeStrategy(10, 20));

        context = new Context(new OpMultiply());
        System.out.println(context.exeStrategy(10, 20));

        // can be changed at runtime.
        context.setStrategy(new OpAdd());
        System.out.println(context.exeStrategy(10, 20));

    }
}
