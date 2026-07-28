/*
                    ========================================
                                JAVA REVISION - DAY 2
                    ========================================
*/

/* 
Topic - 01 What is JDK ?
Full Form: Java Development Kit

Definition:
    JDK is a complete package used to develop Java applications. 
    It contains everything required to write, compile, debug, package, and run Java programs.

Simple Language:
    JDK is for Java Developers.
    If you want to create Java applications, you install the JDK.

JDK Contains
    Java Compiler (javac)
    JRE
    JVM
    Debugger
    Jar Tool
    Javadoc
    JShell
    Development utilities

--------------------------------------------------------------------------------------------------------

Topic - 02 What is JRE?
Full Form: Java Runtime Environment

Definition:
    JRE provides everything needed to run Java applications.

It contains:
    JVM
    Java Class Libraries
    Runtime Files
    Simple Language

JRE is only for running Java programs.
You cannot compile Java code using only JRE.

--------------------------------------------------------------------------------------------------------

Topic - 03 What is JVM?
Full Form: Java Virtual Machine

Definition:
    JVM is the engine that executes Java Bytecode.
    It converts bytecode into machine code and makes Java platform independent.

Main Responsibilities
    Load Classes
    Verify Bytecode
    Execute Program
    Memory Management
    Garbage Collection
    Exception Handling

--------------------------------------------------------------------------------------------------------

Relationship:
    JDK
    │
    ├── Development Tools
    │     ├── javac
    │     ├── jar
    │     ├── javadoc
    │     └── debugger
    │
    └── JRE
          │
        ├── Java Libraries
        │
        └── JVM

Easy formula:
    JDK = JRE + Development Tools
    JRE = JVM + Libraries
    JVM = Executes Bytecode

--------------------------------------------------------------------------------------------------------

Java Execution Process:

    Program.java
        ↓
      javac
        ↓
    Program.class(Bytecode)
        ↓
       JVM
        ↓
    Machine Code
        ↓
     Output

--------------------------------------------------------------------------------------------------------

Compiler (javac)
Compiler converts

    Hello.java
        ↓
    javac Hello.java
        ↓
    Hello.class

--------------------------------------------------------------------------------------------------------

JVM Memory Areas:

Heap Memory (Stores Objects)

Example
    Student s = new Student();
    Student object is stored in Heap.


Stack Memory Stores
    Local Variables
    Method Calls
Every method gets its own stack frame.


Method Area (Non-Heap) Stores
    Class Information
    Static Variables
    Methods


PC Register
    Stores the address of the current executing instruction for each thread.

Native Method Stack
    Stores native (C/C++) method calls.

--------------------------------------------------------------------------------------------------------

JIT Compiler
Full Form: Just-In-Time Compiler

Normally:

    Bytecode
        ↓
    Interpreter
        ↓
    Machine Code

Interpreter is slower.

JIT improves performance.

    Bytecode
        ↓
    JIT Compiler
        ↓
    Machine Code
        ↓
    Faster Execution
*/