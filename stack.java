
package com.mycompany.quiz3;


public class stack <T>{
    private int MaxKapasite;          // stackimin gerekli olan değişkenlerini tanımladım
    private Object[] YıgınArray;
    private int index;

    stack(int kapasite) {              // degerleri atadım. -1 vermemin nedeni eleman alınca ilk indeksin 0 olmasını sağlamak
        
        this.MaxKapasite=kapasite;
        YıgınArray = new Object[this.MaxKapasite];
        this.index=-1;
    }
    public boolean Dolu_Mu(){                        
        return (index== (this.MaxKapasite-1));
    }                                             // yıgının bos veya dolu oldugu durumları kontrol eden iki method yazdım
    public boolean Is_Empty(){
        return (index==-1);
    }
    public void push (Object Yeni_Urun){
        if (Dolu_Mu()){                                                 //eleman ekledim eger doluysa eklenemez mesajı verdim
            System.out.println("Yigit Dolu Ekleme Yapilamaz");
            return;
        }
        index+=1;
        YıgınArray[index]=Yeni_Urun;
        
    }                                                                   
    public T pop (){                                                        // eleman sildim eger bossa silinemez mesajı verdim 
        if (Is_Empty()){
            System.out.println("Yigit Bos Eleman Alinamaz");
            return null;
        }
        T urun = (T) YıgınArray[index];
        index -=1;
        return urun;
    }
}
