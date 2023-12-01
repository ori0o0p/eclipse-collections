package com.example.eclipsecollection.fun;

import org.eclipse.collections.api.factory.Lists;
import org.eclipse.collections.api.list.ImmutableList;
import org.eclipse.collections.impl.factory.Strings;
import org.eclipse.collections.impl.string.immutable.CharAdapter;

public class HelloWorld {

    public static void main(String[] args) {

        CharAdapter helloWorld = Strings.asChars("Hello World");

        ImmutableList<CharSequence> strings = Lists.immutable.with(
                helloWorld,
                helloWorld.toReversed(),
                helloWorld.asReversed().makeString(),
                helloWorld.select(Character::isLowerCase),
                helloWorld.select(Character::isUpperCase),
                helloWorld.toBag().toStringOfItemToCount()
        );

        strings.each(System.out::println);

    }

}
