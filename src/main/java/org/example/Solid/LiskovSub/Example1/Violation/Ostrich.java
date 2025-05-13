package org.example.Solid.LiskovSub.Example1.Violation;

class Ostrich extends Bird {
    void fly() {
        throw new UnsupportedOperationException();
    }
}
