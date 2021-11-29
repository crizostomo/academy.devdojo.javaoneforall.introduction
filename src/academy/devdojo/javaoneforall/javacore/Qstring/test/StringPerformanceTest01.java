package academy.devdojo.javaoneforall.javacore.Qstring.test;

//110 - Utility Classes - String pt 03 - Performance

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        concaString(30_000);
        long end = System.currentTimeMillis();
        System.out.println("Time taken with String " + (end-begin) + "ms");

        begin = System.currentTimeMillis();
        concaStringBuilder(30_000);
        end = System.currentTimeMillis();
        System.out.println("Time taken with StringBuilder " + (end-begin) + "ms");

        begin = System.currentTimeMillis();
        concaStringBuffer(30_000);
        end = System.currentTimeMillis();
        System.out.println("Time taken with StringBuffer " + (end-begin) + "ms");
    }

    private static void concaString(int size){
        String text ="";
        for (int i = 0; i < size; i++) {
            text += i;//0,01,012
        }
    }

    private static void concaStringBuilder(int size){
        StringBuilder text = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            text.append(i);
        }
    }

    private static void concaStringBuffer(int size){
        StringBuffer text = new StringBuffer(size);
        for (int i = 0; i < size; i++) {
            text.append(i);
        }
    }
}
