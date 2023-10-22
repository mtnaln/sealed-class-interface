package com.metin.medium.sealedclassorinterface.case5;

sealed class Shape permits Square, Line, L {
}

final class Square extends Shape {
}

sealed class L extends Shape permits LLevelB {
}

final class LLevelB extends L {
}

non-sealed class Line extends Shape {
}

class LineLevelB extends Line {
}

public class Case5 {
}
