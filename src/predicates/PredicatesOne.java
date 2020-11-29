package predicates;

import java.util.function.Predicate;

public class PredicatesOne {
    public static void main(String[] args) {

        System.out.println("11 > 10: " + numberBiggerThan.test(11));

    }
    static Predicate<Integer> numberBiggerThan = num -> num > 10;
}
