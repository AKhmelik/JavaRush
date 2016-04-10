package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        InputStream in = System.in;
        InputStreamReader streemReader = new InputStreamReader(in);
        BufferedReader buffer = new BufferedReader(streemReader);
        String str = buffer.readLine();
        String str2 = buffer.readLine();
        String str3 = buffer.readLine();
        String str4 = buffer.readLine();
        int int1 = Integer.parseInt(str);
        int int2 = Integer.parseInt(str2);
        int int3 = Integer.parseInt(str3);
        int int4 = Integer.parseInt(str4);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(int1);
        list.add(int2);
        list.add(int3);
        list.add(int4);
        int minIndex = list.indexOf(Collections.max(list));
        System.out.print(list.get(minIndex));

    }
}
