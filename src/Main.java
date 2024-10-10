//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Adder adder = new Adder();
        System.out.println(adder.add(1, 2));
        Subtractor subtractor = new Subtractor();
        System.out.println(subtractor.subtract(6, 3));
    }
}