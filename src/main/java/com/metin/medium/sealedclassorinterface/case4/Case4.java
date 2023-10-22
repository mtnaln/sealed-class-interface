package com.metin.medium.sealedclassorinterface.case4;

sealed class Shape permits Square, Line {
}

class Square extends Shape {
}

class Line extends Shape {
}

public class Case4 {
}
