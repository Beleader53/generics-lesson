public class Printer{

    public static <T> void print(T[] array){
        for (T element : array) {
            System.out.println(element);
        }
    }
    
}

