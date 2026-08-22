package com.objectcreation;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, IOException {
        //method-1 Using new keyword
        Student object=new Student();
        System.out.println(object.a);
        System.out.println();

        //method-2 Using clone
        //constructor not called
        Student object2=(Student) object.clone();
        System.out.println(object2.a);
        System.out.println();

        //method-3 Using newInstance();
        Class<?> studentClass=Class.forName("com.objectcreation.Student");
        Student object3=(Student) studentClass.newInstance();
        System.out.println(object3.a);
        System.out.println();

        //method-4 using newInstance();
        Constructor<Student> studentConstructor=Student.class.getDeclaredConstructor();
        Student object4=(Student) studentConstructor.newInstance();
        System.out.println(object4.a);
        System.out.println();

        //method-5 Deserialization
        //constructor not called
        FileOutputStream fileOut=new FileOutputStream("Sample.txt");//create,write
        ObjectOutputStream objOut=new ObjectOutputStream(fileOut);
        objOut.writeObject(object);
        fileOut.close();
        objOut.close();

        FileInputStream fileInput=new FileInputStream("Sample.txt");
        ObjectInputStream objInput=new ObjectInputStream(fileInput);

        Student object5=(Student) objInput.readObject();
        System.out.println(object5.a);

    }
}
class Student  implements Cloneable, Serializable {
    int a=10;
    Student(){
        System.out.println("Constructor called");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
