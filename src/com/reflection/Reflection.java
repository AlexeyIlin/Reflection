package com.reflection;

import com.sun.istack.internal.NotNull;
import sun.net.www.content.text.Generic;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

/**
 * Created by Aleksey on 01.05.2018.
 */
public class Reflection {
    public static void main (String[] args) throws ClassNotFoundException {

        System.out.println("\nClass:");
        //For testing
        //Class aclass = MyClass.class;
        //Class aclass = MyClass.getClass();
        Class aclass = Class.forName("com.reflection.MyClass");
        System.out.println(aclass.getName());

        System.out.println("\nModifiers:");
        int mods = aclass.getModifiers();
        if (Modifier.isPublic(mods)) System.out.println("Public");
        if (Modifier.isAbstract(mods)) System.out.println("Abstract");

        System.out.println("\nInterfaces:");
        Class[] intface = aclass.getInterfaces();
        for (Class cintface : intface) {
        System.out.println(cintface.getName());}

        System.out.println("\nAnnotations:");
        Annotation[] annot = aclass.getDeclaredAnnotations();
        for (Annotation annotation : annot) System.out.println(annotation.annotationType().getSimpleName());

        System.out.println("\nFields:");
        Field[] field = aclass.getDeclaredFields();
        for (Field cfield : field) {
            Class fieldtype = cfield.getType();
            System.out.println(fieldtype.getName());
            System.out.println(cfield.getName());
        }

        System.out.println("\nConstructors:");
        Constructor[] constructors = aclass.getConstructors();
        for (Constructor constructor : constructors) {
            Class[] paramTypes = constructor.getParameterTypes();
            for (Class paramType: paramTypes){
                System.out.println(paramType.getName() + " ");
            }
            System.out.println();
        }

        System.out.println("\nMethods:");
        Method[] methods = aclass.getMethods();
        for (Method method : methods){
            System.out.println("Имя " + method.getName());
            System.out.println("Тип " + method.getReturnType().getName());
        }


        System.out.println("\nGenerics:");
        Type gnr = aclass.getGenericSuperclass();
        System.out.println(gnr);


        System.out.println("\nInheritance:");

        while (aclass != null ) {
            System.out.println(aclass.getSimpleName());
            aclass = aclass.getSuperclass();
        }

    }
}
