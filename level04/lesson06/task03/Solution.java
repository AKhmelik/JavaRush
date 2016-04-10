package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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
        int int1 = Integer.parseInt(str);
        int int2 = Integer.parseInt(str2);
        int int3 = Integer.parseInt(str3);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(int1);
        list.add(int2);
        list.add(int3);

        Collections.sort(list, Collections.reverseOrder());

        for(Integer s2tr: list){
            System.out.println(s2tr);
        }

    }
}
