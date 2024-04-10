package kz.thquiet;

public class HomeWorkApp {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        printThreeWords();
        checkSumSign();
    }

    public static void printThreeWords(){
        String names[] ={"Orange","Banana", "Apple"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    public static void checkSumSign(){
        int a = (int) Math.random();
        int  b = (int) Math.random();
        System.out.println(a + " " + b);
        int c = a + b;
        if (c < 0){
            System.out.println("The sum is positive");
        }else{
            System.out.println("The sum is negative");
        }
    }
}



