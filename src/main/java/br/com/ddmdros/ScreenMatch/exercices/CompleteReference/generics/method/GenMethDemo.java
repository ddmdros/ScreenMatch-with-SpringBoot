package br.com.ddmdros.ScreenMatch.exercices.CompleteReference.generics.method;

public class GenMethDemo {
    // esse metodo com assinatura gigante determina se um objeto é membro de um array
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y){
        for(int i = 0; i < y.length; i++)
            if(x.equals(y[i]))
                return true;
        return false;
    }
    // A class that implements Comparable defines objects that can be ordered.
    // Next, notice that the type V is upper-bounded by T.
    // Thus, V must either be the same as type T, or a subclass of T.
    // This relationship enforces that isIn( )
    // can be called only with arguments that are compatible with each other.
    //Also notice that isIn( ) is static, enabling it to be called independently of any object.




    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};

        if(isIn(2,nums))
            System.out.println("2 is in nums");

        if(!isIn(7,nums))
            System.out.println("7 is not in nums");

        System.out.println();

        String[] strs = {"one", "two", "three", "four", "five"};

        if(isIn("two", strs))
            System.out.println("two is in strs");

        if(!isIn("seven", strs))
            System.out.println("seven is not in strs");
    }
}
