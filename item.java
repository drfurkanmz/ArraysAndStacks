

package com.mycompany.quiz3;

//item clası oluşturup içine gerekli olan değişkenleri atadım
//işime lazım olacak özellikleri get ve set metodunu kullanarak yazdım
//to string metodunu da yazıp classımda olan işimi bitirdim

public class item {
    private String ItemID;
    private String ItemName;

    public item(String ItemID, String ItemName) {
        this.ItemID = ItemID;
        this.ItemName = ItemName;
    }

    /**
     * @return the ItemID
     */
    public String getItemID() {
        return ItemID;
    }

    /**
     * @param ItemID the ItemID to set
     */
    public void setItemID(String ItemID) {
        this.ItemID = ItemID;
    }

    /**
     * @return the ItemName
     */
    public String getItemName() {
        return ItemName;
    }

    /**
     * @param ItemName the ItemName to set
     */
    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    @Override
    public String toString() {
        return "item{" + "ItemID=" + ItemID + ", ItemName=" + ItemName + '}';
    }
    
    
}
