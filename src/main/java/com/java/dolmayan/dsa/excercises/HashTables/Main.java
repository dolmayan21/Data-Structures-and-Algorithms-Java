package com.java.dolmayan.dsa.excercises.HashTables;

public class Main {

    public static void main(String[] args) {

        HashTable myHashTable = new HashTable();


        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);
        myHashTable.set("bolts", 200);
        myHashTable.set("screws", 140);



        myHashTable.printTable();

        System.out.println(myHashTable.keys());




        /*
            EXPECTED OUTPUT:
            ----------------
            0:
            1:
            2:
            3:
               {screws= 140}
            4:
               {bolts= 200}
            5:
            6:
               {nails= 100}
               {tile= 50}
               {lumber= 80}

        */

    }

}
