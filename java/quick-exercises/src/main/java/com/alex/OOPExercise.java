package com.alex;

public class OOPExercise
{
    public static void main(String[] args)
    {
        ClassA a = new ClassA();
        a.done();
        ClassA a2 = new ClassB();
        a2.done();
        ClassA a3 = new ClassC();
        a3.done();
    }

    static class ClassA
    {
        public void done()
        {
            System.out.println("class a");
        }
    }

    static class ClassB extends ClassA
    {
        @Override
        public void done()
        {
            System.out.println("class b");
        }
    }

    static class ClassC extends ClassB
    {
        @Override
        public void done()
        {
            System.out.println("class c");
        }
    }
}
