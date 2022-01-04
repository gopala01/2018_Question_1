package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int size = inputInt("How big should the triangles and square be");

         String triangle = inputString("What is the character of triangles?");
         String squares = inputString("What is the character of squares?");

        printShape(triangle, squares, size);

    }

    public static void printShape(String t, String s, int size)
    {
        String triangle = "";
        s = createSquare(s, size);
        for (int i = 0; i < size; i++) {
            triangle = addToTriangle(t, i);
            print(triangle);
        }

        for (int i = 0; i < size; i++) {
            print(s);
        }

        for (int i = size; i >= 0 ; i--) {
            bringBackTriangle(triangle, i);
        }

    }

    public static void bringBackTriangle(String triangle, int size)
    {
        String[] triangleArray = triangle.split("");

        String empty = "";
        for (int i = 0; i < size; i++) {
            empty = empty + triangleArray[i];
        }
        print(empty);
    }
    public static String addToTriangle(String t, int size)
    {
        String empty = "";
        for (int i = 0; i <= size; i++) {
            empty = empty + t;
        }
        return empty;
    }
    public static String createSquare(String s, int size)
    {
        String empty = "";
        for (int i = 0; i < size; i++) {
            empty = empty + s;
        }
        return empty;
    }
    public static void print(String m)
    {
        System.out.println(m);
    }

    public static String inputString(String m) {
        String answer;
        Scanner scanner = new Scanner(System.in);

        print(m);
        answer = scanner.nextLine();
        return answer;
    }

    public static int inputInt(String m) {
        int answer;
        Scanner scanner = new Scanner(System.in);

        print(m);
        answer = scanner.nextInt();
        return answer;
    }
}
