# Head First Design Patterns

My written examples from the book [Head First Design Patterns](https://www.oreilly.com/library/view/head-first-design/0596007124/). Written in Java using IntelliJ.

Actual example code released [here](/publisher-code).

![Head First Design Patterns cover image](https://m.media-amazon.com/images/I/51rmlxN57sL._AC_SY780_.jpg)

---

### [The Strategy Pattern](/strategy/)
**The Strategy Pattern** defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from the clients that use it.

### [The Observer Pattern](/observer/)
**The Observer Pattern** defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.

### [The Decorator Pattern](/decorator/)
**The Decorator Pattern** attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

### [The Factory Pattern](/factory/)
**The Factory Method Pattern** defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

**The Abstract Factory Pattern** provides an interface for creating families of related or dependent objects without specifying their concrete classes.

### [The Singleton Pattern](/singleton/)
**The Singleton Pattern** ensures a class has only one instance, and provides a global point of access to it.

---

## OO Basics
1. **Abstraction**
1. **Inheritance**
1. **Encapsulation**
1. **Polymorphism**

---

## OO Principles
1. Encapsulate what varies.
1. Favor composition over inheritance.
1. Program to an interface, not an implementation.
1. Strive for loosely coupled designs between objects that interact.
1. **The Open-Closed Principle** - Classes should be open for extension but closed for modification.
1. **The Dependency Inversion Principle** - Depend on abstractions. Do not depend upon concrete classes.
   - No variable should hold a reference to a concrete class. If you use `new`, you'll be holding a reference to a concrete class. Use a factory to get around that!
   - No class should derive from a concrete class. If you derive from a concrete class, you're depending on a concrete class. Derive from an abstraction, like an interface or an abstract class.
   - No method should override an implemented method of any of its base classes. If you override an implemented method, then your base class wasn't really an abstraction to start with. Those methods implemented in the base class are meant to be shared by all your subclasses.
