package io.github.ajoz.workshop.fp.tools.predicates

fun isLargerThen(value: Int): (Int) -> Boolean = { it > value }

fun isLowerThen(value: Int): (Int) -> Boolean = { it < value }