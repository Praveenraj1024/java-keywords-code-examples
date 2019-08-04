package com.stackroute.numbersandstrings;

public class NumberAndString {
    public static void main(String[] args) {
        Integer g = 6;
        Integer d = 4;
        Double c = Double.valueOf(5);
        Float fl = Float.valueOf("62");
        System.out.println(g.compareTo(6));
        System.out.println(g.compareTo(4));

        System.out.println(g.equals(d));
        System.out.println(c);
        System.out.println(fl);

        int negativeNumber1 = -99;
        float floatNumber2 = 10.5f;
        System.out.println("Before calling abs() : " + negativeNumber1);
        System.out.println("Before calling abs() : " + floatNumber2);
        System.out.println("Absolute value of negative number : " + Math.abs(negativeNumber1));
        System.out.println("Absolute value of float number : " + Math.abs(floatNumber2));
        System.out.println("");

        double x = Math.PI;
        x = Math.toRadians(x);
        double Acosj = Math.acos(x);
        System.out.println("acos value of Acosj : " + Acosj);

        //String Builder.....

        StringBuilder sb = new StringBuilder("Hello ");

        sb.append("Java");
        System.out.println(sb);

        sb.insert(1, "Java");
        System.out.println(sb);

        sb.replace(1, 3, "Java");
        System.out.println(sb);

        sb.delete(1, 3);
        System.out.println(sb);
        System.out.println(sb.reverse());
    }
}


