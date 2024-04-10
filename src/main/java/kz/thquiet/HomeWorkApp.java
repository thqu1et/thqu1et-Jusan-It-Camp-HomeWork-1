package kz.thquiet;

public class HomeWorkApp {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        printThreeWords();
        checkSumSign();
        printColor(101);
    }

    public static void printThreeWords(){
        String[] names ={"Orange","Banana", "Apple"};
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void checkSumSign(){
        int a = 2;
        int  b = 3;
        int c = a + b;
        if (c >= 0){
            System.out.println("The sum is positive");
        }else{
            System.out.println("The sum is negative");
        }
    }

    public static void printColor(int color){
        if(color <= 0){
            System.out.println("Color is Red!");
        }else if(color > 0 && color <= 100){
            System.out.println("Color is Yellow!");
        }else {
            System.out.println("Color is Green!");
        }
    }
}



