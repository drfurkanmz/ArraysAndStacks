
package com.mycompany.quiz3;



public class Quiz3 {

    public static void main(String[] args) {
        stack<Integer> stack1 = new stack<>(8); // ilk olarak bir yığıt nesnesi oluşturdum
        item item1 = new item("AA","Toka");     // item nesneleri oluşturdum
        item item2 = new item("BB","Papyon");
        item item3 = new item("CC","Kravat");
        item item4 = new item("DD","Ayakkabi");

        
        stack1.push(item1);        
        stack1.push(item2);
        stack1.push(item3);
        stack1.push(item4);
        int i=1;
        while (!stack1.Is_Empty()){                                        // ısempty methodunu kullanarak liste boşalana kadar listedeki elemanları çıkarttım 
            System.out.println("Cikarilan "+ i+". Eleman : "+stack1.pop());  //ve çıkartılan elemanları yazdırdım
            i+=1;
        }
        
        
        
        
        
    }
}
