import java.util.Scanner;

public class app {
    public static void main(String[] args) throws Exception {
        Context context= new Context();
        context.setStrategy(new StrategyImpl1());
        context.appliquerStrategy();
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Donner le nom de strategie :");
            String stragyClassName=scanner.nextLine();
            IStrategy strategy=(IStrategy)Class.forName(stragyClassName).newInstance();
            context.setStrategy(strategy);
            context.appliquerStrategy();
        }
    }
}
