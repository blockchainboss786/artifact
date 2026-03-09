package debuggingexamples;

import java.util.List;

public class NullPointerDemo {
    public static void printFirstItem(List<String> list) {
        System.out.println(list.get(0).toUpperCase()); // 💥 Possible NPE
    }

    public static void main(String[] args) {
        List<String> items = null;
        printFirstItem(items); 
    }
}

