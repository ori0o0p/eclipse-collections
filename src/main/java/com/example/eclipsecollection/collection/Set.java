package com.example.eclipsecollection.collection;

import org.eclipse.collections.api.factory.Sets;
import org.eclipse.collections.api.set.ImmutableSet;
import org.eclipse.collections.api.set.MutableSet;

public class Set {

    public static void main(String[] args) {
        MutableSet<String> emptySet =
                Sets.mutable.empty();

        emptySet.each(System.out::print);

        System.out.println();
        // 원소의 순서를 보장하지 않는다.
        MutableSet<String> set =
                Sets.mutable.with( "1" , "2" , "3" );

        set.each(System.out::print);

        System.out.println();

        ImmutableSet<String> emptyImmutableSet =
                Sets.immutable.empty();

        emptyImmutableSet.each(System.out::print);

        System.out.println();
        //  불변 집합은 요소를 삽입할 때의 순서를 그대로 유지한다.
        ImmutableSet<String> immutableSet =
                Sets.immutable.with( "1" , "2" , "3" );

        immutableSet.each(System.out::print);
    }
}
