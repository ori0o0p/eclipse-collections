package com.example.eclipsecollection.basicCollection;

import org.eclipse.collections.api.factory.Lists;
import org.eclipse.collections.api.list.ImmutableList;
import org.eclipse.collections.api.list.MutableList;

public class List {

    public static void main(String[] args) {
        MutableList<String> emptyList =
                Lists.mutable.empty();

        emptyList.each(System.out::print);

        System.out.println();

        MutableList<String> list =
                Lists.mutable.with( "1" , "2" , "3" );

        list.each(System.out::print);

        System.out.println();

        ImmutableList<String> emptyImmutableList =
                Lists.immutable.empty();

        emptyImmutableList.each(System.out::print);

        System.out.println();

        ImmutableList<String> immutableList =
                Lists.immutable.with( "1" , "2" , "3" );

        immutableList.each(System.out::print);
    }

}
