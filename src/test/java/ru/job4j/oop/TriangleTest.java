package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class TriangleTest {
    @Test
    public void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        assertThat(new Triangle(a, b, c).area()).isCloseTo(8, offset(0.001));
    }

    @Test
    public void when00and40and00ThenMinus1() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 0);
        assertThat(new Triangle(a, b, c).area()).isEqualTo(-1);
    }
}