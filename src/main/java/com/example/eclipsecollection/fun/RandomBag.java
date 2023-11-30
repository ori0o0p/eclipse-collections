package com.example.eclipsecollection.fun;

import org.eclipse.collections.api.bag.primitive.IntBag;
import org.eclipse.collections.api.factory.primitive.IntBags;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomBag {

    public static void main(String[] args) {
        IntStream ints = new Random(42L).ints(1, 11);
        IntBag bag = IntBags.mutable.withAll(ints.limit(1_000_000_000));
        System.out.println(bag.bottomOccurrences(5));
        System.out.println(bag.topOccurrences(5));
    }

    // output :
    // [9:99989872, 10:99991642, 7:99992118, 2:99993090, 8:99995976]
    // [5:100014536, 4:100012248, 6:100006996, 3:100003976, 1:99999546]

}
