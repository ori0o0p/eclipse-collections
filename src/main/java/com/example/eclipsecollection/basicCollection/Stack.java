package com.example.eclipsecollection.basicCollection;

import org.eclipse.collections.api.factory.Stacks;
import org.eclipse.collections.api.stack.ImmutableStack;
import org.eclipse.collections.api.stack.MutableStack;

public class Stack {

    public static void main(String[] args) {
        MutableStack<String> emptyStack =
                Stacks.mutable.empty();

        emptyStack.push("1");
        emptyStack.push("2");

        emptyStack.each(System.out::print);
        System.out.println();

        emptyStack.pop();
        emptyStack.each(System.out::print);
        System.out.println();

        MutableStack<String> stack =
                Stacks.mutable.with( "1" , "2" , "3" );

        stack.each(System.out::print);
        System.out.println();

        ImmutableStack<String> emptyImmutableStack =
                Stacks.immutable.empty();

        emptyImmutableStack.each(System.out::print);
        System.out.println();

        ImmutableStack<String> immutableStack =
                Stacks.immutable.with( "1" , "2" , "3" );

        immutableStack.each(System.out::print);
    }

}
